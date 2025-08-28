package teoria.enumeracionesyabstractos.enumeraciones1.test;

import teoria.enumeracionesyabstractos.enumeraciones1.enums.Semaforo;

public class TestMain1 {
    public static void main(String[] args) {
        for (Semaforo luz : Semaforo.values()) {
            System.out.println(luz + " ==> " + luz.accion());
        }
    }
}
