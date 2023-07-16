package wholesale;

public class Main {
    public static void main(String[] args) {
        ProductMayor[] productMayors = new ProductMayor[6];

        productMayors[0] = new NotPerecibles("Sugar", 320000.5445, 600, 300);
        productMayors[1] = new NotPerecibles("Atun", 34800.54, 456, 1234);
        productMayors[2] = new Perecibles("Meat", 260002.231, 560, "Refrigerate", "Meat");
        productMayors[3] = new Perecibles("Yogurt", 780000.2134, 792, "Refrigerate", "Dair");
        productMayors[4] = new Cleanings("Clorox", 560000.2132, 430, "clorox,oxigen", 2);
        productMayors[5] = new Cleanings("Liquid soap", 98032222.234, 450, "Saponifiable natural oils", 4);
        for (ProductMayor product : productMayors) {
            System.out.println("Type of product: " + product.getClass().getSimpleName());
            System.out.println("Name product:" + product.getNameProduct());
            System.out.println("Price: $ " + product.getPrice());
            System.out.println("Quantity: " + product.getQuantity());
            if (product instanceof NotPerecibles) {
                System.out.println("Calories: " + ((NotPerecibles) product).getCalories());
            } else if (product instanceof Perecibles) {
                System.out.println("Storage type: " + ((Perecibles) product).getStorageType());
                System.out.println("Sub type: " + ((Perecibles) product).getSubType());
            } else if (product instanceof Cleanings) {
                System.out.println("Componets: " + ((Cleanings) product).getComponents());
                System.out.println("Litres: " + ((Cleanings) product).getLitres());
            }
            System.out.println("========================================================================");

        }

        Sellers seller1 = new Sellers("James", "Smith", "1122332232", "3108481366", 23, 1230000.89);
        Sellers seller2 = new Sellers("Maria", "Perez", "100823423", "3217549032", 27, 1230000.89);
        Clients client1 = new Clients("Marco", "Ibanovich", "330488221", "+1123342444", "Credit card");
        imprimir(seller1);
        System.out.println("========================================================================");
        imprimir(seller2);
        System.out.println("========================================================================");
        imprimir(client1);
        System.out.println("========================================================================");


    }

    public static void imprimir(Sellers person) {
        System.out.println("The data of seller is: \n" + person);
    }

    public static void imprimir(Clients person) {
        System.out.println("The data of client is: \n" + person);
    }

}
