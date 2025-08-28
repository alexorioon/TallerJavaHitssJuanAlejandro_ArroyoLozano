package teoria.estaticos.estaticos1.test;

import teoria.estaticos.estaticos1.utils.Persona;
import teoria.estaticos.estaticos1.utils.UtilidadesMath;

public class TestMain {
    @SuppressWarnings("all")
    public static void main(String[] args) {
        UtilidadesMath obj = new UtilidadesMath();
        System.out.println("Valor de PI: " + UtilidadesMath.PI);
        System.out.println("Potencia de 10: " + UtilidadesMath.square(10));
        obj.setValor(10);
        System.out.println("Valor: " + obj.getValor());
        
        Persona p1 = new Persona("Alejandro", 24);
        Persona p2 = new Persona("Jorge", 23);
        Persona p3 = new Persona("Lluvia", 25);
        System.out.println("Total: " + Persona.getContador());
    }
}
