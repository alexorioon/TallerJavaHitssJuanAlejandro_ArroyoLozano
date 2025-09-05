package teoria.interfaces.ejemploPagosLogger.interfaces;

public final class PagoTarjetaCredito implements MetodoPago {

  @Override
  public void pago(double cantidad) {
    System.out.println("Pagando $" + cantidad + " con tarjeta de crédito");
  }
}
