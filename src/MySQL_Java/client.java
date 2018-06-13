package MySQL_Java;

import java.util.ArrayList;

public class client {
    private int id;
    private String name;
    private String surname;
    private String education;
    private String passport;
    private String city;
    private int age;
    private int department_idDepartment;

    private ArrayList<application> lis_of_app = new ArrayList<>();

    public client(int id, String name, String surname, String education, String passport, String city, int age, int department_idDepartment, ArrayList<application> lis_of_app) {
        this.id = id;
        this.name = name;
        this.surname = surname;
        this.education = education;
        this.passport = passport;
        this.city = city;
        this.age = age;
        this.department_idDepartment = department_idDepartment;
        this.lis_of_app = lis_of_app;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getSurname() {
        return surname;
    }

    public void setSurname(String surname) {
        this.surname = surname;
    }

    public String getEducation() {
        return education;
    }

    public void setEducation(String education) {
        this.education = education;
    }

    public String getPassport() {
        return passport;
    }

    public void setPassport(String passport) {
        this.passport = passport;
    }

    public String getCity() {
        return city;
    }

    public void setCity(String city) {
        this.city = city;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public int getDepartment_idDepartment() {
        return department_idDepartment;
    }

    public void setDepartment_idDepartment(int department_idDepartment) {
        this.department_idDepartment = department_idDepartment;
    }

    public ArrayList<application> getLis_of_app() {
        return lis_of_app;
    }

    public void setLis_of_app(ArrayList<application> lis_of_app) {
        this.lis_of_app = lis_of_app;
    }

    @Override
    public String toString() {
        return "client{" +
                "id=" + id +
                ", name='" + name + '\'' +
                ", surname='" + surname + '\'' +
                ", education='" + education + '\'' +
                ", passport='" + passport + '\'' +
                ", city='" + city + '\'' +
                ", age=" + age +
                ", department_idDepartment=" + department_idDepartment +
                ", lis_of_app=" + lis_of_app +
                '}';
    }
}
