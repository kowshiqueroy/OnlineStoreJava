package OSPackage;

public abstract class Product {
	
	private String name;
	private int id;
	private String category;
	private double price;
	private int quantity;
	private boolean isOnSale;
	private int salePercentage;
	
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public String getCategory() {
		return category;
	}
	public void setCategory(String category) {
		this.category = category;
	}
	public double getPrice() {
		return price;
	}
	public void setPrice(double price) {
		this.price = price;
	}
	public int getQuantity() {
		return quantity;
	}
	public void setQuantity(int quantity) {
		this.quantity = quantity;
	}
	public boolean isOnSale() {
		return isOnSale;
	}
	public void setOnSale(boolean isOnSale) {
		this.isOnSale = isOnSale;
	}
	public int getSalePercentage() {
		return salePercentage;
	}
	public void setSalePercentage(int salePercentage) {
		this.salePercentage = salePercentage;
	}
	
	
	double salePrice(int amt) {
		double salePrice = 0;
		salePrice=this.price-(this.price/100*amt);
		return salePrice;	
	}
	
	abstract double putOnSale(Object criterion, int percentage);
	
	
	double totalPrice(int amt) {
		
		double totalPrice = 0;
		
		return totalPrice;
		
		
		
	}
	
	
	
	void displaytoCustomer() {
		
		
		
	}
	
	
void displaytoAdmin() {
		
		
		
	}
}
