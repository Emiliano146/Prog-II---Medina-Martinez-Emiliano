package tema1_ejercicio2;

public class Empleado {
    
    private String nombre;
    private int legajo;

    //  Constructor parametrizado
    public Empleado(String nombre, int legajo) {
        this.nombre = nombre;
        this.legajo = legajo;
    }

    public String getNombre() {
        return nombre;
    }

    public int getLegajo() {
        return legajo;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public void setLegajo(int legajo) {
        this.legajo = legajo;
    }

    public int calcularSueldo() {
        return 0;
    }

    public static void main(String[] args) {
        Empleado e1, e2, e3, e4;
        e1 = new Empleado("Juan", 123);
        e2 = new Empleado("Maria", 456);
        e3 = new Empleado("Pedro", 789);
        e4 = new Empleado("Ana", 500);

        legajoMayor_y_Menor(e1, e2, e3, e4);
    }

    public static void legajoMayor_y_Menor(Empleado e1, Empleado e2, Empleado e3, Empleado e4) {

        Empleado mayor = e1;
        Empleado menor = e1;

        if (e2.getLegajo() > mayor.getLegajo()) {
           mayor = e2;
        }

        if (e3.getLegajo() > mayor.getLegajo()) {
            mayor = e3;
        }

        if (e4.getLegajo() > mayor.getLegajo()) {
            mayor = e4;
        }

        if (e2.getLegajo() < menor.getLegajo()) {
            menor = e2;
        }

        if (e3.getLegajo() < menor.getLegajo()) {
            menor = e3;
        }

        if (e4.getLegajo() < menor.getLegajo()) {
            menor = e4;
        }

        System.out.println("Empleado con legajo mayor: " + mayor.getNombre() + ", Legajo: " + mayor.getLegajo());
        System.out.println("Empleado con legajo menor: " + menor.getNombre() + ", Legajo: " + menor.getLegajo());
    }
}