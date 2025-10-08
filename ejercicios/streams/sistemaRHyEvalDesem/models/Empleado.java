package ejercicios.streams.sistemaRHyEvalDesem.models;

import java.util.ArrayList;
import java.util.List;

public class Empleado {
  private int id;
  private String nombre;
  private String departamento;
  private double salario;
  private int aniosXP;
  private List<Evaluacion> evaluaciones;

  public Empleado(int id, String nombre, String departamento, double salario, int aniosXP) {
    this.id = id;
    this.nombre = nombre;
    this.departamento = departamento;
    this.salario = salario;
    this.aniosXP = aniosXP;
    this.evaluaciones = new ArrayList<>();
  }

  public int getId() {
    return id;
  }

  public String getNombre() {
    return nombre;
  }

  public String getDepartamento() {
    return departamento;
  }

  public double getSalario() {
    return salario;
  }

  public int getAniosXP() {
    return aniosXP;
  }

  public List<Evaluacion> getEvaluaciones() {
    return evaluaciones;
  }

  public void agregarEvaluacion(Evaluacion ev) {
    evaluaciones.add(ev);
  }

  @Override
  public String toString() {
    return nombre + "(" + departamento + ")" + " Exp:" + aniosXP + "y $" + salario;
  }
}
