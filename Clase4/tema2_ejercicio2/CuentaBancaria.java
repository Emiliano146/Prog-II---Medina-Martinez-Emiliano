package tema2_ejercicio2;

public class CuentaBancaria {

    String titular;
    int numeroCuenta;
    double saldo;

    //  Constructor parametrizado
    public CuentaBancaria(String titular, int numeroCuenta, double saldo) {

        setTitular(titular);
        setNumeroCuenta(numeroCuenta);
        setSaldo(saldo);
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
        if (titular == null || titular.isEmpty()) {
            throw new IllegalArgumentException("Ingrese un titular válido");
        }
        this.titular = titular;
    }

    public void setNumeroCuenta(int numeroCuenta) {
        this.numeroCuenta = numeroCuenta;
    }

    public void setSaldo(double saldo) {
        if (saldo < 0) {
            throw new IllegalArgumentException("El saldo no puede ser negativo");
        }
        this.saldo = saldo;
    }

    public void depositar(double monto) {
        if (monto <= 0) {
            throw new IllegalArgumentException("La cantidad a depositar debe ser positiva");
        }
        saldo += monto;
        System.out.println("Depósito realizado. Nuevo saldo: " + saldo);
    }

    public void extraer(double monto) {
        if (monto <= 0) {
            throw new IllegalArgumentException("La cantidad a extraer debe ser positiva");
        }
        if (monto > saldo) {
            throw new IllegalArgumentException("Saldo insuficiente");
        }
        saldo -= monto;
        System.out.println("Extracción realizada. Nuevo saldo: " + saldo);
    }

    public static void main(String[] args) {

        CuentaBancaria c1, c2;

        c1 = new CuentaBancaria("Juan", 1, 1000.);

        System.out.println("Titular: " + c1.getTitular());
        System.out.println("Número de cuenta: " + c1.getNumeroCuenta());
        System.out.println("Saldo: " + c1.getSaldo());

        c2 = new CuentaBancaria("Maria", 2, 2000);

        System.out.println("Titular: " + c2.getTitular());
        System.out.println("Número de cuenta: " + c2.getNumeroCuenta());
        System.out.println("Saldo: " + c2.getSaldo());

        c1.depositar(246.22);
        c1.extraer(463.50);

        try {
            c1.depositar(-500);
        } catch (IllegalArgumentException e) {
            System.out.println(e.getMessage());
        }

        try {
            c2.extraer(9999999);
        } catch (IllegalArgumentException e) {
            System.out.println(e.getMessage());
        }
    }
}

