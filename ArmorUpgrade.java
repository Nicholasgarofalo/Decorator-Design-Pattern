//Written by Nicholas Garofalo

public class ArmorUpgrade extends PlayerDecorator {
	private Player player;
	
	public ArmorUpgrade(Player aPlayer) {
		player = aPlayer;
	}
	
	public String toString() {
		return player.toString() + 
				"\nUpgraded armor";
	}
	
	public double getPower() {
		return player.getPower() + 3;
	}
}
