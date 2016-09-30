
public class Player {
	int number = 0;
	String nom = "";
	
	public void guess() {
		number = (int) (Math.random() * 10);
	}
	public String name(String nom) {
		return nom;
	}
}