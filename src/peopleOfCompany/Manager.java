package peopleOfCompany;

public class Manager extends Employee {
    private double budget;

    public Manager(String namePerson, String lastName, String taxNumber, String addres, double remuneration, int idEmployee, int amountSales) {
        super(namePerson, lastName, taxNumber, addres, remuneration, idEmployee, amountSales);
        this.budget = budget;
    }

    public double getBudget() {
        return budget;
    }

    public void setBudget(double budget) {
        this.budget = budget;
    }

    public Manager() {
        System.out.println("Iniciaizanding...Manager");
    }

    public String increaseRemuneration(double percentage) {
        double increaseTotal = 0;
        if (getAmountSales() >= 5) {
            increaseTotal = getRemuneration() * percentage;
        } else {
            System.out.println("Not remuneration");
        }
        double totalRemaining = budget - increaseTotal;
        double totalPay = increaseTotal + getRemuneration();
        return "Total remuneration:" + increaseTotal + "$ USD\nTotal remaining budget: " + totalRemaining + "$ USD\n" + "Total pay: " + totalPay + "$ USD";
    }

    @Override
    public String toString() {
        return super.toString() + "Budget: " + budget + "$ USD\n" + increaseRemuneration(0.2);
    }
}
