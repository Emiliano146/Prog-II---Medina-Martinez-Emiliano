package Tema1.Ejercicio2;

public class Main {

    public static String legajoAltoyBajo(Empleado e1, Empleado e2, Empleado e3, Empleado e4) {
        int legajoAlto = e1.getLegajo();
        String nombreAlto = e1.getNombre();
        
        if (legajoAlto < e2.getLegajo()) {
            legajoAlto = e2.getLegajo();
            nombreAlto = e2.getNombre();
        }

        if (legajoAlto < e3.getLegajo()) {
            legajoAlto = e3.getLegajo();
            nombreAlto = e3.getNombre();
        }

        if (legajoAlto < e4.getLegajo()) {
            legajoAlto = e4.getLegajo();
            nombreAlto = e4.getNombre();
        }

        int legajoBajo = e1.getLegajo();
        String nombreBajo = e1.getNombre();

        if (legajoBajo > e2.getLegajo()) {
            legajoBajo = e2.getLegajo();
            nombreBajo = e2.getNombre();
        }

        if (legajoBajo > e3.getLegajo()) {
            legajoBajo = e3.getLegajo();
            nombreBajo = e3.getNombre();
        }

        if (legajoBajo > e4.getLegajo()) {
            legajoBajo = e4.getLegajo();
            nombreBajo = e4.getNombre();
        }

        return "El legajo más alto es " + legajoAlto + ", de " + nombreAlto + ", y el legajo más bajo es " + legajoBajo + ", de " + nombreBajo + ".";

    }
    
    public static void main(String[] args) {
        Empleado e1 = new Empleado("Emi", 12345);
        Empleado e2 = new Empleado("Juan", 54321);
        Empleado e3 = new Empleado("Ana", 67890);
        Empleado e4 = new Empleado("Luis", 98765);

        System.out.println(legajoAltoyBajo(e1, e2, e3, e4));
    }

}
