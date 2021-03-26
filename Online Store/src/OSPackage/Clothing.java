package OSPackage;

public class Clothing extends Product {
	
	private String brand, size, subCategory;

	public String getSubCategory() {
		return subCategory;
	}

	public void setSubCategory(String subCategory) {
		this.subCategory = subCategory;
	}

	public String getSize() {
		return size;
	}

	public void setSize(String size) {
		this.size = size;
	}

	public String getBrand() {
		return brand;
	}

	public void setBrand(String brand) {
		this.brand = brand;
	}

	@Override
	public double putOnSale(Object criterion, int percentage) {
		// TODO Auto-generated method stub
		return 0;
	}
	
	public String details() {
		
		
		return "";
	}
	
}
