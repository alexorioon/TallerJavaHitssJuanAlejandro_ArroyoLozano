package teoria.interfaces.facturas.test;

import teoria.interfaces.facturas.impl.FacturaInternacional;
import teoria.interfaces.facturas.impl.FacturaNacional;
import teoria.interfaces.facturas.interfaces.*;

public class PruebaFactura {
  public static void main(String[] args) {
    Factura fac1 = new FacturaNacional(10000);
    Factura fac2 = new FacturaInternacional(10000);
    
    System.out.println(fac1.obtenerDetalles());
    System.out.println(fac2.obtenerDetalles());
  }
}
