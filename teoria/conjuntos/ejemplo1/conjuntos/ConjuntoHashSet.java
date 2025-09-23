package teoria.conjuntos.ejemplo1.conjuntos;

import java.util.HashSet;
import java.util.Iterator;
import java.util.Set;

import teoria.conjuntos.ejemplo1.modelos.Alumno;

public class ConjuntoHashSet {
  public static void main(String[] args) {
    Set<String> departamentos = new HashSet<>(); // No ordenados
    departamentos.add("Ventas");
    departamentos.add("Credito");
    departamentos.add("TI");
    departamentos.add("Credito"); // Duplicado, se ignora
    departamentos.add("RH");
    departamentos.add("Limpieza");

    System.out.println("Conjunto: " + departamentos);
    // System.out.println(departamentos);
    
    for (String departamento : departamentos) {
      System.out.println(departamento);
      /* if (departamento.equals("TI")) {
        departamentos.remove("TI");
      } */
    }

    Iterator<String> it = departamentos.iterator();
    while (it.hasNext()) {
      //System.out.println(it.next());
      String d = it.next();
      System.out.println("Departamento: " + d);
      if (d.equals("TI")) {
        it.remove();
      }
    }

    System.out.println("===============================================");
    Set<Alumno> alumnos = new HashSet<>();
    alumnos.add(new Alumno(1, "Alex", 80));
    alumnos.add(new Alumno(3, "Juan", 90));
    alumnos.add(new Alumno(4, "Roberto", 95));
    alumnos.add(new Alumno(2, "Susana", 75));
    alumnos.add(new Alumno(2, "Susana", 75));
    alumnos.add(new Alumno(2, "Susana", 75));
    for (Alumno alumno : alumnos) {
      System.out.println(alumno);
    }
  } 
}
