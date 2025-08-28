package teoria.ManejoFechasHoras.horas;

import java.time.LocalTime;

public class Horas {
    public static void main(String[] args) {
        
        //  Horas
        LocalTime horaActual = LocalTime.now();
        System.out.println("Hora actual: " + horaActual);

        //  Hora específica
        LocalTime hora = LocalTime.of(9, 30);
        System.out.println("Hora: " + hora);

        //  Sumar/Restar horas
        System.out.println("Sumar hora: " + hora.plusHours(1).plusMinutes(15).plusSeconds(12));
        System.out.println("Restar hora: " + hora.minusHours(1));
        System.out.println("Hora es menor a hora actual? " + hora.isBefore(horaActual));
        System.out.println("Hora es mayor a hora actual? " + hora.isAfter(horaActual));
    }
}
