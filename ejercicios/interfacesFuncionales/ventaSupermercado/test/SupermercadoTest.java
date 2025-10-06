package ejercicios.interfacesFuncionales.ventaSupermercado.test;

import ejercicios.interfacesFuncionales.ventaSupermercado.classes.Cliente;
import ejercicios.interfacesFuncionales.ventaSupermercado.classes.Empleado;
import ejercicios.interfacesFuncionales.ventaSupermercado.classes.Producto;
import ejercicios.interfacesFuncionales.ventaSupermercado.classes.Venta;
import ejercicios.interfacesFuncionales.ventaSupermercado.service.SupermercadoService;

import java.util.Arrays;
import java.util.List;

public class SupermercadoTest {
  public static void main(String[] args) {
    SupermercadoService supermercadoService = new SupermercadoService();

    // Crear algunos productos de prueba
    Producto p1 = new Producto(1, "Manzanas", 2.5, 10);
    Producto p2 = new Producto(2, "Leche", 3.0, 3);
    Producto p3 = new Producto(3, "Pan", 1.5, 2);
    Producto p4 = new Producto(4, "Queso", 5.0, 8);
    Producto p5 = new Producto(5, "Yogurt", 4.0, 1);
    Producto p6 = new Producto(6, "Cereal", 4.5, 0);
    Producto p7 = new Producto(7, "Jugo", 2.0, 6);
    Producto p8 = new Producto(8, "Carne", 12.0, 4);

    List<Producto> productos = Arrays.asList(p1, p2, p3, p4, p5, p6, p7, p8);

    // 1. Probar filtrado de productos con stock bajo
    System.out.println("=== Productos con stock bajo ===");
    List<Producto> stockBajo = supermercadoService.filtrarProductosStockBajo(productos);
    stockBajo.forEach(System.out::println);

    // 2. Probar cálculo de total
    System.out.println("\n=== Cálculo de total ===");
    double total = supermercadoService.calcularTotalVenta(Arrays.asList(p3, p4, p8, p8));
    System.out.println("Total de la venta: $" + total);

    // 3 y 8. Probar impresión de detalles y generación de ticket
    Cliente c1 = new Cliente(1, "Juan Pérez", "VIP");
    Empleado e1 = new Empleado(1, "María García", "Cajera");
    Venta v1 = new Venta(1, c1, e1, Arrays.asList(p3, p4, p8, p8));
    v1.setTotal(total);
    //Detalles de la venta
    System.out.println("\n=== Detalles de la venta ===");
    supermercadoService.imprimirDetallesVenta(v1);
    //Ticket de la venta
    System.out.println("\n=== Ticket de venta ===");
    System.out.println(supermercadoService.generarTicketVenta(v1));

    // 4. Probar generación de producto de muestra
    System.out.println("\n=== Producto de muestra ===");
    Producto muestraProducto = supermercadoService.generarProductoMuestra();
    System.out.println(muestraProducto);

    // 5. Probar aplicación de descuento
    System.out.println("\n=== Aplicación de descuento ===");
    double precioOriginal = 100.0;
    double precioConDescuento = supermercadoService.aplicarDescuento(precioOriginal);
    System.out.println("Precio original: $" + precioOriginal);
    System.out.println("Precio con descuento: $" + precioConDescuento);

    // 6. Probar comparación de productos
    System.out.println("\n=== Comparación de productos ===");
    Producto masCaro = supermercadoService.obtenerProductoMasCaro(p1, p4);
    System.out.println("El producto más caro entre " + p1.getNombre() + " y " + p4.getNombre() + " es: " + masCaro);

    // 7. Probar verificación de descuento
    System.out.println("\n=== Verificación de descuento ===");
    boolean puedeAcceder = supermercadoService.puedeAccederDescuento(c1, 1500.0);
    System.out.println("¿Puede acceder a descuento? " + puedeAcceder);

    // 9. Probar notificación al cliente
    System.out.println("\n=== Notificación al cliente ===");
    supermercadoService.notificarCliente(v1);
  }
}