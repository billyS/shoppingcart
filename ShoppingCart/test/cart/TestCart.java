package cart;

import static org.junit.Assert.*;

import java.util.ArrayList;
import java.util.List;
import org.junit.Test;

public class TestCart {

	@Test
	public void test() {
		
		Double result = 0.85;
		List<String> basket = new ArrayList<String>();
		basket.add("Apple");
		basket.add("Apple");
		basket.add("Orange");

		ShoppingCart cart = new ShoppingCart();
		
		assertEquals(result, cart.checkOut(basket));
		
	}
	
	@Test
	public void test2() {
		
		Double result = 1.10;
		List<String> basket = new ArrayList<String>();
		basket.add("Apple");
		basket.add("Apple");
		basket.add("Orange");
		basket.add("Orange");
		basket.add("Orange");

		ShoppingCart cart = new ShoppingCart();
		
		assertEquals(result, cart.checkOut(basket));
		
	}
	
	@Test
	public void test3() {
		
		Double result = 2.20;
		List<String> basket = new ArrayList<String>();
		basket.add("Apple");
		basket.add("Apple");
		basket.add("Orange");
		basket.add("Orange");
		basket.add("Orange");
		basket.add("Apple");
		basket.add("Apple");
		basket.add("Orange");
		basket.add("Orange");
		basket.add("Orange");



		ShoppingCart cart = new ShoppingCart();
		
		assertEquals(result, cart.checkOut(basket));
		
	}

}
