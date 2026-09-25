package Clase6.Tema1.Ejercicio2;

public class Main {
    public static void main(String[] args) {
        Circulo redondo = new Circulo("Círculo", 50);
        Rectangulo cuadrado = new Rectangulo("Rectángulo", 20, 20);

        try {
            Circulo errorRedondo = new Circulo("a", 56);
            System.out.println("Nombre de errorRedondo: " + errorRedondo.getNombre());
        } catch (IllegalArgumentException e) {
            System.out.println("Error: " + e.getMessage());
        }
    }
}


// AGREGAR LA FUNCION calcularArea() A FIGURA, LUEGO HACERLO EN CIRCULO Y RECTANGULO CON @override
// Se supone que va en Ejercicio_de_la_clase



/*

package Clase6.Ejercicio_de_la_clase;

public class Figura {

}

// Subclase concreta
class Circulo extends Figura {
    private final double radio;

    public Circulo(double radio) {
        super("Círculo");
        this.radio = radio;
    }

    @Override
    public double calcularArea() {
        return Math.PI * radio * radio;
    }
}

// Subclase concreta
class Rectangulo extends Figura {
    private final double base;
    private final double altura;

    public Rectangulo(double base, double altura) {
        super("Rectángulo");
        this.base = base;
        this.altura = altura;
    }

    @Override
    public double calcularArea() {
        return base * altura;
    }
}

*/
