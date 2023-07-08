package Tarea_9_4;

import java.util.Random;

public class MaxOcurrencies {
    public static void main(String[] args) {
        Random aleatorio = new Random();
        int[] a = new int[10];
        int index = 0;
        System.out.println("you array is: ");
        for (int i = 0; i < a.length; i++) {
            int aleatorioj = 1 + aleatorio.nextInt(9 );
            a[i] = aleatorioj;
            System.out.print(a[i]+"-");
        }
        int[] b = new int[a.length];
        for (int i = 0; i < a.length; i++) {
            for (int j = 0; j < a.length; j++) {
                if (a[i] == a[j]) {
                    b[i]++;
                }
            }
        }
        for (int j = 0; j < b.length; j++) {
            if (b[j] > b[index]) {
                index = j;
            }
        }
        System.out.println("\nThe number with max ocurriencies is: " + a[index]);
        System.out.println("With " + b[index] + " ocurrencies");

    }
}