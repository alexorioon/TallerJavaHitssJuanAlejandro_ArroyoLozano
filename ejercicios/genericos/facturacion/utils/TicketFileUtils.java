package ejercicios.genericos.facturacion.utils;

import ejercicios.genericos.facturacion.classes.Factura;
import java.io.File;
import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.nio.file.StandardOpenOption;

public class TicketFileUtils {

  static Path carpetaFacturas = Paths.get("ejercicios\\genericos\\facturacion\\facturas\\");

  public static void guardarFactura(Factura f) {
    try {
      if (!Files.exists(carpetaFacturas)) {
        Files.createDirectories(carpetaFacturas);
      }
      String nombreArchivo = "factura_" + f.getId() + ".txt";
      Path archivoSalida = carpetaFacturas.resolve(nombreArchivo);

      // Guardar factura
      Files.writeString(archivoSalida, f.generarReporte(), StandardOpenOption.CREATE, StandardOpenOption.TRUNCATE_EXISTING);
      System.out.println("Factura generada en: " + archivoSalida.toAbsolutePath());
    } catch (Exception e) {
      System.out.println("Error al guardar la factura: " + e.getMessage());
    }
  }

  public static void leerFactura(Factura f) {
    try {
      if (!Files.exists(carpetaFacturas)) {
        Files.createDirectories(carpetaFacturas);
      }

      String nombreArchivo = "factura_" + f.getId() + ".txt";
      Path archivo = carpetaFacturas.resolve(nombreArchivo);

      if (Files.exists(archivo)) {
        String contenido = Files.readString(archivo);
        System.out.print("-=-=-=-=-=-=-=- " + archivo.getFileName() + " -=-=-=-=-=-=-=-");
        System.out.println(contenido);
      } else {
        System.out.println("La factura con ID " + f.getId() + " no existe.");
      }
    } catch (IOException e) {
      System.out.println(
        "Error al leer la factura con ID " + f.getId() + ": " + e.getMessage()
      );
    }
  }

  public static void listarFacturas() {
    File carpeta = carpetaFacturas.toFile();

    if (!carpeta.exists()) {
      System.out.println("No existe la carpeta de facturas.");
      return;
    }

    File[] archivos = carpeta.listFiles();

    if (archivos == null || archivos.length == 0) {
      System.out.println("No hay facturas en la carpeta.");
      return;
    }

    System.out.println("=== Lista de facturas ===");
    for (File archivo : archivos) {
      if (archivo.isFile() && archivo.getName().endsWith(".txt")) {
        System.out.println(archivo.getName());
      }
    }
  }
}
