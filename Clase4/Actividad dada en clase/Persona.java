import java.time.LocalDate;
import java.time.Period;

class Persona {

    // Atributos privados
    private String nombre;
    private int edad;
    private LocalDate fechaNacimiento;
    private String mes;

    // Getter de nombre
    public String getNombre() {
        return nombre;
    }

    // Setter de nombre
    public void setNombre(String nombre) {

        if (nombre == null || nombre.trim().isEmpty()) {
            throw new IllegalArgumentException("El nombre no puede estar vacío.");
        }

        this.nombre = nombre;

    }

    // Getter de edad
    public int getEdad() {
        return edad;
    }

    // Setter de edad
    public void setEdad(int edad) {
        this.edad = edad;
    }

    // Getter de fechaNacimiento
    public LocalDate getFechaNacimiento() {
        return fechaNacimiento;
    }

    // Setter de fechaNacimiento
    public void setFechaNacimiento(LocalDate fechaNacimiento) {
        
        if (fechaNacimiento.isAfter(LocalDate.now())) {
            throw new IllegalArgumentException("La fecha de nacimiento no puede ser posterior a la fecha actual.");
        }

        this.fechaNacimiento = fechaNacimiento;
    }

    public void saludar() {

        LocalDate hoy = LocalDate.now();

        switch (fechaNacimiento.getMonthValue()) { // guardar el mes en la variable mes
            case 1:
                mes = "enero";
                break;
            case 2:
                mes = "febrero";
                break;
            case 3:
                mes = "marzo";
                break;
            case 4:
                mes = "abril";
                break;
            case 5:
                mes = "mayo";
                break;
            case 6:
                mes = "junio";
                break;
            case 7:
                mes = "julio";
                break;
            case 8:
                mes = "agosto";
                break;
            case 9:
                mes = "septiembre";
                break;
            case 10:
                mes = "octubre";
                break;
            case 11:
                mes = "noviembre";
                break;
            case 12:
                mes = "diciembre";
                break;
        }

        System.out.println("Hola, mi nombre es " + nombre + ", tengo " + edad + " años.");

        System.out.println("Mi fecha de nacimiento es: " + fechaNacimiento.getDayOfMonth() + " de " + mes + " del " + fechaNacimiento.getYear() + ".");

        // Calcular la edad usando Period
        Period edadCalculada = Period.between(fechaNacimiento, hoy);

        System.out.println("Tengo " + edadCalculada.getYears() + " años.");
    }

    public static void main(String[] args) {

        String mes = "";
        LocalDate hoy = LocalDate.now();

        switch (hoy.getMonthValue()) { // guardar el mes en la variable mes
            case 1:
                mes = "enero";
                break;
            case 2:
                mes = "febrero";
                break;
            case 3:
                mes = "marzo";
                break;
            case 4:
                mes = "abril";
                break;
            case 5:
                mes = "mayo";
                break;
            case 6:
                mes = "junio";
                break;
            case 7:
                mes = "julio";
                break;
            case 8:
                mes = "agosto";
                break;
            case 9:
                mes = "septiembre";
                break;
            case 10:
                mes = "octubre";
                break;
            case 11:
                mes = "noviembre";
                break;
            case 12:
                mes = "diciembre";
                break;
        }

        System.out.println("La fecha actual es: " + hoy.getDayOfMonth() + " de " + mes + " del " + hoy.getYear() + ".\n");

        Persona p1 = new Persona();

        p1.setNombre("Juan");
        p1.setEdad(30);
        p1.setFechaNacimiento(LocalDate.of(1993, 5, 15));

        p1.saludar();

        System.out.println(); // Línea en blanco

        Persona p2 = new Persona();

        p2.setNombre("María");
        p2.setEdad(25);
        p2.setFechaNacimiento(LocalDate.of(1998, 8, 22));

        p2.saludar();

        try {
            Persona p3 = new Persona();
            p3.setNombre("Carlos");
            p3.setEdad(40);
            p3.setFechaNacimiento(LocalDate.of(2099, 1, 1)); // Fecha futura para probar la excepción
        } catch (IllegalArgumentException e) {
            System.out.println("\nError: " + e.getMessage());
        }
    }
}