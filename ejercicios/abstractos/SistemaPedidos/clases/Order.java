package ejercicios.abstractos.SistemaPedidos.clases;

import ejercicios.abstractos.SistemaPedidos.enums.OrderPriority;
import ejercicios.abstractos.SistemaPedidos.enums.OrderStatus;
import ejercicios.abstractos.SistemaPedidos.enums.PaymentMethod;

public class Order {

  private final int idOrder;
  private String nameCustomer;
  private OrderStatus status;
  private OrderPriority priority;
  private PaymentMethod paymentMethod;

  private static int contador;

  public Order(
    String nameCustomer,
    OrderStatus status,
    OrderPriority priority,
    PaymentMethod paymentMethod
  ) {
    this.idOrder = ++contador;
    this.nameCustomer = nameCustomer;
    this.status = status;
    this.priority = priority;
    this.paymentMethod = paymentMethod;
  }

  public String showDetails() {
    return String.format(
      "Pedido #%d" +
      "%nCustomer: %s" +
      "%nStatus: %s --> %s" +
      "%nPriority: %s (Nivel %d)" +
      "%nPayment Method: %s --> %s" +
      "%n----------------------------------------------------%n",
      idOrder,
      nameCustomer,
      status,
      status.mensaje(),
      priority,
      priority.priority(),
      paymentMethod,
      paymentMethod.descripcion()
    );
  }
}
