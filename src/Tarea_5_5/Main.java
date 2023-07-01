package Tarea_5_5;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        int contador1 = 0;
        int contador2 = 0;
        int contador3 = 0;
        double suma1 = 0;
        double suma2 = 0;
        double sumaTotal = 0;
        int i;
        Scanner scanner = new Scanner(System.in);
        System.out.println("Ingrese las notas de los alumnos no olvide ingresar decimales \n Recuerde el rango de notas es de 1 a 7");
        Double[] array1 = new Double[20];
        for (i = 0; i < array1.length; i++) {
            System.out.println("Ingrese la nota en la posicion " + i);
            array1[i] = scanner.nextDouble();
            sumaTotal += array1[i];
            if (array1[i] <= 7 && array1[i] >= 1) {
                if (array1[i] == 1) {
                    contador3++;
                } else if (array1[i] <= 4) {
                    contador2++;
                    suma2 += array1[i];
                } else if (array1[i] >= 5) {
                    contador1++;
                    suma1 += array1[i];
                }
            } else {
                System.out.println("el numero ingresado excede el valor posible de las notas");
                break;
            }
        }
        double promedio1 = suma1 / contador1;
        System.out.println("El promedio de notas mayores a 5 es: " + promedio1 + "\nLa cantidad de notas mayores a 5 es: " + contador1);
        double promedio2 = suma2 / contador2;
        System.out.println("el promedio de notas inferiores a 4 es: " + promedio2 + "\nLa cantidad de notas inferiores a 4 es: " + contador2);
        System.out.println("la cantidad de notas de 1 es: " + contador3);
        double promedioTotal = sumaTotal / array1.length;
        System.out.println("el promedio general de todas las notas es de : " + promedioTotal);
    }
}

