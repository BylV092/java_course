package Tarea_3;

import javax.swing.*;

public class Main {
    public static void main(String[] args) {
        String familiares = "";
        String[] familia;
        try {
            familiares = JOptionPane.showInputDialog(null, familiares + "Ingrese el numero de familiares a mostrar. \n Ingrese unicamente numeros");
            int f = Integer.parseInt(familiares);
            familia = new String[f];
            for (int i = 0; i < f; i++) {
                familia[i] = JOptionPane.showInputDialog(null, "Ingrese su familiar numero " + i);
            }
            JOptionPane.showMessageDialog(null, "El nombre de los familiares ingresados es: ");
            JOptionPane.showMessageDialog(null, familia);

        } catch (NumberFormatException e) {
            JOptionPane.showMessageDialog(null, "Error : ingrese un dato valido");

        }
    }
}
