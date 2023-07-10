package Tarea_11;

import java.util.Date;
import java.util.Scanner;

public class orderShopping {
    private static int counter = 1;
    private Integer id;
    private String description;
    private Date date;
    private client client;
    private Product[] products;

    //create getters and setters

    public int getId() {
        return id;
    }

    public String getDescription() {
        return description;
    }


    public Date getDate() {
        return date;
    }

    public void setDate(Date date) {
        this.date = date;
    }

    public client getClient() {
        return client;
    }

    public void setClient(client client) {
        this.client = client;
    }


    //create constructs
    public orderShopping(String description) {
        this.id = counter++;
        this.description = description;
        this.date = new Date();
        this.client= null;
        this.products = new Product[4];
    }

    public void addProduct(Product product) {
        for (int i = 0; i < products.length; i++) {
            if (products[i] == null) {
                products[i] = product;
                break;
            }
        }

    }
    public Product[] getProducts() {
        return products;
    }
    public double total() {
        double total = 0;
        for (Product product : products) {
            if (product != null) {
                total += product.getPrice();
            }
        }
        return total;
    }
}

