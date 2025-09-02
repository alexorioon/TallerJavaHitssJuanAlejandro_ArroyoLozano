package teoria.estaticos.sistemapos.test;

import teoria.estaticos.sistemapos.clases.Producto;
import teoria.estaticos.sistemapos.clases.Venta;

public class TestMain {

  public static void main(String[] args) {
    // Crear tres productos
    Producto p1 = new Producto("Leche Santa Clara 1L", 30.45);
    System.out.println(p1);
    Producto p2 = new Producto("Galletas Marías Gamesa 30g", 12.56);
    System.out.println(p2);
    Producto p3 = new Producto("Refresco CocaCola 600ml", 20);
    System.out.println(p3);

    System.out.println("------------Ventas------------");
    Venta v1 = new Venta(p1, 5);
    System.out.println(v1);
    Venta v2 = new Venta(p3, 3);
    System.out.println(v2);
    Venta v3 = new Venta(new Producto("Pan Tostado Bimbo", 32.40), 2);
    System.out.println(v3);
  }
}
