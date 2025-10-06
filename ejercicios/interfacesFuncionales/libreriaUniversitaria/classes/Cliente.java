package ejercicios.interfacesFuncionales.libreriaUniversitaria.classes;

import java.util.ArrayList;

public class Cliente {
  private String name;
  private int age;
  private ArrayList<Venta> purchasesHistory;

  public Cliente(String name, int age) {
    this.name = name;
    this.age = age;
    this.purchasesHistory = new ArrayList<>();
  }

  public String getName() {
    return name;
  }

  public int getAge() {
    return age;
  }

  public ArrayList<Venta> getPurchasesHistory() {
    return purchasesHistory;
  }

  public void addPurchase(Venta venta) {
    purchasesHistory.add(venta);
  }
}
