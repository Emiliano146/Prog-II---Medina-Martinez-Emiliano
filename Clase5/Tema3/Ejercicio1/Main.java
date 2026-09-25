package Clase5.Tema3.Ejercicio1;

public class Main {
    public static void main(String[] args) {

        CuentaBancaria cuenta1 = new CuentaBancaria("Emi", 342342, 999);
        CuentaBancaria cuenta2 = new CuentaBancaria("Gonzalo", 223344);

        System.out.println("Cuenta1");
        System.out.println("Titular: " + cuenta1.getTitular());
        System.out.println("Número: " + cuenta1.getNumeroCuenta());
        System.out.println("Saldo: $" + cuenta1.getSaldo());
        
        System.out.println("Cuenta2");
        System.out.println("Titular: " + cuenta2.getTitular());
        System.out.println("Número: " + cuenta2.getNumeroCuenta());
        System.out.println("Saldo: $" + cuenta2.getSaldo());

    }
}