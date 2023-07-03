package Tarea_4_1;

import javax.swing.*;
import java.util.Scanner;

public class Main {


    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("ingrese el primer nombre y apellido de tu familiar");
        String p = scanner.nextLine();
        System.out.println("ingrese el primer nombre y apellido de tu familiar");
        String d = scanner.nextLine();
        System.out.println("ingrese el primer nombre y apellido de tu familiar");
        String s = scanner.nextLine();
        int tamano1 = p.length();
        int tamano2 = d.length();
        int tamano3 = s.length();
        if (tamano1 > tamano2 && tamano1 > tamano3) {
            System.out.println("El dato " + p.toUpperCase() + " es el dato de mayor longitud teniendo " + tamano1 + " datos");
        } else if (tamano2 > tamano1 && tamano2 > tamano3) {
            System.out.println("El dato " + d.toUpperCase() + " ingresado es el dato de mayor longitud teniendo " + tamano2 + " datos");
        } else if (tamano3 > tamano1 && tamano3 > tamano2) {
            System.out.println("El dato " + s.toUpperCase() + " ingresado es el dato de mayor longitud teniendo " + tamano3 + " datos");
        } else {
            JOptionPane.showMessageDialog(null, "Hay mas de un dato con la misma longitud");
        }

    }

}