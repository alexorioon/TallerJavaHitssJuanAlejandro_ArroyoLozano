package ejercicios.genericos.repositorioGenerico.test;

import java.util.List;

import ejercicios.genericos.repositorioGenerico.entidades.Cliente;
import ejercicios.genericos.repositorioGenerico.entidades.Producto;
import ejercicios.genericos.repositorioGenerico.repo.Repositorio;

public class TestMain {
    public static void main(String[] args) {
        Repositorio<Cliente> clienteRepo = new Repositorio<>();
        clienteRepo.agregar(new Cliente("Eloy"));
        clienteRepo.agregar(new Cliente("Susana"));
        clienteRepo.agregar(new Cliente("Juan"));

        List<Cliente> clientes = clienteRepo.obtenerTodo();
        System.out.println("=============CLIENTES=============");
        for (Cliente cliente : clientes) {
            System.out.println(cliente);
        }

        Repositorio<Producto> productoRepo = new Repositorio<>();
        productoRepo.agregar(new Producto("Leche", 20.50));
        productoRepo.agregar(new Producto("Frijol", 45));
        productoRepo.agregar(new Producto("Arroz", 35.75));
        productoRepo.agregar(new Producto("Azucar",23.4));

        
        System.out.println("=============PRODUCTOS=============");
        for (Producto producto : productoRepo.obtenerTodo()) {
            System.out.println(producto);
        }
    }
}
