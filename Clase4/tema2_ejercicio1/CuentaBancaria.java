package tema2_ejercicio1;

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

    public static void main(String[] args) {

        CuentaBancaria c1, c2, c3;

        c1 = new CuentaBancaria("Juan", 1, 1000.);

        System.out.println("Titular: " + c1.getTitular());
        System.out.println("Número de cuenta: " + c1.getNumeroCuenta());
        System.out.println("Saldo: " + c1.getSaldo());

        c2 = new CuentaBancaria("Maria", 2, 2000);

        System.out.println("Titular: " + c2.getTitular());
        System.out.println("Número de cuenta: " + c2.getNumeroCuenta());
        System.out.println("Saldo: " + c2.getSaldo());

        //////
        c3 = new CuentaBancaria("", 3, 1500);
        ////// Me va a pedir un titular válido y no va a imprimir

        System.out.println("Titular: " + c3.getTitular());
        System.out.println("Número de cuenta: " + c3.getNumeroCuenta());
        System.out.println("Saldo: " + c3.getSaldo());
    }
}
