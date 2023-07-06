package Tarea_8;

import java.util.Scanner;

public class a_circulo {
    public static void main(String[] args) {
        try {
            Scanner scanner = new Scanner(System.in);
            System.out.println("ingrese el radio del circulo");
            double radio;
            radio = scanner.nextDouble();
            double radiocuadrado = Math.pow(radio, 2);
            double area = radiocuadrado * Math.PI;
            System.out.println("El area de tu circulo es: " + area);
        } catch (Exception InputMismatchException) {
            System.err.println("ingresaste un dato invalido\n error en ejecuciom");
        }
    }
}
