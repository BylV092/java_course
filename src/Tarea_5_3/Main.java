package Tarea_5_3;

import java.util.InputMismatchException;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        try {
            Scanner scanner = new Scanner(System.in);
            int op;
            do {

                System.out.println("ELija la operqcion aritmetica a realizar, ingresando el numero de la opcion correspondiente");
                System.out.println("1. sumar");
                System.out.println("2. restar");
                System.out.println("3. multiplicar");
                System.out.println("4. dividir");
                System.out.println("5. Saber si el numero ingresado es par o impar");
                System.out.println("6. Potencia");
                System.out.println("7. salir del programa");
                op = scanner.nextInt();
                switch (op) {


                    case 1:
                        System.out.println("Ingrese el primer numero");
                        int a = scanner.nextInt();
                        System.out.println("Ingrese el primer numero");
                        int b = scanner.nextInt();
                        int r = a + b;
                        System.out.println("El resultado de la suma es:" + r);
                        break;
                    case 2:
                        System.out.println("Ingrese el primer numero");
                        int q = scanner.nextInt();
                        System.out.println("Ingrese el primer numero");
                        int w = scanner.nextInt();
                        int re = q - w;
                        System.out.println("El resultado de la resta es:" + re);
                        break;
                    case 3:
                        System.out.println("Ingrese el primer numero");
                        int e = scanner.nextInt();
                        System.out.println("Ingrese el primer numero");
                        int t = scanner.nextInt();
                        int total = e * t;
                        System.out.println("El resultado de la multiplicacion es:" + total);
                        break;
                    case 4:
                        System.out.println("Ingrese el primer numero");
                        int g = scanner.nextInt();
                        System.out.println("Ingrese el primer numero");
                        int h = scanner.nextInt();
                        int r1 = g / h;
                        System.out.println("El resultado de la divicion es:" + r1);
                        break;
                    case 5:
                        System.out.println("Ingrese el primer numero");
                        int s = scanner.nextInt();
                        int par = s % 2;
                        if (par == 0) {
                            System.out.println("el numero ingresado es par");
                        } else {
                            System.out.println("el numero ingresado es impar");
                        }
                        break;
                    case 6:
                        int num1, num2;
                        int resultado = 1;
                        System.out.println("Ingrese la base");
                        num1 = scanner.nextInt();
                        System.out.println("Ingrese el exponente");
                        num2 = scanner.nextInt();
                        for (int i = 0; i < num2; i++) {
                            resultado *= num1;
                        }
                        System.out.println("El resultado de la potencia es" + resultado);
                    case 7:
                        System.out.println("Ejecucion finalizada con exito");
                        break;
                    default:
                        System.out.println("Opcion ingresada invalida por favor ingrese una de las opciones que se muestran");
                        break;
                }
                System.out.println();
            } while (op != 7);
            scanner.close();
        } catch (InputMismatchException e) {
            System.err.println("Error : Dato ingresado invalido solo se admiten valores numericos");
        }
    }
}
