import java.util.*;

class Basket {

  private ArrayList<Item> basket;

  public Basket(){
    this.basket = new ArrayList<Item>();
  }



  public int countBasket(){
    int count = 0;
    for (Item item : this.basket){
      if(item != null) {
        count++;
      }
    }
    return count;
  }

}