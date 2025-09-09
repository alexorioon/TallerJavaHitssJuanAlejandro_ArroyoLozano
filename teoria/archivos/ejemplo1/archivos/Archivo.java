package teoria.archivos.ejemplo1.archivos;

import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.nio.file.StandardOpenOption;

public class Archivo {

  public static void main(String[] args) {
    /* java.nio.file
    Path -> Representa la ruta de un archivo o directorio en el sistema de archivos
    Files -> Contiene métodos para trabajar archivos y directorios
    (crear, copiar, mover, eliminar, leer, escribir, etc.) 
    Paths -> Contiene métodos para crear objetos Path a partir de cadenas de texto */

    //  Crear un archivo
    Path ruta = Paths.get("teoria\\archivos\\ejemplo1\\ejemplo.txt");
    String contenido = "Hola, este es un archivo de ejemplo";
    try {
      //Files.createFile(ruta);
      //System.out.println("Archivo creado: " + ruta.toAbsolutePath());
      Files.writeString(
        ruta,
        contenido,
        StandardOpenOption.CREATE, 
        StandardOpenOption.TRUNCATE_EXISTING // o se puede .APPEND
      );
      System.out.println("Texto escrito en el archivo");
    } catch (Exception e) {
      System.out.println("Error al escribir en el archivo: " + e.getMessage());
    }
  }
}
