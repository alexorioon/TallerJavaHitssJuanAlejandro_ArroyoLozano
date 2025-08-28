package teoria.herencia.herencia1.test;

import teoria.herencia.herencia1.clases.Persona;
import teoria.herencia.herencia1.herencia.Estudiante;

public class TestMain {
    public static void main(String[] args) {
        Persona p1 = new Persona("Alejandro", 24);
        Estudiante e1 = new Estudiante("Gerarfo", 18, "Ingeniería en Sistemas Computacionales");
        p1.mostrarInfo();
        e1.mostrarInfo();
    }
}
