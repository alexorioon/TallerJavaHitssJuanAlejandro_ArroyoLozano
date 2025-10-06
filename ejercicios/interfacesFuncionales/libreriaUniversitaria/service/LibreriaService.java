package ejercicios.interfacesFuncionales.libreriaUniversitaria.service;

import java.time.LocalDate;
import java.util.function.BiFunction;
import java.util.function.BinaryOperator;
import java.util.function.Consumer;
import java.util.function.Function;
import java.util.function.Predicate;
import java.util.function.Supplier;

import ejercicios.interfacesFuncionales.libreriaUniversitaria.classes.Cliente;
import ejercicios.interfacesFuncionales.libreriaUniversitaria.classes.Libro;
import ejercicios.interfacesFuncionales.libreriaUniversitaria.classes.Venta;

public class LibreriaService {

  // Validar datos (ej. que un libro sea posterior a 1900, que un cliente sea mayor de edad
  Predicate<LocalDate> esPosterior1900 = fecha -> fecha.isAfter(LocalDate.of(1900, 1, 1));
  Predicate<Integer> esMayorEdad = edad -> edad >= 18;

  // Transformar objetos (ej. convertir un libro en un resumen textual, generar facturas)
  Function<Libro, String> generarResumenLibro = libro -> "\nTítulo: " + libro.getTittle() + ", Autor: " + libro.getAuthor();
  Function<Venta, String> generarFactura = venta -> "\nFactura: \nCliente: " + venta.getCliente().getName() + "\nLibro: " + venta.getLibro().getTittle() + "\nFecha: " + venta.getDate();

  // Ejecutar acciones (ej. imprimir reportes, enviar notificaciones al cliente)
  Consumer<String> imprimirReporte = reporte -> {
    System.out.println("Reporte: \n" + reporte);
  };
  Consumer<String> enviarNotificacion = mensaje -> {
    System.out.println("Enviando notificación: " + mensaje);
  };

  // Generar información automáticamente (ej. ID de libros, códigos de venta, fechas actuales)
  Supplier<String> generarIdLibro = () -> "ID Libro: " + System.currentTimeMillis();
  Supplier<String> generarCodigoVenta = () -> "Código Venta: " + System.nanoTime();
  Supplier<LocalDate> obtenerFechaActual = () -> LocalDate.now();

  // Realizar cálculos (ej. promedio de precios, encontrar el libro más caro/barato, calcular descuentos)
  Function<double[], Double> calcularPromedioPrecios = precios -> {
    double suma = 0;
    for (double precio : precios) {
      suma += precio;
    }
    return precios.length > 0 ? suma / precios.length : 0;
  };
  BinaryOperator<Double> encontrarPrecioMaximo = (precio1, precio2) -> Math.max(precio1, precio2);
  BinaryOperator<Double> encontrarPrecioMinimo = (precio1, precio2) -> Math.min(precio1, precio2);
  BiFunction<Double, Double, Double> aplicarDescuento = (precio, descuento) -> precio - (precio * descuento / 100);
  
  public static void main(String[] args) {
    Libro libro = new Libro("Java Programming", "John Doe", LocalDate.of(2020, 5, 15), 59.99);
    Cliente cliente = new Cliente("Alice", 25);
    Venta venta = new Venta(cliente, LocalDate.now(), libro);
    LibreriaService service = new LibreriaService();
    // Validaciones
    System.out.println("¿El libro es posterior a 1900? " + service.esPosterior1900.test(libro.getPublicationDate()));
    System.out.println("¿El cliente es mayor de edad? " + service.esMayorEdad.test(cliente.getAge()));
    // Transformaciones
    System.out.println("Resumen del libro: " + service.generarResumenLibro.apply(libro));
    System.out.println("Factura de la venta: " + service.generarFactura.apply(venta));
    // Acciones
    service.imprimirReporte.accept("Venta realizada: " + venta.getLibro().getTittle() + " a " + venta.getCliente().getName());
    service.enviarNotificacion.accept("Gracias por su compra, " + venta.getCliente().getName() + "!");
    // Generación automática
    System.out.println(service.generarIdLibro.get());
    System.out.println(service.generarCodigoVenta.get());
    System.out.println(service.obtenerFechaActual.get());
    // Cálculos
    double[] precios = { 29.99, 49.99, 19.99, 99.99 };
    System.out.println("Precio promedio: " + service.calcularPromedioPrecios.apply(precios));
    System.out.println("Precio máximo: " + service.encontrarPrecioMaximo.apply(precios[0], precios[1]));
    System.out.println("Precio mínimo: " + service.encontrarPrecioMinimo.apply(precios[0], precios[1]));
    System.out.println("Precio con descuento: " + service.aplicarDescuento.apply(precios[0], 10.0));
  }
}
