package Clase11.Tema1.Ejercicio1;

public class ListaEstatica {
    private int[] datos;
    private int cantidad;

    // Constructor
    public ListaEstatica(int capacidad) {
        datos = new int[capacidad];
        cantidad = 0;
    }

    public void insertar(int valor) {
        if (cantidad == datos.length) {
            throw new RuntimeException("La lista está llena");
        }
        datos[cantidad] = valor;
        cantidad++;
    }

    public int buscar(int valor) {
        for (int i = 0; i < cantidad; i++) {
            if (datos[i] == valor) {
                return i;
            }
        }
        return -1;
    }

    public void mostrar() {
        for (int i = 0; i < cantidad; i++) {
            System.out.print(datos[i] + " ");
        }
        System.out.println();
    }

    public static void main(String[] args) {
        ListaEstatica lista = new ListaEstatica(5);

        lista.insertar(10);
        lista.insertar(20);
        lista.insertar(30);
        lista.insertar(40);

        System.out.print("Lista: ");
        lista.mostrar();

        System.out.println("Buscar 40: " + lista.buscar(40));
        System.out.println("Buscar 99: " + lista.buscar(99));
    }
}