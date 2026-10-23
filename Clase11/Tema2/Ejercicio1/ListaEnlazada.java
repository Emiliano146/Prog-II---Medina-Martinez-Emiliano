package Clase11.Tema2.Ejercicio1;

public class ListaEnlazada {

    private Nodo cabeza;

    // Clase interna Nodo
    private class Nodo {
        int dato;
        Nodo siguiente;

        public Nodo(int dato) {
            this.dato = dato;
            this.siguiente = null;
        }
    }

    // Constructor
    public ListaEnlazada() {
        cabeza = null;
    }

    public void insertarInicio(int dato) {
        Nodo nuevoNodo = new Nodo(dato);
        nuevoNodo.siguiente = cabeza;
        cabeza = nuevoNodo;
    }

    public void insertarFinal(int dato) {
        Nodo nuevoNodo = new Nodo(dato);

        if (cabeza == null) {
            cabeza = nuevoNodo;
        } else {
            Nodo actual = cabeza;

            while (actual.siguiente != null) {
                actual = actual.siguiente;
            }

            actual.siguiente = nuevoNodo;
        }
    }

    public boolean buscar(int valor) {
        Nodo actual = cabeza;

        while (actual != null) {
            if (actual.dato == valor) {
                return true;
            }
            actual = actual.siguiente;
        }

        return false;
    }

    public int tamanio() {
        int contador = 0;
        Nodo actual = cabeza;

        while (actual != null) {
            contador++;
            actual = actual.siguiente;
        }

        return contador;
    }

    public void mostrar() {
        Nodo actual = cabeza;

        while (actual != null) {
            System.out.print(actual.dato + " -> ");
            actual = actual.siguiente;
        }

        System.out.println("null");
    }

    public static void main(String[] args) {
        ListaEnlazada lista = new ListaEnlazada();

        lista.insertarFinal(10);
        lista.insertarInicio(5);
        lista.insertarFinal(20);
        lista.insertarInicio(1);

        System.out.print("Lista: ");
        lista.mostrar();

        System.out.println("Tamaño: " + lista.tamanio());
        System.out.println("¿Existe el 10? " + lista.buscar(10));
        System.out.println("¿Existe el 99? " + lista.buscar(99));
    }
}