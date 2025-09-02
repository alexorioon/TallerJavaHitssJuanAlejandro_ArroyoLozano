package teoria.herencia.herenciabanco.clases;

public class CuentaBancaria {

  protected Integer cuentaId;
  protected String titular;
  protected double saldo;
  private static Integer contador = 0;

  public CuentaBancaria() {}

  public CuentaBancaria(String titular, double saldo) {
    this.cuentaId = ++contador;
    this.titular = titular;
    this.saldo = saldo;
  }

  public void depositar(double cantidad) {
    if (cantidad > 0) {
      saldo += cantidad;
    }
  }

  public void retirar(double cantidad) {
    if (cantidad > 0) {
      if (cantidad <= saldo) {
        saldo -= cantidad;
      } else {
        System.out.println("Saldo insuficiente");
      }
    }
  }

  public void mostrarInfo() {
    System.out.println(
      "Cuenta #" + cuentaId + "| Titular: " + titular + "| Saldo $" + saldo
    );
  }
}
