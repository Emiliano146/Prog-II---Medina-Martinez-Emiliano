package Clase8.app;

import Clase8.modelo.PaqueteEstandar;
import Clase8.modelo.PaqueteFragil;

public class Main {
    

    public static void main(String[] args) {
        // Método main que instancie un CentroLogistico, agregue al menos 2 paquetes
        // estándar y 2 frágiles, invoque la sobrecarga de actualizarDestino, pruebe la
        // captura de excepciones con un valor inválido y muestre el reporte final.

        CentroLogistico centro = new CentroLogistico();

        // Agregar paquetes estándar
        PaqueteEstandar paquete1 = new PaqueteEstandar("ABC123", 2.5, "Ciudad A", 10);
        PaqueteEstandar paquete2 = new PaqueteEstandar("DEF456", 11.9, "Ciudad B", 5);

        // Agregar paquetes frágiles
        PaqueteFragil paquete3 = new PaqueteFragil("GHI789", 3.3, "Ciudad C", "Alta");
        PaqueteFragil paquete4 = new PaqueteFragil("JKL012", 6.1, "Ciudad D", "Media");

        // Registrar paquetes en el centro logístico
        centro.registrarPaquete(paquete1);
        centro.registrarPaquete(paquete2);

        centro.registrarPaquete(paquete3);
        centro.registrarPaquete(paquete4);

        // Invocar la sobrecarga de actualizarDestino
        paquete1.actualizarDestino("Ciudad E");

        // Probar la captura de excepciones con un valor inválido
        try {
            PaqueteFragil paqueteInvalido = new PaqueteFragil("MNO345", 23.4, "Ciudad F", "Muy Alta");
            System.out.println("Paquete frágil creado exitosamente: " + paqueteInvalido.toString());
        } catch (IllegalArgumentException e) {
            System.out.println("Error al crear paquete frágil: " + e.getMessage());
        }

        // Mostrar el reporte final
        centro.mostrarReporteEnvios();

    }
}
