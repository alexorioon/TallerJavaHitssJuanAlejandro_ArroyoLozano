package teoria.archivos.ejemplo1.archivos;

import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;

public class LeerArchivo {
    public static void main(String[] args) {
        Path ruta = Paths.get("teoria\\archivos\\ejemplo1\\ejemplo.txt");
        try {
            String contenido = Files.readString(ruta);
            System.out.println("Contenido del archivo:");
            System.out.println(contenido);
        } catch (Exception e) {
            System.out.println("Error al leer el archivo: " + e.getMessage());
        }
    }
}
