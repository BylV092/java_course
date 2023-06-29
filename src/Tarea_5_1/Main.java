package Tarea_5_1;

import javax.swing.*;

public class Main {
    public static void main(String[] args) {
        int numero1 = Integer.parseInt(JOptionPane.showInputDialog(null, "ingrese el primer numero a multiplicar"));
        int numero2 = Integer.parseInt(JOptionPane.showInputDialog(null, "ingrese el segundo numero a multiplicar"));
        int resultado = 0;
        for (int i = 0; i < numero2; i++) {
            resultado += numero1;
        }
        JOptionPane.showMessageDialog(null, "El resultado de la multiplicacion de los numeros que agregaste es: " + resultado);
    }
}
