package teoria.settersgetters.automovil.clases;

import java.util.Objects;

public class Persona {
    private String nombre;
    private Integer edad;
    
    public Persona(String nombre, Integer edad) {
        this(nombre);
        this.edad = edad;
    }
    public Persona(String nombre) {
        this.nombre = nombre;
    }
    public Persona(Integer edad) {
        this.edad = edad;
    }
    public Persona() {
    }

    public String getNombre() {
        return nombre;
    }
    public void setNombre(String nombre) {
        this.nombre = nombre;
    }
    public Integer getEdad() {
        return edad;
    }
    public void setEdad(Integer edad) {
        this.edad = edad;
    }
    
    @Override
    public String toString() {
        // Notación JSON {atributo: valor, atributo: valor, ...}
        return "{nombre: " + nombre + ", edad: " + edad + "}";
    }
    
    @Override
    public boolean equals(Object obj) {
        if (this == obj) return true; //  Misma referencia en memoria
        
        //  Objeto sin parametros || Clases distintas
        if (obj == null || getClass() != obj.getClass()) return false; 

        Persona other = (Persona) obj; // Casteo pq  obj  es Object, se necesita Persona
        return this.edad == other.edad && this.nombre.equals(other.nombre);
    }

    @Override
    public int hashCode() {
        return Objects.hash(nombre, edad);
    }
}
