package teoria.ManejoFechasHoras.pos;

import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;

public class Compras {
    private String producto;
    private double precio;
    private LocalDateTime compraFecha;
    
    public Compras() {
        this.compraFecha = LocalDateTime.now();
    }

    public Compras(String producto, double precio) {
        this();
        this.producto = producto;
        this.precio = precio;
    }

    public String getProducto() {
        return producto;
    }

    public double getPrecio() {
        return precio;
    }

    public LocalDateTime getCompraFechaHora() {
        return compraFecha;
    }

    @Override
    public String toString() {
        return "Compras {producto=" + producto + 
        ", precio=" + precio + 
        ", compraFechaHora=" + compraFecha + "}";
    }

    public String formateoFechas(){
        //  2025-06-02  ->  02/06/2025
        DateTimeFormatter formato = DateTimeFormatter.ofPattern("EEEE, dd/MMMM/yyyy HH:mm:ss");
        String formatoActual = compraFecha.format(formato);
        return formatoActual;
    }

    public void textoAFecha(){
        String fechaTexto = "25/10/2025";
        DateTimeFormatter formato = DateTimeFormatter.ofPattern("dd/MM/y");
        LocalDate fecha = LocalDate.parse(fechaTexto, formato);
        System.out.println("Fecha objeto: " + fecha);
    }
    
}
