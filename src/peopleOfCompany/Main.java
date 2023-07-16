package peopleOfCompany;

public class Main {
    public static void main(String[] args) {

        Employee employee = new Employee("Camila", "Perez", "100298234", "Cra 4 #54-34", 123500.50, 123,8);
        employee.setAmountSales(6);
        Manager manager = new Manager("Breider", "Lopez", "12323442", "Kra 32 #56-27", 567000.345, 1000728292,12);
        manager.setBudget(90350120.000323);
        Customer customer = new Customer("James", "Smith", "12009443", "Calle 65 # 56-43", 1100288223);
        imprimir(manager);

    }

    public static void imprimir(Person person) {
        System.out.println("The data of manager is: \n" + person);


    }
}
