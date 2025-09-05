package teoria.interfaces.ejemploPagosLogger.impl;

import teoria.interfaces.ejemploPagosLogger.interfaces.Logger;

public class LoggerConsola implements Logger {

  @Override
  public void log(String mensaje) {
    System.out.println(mensaje);
  }
}
