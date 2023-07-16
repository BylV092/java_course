package peopleOfCompany;

public class Customer extends Person {
    private int idCustomer;

    public Customer() {
        System.out.println("Inicializanding...Customer");
    }

    public Customer(String namePerson, String lastName, String taxNumber, String addres, int idCustomer) {
        super(namePerson, lastName, taxNumber, addres);
        this.idCustomer = idCustomer;
    }
}
