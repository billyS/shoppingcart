package cart;

public class Product {
	
	public Product (String name, double price) {
		this.price = price;
		this.productName = name;
	}
	public Product () {
		
	}

	public double getPrice() {
		return price;
	}
	public void setPrice(double price) {
		this.price = price;
	}
	public String getProductName() {
		return productName;
	}
	public void setProductName(String productName) {
		this.productName = productName;
	}
	private double price;
	private String productName;
	
	
}
