package Tarea_4_3;

import javax.swing.*;

public class Main {
    public static void main(String[] args) {
        try{
        double capacidad = Double.parseDouble(JOptionPane.showInputDialog(null,"Ingrese la cantidad de litros restantes en el tanque"));
if (capacidad == 70){
    JOptionPane.showMessageDialog(null,"Estanque lleno");
} else if (capacidad >= 60 && capacidad < 70) {
    JOptionPane.showMessageDialog(null,"Estanque casi lleno");
}else if (capacidad >= 40 && capacidad < 60) {
    JOptionPane.showMessageDialog(null,"Estanque 3/4");
}else if (capacidad >= 35 && capacidad < 40) {
    JOptionPane.showMessageDialog(null,"Estanque a media capacidad");
}else if (capacidad >= 20 && capacidad < 35) {
    JOptionPane.showMessageDialog(null,"Suficiente");
}else if (capacidad >= 1 && capacidad < 20) {
    JOptionPane.showMessageDialog(null,"Insuficiente");
}else if (capacidad > 70) {
    JOptionPane.showMessageDialog(null,"Estanque excedido de capacidad");
}else if (capacidad < 1) {
    JOptionPane.showMessageDialog(null,"Estanque vacio");
}
        }catch(NumberFormatException e){
            JOptionPane.showMessageDialog(null,"Error : ingrese un dato valido");

        }
    }
}
