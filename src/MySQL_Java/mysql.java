package MySQL_Java;

import java.sql.*;
import java.util.ArrayList;
import java.util.List;
import java.util.function.Predicate;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class mysql {
    public static void main(String[] args) throws SQLException {
        String url = "jdbc:mysql://localhost:3306/bank";
        String login = "root";
        String pass = "root";
        Connection conn = DriverManager.getConnection(url, login, pass);
        PreparedStatement preparedStatement = conn.prepareStatement("SELECT * FROM application");
        ResultSet resultSet = preparedStatement.executeQuery();
        ArrayList<application> list_of_app = new ArrayList<>();
        while(resultSet.next()){
            int idApplication = resultSet.getInt("idApplication");
            int sum = resultSet.getInt("Sum");
            String creditState = resultSet.getString("CreditState");
            String currency = resultSet.getString("Currency");
            int client_idClient = resultSet.getInt("Client_idClient");
            list_of_app.add(new application(idApplication,sum,creditState,currency,client_idClient));
        }

        List<application> collect = list_of_app.stream().sorted((o1, o2) -> o2.getIdClient() - o1.getIdClient()).collect(Collectors.toList());

        int iterator = 1;
        int maxIdClient = collect.get(0).getIdClient();
        PreparedStatement client = conn.prepareStatement("SELECT * FROM client");
        ResultSet resSet368 = client.executeQuery();
        ArrayList<client> list_of_clients = new ArrayList<>();
        while (resSet368.next()){
            int idClient = resSet368.getInt("idClient");
            String firstName = resSet368.getString("FirstName");
            String lastName = resSet368.getString("LastName");
            String education = resSet368.getString("Education");
            String passport = resSet368.getString("Passport");
            String city = resSet368.getString("City");
            int age = resSet368.getInt("Age");
            int department_idDepartment = resSet368.getInt("Department_idDepartment");
            //System.out.println(firstName+lastName+education);
            ArrayList<application> app_list = new ArrayList<>();
            for (application app : list_of_app) {
                if (app.getIdClient() == iterator){
                    app_list.add(app);
                }
            }
            iterator++;
            list_of_clients.add(new client(idClient, firstName,lastName, education,passport,city,age,department_idDepartment,app_list));
        }

        for (client list_of_client : list_of_clients) {
            System.out.println(list_of_client);
        }

        System.out.println("----------------------------------------");
        //Here i want to show CreditState = Returned
        Stream<MySQL_Java.client> stream = list_of_clients.stream();
        stream
                .filter(c -> c.getLis_of_app().stream().allMatch(application -> application.getState().equals("Returned")))
                .forEach(clien -> System.out.println(clien));

    }
}