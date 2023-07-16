package warehouseAndGreengrocers;

public class Main {
    public static void main(String[] args) {
        Product[] products = new Product[8];
        products[0] = new Dairy("Yogurt", 1800.50, 3, 78);
        products[1] = new Dairy("Kumis", 1500.70, 6, 40);
        products[2] = new Fruit("Apple", 1200.50, 3, "Red");
        products[3] = new Fruit("Orange", 1250.80, 20, "Orange");
        products[4] = new Cleaning("Clorox", 1800, "clorox", 0.5);
        products[5] = new Cleaning("Liquid Soap", 2500, "Glicerine,soap", 2);
        products[6] = new NotPerecible("Salt", 1100.70, 400, 30);
        products[7] = new NotPerecible("Sugar", 1700.65, 500, 80);

        for (Product product : products) {
            System.out.println("Type of product: "+product.getClass().getSimpleName());
            System.out.println("Name product:" + product.getNameProduct());
            System.out.println("Price: $ " + product.getPrice());
            if (product instanceof Dairy) {
                System.out.println("Amount: " + ((Dairy) product).getAmount());
                System.out.println("Proteins: " + ((Dairy) product).getProteins());
            } else if (product instanceof Fruit) {
                System.out.println("Weight: " + ((Fruit) product).getWeight());
                System.out.println("Color: " + ((Fruit) product).getColor());
            } else if (product instanceof Cleaning) {
                System.out.println("Componets: " + ((Cleaning) product).getComponents());
                System.out.println("Litres: " + ((Cleaning) product).getLitres());
            } else if (product instanceof NotPerecible) {
                System.out.println("Content: " + ((NotPerecible) product).getContent());
                System.out.println("Calories: " + ((NotPerecible) product).getCalories());
            }
            System.out.println("========================================================================");
        }

    }
}
