package Tarea_5_2;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Ingrese el tamanio del arreglo, este debe ser mayor a 10");
        int a = scanner.nextInt();
        if (a >= 10) {
            int[] array1 = new int[a];
            for (int i = 0; i < a; i++) {
                System.out.println("ingrese el dato en la posicion " + i);
                array1[i] = scanner.nextInt();
            }
            int menor = array1[0];
            int mayor = array1[0];

            for (int i = 0; i < array1.length; i++) {
                if (array1[i] < menor) {
                    menor = array1[i];
                }
            }
            System.out.println("El menor dato ingresado es: " + menor);
            System.out.println("!El numero menor es igual o mayor que 10!");
            for (int i = 0; i < array1.length; i++) {
                if (array1[i] > mayor) {
                    mayor = array1[i];
                }
            }
            System.out.println("El mayor dato ingresado es: " + mayor);
        }else {
            System.out.println("!El número menor es menor que 10!");
        }
    }
}
