package Tarea_9_1;

import java.util.Scanner;

public class arreglo {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int[] a = new int[10];
        for (int i = 0; i < a.length; i++) {
            System.out.println("Ingresa el daro en la posicion:" + i);
            a[i] = scanner.nextInt();
        }
        int j = a.length;
        for (int k = 0; k < a.length; k++) {
            System.out.println(j-- + a[0]++);
        }
    }
}
