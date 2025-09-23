package ejercicios.genericos.facturacion.test;

import java.util.Arrays;

import ejercicios.genericos.facturacion.classes.Cliente;
import ejercicios.genericos.facturacion.classes.Factura;
import ejercicios.genericos.facturacion.classes.Producto;
import ejercicios.genericos.facturacion.generics.ServicioGenerico;
import ejercicios.genericos.facturacion.utils.TicketFileUtils;

public class Facturacion {

  public static void main(String[] args) {
    /* Sistema de facturación
     * Entidades: Cliente, Producto, Factura
     * Servicio Genérico, ID Único -> Todas las entidades
     *                                que implementen Identificable
     * -> Guadar entidades
     * -> Listar las entidades
     * -> Buscar por ID
     * -> Actualizar por ID
     * -> Eliminar por ID
     *
     * Interfaz Genérica Identificable
     *
     * Problema: Escribir y Leer un archivo donde se guarde el detalle de la factura
     *
     */

    /*
     * Una clase con métodos estáticos los cuales son:
     * 1.- Guardar en un archivo la factura, con la siguiente nomenglatura
     *      en el nombre del archivo: "factura_idFactura.txt", todas las
     *      facturas se guardan en una carpeta llamada "facturas"
     * 2.- Leer la factura y mostrar en consola
     * 3.- Listar los nombres de todas las facturas existentes
     *      factura_1.txt
     *      factura_2.txt
     */
    
    // Servicios
    ServicioGenerico<Cliente, String> clienteServicio =
      new ServicioGenerico<>();
    ServicioGenerico<Producto, Integer> productoServicio =
      new ServicioGenerico<>();
    ServicioGenerico<Factura, Integer> facturaServicio =
      new ServicioGenerico<>();

    // Clientes
    Cliente c1 = new Cliente("C001", "Eloy Sanchez");
    Cliente c2 = new Cliente("C001", "Susana Gonzaga");
    Cliente c3 = new Cliente("C002", "Alejandro Arroyo");
    clienteServicio.guardar(c1);
    // No se guarda el cliente c2 porque tiene duplicado el ID
    clienteServicio.guardar(c2);
    clienteServicio.guardar(c3);

    // Productos
    Producto p1 = new Producto(100, "Laptop", 15000);
    Producto p2 = new Producto(200, "Mouse", 249.99);
    Producto p3 = new Producto(300, "Teclado", 670.54);
    Producto p4 = new Producto(400, "Pantalla LCD", 5600);
    productoServicio.guardar(p1);
    productoServicio.guardar(p2);
    productoServicio.guardar(p3);
    productoServicio.guardar(p4);

    //  Facturas
    Factura f1 = new Factura(1, c1, Arrays.asList(p1, p2));
    Factura f2 = new Factura(2, c3, Arrays.asList(p1, p2, p3));
    facturaServicio.guardar(f1);
    facturaServicio.guardar(f2);

    //  Buscar por ID
    System.out.println("Buscar cliente C002");
    System.out.println(clienteServicio.buscarPorId("C002"));
    System.out.println("Buscar cliente C003");
    System.out.println(clienteServicio.buscarPorId("C003"));

    // Actualizar un cliente
    System.out.println("Actualizando cliente C002...");
    clienteServicio.actualizar("C002", new Cliente("C002", "Susana Gonzaga"));

    // Eliminar cliente por ID
    System.out.println("Eliminando cliente C003...");
    clienteServicio.eliminar("C003");

    System.out.println("Eliminar y agregar producto a Factura");
    f2.eliminarProducto(300);
    f2.agregarProducto(p4);

    TicketFileUtils.guardarFactura(f1);
    TicketFileUtils.guardarFactura(f2);
    
    TicketFileUtils.leerFactura(f1);
    TicketFileUtils.leerFactura(f2);

    TicketFileUtils.listarFacturas();
  }
}
