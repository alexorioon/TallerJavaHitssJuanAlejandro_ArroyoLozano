package teoria.enumeracionesyabstractos.enumeraciones1.test;

import teoria.enumeracionesyabstractos.enumeraciones1.enums.Calificacion;
import teoria.enumeracionesyabstractos.enumeraciones1.enums.Dia;

public class TestMain {

  private static String verificarDias(Dia dia) {
    String respuesta = switch (dia) {
      case SABADO, DOMINGO -> "Finde semana";
      default -> "Día laboral";
    };
    return respuesta;
  }

  public static void main(String[] args) {
    System.out.println("Día Lunes: " + verificarDias(Dia.LUNES));
    System.out.println("Día viernes: " + verificarDias(Dia.VIERNES));
    System.out.println("Día sábado: " + verificarDias(Dia.SABADO));
    System.out.println(Dia.JUEVES);
    for (Calificacion cal : Calificacion.values()) {
      System.out.println("Valor ordinal: " + cal.ordinal());
      System.out.println("Nombre: " + cal.name());
      System.out.println("Calificación: " + cal.getDescripcion());
    }
  }
}
