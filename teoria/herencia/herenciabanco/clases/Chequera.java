package teoria.herencia.herenciabanco.clases;

public class Chequera extends CuentaBancaria{
    private double limite;

    public Chequera() {
    }

    public Chequera(String titular, double saldo, double limite) {
        super(titular, saldo);
        this.limite = limite;
    }

    @Override
    public void retirar(double cantidad) {
        if (saldo + limite >= cantidad) {
            saldo -= cantidad;
        } else {
            System.out.println("ERROR: Excede el límite de retiro");
        }
    }

    @Override
    public void mostrarInfo() {
        System.out.println("Cuenta #" + cuentaId);
        System.out.println("Titular: " + titular);
        System.out.println("Saldo: " + saldo);
        System.out.println("Tipo: Chequera | Límite: " + limite);
    }

    
}
