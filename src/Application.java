
public class Application {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println("Hello world!");
		
		// Products ---------------------------------------
		Product product1 = new Product();
//		product1.name = "TV";
//		product1.price = 120;
//		product1.printDetails();
		product1.stelPrijsIn(290);
		product1.printDetails();
		String productNaam = product1.watIsDeNaam();
		System.out.println(productNaam);
		
		Product product2 = new Product();
//		product2.name = "Wasmachine";
//		product2.price = 300;
//		product2.printDetails();
		
		Product product3 = new Product("Fiets", 23, true);
		product3.printDetails();
		
		// Cars ---------------------------------------------
		Auto auto1 = new Auto();
		Auto auto2 = new Auto();
		
		auto1.snelheid = 150;
		auto1.kleur = "groen";
		auto1.merk = "Ferrari";
		auto1.deuren = 2;
		auto1.schakelbak = true;
		
		auto2.snelheid = 110;
		auto2.kleur = "blauw";
		auto2.merk = "Volvo";
		auto2.deuren = 4;
		auto2.schakelbak = false;
		
		System.out.println("AUTO 1");
		auto1.showSpeed();
		String auto1kleur = auto1.getColour();
		int auto1deuren = auto1.getDeuren();
		System.out.println("De kleur van de auto is " + auto1kleur);
		System.out.println("De auto heeft " + auto1deuren + " deuren.");
		
		System.out.println("AUTO 2");
		auto2.printColour();
		auto2.setColour("rood");
		System.out.println("De kleur van auto 2 is veranderd!");
		auto2.printColour();
		
		System.out.println("AUTO 3");
		Auto auto3 = new Auto();
		auto3.printColour();
		
		System.out.println("AUTO 4");
		Auto auto4 = new Auto(100, "geel", "Jaguar", 4, true);
		auto4.printColour();
		
		// Cats and Dogs ---------------------------------
		Cat cat1 = new Cat();
		Dog dog1 = new Dog();
		
		cat1.setName("Kitty");
		cat1.setLegs(4);
		dog1.setName("Doggy");
		dog1.setLegs(4);
		System.out.println("Cat1 heeft " + cat1.legs + " benen.");
		int dog1legs = dog1.getLegs();
		System.out.println("Dog1 heeft " + dog1legs + " benen.");	
		cat1.makeSound();
	
	}

}
