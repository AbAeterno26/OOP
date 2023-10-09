
public class Auto {
	public int snelheid;
	public String kleur;
	public String merk;
	public int deuren;
	public boolean schakelbak;
	
	public Auto() {
		
	}
	
	public Auto(int snelheid, String kleur, String merk, int deuren, boolean schakelbak) {
		this.snelheid = snelheid;
		this.kleur = kleur;
		this.merk = merk;
		this.deuren = deuren;
		this.schakelbak = schakelbak; 		
	}
	
	public void showSpeed() {
		System.out.println("Auto rijdt " + snelheid + "km/h");
	}
	
	public void printColour() {
		System.out.println("De kleur van de auto is " + kleur);
	}
	
	public void setColour(String color) {
		this.kleur = color;
	}
	
	public String getColour() {
		return kleur;
	}
	
	public int getDeuren() {
		return deuren;
	}
}
