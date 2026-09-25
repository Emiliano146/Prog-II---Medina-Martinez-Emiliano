package Clase5.Tema3.Ejercicio1;

public class CuentaBancaria {
    private String titular;
    private int numeroCuenta;
    private double saldo;

    // Constructor n°1
    public CuentaBancaria(String titular, int numeroCuenta, double saldo) {
        this.titular = titular;
        this.numeroCuenta = numeroCuenta;
        this.saldo = saldo;
    }

    // Constructor n°2
    public CuentaBancaria(String titular, int numeroCuenta) {
        this(titular, numeroCuenta, 0);
    }

    public String getTitular() {
        return titular;
    }

    public int getNumeroCuenta() {
        return numeroCuenta;
    }

    public double getSaldo() {
        return saldo;
    }

    public void setTitular(String titular) {
        if (titular == null || titular.trim().isEmpty()) {
            throw new IllegalArgumentException("El titular no puede ser vacío");
        } else {
            this.titular = titular;
        }
    }

    public void setNumeroCuenta(int numeroCuenta) {
        this.numeroCuenta = numeroCuenta;
    }

    public void setSaldo(double saldo) {
        if (saldo < 0) {
            throw new IllegalArgumentException("El saldo no puede ser negativo");
        } else {
            this.saldo = saldo;
        }
    }

    // Uso %.2f%n para que solo me muestre 2 decimales.

    public void depositar(double monto) {
        if (monto < 0) {
            throw new IllegalArgumentException("El monto a depositar no puede ser negativo.");
        } else {
            setSaldo(getSaldo() + monto);
            System.out.printf("Depositado: $%.2f%n", monto);
            System.out.printf("Nuevo saldo: $%.2f%n", getSaldo());
        }
    }


    public void extraer(double monto) {
        if (monto < 0) {
            throw new IllegalArgumentException("El monto a extraer no puede ser negativo.");
        } else {
            if (getSaldo() - monto < 0) {
                throw new IllegalArgumentException("Saldo insuficiente.");
            } else {
                setSaldo(getSaldo() - monto);
                System.out.printf("Extraido: $%.2f%n", monto);
                System.out.printf("Nuevo saldo: $%.2f%n", getSaldo());
            }
        }
    }
}