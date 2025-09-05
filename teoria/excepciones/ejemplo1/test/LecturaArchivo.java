package teoria.excepciones.ejemplo1.test;

import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;

public class LecturaArchivo {
  public static void main(String[] args) {
    //  try-with-resources -> Java 17+
    try (BufferedReader br = new BufferedReader(new FileReader("teoria/excepciones/ejemplo1/datos.txt"))) {
      String linea = br.readLine();
      System.out.println(linea);
      br.close();
    } catch (FileNotFoundException e) {
      System.out.println("ERROR: No se encuentra el archivo especificado.");
      //e.printStackTrace();
    } catch (IOException e) {
      //e.printStackTrace();
      System.out.println("ERROR: No se puede leer el archivo." + e.getMessage());
    }
  }
}
