package teoria.archivos.ejemplo1.archivos;

import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.util.List;

public class LeerArchivoLinea {
    public static void main(String[] args) {
        Path ruta = Paths.get("teoria\\archivos\\ejemplo1\\ejemplo.txt");
        try {
            //  Stream -> Files.Lines ==> 
            List<String> lineas = Files.readAllLines(ruta); //  Para archivos pequeños
            for (String linea : lineas) {
                System.out.println("-->" + linea);
            }
        } catch (Exception e) {
         System.out.println("Error al leer las líneas: " + e.getMessage());   
        }
    }
}
