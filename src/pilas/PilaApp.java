package pilas;

public class PilaApp {
    public static void main(String[] args) {
        Pilas pilas = new Pilas(5);
        pilas.insertar(32);
        pilas.insertar(39);
        pilas.insertar(19);
        pilas.insertar(14);
        pilas.insertar(30);
        System.out.println("Elementos agregados a la pila con exito");
        pilas.mostrar();
        System.out.println();
        System.out.println();
        System.out.println("elemento en la cima de la pila es: " + pilas.cimapila());
        System.out.println();
        System.out.println();
        System.out.println("la pila esta llena? " + pilas.pilallena());
        System.out.println();
        System.out.println();
        System.out.println("elementos quitados de la pila: ");
        while (!pilas.pilavacia()) {
            Object valor = pilas.quitar();
            System.out.println("valor quitado: " + valor);
        }
        System.out.println();
        System.out.println();
        System.out.println("La pila esta vacia? " + pilas.pilavacia());

        System.out.println();
        System.out.println();
        pilas.insertar(4566);
        pilas.insertar(123213);
        pilas.insertar(74839);

        System.out.println("el tamaño de la pila es: " + pilas.tamanopila());
    }
}
