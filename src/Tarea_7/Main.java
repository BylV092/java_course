package Tarea_7;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        SimpleDateFormat fecha_nacimiento = new SimpleDateFormat("dd/MM/yyyy");
        Scanner a = new Scanner(System.in);
        System.out.println("ingrese su fecha de nacimiento ingrese:\n Dia/Mes/Anio");
        try {
            Date fecha = fecha_nacimiento.parse(a.next());
            System.out.println("a = " + fecha);
            System.out.println("fecha_nacimiento = " + fecha_nacimiento.format(fecha));
            Date fecha_actual = new Date();
            long fecha_cumpleanios = fecha_actual.getTime() - fecha.getTime();
            long fecha_segundos = fecha_cumpleanios / (1000);
            long fecha_minutos = fecha_segundos / (60);
            long fecha_horas = fecha_minutos / (60);
            long fecha_dias = fecha_horas / (24);
            long fecha_anios = fecha_dias / (365);
            System.out.println("Desde tu nacimiento han transcurrido: \n" + fecha_anios + " años\n" + fecha_dias + " dias\n" + fecha_horas + " horas\n" + fecha_minutos + " minutos\n" + fecha_segundos + " segundos\n" + fecha_cumpleanios + " milisegundos");
        } catch (ParseException e) {
            throw new RuntimeException(e);
        }

    }
}

