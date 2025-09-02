package ejercicios.herencia.CompaniaEmpleados.clases;

public class Gerente extends Empleado {

  private double presupuesto;

  public Gerente(
    String nombre,
    String apellido,
    String numFiscal,
    String direccion,
    double remuneracion,
    double presupuesto
  ) {
    super(nombre, apellido, numFiscal, direccion, remuneracion);
    this.presupuesto = presupuesto;
  }

  public double getPresupuesto() {
    return presupuesto;
  }

  @Override
  public void showInfo() {
    super.showInfo();
    System.out.printf("Presupuesto: %.2f%n", presupuesto);
  }
}
