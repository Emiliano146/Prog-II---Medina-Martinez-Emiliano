package ClaseMarkov;

import java.io.*;
import java.util.*;

public class PredictorMarkovK {
    public static void main(String[] args) throws IOException {
        // Leer todo el archivo como una sola cadena
        StringBuilder sb = new StringBuilder();
        BufferedReader lector = new BufferedReader(new FileReader("ClaseMarkov/texto.txt"));
        String linea;
        while ((linea = lector.readLine()) != null) {
            sb.append(linea.toLowerCase()).append(' ');
        }
        lector.close();
        String texto = sb.toString().replaceAll("[.,;:!?\"()]", "");
        int k = 4;

        // Estado inicial: un fragmento de k caracteres tomado del texto
        int inicio = (int) (Math.random() * (texto.length() - k));
        String actual = texto.substring(inicio, inicio + k);
        StringBuilder generado = new StringBuilder(actual);

        // Generar 60 caracteres nuevos
        for (int c = 0; c < 60; c++) {
            // Buscar todas las ocurrencias del estado actual y guardar el carácter que
            // sigue
            List<Character> posibles = new ArrayList<>();
            for (int i = 0; i + k < texto.length(); i++) {
                if (texto.startsWith(actual, i)) {
                    posibles.add(texto.charAt(i + k));
                }
            }
            if (posibles.isEmpty())
                break;

            // Elegir uno al azar y actualizar el estado con los últimos k caracteres
            char siguiente = posibles.get((int) (Math.random() * posibles.size()));
            generado.append(siguiente);
            actual = generado.substring(generado.length() - k);
        }
        System.out.println("Texto generado: " + generado);
    }
}