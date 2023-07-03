package Tarea_2;
import javax.swing.*;

public class Main {
    public static void main(String[] args) {
        int pd1,pd2,pd3,pd4,pd5,pd6,pd7,pd8,pd9,pd10,total;
        double totaliva,totalpagar;
        String name = JOptionPane.showInputDialog(null,"Ingrese el nombre de la tienda");
        String fecha = JOptionPane.showInputDialog(null,"Por favor ingrese la fecha en la que se realiza la factura \n Ingrese dia/mes/año");
        String numfactura = JOptionPane.showInputDialog(null,"Por favor ingrese el numero de la factura ");
        String producto1= JOptionPane.showInputDialog(null,"Por favor ingrese el nombre de los 10 productos a facturar \n Producto 1");
        String producto2= JOptionPane.showInputDialog(null,"Producto 2");
        String producto3= JOptionPane.showInputDialog(null,"Producto 3");
        String producto4= JOptionPane.showInputDialog(null,"Producto 4");
        String producto5= JOptionPane.showInputDialog(null,"Producto 5");
        String producto6= JOptionPane.showInputDialog(null,"Producto 6");
        String producto7= JOptionPane.showInputDialog(null,"Producto 7");
        String producto8= JOptionPane.showInputDialog(null,"Producto 8");
        String producto9= JOptionPane.showInputDialog(null,"Producto 9");
        String producto10= JOptionPane.showInputDialog(null,"Producto 10");

        String producto01= JOptionPane.showInputDialog(null,"Ingrese los precios de los productos l Solo ingrese numero sin simbolos ni puntos \n" + producto1);
        pd1 = Integer.parseInt(producto01);
        String producto02= JOptionPane.showInputDialog(null,producto2);
        pd2 = Integer.parseInt(producto02);
        String producto03= JOptionPane.showInputDialog(null,producto3);
        pd3 = Integer.parseInt(producto03);
        String producto04= JOptionPane.showInputDialog(null,producto4);
        pd4 = Integer.parseInt(producto04);
        String producto05= JOptionPane.showInputDialog(null,producto5);
        pd5 = Integer.parseInt(producto05);
        String producto06= JOptionPane.showInputDialog(null,producto6);
        pd6 = Integer.parseInt(producto06);
        String producto07= JOptionPane.showInputDialog(null,producto7);
        pd7 = Integer.parseInt(producto07);
        String producto08= JOptionPane.showInputDialog(null,producto8);
        pd8 = Integer.parseInt(producto08);
        String producto09= JOptionPane.showInputDialog(null,producto9);
        pd9 = Integer.parseInt(producto09);
        String producto010= JOptionPane.showInputDialog(null,producto10);
        pd10 = Integer.parseInt(producto010);
        total = pd1+pd2+pd3+pd4+pd5+pd6+pd7+pd8+pd9+pd10;
        totaliva = total*0.19;
        totalpagar= total+totaliva;
        JOptionPane.showMessageDialog(null,name+"Factura numero: "+numfactura +"              "+fecha+"\n"+producto1+"--------------"+pd1+"\n"+producto2+"--------------"+pd2+"\n"+producto3+"--------------"+pd3+"\n"+producto4+"--------------"+pd4+"\n"+producto5+"--------------"+pd5+"\n"+producto6+"--------------"+pd6+"\n"+producto6+"--------------"+pd6+"\n"+producto7+"--------------"+pd7+"\n"+producto8+"--------------"+pd8+"\n"+producto9+"--------------"+pd9+"\n"+producto10+"--------------"+pd10+"\n"+"Total ---------------$"+totalpagar+"$  Pesos");
    }
}