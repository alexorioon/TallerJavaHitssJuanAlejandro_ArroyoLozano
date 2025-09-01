package ejercicios.herencia.CompaniaEmpleados.test;

import ejercicios.herencia.CompaniaEmpleados.clases.Cliente;
import ejercicios.herencia.CompaniaEmpleados.clases.Empleado;
import ejercicios.herencia.CompaniaEmpleados.clases.Gerente;
import ejercicios.herencia.CompaniaEmpleados.clases.Persona;

public class TestMain {
    public static void main(String[] args) {
        System.out.println("----------------Persona----------------");
        Persona p1 = new Persona("Alejandro", "Arroyo", "AOL77", "Priv. Olivo #10");
        p1.showInfo();
        System.out.println("----------------Empleado----------------");
        Empleado e1 = new Empleado("Juan", "Pérez", "JEH14", "5 de Mayo #21", 1750.57);
        e1.showInfo();
        e1.aumentarRemuneracion(3);
        System.out.println("Nueva remuneración: " + e1.getRemuneracion());
        System.out.println("----------------Gerente----------------");
        Gerente g1 = new Gerente("Pablo", "Núñez", "PUL16", "Avenida Lázaro Cárdenas #500", 1550, 20000);
        g1.showInfo();
        g1.aumentarRemuneracion(15);
        System.out.println("Nueva remuneración: " + g1.getRemuneracion());
        System.out.println("----------------Cliente----------------");
        Cliente c1 = new Cliente("Laura", "Hernández", "LEC02", "Tepic 2, Parque Industrial #54760");
        c1.showInfo();
    }
}
