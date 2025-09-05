package teoria.interfaces.ejemploPagosLogger.interfaces;

public sealed interface MetodoPago permits PagoTarjetaCredito, PagoPayPal{
  /*Java 17+
      sealed interface -> permits Clase(s) o interface(s), (separamos con comas)
      las clases o interfaces que implementen este tipo de interfaz
      deben ser final, sealed o non-sealed */
  public void pago(double cantidad);
}
