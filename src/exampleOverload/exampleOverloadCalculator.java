package exampleOverload;

import static exampleOverload.calculatorAdd.add;

public class exampleOverloadCalculator {
    public static void main(String[] args) {
        System.out.println("add int: " + add(2, 5));
        System.out.println("Add float: " + add(13.8f, 12.5f));
        System.out.println("Add float-int: " + add(12f, 6));
        System.out.println("Add int-float: " + add(45, 8f));
        System.out.println("Add double: " + add(13.5, 12.6));
        System.out.println("Add String: " + add("4", "78"));
        System.out.println("Add three int: " + add(3, 7, 4));
        System.out.println("Add three int: " + add(3, 7, 4, 6, 5, 4, 3, 2, 4, 5));
        System.out.println("Add long: " + add(134L, 12492L));
    }
}
