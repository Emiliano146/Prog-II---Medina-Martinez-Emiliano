package Clase11.Tema2.Ejercicio2;

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

    public int contarOcurrencias(int valor) {
        int contador = 0;
        Nodo actual = cabeza;

        while (actual != null) {
            if (actual.dato == valor) {
                contador++;
            }
            actual = actual.siguiente;
        }

        return contador;
    }

    public void eliminarTodas(int valor) {
        while (cabeza != null && cabeza.dato == valor) {
            cabeza = cabeza.siguiente;
        }

        Nodo actual = cabeza;

        while (actual != null && actual.siguiente != null) {
            if (actual.siguiente.dato == valor) {
                actual.siguiente = actual.siguiente.siguiente;
            } else {
                actual = actual.siguiente;
            }
        }
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

        lista.insertarFinal(10);
        lista.insertarFinal(10);
        lista.insertarInicio(10);
        System.out.println("Lista con muchos 10: ");
        lista.mostrar();
        System.out.println("Ocurrencias del 10: " + lista.contarOcurrencias(10));

        lista.eliminarTodas(10);
        System.out.print("Lista después de eliminar todas las ocurrencias del 10: ");
        lista.mostrar();
    }
}

// En una ListaEstatica, eliminar todas las ocurrencias de un valor
// manteniendo los elementos contiguos puede requerir desplazar los
// elementos posteriores a cada eliminación para llenar los espacios vacíos.
// Estos desplazamientos pueden aumentar el costo de la operación.

// En una ListaEnlazada, en cambio, basta con modificar los enlaces
// entre nodos para eliminar un elemento, sin desplazar los demás.

// Si se eliminan las ocurrencias individualmente en una ListaEstatica,
// el costo total puede llegar a ser O(n²) en el peor caso,
// mientras que en esta ListaEnlazada la operación eliminarTodas()
// tiene un costo temporal de O(n).