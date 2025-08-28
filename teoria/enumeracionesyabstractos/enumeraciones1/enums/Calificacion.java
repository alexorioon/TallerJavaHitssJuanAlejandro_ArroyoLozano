package teoria.enumeracionesyabstractos.enumeraciones1.enums;

public enum Calificacion {
    A("Excelente"),
    B("Notable"),
    C("Aprobado"),
    D("Suficiente"),
    E("Reprobado");

    private final String descripcion;

    Calificacion(String descripcion){
        this.descripcion = descripcion;
    }

    public String getDescripcion() {
        return descripcion;
    }
    
}
