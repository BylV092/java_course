package Tarea_9_2;

import java.util.Random;

public class nummaxarray {
    public static void main(String[] args) {
        Random aleatorio = new Random();
        int[] a = new int[7];
        System.out.println("Tu arreglo es: ");
        for (int j = 0; j < a.length; j++) {
            int aleatorioj = 11 + aleatorio.nextInt(99 - 11);
            a[j] = aleatorioj;
            System.out.println(a[j]);
        }
        int mayor = 0;
        for (int i = 0; i < a.length; i++) {
            if (a[i] > a[mayor]) {
                mayor = i;
            }
        }
        System.out.println("El mayor dato del arreglo es: " + a[mayor]);
    }
}
