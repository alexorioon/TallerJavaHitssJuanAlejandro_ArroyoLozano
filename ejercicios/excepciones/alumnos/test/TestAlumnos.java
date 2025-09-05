package ejercicios.excepciones.alumnos.test;

import ejercicios.excepciones.alumnos.classes.Alumno;
import ejercicios.excepciones.alumnos.exceptions.EdadInvalidaException;

public class TestAlumnos {

  public static void main(String[] args) throws EdadInvalidaException{
    // Creación de un array de 3 alumnos
    Alumno[] alumnos = new Alumno[3];
    try {
      alumnos[0] = new Alumno("Alejandro A. L.", -1, (Math.random() * 10 + 1));
    } catch (IllegalArgumentException e) {
      System.out.println("ERROR DE ENTRADA: " + e.getMessage() +"\n");
    } 
    
    try{
      alumnos[1] = new Alumno("Michelle R. S.", 17, (Math.random() * 10 + 1));
    }catch (EdadInvalidaException e) {
      System.out.println("ERROR DE EDAD: " + e.getMessage() +"\n");
    } 
    
    try{
      alumnos[2] = new Alumno("Kevin H. H.", 23, (Math.random() * 10 + 1));
      alumnos[3] = new Alumno("Daniel M. B.", 23, (Math.random() * 10 + 1));
    } catch (ArrayIndexOutOfBoundsException e) {
      System.out.println("ERROR DE ARRAY: Sólo puedes ingresar 3 alumnos\n");
    }
    
    /* for (Alumno alumno : alumnos) {
      System.out.println(alumno.toString());
    } */
  }
}
