package Tarea_8;

import java.util.InputMismatchException;
import java.util.Random;
import java.util.Scanner;

public class menu {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        Random aleatnum = new Random();
        try {
            int op;
            do {
                System.out.println("ELija la opcion que desee ejecutar para resolver el area");
                System.out.println("1. Ingresa el radio para calcular el area del circulo");
                System.out.println("2. Ingresa el perimetro para calcular el atea del circulo");
                System.out.println("3. Hallar el area de un circulo con radio aleatorio");
                System.out.println("4. Hallar area del cubo");
                System.out.println("5. Hallar volumen del cubo");
                System.out.println("6. salir del programa");
                op = scanner.nextInt();
                switch (op) {
                    case 1:
                        try {
                            System.out.println("ingrese el radio del circulo");
                            double radio;
                            radio = scanner.nextDouble();
                            double radiocirculo = Math.pow(radio, 2);
                            double area = radiocirculo * Math.PI;
                            System.out.println("El area de tu circulo es: " + area + "\n");
                        } catch (Exception InputMismatchException) {
                            System.err.println("ingresaste un dato invalido\n error en ejecuciom");
                        }
                        break;
                    case 2:
                        try {
                            System.out.println("ingrese el perimetro del circulo");
                            double perimetro;
                            perimetro = scanner.nextDouble();
                            double radio = perimetro / 2;
                            double radiocirculo = Math.pow(radio, 2);
                            double area = radiocirculo * Math.PI;
                            System.out.println("El area de tu circulo es: " + area + "\n");
                        } catch (Exception InputMismatchException) {
                            System.err.println("ingresaste un dato invalido\n error en ejecuciom");
                        }
                        break;
                    case 3:
                        try {
                            System.out.println("ingrese el radio del circulo");
                            double rango;
                            System.out.println("ingrese el rango de los numeros aleatorios que desea");
                            rango = scanner.nextDouble();
                            double radio = aleatnum.nextDouble(rango);
                            double radiocuadrado = Math.pow(radio, 2);
                            double area = radiocuadrado * Math.PI;
                            System.out.println("El area de tu circulo es: " + area + "\n");
                        } catch (Exception InputMismatchException) {
                            System.err.println("ingresaste un dato invalido\n error en ejecuciom");
                        }
                        break;
                    case 4:
                        try {
                            System.out.println("ingrese la longitud de un lado del cubo");
                            double lado;
                            lado = scanner.nextDouble();
                            double areacuadrado = 6 * Math.pow(lado, 2);
                            System.out.println("El area de tu circulo es: " + areacuadrado + "\n");
                        } catch (Exception InputMismatchException) {
                            System.err.println("ingresaste un dato invalido\n error en ejecuciom");
                        }
                        break;
                    case 5:
                        try {
                            System.out.println("ingrese la longitud de un lado del cubo");
                            double lado;
                            lado = scanner.nextDouble();
                            double areacuadrado = Math.pow(lado, 3);
                            System.out.println("El area de tu circulo es: " + areacuadrado + "\n");
                        } catch (Exception InputMismatchException) {
                            System.err.println("ingresaste un dato invalido\n error en ejecuciom");
                        }
                        break;
                }

            } while (op != 6);
            scanner.close();
        } catch (InputMismatchException e) {
            System.err.println("Error : Dato ingresado invalido solo se admiten valores numericos");
        }
    }
}
