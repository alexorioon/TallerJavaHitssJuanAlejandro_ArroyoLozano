package ejercicios.genericos.carritoSupermercado.service;

import java.util.ArrayList;
import java.util.List;

import ejercicios.genericos.carritoSupermercado.classes.Product;

public class Cart<T extends Product> {
    private List<T> products = new ArrayList<>();

    public void addProduct(T product) {
        products.add(product);
    }
    
    public List<T> getProducts() {
        return products;
    }
}
