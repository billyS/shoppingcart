package cart;

import static org.junit.Assert.*;

import java.util.ArrayList;
import java.util.List;
import org.junit.Test;

public class TestCart {

	@Test
	public void test() {
		
		List<String> basket = new ArrayList<String>();
		basket.add("Apple");
		basket.add("Apple");
		basket.add("Orange");
		basket.add("Apple");

		ShoppingCart cart = new ShoppingCart();
		
		assertEquals("£2.05", cart.checkOut(basket));
		
	}

}
