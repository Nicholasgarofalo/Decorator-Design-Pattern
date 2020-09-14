//Written by Nicholas Garofalo

public class Warrior extends Player{
	protected String name;
	protected int intellect;
	protected int defense;
	protected int attack;
	protected String weapon;
	protected String armor;
	
	public Warrior(String name) {
		super.name = name;
		super.intellect = 2;
		super.attack = 8;
		super.defense = 5;
		super.weapon = "Sword";
		super.armor = "Breast Plate";
	}
	
	public String toString() {
		return "Warrior: " + super.toString();
	}
	
}
