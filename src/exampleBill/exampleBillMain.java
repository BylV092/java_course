package exampleBill;

import exampleBill.model.*;

import java.util.Scanner;

public class exampleBillMain {
    public static void main(String[] args) {
        clients client = new clients();
        client.setNit("1000728292");
        client.setName("Yesid Lopez");
        Scanner s = new Scanner(System.in);
        System.out.println("Enter the invoice description");
        String description = s.nextLine();
        bill Bill = new bill(description, client);
        product Product;
        System.out.println();

        for (int i = 0; i < 5; i++) {
            Product = new product();
            System.out.print("Enter the new product number " + Product.getCode_id() + " :");
            Product.setNameProduct(s.next());
            System.out.print("Enter the price of product: ");
            Product.setPrice(s.nextFloat());
            System.out.print("Enter the amount of products: ");
            Bill.addItemBill(new itemBill(s.nextInt(), Product));
            System.out.println();

        }
        System.out.println(Bill.seeDetails());
        s.nextLine();

    }
}
