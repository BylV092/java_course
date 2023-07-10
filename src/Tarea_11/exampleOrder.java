package Tarea_11;

public class exampleOrder {
    public static void main(String[] args) {
        //orders
        orderShopping order1 = new orderShopping("\nOrder for table number 6 ");
        orderShopping order2 = new orderShopping("\nOrder for delivery");
        orderShopping order3 = new orderShopping("\nOrder canceled");
        client names1 = new client("Clair", " Valentine");
        client names2 = new client("James", " Smith");
        client names3 = new client("Jonh", " Bermounth");

        //products
        Product product1 = new Product("KFC", "2 Pc. Chicken", 5.99);
        Product product2 = new Product("McDonals", "Bacon, Egg & Cheese Biscuit", 10);
        Product product3 = new Product("McDonals", "Bacon, Egg and Cheese Biscuit", 9.45);
        Product product4 = new Product("McDonals", "Egg McMuffin", 6.78);
        Product product5 = new Product("McDonals", "Sausage McMuffin", 11.75);
        Product product6 = new Product("McDonals", "Sausage McMuffin® with Egg", 40);
        Product product7 = new Product("Pepsi", "Pepsi regular", 3);
        Product product8 = new Product("Coca Cola", "Coca Cola lite", 5);
        Product product9 = new Product("McDonals", "Sausage Biscuit", 8.45);
        Product product10 = new Product("Pepsi", "Pepsi dietetic", 4.70);
        Product product11 = new Product("Coca Cola", "Coca Cola regular", 4);
        Product product12 = new Product("McDonalds", "Sausage Biscuit with Egg", 12.70);

        //add products
        order1.addProduct(product1);
        order1.addProduct(product2);
        order1.addProduct(product3);
        order1.addProduct(product4);

        order2.addProduct(product5);
        order2.addProduct(product6);
        order2.addProduct(product7);
        order2.addProduct(product8);

        order3.addProduct(product9);
        order3.addProduct(product10);
        order3.addProduct(product11);
        order3.addProduct(product12);

        //view all details order1
        System.out.println("Description" + order1.getDescription());
        System.out.println("Date " + order1.getDate());
        System.out.println("Client name: " + names1.getName() + names1.getLastname());
        System.out.println("Id of buys: " + order1.getId());

        for (Product product : order1.getProducts()) {
            System.out.print("Maker = " + product.getMaker() + "\t");
            System.out.print("Name product = " + product.getNameProduct() + "\t");
            System.out.println("Price = " + product.getPrice());
        }
        System.out.println("The total invoice in dollars is: " + order1.total() + " USD");
        System.out.println("////////////////////////////////////////////////////////////////////////////////////////////");

        //view all details order2
        System.out.println("Description" + order2.getDescription());
        System.out.println("Date " + order2.getDate());
        System.out.println("Client name " + names2.getName() + names2.getLastname());
        System.out.println("Id of buys : " + order2.getId());

        for (Product product : order2.getProducts()) {
            System.out.print("Maker = " + product.getMaker() + "\t");
            System.out.print("Name product = " + product.getNameProduct() + "\t");
            System.out.println("Price = " + product.getPrice());
        }
        System.out.println("The total invoice in dollars is:" + order2.total() + " USD");
        System.out.println("////////////////////////////////////////////////////////////////////////////////////////////");

        //view all details order3
        System.out.println("Maker" + order3.getDescription());
        System.out.println("Date " + order3.getDate());
        System.out.println("Client name " + names3.getName() + names3.getLastname());
        System.out.println("Id of buys: " + order3.getId());

        for (Product product : order3.getProducts()) {
            System.out.print("Maker = " + product.getMaker() + "\t");
            System.out.print("Name product = " + product.getNameProduct() + "\t");
            System.out.println("Price = " + product.getPrice());
        }
        System.out.println("The total invoice in dollars is: " + order3.total() + " USD");
        System.out.println("////////////////////////////////////////////////////////////////////////////////////////////");

    }
}
