package teoria.herencia.herenciabanco.clases;

public class CuentaAhorro extends CuentaBancaria {

  private double tasaInteres;

  public CuentaAhorro(String titular, double saldo, double tasaInteres) {
    super(titular, saldo);
    this.tasaInteres = tasaInteres;
  }

  public void aplicarIntereses() {
    saldo += saldo * tasaInteres;
  }

  @Override
  public void mostrarInfo() {
    super.mostrarInfo();
    System.out.println(
      "Tipo Ahorros | Tasa de interés: " + (tasaInteres * 100) + "%"
    );
  }
}
