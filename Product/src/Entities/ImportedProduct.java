package Entities;

public class ImportedProduct extends Product {
	private Double customsFree;

    public ImportedProduct() {
	}
    
	public ImportedProduct(String name, Double price,Double customsFree) {
		super(name, price);
		this.customsFree = customsFree;
	}
	
	@Override
	public String PriceTag() {
		return super.getName() + " $ " + super.getPrice() + String.format(" (Customs free: $ %.2f)", customsFree);
	}
	
	public Double totalPrice() {
		double price = super.getPrice();
		return price += customsFree;
	}
}
