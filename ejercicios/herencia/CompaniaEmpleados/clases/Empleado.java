package ejercicios.herencia.CompaniaEmpleados.clases;

public class Empleado extends Persona {
    private double remuneracion;
    private int empleadoId;

    private static int contador;

    public Empleado(String nombre, String apellido, String numFiscal, String direccion, double remuneracion) {
        super(nombre, apellido, numFiscal, direccion);
        this.remuneracion = remuneracion;
        this.empleadoId = ++contador;
    }
    public Empleado() {
        
    }

    public double getRemuneracion() {
        return remuneracion;
    }

    public int getEmpleadoId() {
        return empleadoId;
    }

    public void aumentarRemuneracion(int porcentaje) {
        remuneracion += (remuneracion / 100) * porcentaje;
    }
    @Override
    public void showInfo() {
        System.out.printf("Empleado #%d, Remuneración: %.2f%n", 
            empleadoId, remuneracion);
        super.showInfo();
    }
}
