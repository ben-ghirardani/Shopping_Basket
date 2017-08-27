package shopping_basket;
import java.util.*;
import behaviours.*;

class Basket {

  private ArrayList<Buyable> basket;

  public Basket(){
    this.basket = new ArrayList<Buyable>();
  }


  public int countBasket(){
    int count = 0;
    for (Buyable item : this.basket){
      if(item != null) {
        count++;
      }
    }
    return count;
  }

  public void addItem(Buyable item){
    basket.add(item);
  }

}