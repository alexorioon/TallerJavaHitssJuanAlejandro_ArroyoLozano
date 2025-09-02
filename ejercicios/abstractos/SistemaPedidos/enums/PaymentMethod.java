package ejercicios.abstractos.SistemaPedidos.enums;

public enum PaymentMethod {
  CASH {
    @Override
    public String descripcion() {
      return "Efectivo";
    }
  },
  CARD {
    @Override
    public String descripcion() {
      return "Tarjeta de crédito/débito";
    }
  },
  TRANSFER {
    @Override
    public String descripcion() {
      return "Transferencia bancaria";
    }
  };

  //  Método abstracto que cada constante debe implementar
  public abstract String descripcion();
}
