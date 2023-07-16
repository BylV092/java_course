package wholesale;

public class Clients extends Person {
    private String typePay;

    public String getTypePay() {
        return typePay;
    }

    public void setTypePay(String typePay) {
        this.typePay = typePay;
    }

    public Clients(String namePerson, String lastName, String idPerson, String phone, String typePay) {
        super(namePerson, lastName, idPerson, phone);
        this.typePay = typePay;
    }

    @Override
    public String toString() {
        return super.toString()+ "Type of pay: " + typePay;
    }
}
