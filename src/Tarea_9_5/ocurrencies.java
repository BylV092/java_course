package Tarea_9_5;

import java.util.Random;

public class ocurrencies {
    public static void main(String[] args) {
        Random aleat = new Random();
        int[] a = new int[10];
        System.out.println("you array is: ");
        for (int i = 0; i < a.length; i++) {
            int aleatorioj = 1 + aleat.nextInt(6);
            a[i] = aleatorioj;
            System.out.println(a[i] + " ");
        }
        int[] frecuency = new int[6];
        for (int count : a) {
            frecuency[count - 1]++;
        }
        for (int i = 0; i < frecuency.length; i++) {
            System.out.print((i + 1) + ":");
            for (int j = 0; j < frecuency[i]; j++) {
                System.out.print("*");
            }
            System.out.println();
        }
    }
}
