package teoria.mapas.mapasConObjetos.test;

import java.util.HashMap;
import java.util.Map;

import teoria.mapas.mapasConObjetos.models.Empleado;

public class Empleados {
  public static void main(String[] args) {
    // Crear un HashMap donde la clave es el ID y el valor es un empleado
    HashMap<Integer, Empleado> empleados = new HashMap<>();

    // Agregar empleados al mapa
    empleados.put(1, new Empleado(1, "Alex", "TI"));
    empleados.put(203, new Empleado(203, "Bob", "HR"));
    empleados.put(101, new Empleado(101, "Cathy", "Finance"));
    empleados.put(5, new Empleado(5, "David", "Marketing"));

    // Recorrer mi mapa
    for (Map.Entry<Integer, Empleado> empleado : empleados.entrySet()) {
      System.out.println("Clave: " + empleado.getKey() + " --> " + empleado.getValue());
    }

    // Acceder a un empleado por ID
    System.out.println("Buscar empleado con ID 5");
    System.out.println(empleados.get(5));

    // Verificar si existe un empleado
    int buscarId = 5;
    if (empleados.containsKey(buscarId)) {
      System.out.println("El empleado con ID " + buscarId + " existe: " + empleados.get(buscarId).getName());
    } else {
      System.out.println("El empleado con ID " + buscarId + " no está registrado.");
    }

    // Eliminar empleado
    System.out.println("Empleado eliminado: " + empleados.remove(5));
  }
}
