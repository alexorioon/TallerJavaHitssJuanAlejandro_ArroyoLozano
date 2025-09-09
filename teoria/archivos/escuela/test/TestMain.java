package teoria.archivos.escuela.test;

import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.nio.file.StandardOpenOption;
import java.util.ArrayList;
import java.util.List;
import teoria.archivos.escuela.classes.Estudiante;

public class TestMain {

  public static void main(String[] args) {
    /* Leer un archivo de estudiantes (estudiantes.txt)
     * Procesar los datos (nombre, edad, calificación)
     * Generar un archivo de reportes (reporte.txt) con estadística:
     * -> Número de estudiantes
     * -> Promedio de edad
     * -> Promedio de calificación
     * -> Mejor y Peor calificación (nombre)
     */
    Path archivoEntrada = Paths.get("teoria\\archivos\\escuela\\estudiantes.txt");
    Path archivoSalida = Paths.get("teoria\\archivos\\escuela\\reporte.txt");
    try {
        //  Leer todas las líneas del archivo estudiantes
        List<String> lineas = Files.readAllLines(archivoEntrada);

        //  Lista de estudiantes
        List<Estudiante> estudiantesList = new ArrayList<>();

        //  Convertir cada linea a un objeto Estudiante
        for (String linea : lineas) {
            String[] elementos = linea.split(",");
            String nombre = elementos[0].trim();
            Integer edad = Integer.parseInt(elementos[1].trim());
            double calificacion = Double.parseDouble(elementos[2].trim());
            estudiantesList.add(new Estudiante(nombre, edad, calificacion));
        }

        //  Variables para la estadística
        int totalEstudiantes = estudiantesList.size();
        int sumaEdades = 0;
        double sumaCalificaciones = 0;
        double maxCalificacion = Double.MIN_VALUE;
        double minCalificacion = Double.MAX_VALUE;
        Estudiante peorEstudiante = null;
        Estudiante mejorEstudiante = null;

        /* Iterar sobre cada estudiante para calcular la suma de edades y calificaciones
        y determinar el estudiante con la mejor y peor calificación */
        for (Estudiante estudiante : estudiantesList) {
            sumaEdades += estudiante.getEdad();
            sumaCalificaciones += estudiante.getCalificacion();
            double calificacion = estudiante.getCalificacion();

            // Actualizar el estudiante con la mejor calificación encontrada
            if (calificacion > maxCalificacion) {
            maxCalificacion = calificacion;
            mejorEstudiante = estudiante;
            }

            // Actualizar el estudiante con la menor calificación encontrada
            if (calificacion < minCalificacion) {
            minCalificacion = calificacion;
            peorEstudiante = estudiante;
            }
        }
        // Sacar promedios con validación
        double promedioEdad = totalEstudiantes > 0 ? (double) sumaEdades / totalEstudiantes : 0;
        double promedioCalif = totalEstudiantes > 0 ? (double) sumaCalificaciones / totalEstudiantes : 0;

        // Generar un informe con los resultados calculados
        StringBuilder reporte = new StringBuilder();
        reporte.append("REPORTE DE ESTUDIANTES\n");
        reporte.append("===================================\n");
        reporte.append("Total de estudiantes: ").append(totalEstudiantes + "\n");
        reporte.append("Promedio de edades: ").append(String.format("%.2f%n", promedioEdad));
        reporte.append("Promedio de calificaciones: ").append(String.format("%.2f%n", promedioCalif));
        reporte.append("Mejor estudiante: ").append(maxCalificacion).append(" (")
            .append(mejorEstudiante != null ? mejorEstudiante.getNombre() : "N/A").append(")\n");
        reporte.append("Peor estudiante: ").append(minCalificacion).append(" (")
            .append(peorEstudiante != null ? peorEstudiante.getNombre() : "N/A").append(")\n");
        
        // Guardar reporte
        Files.writeString(archivoSalida, reporte, StandardOpenOption.CREATE, StandardOpenOption.TRUNCATE_EXISTING);
        System.out.println("Reporte generado en: " + archivoSalida.toAbsolutePath());
    } catch (Exception e) {
      System.out.println("Error - " + e.getMessage());
    }
  }
}

