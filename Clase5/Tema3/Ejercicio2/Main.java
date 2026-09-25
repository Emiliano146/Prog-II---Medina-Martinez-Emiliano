package Clase5.Tema3.Ejercicio2;

public class Main {
    public static void main(String[] args) {
        
        Concesionaria cars = new Concesionaria("Cars");

        System.out.println("Bienvenido a la concesionaria " + cars.getNombre() + ".");

        Vehiculo auto1 = new Vehiculo("Toyota", "Corolla", 50000000);
        Vehiculo auto2 = new Vehiculo("Volkswagen", "Nivus", 44000000);
        Vehiculo auto3 = new Vehiculo("Ford", "Bronco", 63000000);
        Vehiculo auto4 = new Vehiculo("Ferrari", "Roma", 99999999);
        Vehiculo auto5 = new Vehiculo("Chevrolet", "Sonic", 40000000);

        cars.agregarVehiculo(auto1);
        cars.agregarVehiculo(auto2);
        cars.agregarVehiculo(auto3);
        cars.agregarVehiculo(auto4);
        cars.agregarVehiculo(auto5);

        System.out.println(cars.buscarPorMarca("Volkswagen"));

        cars.valorTotalStock();

        // Esta búsqueda no dará un resultado
        System.out.println(cars.buscarPorMarca("Fiat"));

    }
}

// Este me tomó un buen rato, tuve que buscar como se usa ArraList