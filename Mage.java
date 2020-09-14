//written by Nicholas Garofalo

public class Mage extends Player {
	protected String name;
	protected int intellect;
	protected int defense;
	protected int attack;
	protected String weapon;
	protected String armor;
	
	public Mage(String name) {
		super.name = name;
		super.intellect = 8;
		super.attack = 2;
		super.defense = 3;
		super.weapon = "Staf";
		super.armor = "Robe";
	}
	
	public String toString() {
		return "Mage: " + super.toString();
	}
}
