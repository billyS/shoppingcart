package cart;

import java.util.ArrayList;
import java.util.List;

public class ShoppingCart {
	
	Product aProduct ;
	List<Product> stock;
	
	public ShoppingCart() {
		
		stock = new ArrayList<Product>();
		
		aProduct = new Product("Apple", 60);
		stock.add(aProduct);
		aProduct = new Product("Orange", 25);
		stock.add(aProduct);
	}

	
	public Double checkOut(List<String> basket) {
		
		int numberOfApples = 0; 
		int numberOfOranges = 0;
		double total = 0;
		
		List<String> newBasket = new ArrayList<String>();
		
		//loop through the list of products
		for(String product: basket) {
			
			//keep track of the amount oranges and apples to apply discount
			if(product.equals("Orange")){
				numberOfOranges ++;
			}else {
				numberOfApples ++;
			}
			
			newBasket.add(product);
			
			//applying the discounts
			if(numberOfOranges == 3 ) {
				newBasket.remove("Orange");
				numberOfOranges=0;
			}
			
			if(numberOfApples == 2) {
				newBasket.remove("Apple");
				numberOfApples = 0;
			}
			
		}
		
		for(String product: newBasket) {
			
			for(int i = 0; i < stock.size();i++) {
				// add the price of each product to the total
				if(stock.get(i).getProductName().equals(product)) {
					Product basketItem = stock.get(i);
					total = total+ basketItem.getPrice();
				}
			}
		}
		
		return total/100;
	}

}
