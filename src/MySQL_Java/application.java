package MySQL_Java;

public class application {
    private int idApl;
    private int sum;
    private String state;
    private String currency;
    private int idClient;

    @Override
    public String toString() {
        return "application{" +
                "idApl=" + idApl +
                ", sum=" + sum +
                ", state='" + state + '\'' +
                ", currency='" + currency + '\'' +
                ", idClient=" + idClient +
                '}';
    }

    public int getIdApl() {
        return idApl;
    }

    public void setIdApl(int idApl) {
        this.idApl = idApl;
    }

    public int getSum() {
        return sum;
    }

    public void setSum(int sum) {
        this.sum = sum;
    }

    public String getState() {
        return state;
    }

    public void setState(String state) {
        this.state = state;
    }

    public String getCurrency() {
        return currency;
    }

    public void setCurrency(String currency) {
        this.currency = currency;
    }

    public int getIdClient() {
        return idClient;
    }

    public void setIdClient(int idClient) {
        this.idClient = idClient;
    }

    public application(int idApl, int sum, String state, String currency, int idClient) {

        this.idApl = idApl;
        this.sum = sum;
        this.state = state;
        this.currency = currency;
        this.idClient = idClient;
    }
}