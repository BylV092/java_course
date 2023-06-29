package Tarea_4_1;

import javax.swing.*;

public class Main {


    public static void main(String[] args) {

        String p = JOptionPane.showInputDialog(null, "ingrese la primera palabra".trim());
        String d = JOptionPane.showInputDialog(null, "ingrese la segunda palabra".trim());
        String s = JOptionPane.showInputDialog(null, "ingrese la tercera palabra".trim());
        int tamano1 = p.length();
        int tamano2 = d.length();
        int tamano3 = s.length();
        if (tamano1 > tamano2 && tamano1 > tamano3) {
            JOptionPane.showMessageDialog(null, "El primer dato ingresado es el dato de mayor longitud teniendo " + tamano1 + "datos");
        } else if (tamano2 > tamano1 && tamano2 > tamano3) {
            JOptionPane.showMessageDialog(null, "El segundo dato ingresado es el dato de mayor longitud teniendo " + tamano2 + "datos");
        } else if (tamano3 > tamano1 && tamano3 > tamano2) {
            JOptionPane.showMessageDialog(null, "El tercer dato ingresado es el dato de mayor longitud teniendo " + tamano3 + "datos");
        } else {
            JOptionPane.showMessageDialog(null, "Hay mas de un dato con la misma longitud");
        }

    }

}