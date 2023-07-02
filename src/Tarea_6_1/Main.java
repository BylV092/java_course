package Tarea_6_1;
public class Main {
        public static void main(String[] args) {
            if (args.length != 3) {
                System.out.println("Se requieren exactamente 3 nombres como argumentos de línea de comandos.");
                return;
            }
            String nombre1 = args[0];
            String nombre2 = args[1];
            String nombre3 = args[2];

            String nuevoNombre1 = obtenerNuevoNombre(nombre1);
            String nuevoNombre2 = obtenerNuevoNombre(nombre2);
            String nuevoNombre3 = obtenerNuevoNombre(nombre3);

            String resultado = nuevoNombre1 + "_" + nuevoNombre2 + "_" + nuevoNombre3;
            System.out.println(resultado);
        }

    private static String obtenerNuevoNombre(String nombre) {
        if (nombre.length() < 2) {
            return "";
        }

        char segundoCaracter = nombre.charAt(1);
        String mayuscula = Character.toString(segundoCaracter).toUpperCase();
        String ultimosDosCaracteres = nombre.substring(nombre.length() - 2);

        return mayuscula + "." + ultimosDosCaracteres;
    }
}