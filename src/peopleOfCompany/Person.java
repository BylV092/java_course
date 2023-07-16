package peopleOfCompany;

public class Person {
    private String namePerson;
    private String lastName;
    private String taxNumber;
    private String addres;
    public Person(String namePerson, String lastName, String taxNumber, String addres) {
        this.namePerson = namePerson;
        this.lastName = lastName;
        this.taxNumber = taxNumber;
        this.addres = addres;
    }

    public String getNamePerson() {
        return namePerson;
    }

    public void setNamePerson(String namePerson) {
        this.namePerson = namePerson;
    }

    public String getLastName() {
        return lastName;
    }

    public void setLastName(String lastName) {
        this.lastName = lastName;
    }

    public String getTaxNumber() {
        return taxNumber;
    }

    public void setTaxNumber(String taxNumber) {
        this.taxNumber = taxNumber;
    }

    public String getAddres() {
        return addres;
    }

    public void setAddres(String addres) {
        this.addres = addres;
    }
    public Person() {
        System.out.println("Inicializanding...Person");
    }

    @Override
    public String toString() {
        return "Name: " + namePerson +
                "\tLast Name: " + lastName + '\n' +
                "TaxNumber: " + taxNumber + '\n' +
                "Addres: " + addres + '\n';
    }
}
