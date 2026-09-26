package Clase7.Tema2.Ejercicio1;

public class Main {
    public static void main(String[] args) {

        // En el anterior ejercicio ya había agregado los calcularArea() respectivos de cada subclase
        // Si no estuvieran, daría error, pues Figura no define el método, es abstracto

        Figura c = new Circulo(5);
        Figura r = new Rectangulo(5, 10);
        Figura t = new Triangulo(5, 10, 9);

        System.out.println("Area del círculo: " + c.calcularArea());
        System.out.println("Area del rectángulo: " + r.calcularArea());
        System.out.println("Area del triángulo: " + t.calcularArea());

        // Ya comprobé qué ocurriría si no se implementa el método calcularArea() a cada subclase
        // Da el siguiente error:

        // Exception in thread "main" java.lang.Error: Unresolved compilation problem: 
        // The type must implement the inherited abstract method Figura.calcularArea()

        // Y si intentás crear Figura f = new Figura("Figura");

        // Cannot instantiate the type Figura
    }
}