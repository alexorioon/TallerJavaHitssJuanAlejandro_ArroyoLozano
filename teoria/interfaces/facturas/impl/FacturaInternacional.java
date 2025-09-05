package teoria.interfaces.facturas.impl;

import teoria.interfaces.facturas.interfaces.Factura;

public class FacturaInternacional implements Factura {
  private double subtotal;
  private final double TAX;
  
  public FacturaInternacional(double subtotal) {
    this.subtotal = subtotal;
    TAX = 0.10;
  }
  @Override
  public double calcularTotal() {
    return subtotal + (subtotal * TAX);
  }

  @Override
  public String obtenerDetalles() {
    return "Factura Internacional - Subtotal: " + subtotal + " | Total: " + calcularTotal();
  }
}
