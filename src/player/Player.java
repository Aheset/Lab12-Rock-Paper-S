package player;

public abstract class Player {
	
	private String Name;
	private String Roshambo;
	public abstract String Roshambo();
	
	public String getName() {
		return Name;
	}
	public void setName(String name) {
		Name = name;
	}
	public String getRoshambo() {
		return Roshambo;
	}
	public void setRoshambo(String roshambo) {
		Roshambo = roshambo;
	}
}
