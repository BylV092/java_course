package pilas;

public class Pilas {
    private Object[] arraypila;
    private int tamanopila;
    private int cima;

    public Pilas(int tamano) {
        this.tamanopila = tamano;
        cima = cima - 1;
        arraypila = new Object[tamanopila];
    }

    public void insertar(Object elememto) {
        cima += 1;
        arraypila[cima] = elememto;
    }

    public Object quitar() {
        Object temp = arraypila[cima];
        cima -= 1;
        return temp;
    }

    public Object cimapila() {
        return arraypila[cima];

    }

    public boolean pilavacia() {
        return cima == -1;

    }

    public boolean pilallena() {
        return cima == tamanopila - 1;
    }

     public int tamanopila(){
        return cima+1;

    }

    public void mostrar(){
        for (int i =0;i<arraypila.length;i++){
            System.out.println(arraypila[i]);
            System.out.println("--");
        }
    }

}
