package teoria.interfaces.ejemploPagosLogger.test;

import teoria.interfaces.ejemploPagosLogger.impl.LoggerConsola;
import teoria.interfaces.ejemploPagosLogger.interfaces.Logger;

public class PruebaLogger {

  public static void main(String[] args) {
    Logger logger = new LoggerConsola();
    logger.info("Hola");
    logger.error("Error");
  }
}
