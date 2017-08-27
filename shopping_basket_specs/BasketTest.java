import static org.junit.Assert.*;
import org.junit.*;

public class BasketTest {
  
  private Basket basket;

  
  @Before
  public void before(){
    basket = new Basket();
  }

  @Test
  public void checkBasketEmpty() {
    assertEquals(0, basket.countBasket());
  }




}  