package ejercicios.genericos.facturacion.generics;

import java.util.ArrayList;
import java.util.List;

public class ServicioGenerico<T extends Identificable<ID>, ID>{
  private List<T> datos = new ArrayList<>();

  //  Buscar elemento por ID
  public T buscarPorId(ID id) {
    for (T dato : datos) {
      if (dato.getId().equals(id)) {
        return dato;
      }
    }
    return null;
  }

  //  Guardar elemento sin duplicarse
  public void guardar(T dato) {
    if (buscarPorId(dato.getId()) != null) {
      System.out.println("El elemento con ID " + dato.getId() + " ya existe.");
    } else {
      datos.add(dato);
      System.out.println("Guardado: " + dato);
    }
  }

  //  Listar todos los elementos
  public List<T> listar(){
    return datos;
  }

  //  Actualizar elemento de datos de acuerdo al ID
  public boolean actualizar(ID id, T nuevoElemento){
    for (int i = 0; i < datos.size(); i++) {
      if (datos.get(i).getId().equals(id)) { //  get(i) obtiene el valor del elemento en la posición i
        datos.set(i, nuevoElemento);
        System.out.println("Actualizado ID " + id + " con: " + nuevoElemento);
        return true;
      }
    }
    System.out.println("No se encontró el ID " + id + " para actualizar.");
    return false;
  }

  //  Eliminar un elemento con ID
  public boolean eliminar(ID id){
    for (int i = 0; i < datos.size(); i++) {
      if (datos.get(i).getId().equals(id)) { //  get(i) obtiene el valor del elemento en la posición i
        datos.remove(i);
        System.out.println("Eliminado ID " + id);
        return true;
      }
    }
    System.out.println("No se encontró el ID " + id + " para eliminar.");
    return false;
  }
}