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

	
	public String checkOut(List<String> basket) {
		
		double total = 0;
		//loop through the list of products, get the price of the product and add it to the total
		for(String product: basket) {
			
			for(int i = 0; i < stock.size();i++) {
				
				if(stock.get(i).getProductName().equals(product)) {
					Product basketItem = stock.get(i);
					total = total+ basketItem.getPrice();
				}
			}
		}
		
		return "£" + total/100;
	}

}
