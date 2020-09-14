//written by Nicholas Garofalo

public class Healer extends Player {
	protected String name;
	protected int intellect;
	protected int defense;
	protected int attack;
	protected String weapon;
	protected String armor;
	
	public Healer(String name) {
		super.name = name;
		super.intellect = 7;
		super.attack = 3;
		super.defense = 4;
		super.weapon = "Staf";
		super.armor = "Robe";
	}
	
	public String toString() {
		return "Healer: " + super.toString();
	}
}
