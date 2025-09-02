package teoria.ManejoFechasHoras.test;

import java.time.LocalDate;
import java.time.format.DateTimeFormatter;
import java.util.Locale;
import teoria.ManejoFechasHoras.pos.Compras;

public class TestMain {

  public static void main(String[] args) {
    Compras c1 = new Compras("Producto 1", 500.50);
    Compras c2 = new Compras();
    System.out.println(c1);
    System.out.println(c2);
    System.out.println("Fecha compra (formateada): " + c1.formateoFechas());
    c1.textoAFecha();

    LocalDate ahora = LocalDate.now();
    DateTimeFormatter formato = DateTimeFormatter.ofPattern(
      "EEEE, dd MMMM yyyy"
    );
    System.out.println("Fecha actual: " + ahora.format(formato));

    DateTimeFormatter formatoIngles = DateTimeFormatter.ofPattern(
      "EEEE, dd MMMM yyyy",
      Locale.ENGLISH
    );
    System.out.println("Fecha actual (inglés): " + ahora.format(formatoIngles));

    DateTimeFormatter formatoEspMex = DateTimeFormatter.ofPattern(
      "EEEE, dd MMMM yyyy",
      Locale.of("es", "MX")
    );
    System.out.println(
      "Fecha actual (Español México): " + ahora.format(formatoEspMex)
    );
  }
}
