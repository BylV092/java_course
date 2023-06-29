package Tarea_5_2;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Ingrese el primer numero");
        int a = scanner.nextInt();
        System.out.println("Ingrese el segundo numero");
        int b = scanner.nextInt();
        System.out.println("Ingrese el tercer numero");
        int q = scanner.nextInt();
        System.out.println("Ingrese el cuarto numero");
        int w = scanner.nextInt();
        System.out.println("Ingrese el quinto numero");
        int e = scanner.nextInt();
        System.out.println("Ingrese el sexto numero");
        int r = scanner.nextInt();
        System.out.println("Ingrese el septimo numero");
        int t = scanner.nextInt();
        System.out.println("Ingrese el octavo numero");
        int y = scanner.nextInt();
        System.out.println("Ingrese el noveno numero");
        int s = scanner.nextInt();
        System.out.println("Ingrese el decimo numero");
        int d = scanner.nextInt();
        int[] array1 = {a, b, q, w, e, r, t, y, s, d};
        int menor = array1[0];
        int mayor = array1[0];

        for (int i = 0; i < array1.length; i++) {
            if (array1[i] < menor) {
                menor = array1[i];
            }
        }
        System.out.println("El menor dato ingresado es: " + menor);
        for (int i = 0; i < array1.length; i++) {
            if (array1[i] > mayor) {
                mayor = array1[i];
            }
        }
        System.out.println("El mayor dato ingresado es: " + mayor);
    }
}
