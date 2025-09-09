package teoria.archivos.ejemplo1.archivos;

import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.nio.file.StandardOpenOption;
import java.util.Arrays;
import java.util.List;

public class EscrituraArchivo {
    public static void main(String[] args) {
         Path ruta = Paths.get("teoria\\archivos\\ejemplo1\\lista.txt");
         List<String> lineas = Arrays.asList("Linea1 ", "Linea 2", "Linea 3");
         try {
            Files.write(ruta, lineas, StandardOpenOption.CREATE, StandardOpenOption.TRUNCATE_EXISTING);
            System.out.println("Archivo escrito con varias líneas");
         } catch (Exception e) {
            System.out.println("Error - " + e.getMessage());
         }
    }
}
