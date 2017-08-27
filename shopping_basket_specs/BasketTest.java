import static org.junit.Assert.*;
import org.junit.*;
import behaviours.*;
import shopping_basket.*;

public class BasketTest {
  
  Basket basket;
  Pasta pasta;
  
  @Before
  public void before(){
    basket = new Basket();
    pasta = new Pasta("Barilla", 5);
  }

  @Test
  public void checkBasketEmpty() {
    assertEquals(0, basket.countBasket());
  }

  @Test
  public void checkAddToBasket() {
    basket.addItem(pasta);
    assertEquals(1, basket.countBasket());
  }


}