package peopleOfCompany;

public class Employee extends Person {
    private double remuneration;
    private int idEmployee;
    private int amountSales;

    public Employee(String namePerson, String lastName, String taxNumber, String addres, double remuneration, int idEmployee,int amountSales) {
        super(namePerson, lastName, taxNumber, addres);
        this.amountSales= amountSales;
        this.remuneration = remuneration;
        this.idEmployee = idEmployee;
    }

    public int getAmountSales() {
        return amountSales;
    }

    public void setAmountSales(int amountSales) {
        this.amountSales = amountSales;
    }

    public double getRemuneration() {
        return remuneration;
    }

    public void setRemuneration(double remuneration) {
        this.remuneration = remuneration;
    }

    public int getIdEmployee() {
        return idEmployee;
    }

    public void setIdEmployee(int idEmployee) {
        this.idEmployee = idEmployee;
    }

    public Employee() {
        System.out.println("Inicializanding...Employee");
    }




    @Override
    public String toString() {
        return super.toString() + "Remuneration: " + remuneration +"$ USD\n"+
                "Id employee: " + idEmployee +"\n"+
                "Amount Sales: " + amountSales+"\n";
    }
}
