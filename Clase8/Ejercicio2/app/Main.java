
package Clase8.Ejercicio2.app;

import Clase8.Ejercicio2.modelo.*;

public class Main {

    public static void main(String[] args) {

        CentroCoworking centro = new CentroCoworking();

        // Crear dos escritorios individuales
        EscritorioIndividual escritorio1 = new EscritorioIndividual("E01", 1, 1000, true);

        EscritorioIndividual escritorio2 = new EscritorioIndividual("E02", 1, 800, false);

        // Crear dos salas de reuniones
        SalaReuniones sala1 = new SalaReuniones("S01", 8, 3000, 500, true);

        SalaReuniones sala2 = new SalaReuniones("S02", 12, 4000, 0, true);

        // Registrar los cuatro espacios
        centro.registrarEspacio(escritorio1);
        centro.registrarEspacio(escritorio2);
        centro.registrarEspacio(sala1);
        centro.registrarEspacio(sala2);

        // Probar la primera sobrecarga
        System.out.println(escritorio1.nuevaCapacidad(2));

        // Probar la segunda sobrecarga
        System.out.println(
                sala1.nuevaCapacidad(10, true));

        // Intentar crear un espacio con datos inválidos
        try {
            EscritorioIndividual escritorioInvalido = new EscritorioIndividual("", 1, 1000, false);

            centro.registrarEspacio(escritorioInvalido);

        } catch (IllegalArgumentException e) {
            System.out.println("\nError al crear el espacio: " + e.getMessage());
        }

        // Mostrar el reporte para una reserva de 3 horas
        centro.mostrarReporte(3);
    }
}