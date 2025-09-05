package teoria.interfaces.ejemploPagosLogger.test;

import teoria.interfaces.ejemploPagosLogger.interfaces.MetodoPago;
import teoria.interfaces.ejemploPagosLogger.interfaces.PagoPayPal;
import teoria.interfaces.ejemploPagosLogger.interfaces.PagoTarjetaCredito;

public class Prueba {
  public static void main(String[] args) {
    MetodoPago[] metodoPagos = new MetodoPago[5];
    
    MetodoPago pago1 = new PagoTarjetaCredito();
    MetodoPago pago2 = new PagoPayPal();
    MetodoPago pago3 = new PagoTarjetaCredito();

    metodoPagos[0] = pago1;
    metodoPagos[1] = pago2;
    metodoPagos[2] = pago3;

    pago1.pago(1500);
    pago2.pago(950.50);
    pago3.pago(2500);

    for (MetodoPago metodoPago : metodoPagos) {
      System.out.println(metodoPago);
    }
  }
}
