package Tarea_4_2;

import javax.swing.*;

public class Main {
    public static void main(String[] args) {
        int w = Integer.parseInt(JOptionPane.showInputDialog(null, "ingrese el primer numero a ordenar"));
        int q = Integer.parseInt(JOptionPane.showInputDialog(null, "ingrese el segundo numero a ordenar"));
        //ordenamiento menor a mayor
        if (w < q) {
            JOptionPane.showMessageDialog(null, "Los numeros que ingresaste ordenados de menor a mayor son: " + w + "-" + q);
        } else if (q < w) {
            JOptionPane.showMessageDialog(null, "Los numeros que ingresaste ordenados de menor a mayor son: " + q + "-" + w);
        } else {
            JOptionPane.showMessageDialog(null, "Los dos numeros ingresados son iguales: " + q + "-" + w);
        }
        if (w > q) {
            JOptionPane.showMessageDialog(null, "Los numeros que ingresaste ordenados de mayor a menor son: " + w + "-" + q);
        } else if (q > w) {
            JOptionPane.showMessageDialog(null, "Los numeros que ingresaste ordenados de mayor a menor son: " + q + "-" + w);
        } else {
            JOptionPane.showMessageDialog(null, "Los dos numeros ingresados son iguales: " + q + "-" + w);
        }
    }
}
