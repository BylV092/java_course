package wholesale;

public class Sellers extends Person {
    private int numberSales;
    private double salary;

    public int getNumberSales() {
        return numberSales;
    }

    public void setNumberSales(int numberSales) {
        this.numberSales = numberSales;
    }

    public double getSalary() {
        return salary;
    }

    public void setSalary(double salary) {
        this.salary = salary;
    }

    public Sellers(String namePerson, String lastName, String idPerson, String phone, int numberSales, double salary) {
        super(namePerson, lastName, idPerson, phone);
        this.numberSales = numberSales;
        this.salary = salary;
    }

    public String increaseRemuneration(double percentage) {
        double increaseTotal = 0;
        if (getNumberSales() >= 5) {
            increaseTotal = getSalary() * percentage;
        } else {
            System.out.println("Not remuneration");
        }
        double totalPay = increaseTotal + getSalary();
        return "\nTotal remuneration: " + increaseTotal + "$ USD\n"+"Total pay: " + totalPay + "$ USD";
    }

    @Override
    public String toString() {
        return super.toString() + "Number of Sales: " + numberSales + "\n" +
                "Salary: " + salary + increaseRemuneration(0.4);
    }
}
