
public class Product {
	
	private String name;
	
	private int price;
	
	public boolean soldOut;
	
	public Product() {
		System.out.println("In constructor");
		name = "onbekend";
		price = 120;
	}
	
	public Product(String name, int price, boolean soldOut) {
		System.out.println("In constructor");
		this.name = name;
		this.price = price;
		this.soldOut = soldOut;
	}
	
	public void method1() {
		
	}
	
	public void printDetails() {
		System.out.println("Product met naam " + name);
		System.out.println("  heeft prijs " + price);
	}
	
	public void stelPrijsIn(int price) {
		this.price = price;
	}
	
	public String watIsDeNaam() {
		return name;
	}
	
	public void setName(String name) {
		this.name = name;
	}
	
	public String getName() {
		return name;
	}
	
	public void setPrice(int price) {
		if (price >= 0 && price < 1000000) {
			this.price = price;
		}
	}
}
