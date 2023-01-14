package Entities;

public class UsedProduct extends Product{
	private String manufactureData;

    public UsedProduct() {
    }
    
	public UsedProduct(String name, Double price,String manufactureData) {
		super(name, price);
		this.manufactureData = manufactureData;
	}

	public String getManufactureData() {
		return manufactureData;
	}

	public void setManufactureData(String manufactureData) {
		this.manufactureData = manufactureData;
	}
	
	@Override
	public String PriceTag() {
		return super.getName() + " (used) " + " $ " + super.getPrice() + "(Manufacture date: " + manufactureData + " )";
	}
}
