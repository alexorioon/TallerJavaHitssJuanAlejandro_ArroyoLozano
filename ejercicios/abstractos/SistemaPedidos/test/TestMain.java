package test;

import clases.Order;
import enums.OrderPriority;
import enums.OrderStatus;
import enums.PaymentMethod;

public class TestMain {
    public static void main(String[] args) {
        Order o1 = new Order("Ana", OrderStatus.NEW, OrderPriority.HIGH, PaymentMethod.CARD);
        Order o2 = new Order("Luis", OrderStatus.SHIPPED, OrderPriority.MEDIUM, PaymentMethod.CASH);
        Order o3 = new Order("Marta", OrderStatus.DELIVERED, OrderPriority.LOW, PaymentMethod.TRANSFER);
        System.out.println(o1.showDetails());
        System.out.println(o2.showDetails());
        System.out.println(o3.showDetails());   
    }
}
