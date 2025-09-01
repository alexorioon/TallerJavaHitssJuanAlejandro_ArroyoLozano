package ejercicios.herencia.CompaniaEmpleados.clases;

public class Persona {
    private String nombre;
    private String apellido;
    private String numFiscal;
    private String direccion;
    
    public Persona(String nombre, String apellido, String numFiscal, String direccion) {
        this.nombre = nombre;
        this.apellido = apellido;
        this.numFiscal = numFiscal;
        this.direccion = direccion;
    }
    public Persona() {
    }

    public String getNombre() {
        return nombre;
    }
    
    public String getApellido() {
        return apellido;
    }
    
    public String getNumFiscal() {
        return numFiscal;
    }
    
    public String getDireccion() {
        return direccion;
    }

    public void showInfo(){
        System.out.printf("Persona: %s %s, NumFiscal: %s, Dirección: '%s'%n",
        nombre, apellido, numFiscal, direccion);
    }
}
