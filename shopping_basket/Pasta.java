package shopping_basket;
import behaviours.*;

public class Pasta implements Buyable {

  private String brand;
  private int price;

  public Pasta(String brand, int price) {
    this.brand = brand;
    this.price = price;
  }

}