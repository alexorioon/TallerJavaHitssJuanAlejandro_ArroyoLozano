package ejercicios.streams.sistemaRHyEvalDesem.test;

import java.time.LocalDate;
import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;

import ejercicios.streams.sistemaRHyEvalDesem.models.Empleado;
import ejercicios.streams.sistemaRHyEvalDesem.models.Evaluacion;

public class SistemaRHTest {
  public static void main(String[] args) {
    /*
     * Empleados y sus evaluaciones
     * Cada empleado tiene tantas evaluaciones como años de experiencia
     */
    Empleado e1 = new Empleado(1, "Juan", "Ventas", 28000.0, 3);
    e1.agregarEvaluacion(new Evaluacion(LocalDate.of(2022, 7, 14), 70));
    e1.agregarEvaluacion(new Evaluacion(LocalDate.of(2023, 1, 5), 85));
    e1.agregarEvaluacion(new Evaluacion(LocalDate.of(2023, 6, 20), 65));

    Empleado e2 = new Empleado(2, "María", "RH", 25000.0, 4);
    e2.agregarEvaluacion(new Evaluacion(LocalDate.of(2021, 11, 10), 90));
    e2.agregarEvaluacion(new Evaluacion(LocalDate.of(2022, 3, 22), 88));
    e2.agregarEvaluacion(new Evaluacion(LocalDate.of(2023, 9, 15), 95));
    e2.agregarEvaluacion(new Evaluacion(LocalDate.of(2024, 2, 1), 80));

    Empleado e3 = new Empleado(3, "Pedro", "Marketing", 27000.0, 2);
    e3.agregarEvaluacion(new Evaluacion(LocalDate.of(2023, 5, 8), 75));
    e3.agregarEvaluacion(new Evaluacion(LocalDate.of(2023, 12, 3), 82));

    Empleado e4 = new Empleado(4, "Alex", "TI", 45000.0, 2);
    e4.agregarEvaluacion(new Evaluacion(LocalDate.of(2023, 4, 18), 90));
    e4.agregarEvaluacion(new Evaluacion(LocalDate.of(2024, 10, 10), 88));

    Empleado e5 = new Empleado(5, "Luis", "Marketing", 29000.0, 3);
    e5.agregarEvaluacion(new Evaluacion(LocalDate.of(2024, 1, 1), 65));
    e5.agregarEvaluacion(new Evaluacion(LocalDate.of(2023, 9, 15), 78));
    e5.agregarEvaluacion(new Evaluacion(LocalDate.of(2024, 2, 20), 72));

    Empleado e6 = new Empleado(6, "Sofia", "TI", 55000.0, 4);
    e6.agregarEvaluacion(new Evaluacion(LocalDate.of(2022, 4, 18), 90));
    e6.agregarEvaluacion(new Evaluacion(LocalDate.of(2023, 10, 10), 88));
    e6.agregarEvaluacion(new Evaluacion(LocalDate.of(2024, 7, 5), 95));
    e6.agregarEvaluacion(new Evaluacion(LocalDate.of(2025, 3, 10), 92));

    Empleado e7 = new Empleado(7, "Carlos", "Ventas", 22000.0, 1);
    e7.agregarEvaluacion(new Evaluacion(LocalDate.of(2024, 6, 2), 89));

    Empleado e8 = new Empleado(8, "Laura", "RH", 26000.0, 3);
    e8.agregarEvaluacion(new Evaluacion(LocalDate.of(2023, 2, 15), 80));
    e8.agregarEvaluacion(new Evaluacion(LocalDate.of(2024, 5, 10), 85));
    e8.agregarEvaluacion(new Evaluacion(LocalDate.of(2025, 1, 20), 90));

    Empleado e9 = new Empleado(9, "Daniel", "TI", 42000.0, 2);
    e9.agregarEvaluacion(new Evaluacion(LocalDate.of(2024, 02, 16), 87));
    e9.agregarEvaluacion(new Evaluacion(LocalDate.of(2025, 01, 07), 91));

    Empleado e10 = new Empleado(10, "Kevin", "TI", 48000.0, 3);
    e10.agregarEvaluacion(new Evaluacion(LocalDate.of(2022, 9, 7), 76));
    e10.agregarEvaluacion(new Evaluacion(LocalDate.of(2023, 5, 15), 80));
    e10.agregarEvaluacion(new Evaluacion(LocalDate.of(2024, 12, 2), 72));

    Empleado e11 = new Empleado(11, "Ana", "TI", 65000.0, 7);
    e11.agregarEvaluacion(new Evaluacion(LocalDate.of(2019, 5, 10), 88));
    e11.agregarEvaluacion(new Evaluacion(LocalDate.of(2020, 6, 15), 90));
    e11.agregarEvaluacion(new Evaluacion(LocalDate.of(2021, 7, 20), 92));
    e11.agregarEvaluacion(new Evaluacion(LocalDate.of(2022, 8, 25), 95));
    e11.agregarEvaluacion(new Evaluacion(LocalDate.of(2023, 9, 30), 94));
    e11.agregarEvaluacion(new Evaluacion(LocalDate.of(2024, 10, 5), 96));
    e11.agregarEvaluacion(new Evaluacion(LocalDate.of(2025, 1, 15), 97));

    Empleado e12 = new Empleado(12, "Roberto", "Ventas", 45000.0, 6);
    e12.agregarEvaluacion(new Evaluacion(LocalDate.of(2020, 3, 12), 85));
    e12.agregarEvaluacion(new Evaluacion(LocalDate.of(2021, 4, 15), 87));
    e12.agregarEvaluacion(new Evaluacion(LocalDate.of(2022, 5, 18), 88));
    e12.agregarEvaluacion(new Evaluacion(LocalDate.of(2023, 6, 21), 90));
    e12.agregarEvaluacion(new Evaluacion(LocalDate.of(2024, 7, 24), 92));
    e12.agregarEvaluacion(new Evaluacion(LocalDate.of(2025, 1, 27), 91));

    Empleado e13 = new Empleado(13, "Patricia", "RH", 42000.0, 8);
    e13.agregarEvaluacion(new Evaluacion(LocalDate.of(2019, 2, 5), 89));
    e13.agregarEvaluacion(new Evaluacion(LocalDate.of(2020, 3, 8), 90));
    e13.agregarEvaluacion(new Evaluacion(LocalDate.of(2021, 4, 11), 91));
    e13.agregarEvaluacion(new Evaluacion(LocalDate.of(2022, 5, 14), 93));
    e13.agregarEvaluacion(new Evaluacion(LocalDate.of(2023, 6, 17), 92));
    e13.agregarEvaluacion(new Evaluacion(LocalDate.of(2023, 7, 20), 94));
    e13.agregarEvaluacion(new Evaluacion(LocalDate.of(2024, 8, 23), 95));
    e13.agregarEvaluacion(new Evaluacion(LocalDate.of(2025, 1, 26), 96));

    Empleado e14 = new Empleado(14, "Miguel", "Marketing", 38000.0, 5);
    e14.agregarEvaluacion(new Evaluacion(LocalDate.of(2021, 1, 15), 86));
    e14.agregarEvaluacion(new Evaluacion(LocalDate.of(2022, 3, 20), 88));
    e14.agregarEvaluacion(new Evaluacion(LocalDate.of(2023, 5, 25), 87));
    e14.agregarEvaluacion(new Evaluacion(LocalDate.of(2024, 7, 30), 89));
    e14.agregarEvaluacion(new Evaluacion(LocalDate.of(2025, 1, 5), 90));

    Empleado e15 = new Empleado(15, "Elena", "TI", 58000.0, 6);
    e15.agregarEvaluacion(new Evaluacion(LocalDate.of(2020, 8, 10), 91));
    e15.agregarEvaluacion(new Evaluacion(LocalDate.of(2021, 9, 15), 92));
    e15.agregarEvaluacion(new Evaluacion(LocalDate.of(2022, 10, 20), 93));
    e15.agregarEvaluacion(new Evaluacion(LocalDate.of(2023, 11, 25), 94));
    e15.agregarEvaluacion(new Evaluacion(LocalDate.of(2024, 12, 30), 95));
    e15.agregarEvaluacion(new Evaluacion(LocalDate.of(2025, 2, 5), 96));

    Empleado e16 = new Empleado(16, "Fernando", "Ventas", 35000.0, 4);
    e16.agregarEvaluacion(new Evaluacion(LocalDate.of(2022, 4, 8), 84));
    e16.agregarEvaluacion(new Evaluacion(LocalDate.of(2023, 5, 13), 86));
    e16.agregarEvaluacion(new Evaluacion(LocalDate.of(2024, 6, 18), 88));
    e16.agregarEvaluacion(new Evaluacion(LocalDate.of(2025, 1, 23), 87));

    Empleado e17 = new Empleado(17, "Carmen", "Marketing", 48000.0, 7);
    e17.agregarEvaluacion(new Evaluacion(LocalDate.of(2019, 7, 5), 88));
    e17.agregarEvaluacion(new Evaluacion(LocalDate.of(2020, 8, 10), 89));
    e17.agregarEvaluacion(new Evaluacion(LocalDate.of(2021, 9, 15), 90));
    e17.agregarEvaluacion(new Evaluacion(LocalDate.of(2022, 10, 20), 91));
    e17.agregarEvaluacion(new Evaluacion(LocalDate.of(2023, 11, 25), 92));
    e17.agregarEvaluacion(new Evaluacion(LocalDate.of(2024, 12, 30), 93));
    e17.agregarEvaluacion(new Evaluacion(LocalDate.of(2025, 2, 5), 94));

    Empleado e18 = new Empleado(18, "Ricardo", "TI", 52000.0, 5);
    e18.agregarEvaluacion(new Evaluacion(LocalDate.of(2021, 3, 12), 87));
    e18.agregarEvaluacion(new Evaluacion(LocalDate.of(2022, 4, 17), 88));
    e18.agregarEvaluacion(new Evaluacion(LocalDate.of(2023, 5, 22), 90));
    e18.agregarEvaluacion(new Evaluacion(LocalDate.of(2024, 6, 27), 91));
    e18.agregarEvaluacion(new Evaluacion(LocalDate.of(2025, 1, 2), 92));

    Empleado e19 = new Empleado(19, "Diana", "RH", 38000.0, 5);
    e19.agregarEvaluacion(new Evaluacion(LocalDate.of(2021, 5, 8), 85));
    e19.agregarEvaluacion(new Evaluacion(LocalDate.of(2022, 6, 13), 86));
    e19.agregarEvaluacion(new Evaluacion(LocalDate.of(2023, 7, 18), 88));
    e19.agregarEvaluacion(new Evaluacion(LocalDate.of(2024, 8, 23), 89));
    e19.agregarEvaluacion(new Evaluacion(LocalDate.of(2025, 1, 28), 90));

    Empleado e20 = new Empleado(20, "Gabriel", "Marketing", 41000.0, 6);
    e20.agregarEvaluacion(new Evaluacion(LocalDate.of(2020, 9, 15), 86));
    e20.agregarEvaluacion(new Evaluacion(LocalDate.of(2021, 10, 20), 87));
    e20.agregarEvaluacion(new Evaluacion(LocalDate.of(2022, 11, 25), 89));
    e20.agregarEvaluacion(new Evaluacion(LocalDate.of(2023, 12, 30), 90));
    e20.agregarEvaluacion(new Evaluacion(LocalDate.of(2024, 2, 5), 91));
    e20.agregarEvaluacion(new Evaluacion(LocalDate.of(2025, 3, 10), 92));

    List<Empleado> empleados = new ArrayList<>();
    empleados.add(e1);
    empleados.add(e2);
    empleados.add(e3);
    empleados.add(e4);
    empleados.add(e5);
    empleados.add(e6);
    empleados.add(e7);
    empleados.add(e8);
    empleados.add(e9);
    empleados.add(e10);
    empleados.add(e11);
    empleados.add(e12);
    empleados.add(e13);
    empleados.add(e14);
    empleados.add(e15);
    empleados.add(e16);
    empleados.add(e17);
    empleados.add(e18);
    empleados.add(e19);
    empleados.add(e20);

    // 1. Listar todos los empleados de un departamento específico (ej: "TI"),
    // ordenados por nombre alfabéticamente.
    System.out.println("==========Listar empleados de un departamento==========");
    empleados.stream()
        .filter(e -> e.getDepartamento().equals("Ventas"))
        .sorted(Comparator.comparing(Empleado::getNombre))
        .forEach(System.out::println);

    // 2. Calcular el salario promedio por departamento.
    System.out.println("\n==========Salario promedio por departamento==========");
    empleados.stream()
        .collect(Collectors.groupingBy(Empleado::getDepartamento, Collectors.averagingDouble(Empleado::getSalario)))
        .forEach((depto, avg) -> System.out.println(depto + ": $" + avg));

    // 3. Obtener el empleado con mayor salario en toda la empresa.
    System.out.println("\n==========Empleado con mayor salario==========");
    empleados.stream()
        .max(Comparator.comparing(Empleado::getSalario))
        .ifPresent(e -> System.out.println(e.getNombre() + " (" + e.getDepartamento() + ") - $" + e.getSalario()));

    // 4. Listar todos los empleados con más de 5 años de experiencia y salario
    // mayor a 50,000.
    System.out.println("\n==========Empleados con más de 5 años de experiencia y salario mayor a 50,000==========");
    empleados.stream()
        .filter(e -> e.getAniosXP() > 5 && e.getSalario() > 50000)
        .forEach(System.out::println);

    // 5. Obtener el top 3 de empleados con mejor puntaje en la última evaluación
    // (último año).
    System.out.println("\n==========Top 3 empleados con mejor puntaje en la última evaluación==========");
    empleados.stream()
        .sorted((emp1, emp2) -> {
          // Obtener la última evaluación de cada empleado
          Evaluacion ultimaEmp1 = emp1.getEvaluaciones().stream()
              .max(Comparator.comparing(Evaluacion::getAnio))
              .orElse(null);
          Evaluacion ultimaEmp2 = emp2.getEvaluaciones().stream()
              .max(Comparator.comparing(Evaluacion::getAnio))
              .orElse(null);

          if (ultimaEmp1 == null || ultimaEmp2 == null)
            return 0;
          // Ordenar de mayor a menor puntaje
          return Integer.compare(ultimaEmp2.getPuntaje(), ultimaEmp1.getPuntaje());
        })
        .limit(3)
        .forEach(emp -> {
          Evaluacion ultima = emp.getEvaluaciones().stream()
              .max(Comparator.comparing(Evaluacion::getAnio))
              .orElse(null);
          if (ultima != null) {
            System.out.println(emp.getNombre() + " - Puntaje: " + ultima.getPuntaje() +
                " (Fecha: " + ultima.getAnio() + ")");
          }
        });

    // 6. Contar cuántos empleados tienen al menos una evaluación superior a 90
    // puntos.
    System.out.println("\n==========Cantidad de empleados con al menos una evaluación superior a 90 puntos==========");
    long count = empleados.stream()
        .filter(e -> e.getEvaluaciones().stream().anyMatch(ev -> ev.getPuntaje() > 90))
        .count();
    System.out.println("Cantidad de empleados con al menos una evaluación superior a 90 puntos: " + count);

    // 7. Generar un ranking de promedio de puntajes por empleado.
    System.out.println("\n==========Ranking de promedio de puntajes por empleado==========");
    empleados.stream()
        .collect(Collectors.toMap(Empleado::getNombre,
            e -> e.getEvaluaciones().stream()
                .mapToInt(Evaluacion::getPuntaje)
                .average()
                .orElse(0)))
        .entrySet().stream()
        .sorted(Map.Entry.<String, Double>comparingByValue().reversed())
        .forEach(entry -> System.out.println(entry.getKey() + " - Promedio: " + entry.getValue()));
  }
}
