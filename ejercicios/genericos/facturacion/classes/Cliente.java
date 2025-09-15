package ejercicios.genericos.facturacion.classes;

import ejercicios.genericos.facturacion.generics.Identificable;

public class Cliente implements Identificable<String>{
  private String id;
  private String nombre;
  
  public Cliente(String id, String nombre) {
    this.id = id;
    this.nombre = nombre;
  }

  @Override
  public String getId() {
    return id;
  }

  public String getNombre() {
    return nombre;
  }

  @Override
  public String toString() {
    return "Cliente {id: %s, nombre: %s}".formatted(id, nombre);
  }
  
} 
