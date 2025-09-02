package teoria.enumeracionesyabstractos.enumeraciones1.enums;

public enum Semaforo {
  /*
   * Emular un semáforo, cada constante va a implementar
   * el método accion(), que devuelva lo que el conductor,
   * debe debe de hacer, de acuerdo al color
   */
  ROJO {
    @Override
    public String accion() {
      return "Detenerse";
    }
  },
  AMARILLO {
    @Override
    public String accion() {
      return "Precaución";
    }
  },
  VERDE {
    @Override
    public String accion() {
      return "Avanzar";
    }
  };

  //  Método abstracto que cada constante debe implementar
  public abstract String accion();
}
