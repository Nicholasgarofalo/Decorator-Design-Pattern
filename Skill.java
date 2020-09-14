//written by Nicholas Garofalo

public class Skill extends PlayerDecorator {
	private Player player;
	
	public Skill(Player aPlayer) {
		player = aPlayer;
	}
	
	public String toString() {
		return player.toString() + 
				"\nUpgraded skill";
	}
	
	public double getPower() {
		return player.getPower() + 2;
	}
}
