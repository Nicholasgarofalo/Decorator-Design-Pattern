//written by Nicholas Garofalo

public abstract class Player {
	protected String name;
	protected int intellect;
	protected int defense;
	protected int attack;
	protected String weapon;
	protected String armor;
	
	public String toString() {
		return name +
				"\nCarries a " + weapon + ", and carries a " + armor;
	}
	
	public double getPower() {
		return (attack*3) + defense + (intellect/2);
	}
}
