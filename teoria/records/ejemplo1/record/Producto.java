package teoria.records.ejemplo1.record;

/* Inmutable por defecto -> Los atributos son final
Sintaxis reducida -> mucho menos código repetitivo
Implementa automáticamente: constructor, getters (con el nombre del campo), setters,
Object: equals, hashCode, toString
Se usan para modelos de datos (DTOs, entidades simples (POJO), respuestas de APIs, etc.) */

public record Producto(String descripcion, double precio) {
    public Producto{
        if (precio < 0) {
            throw new IllegalArgumentException("El precio no puede ser negativo");
        }
    }
    public String mensaje(){
        return "Un método en un record";
    }
}
