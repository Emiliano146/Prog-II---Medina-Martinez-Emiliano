package Clase11.Tema1.Ejercicio2;

public class ListaEstatica {
    private int[] datos;
    private int cantidad;

    // Constructor
    public ListaEstatica(int capacidad) {
        datos = new int[capacidad];
        cantidad = 0;
    }

    // Insertar al final
    public void insertar(int valor) {
        if (cantidad == datos.length) {
            throw new RuntimeException("La lista está llena");
        }

        datos[cantidad] = valor;
        cantidad++;
    }

    // Buscar un valor
    public int buscar(int valor) {
        for (int i = 0; i < cantidad; i++) {
            if (datos[i] == valor) {
                return i;
            }
        }

        return -1;
    }

    // Mostrar los elementos
    public void mostrar() {
        for (int i = 0; i < cantidad; i++) {
            System.out.print(datos[i] + " ");
        }
        System.out.println();
    }

    public void insertarEnPosicion(int indice, int valor) {

        // inserta desplazando los elementos existentes desde indice hacia la derecha

        if (cantidad == datos.length) {
            throw new RuntimeException("La lista está llena");
        }

        if (indice < 0 || indice > cantidad) {
            throw new IndexOutOfBoundsException("Índice fuera de rango");
        }

        for (int i = cantidad; i > indice; i--) {
            datos[i] = datos[i - 1];
        }

        datos[indice] = valor;
        cantidad++;
    }

    public void eliminarEnPosicion(int indice) {
        // elimina desplazando los elementos existentes desde indice hacia la izquierda

        if (indice < 0 || indice >= cantidad) {
            throw new IndexOutOfBoundsException("Índice fuera de rango");
        }

        for (int i = indice; i < cantidad - 1; i++) {
            datos[i] = datos[i + 1];
        }

        cantidad--;
    }

    // eliminar borra solo la primera ocurrencia del valor
    // ¿Còmo borrar todas?:
    public void eliminarValor(int valor) {
        int i = 0;
        while (i < cantidad) {
            if (datos[i] == valor) {
                eliminarEnPosicion(i); // Elimina el elemento en la posición i
            } else {
                i++; // Solo incrementa i si no se eliminó un elemento
            }
        }
    }

    public static void main(String[] args) {
        ListaEstatica lista = new ListaEstatica(10);

        // Insertar elementos
        lista.insertar(10);
        lista.insertar(20);
        lista.insertar(30);
        lista.insertar(40);

        // Mostrar elementos
        System.out.println("Elementos de la lista:");
        lista.mostrar();

        // Buscar un elemento
        int indice = lista.buscar(30);
        if (indice != -1) {
            System.out.println("Elemento 30 encontrado en el índice: " + indice);
        } else {
            System.out.println("Elemento 30 no encontrado");
        }

        // Insertar en una posición específica
        lista.insertarEnPosicion(2, 25);
        System.out.println("Elementos de la lista después de insertar 25 en la posición 2:");
        lista.mostrar();

        // Borrar todas las ocurrencias de un valor específico (por ejemplo, 20)

        lista.insertar(20);
        lista.insertar(20);
        lista.insertar(20);

        System.out.println("Elementos de la lista antes de borrar todas las ocurrencias de 20:");
        lista.mostrar();

        // Borrar todas las ocurrencias de 20
        lista.eliminarValor(20);
        System.out.println("Elementos de la lista después de borrar todas las ocurrencias de 20:");
        lista.mostrar();
    }
}