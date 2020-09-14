//written by Nicholas Garofalo

public class WeaponUpgrade extends PlayerDecorator {
	private Player player;
	
	public WeaponUpgrade(Player aPlayer) {
		player = aPlayer;
	}
	
	public String toString() {
		return player.toString() + 
				"\nUpgraded weapon";
	}
	
	public double getPower() {
		return player.getPower() + 5;
	}
}
