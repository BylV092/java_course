package wholesale;

public class Person {
    private String namePerson;
    private String lastName;
    private String idPerson;
    private String phone;

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

    public String getIdPerson() {
        return idPerson;
    }

    public void setIdPerson(String idPerson) {
        this.idPerson = idPerson;
    }

    public String getPhone() {
        return phone;
    }

    public void setPhone(String phone) {
        this.phone = phone;
    }

    public Person(String namePerson, String lastName, String idPerson, String phone) {
        this.namePerson = namePerson;
        this.lastName = lastName;
        this.idPerson = idPerson;
        this.phone = phone;
    }

    @Override
    public String toString() {
        return "NamePerson: " + namePerson + "\n" +
                "LastName: " + lastName + "\n" +
                "IdPerson: " + idPerson + "\n" +
                "Phone: " + phone + "\n";
    }
}
