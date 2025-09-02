package ejercicios.abstractos.SistemaPedidos.test;

import ejercicios.abstractos.SistemaPedidos.clases.Order;
import ejercicios.abstractos.SistemaPedidos.enums.OrderPriority;
import ejercicios.abstractos.SistemaPedidos.enums.OrderStatus;
import ejercicios.abstractos.SistemaPedidos.enums.PaymentMethod;

public class TestMain {

  public static void main(String[] args) {
    Order o1 = new Order(
      "Ana",
      OrderStatus.NEW,
      OrderPriority.HIGH,
      PaymentMethod.CARD
    );
    Order o2 = new Order(
      "Luis",
      OrderStatus.SHIPPED,
      OrderPriority.MEDIUM,
      PaymentMethod.CASH
    );
    Order o3 = new Order(
      "Marta",
      OrderStatus.DELIVERED,
      OrderPriority.LOW,
      PaymentMethod.TRANSFER
    );
    System.out.println(o1.showDetails());
    System.out.println(o2.showDetails());
    System.out.println(o3.showDetails());
  }
}
