
public class GuessGame {
	Player p1;
	Player p2;
	Player p3;
	
	public void startGame() {
		p1 = new Player();
		p2 = new Player();
		p3 = new Player();
		
		String np1 = p1.name("joueur 1");
		String np2 = p2.name("joueur 2");
		String np3 = p3.name("joueur 3");
		
		boolean p1isRight = false;
		boolean p2isRight = false;
		boolean p3isRight = false;
		
		int targetNumber = (int) (Math.random() * 10);
		System.out.println("Je pense à un chiffre entre 0 et 9...");
		System.out.println("... et le chiffre à deviner est " + targetNumber);
		
		while(true) {
						
			p1.guess();
			p2.guess();
			p3.guess();
			
			System.out.println("Le " + np1 + " a deviné " + p1.number);
			System.out.println("Le " + np2 + " a deviné " + p2.number);
			System.out.println("Le " + np3 + " a deviné " + p3.number);
			
			if (p1.number == targetNumber) {
				p1isRight = true;
			}
			if (p2.number == targetNumber) {
				p2isRight = true;
			}
			if (p3.number == targetNumber) {
				p3isRight = true;
			}
			
			if (p1isRight || p2isRight || p3isRight) {
				System.out.println("Il y a un gagnant!^^");
				System.out.println("Est-ce que le " + np1 + " a deviné ? " + p1isRight);
				System.out.println("Est-ce que le " + np2 + " a deviné ? " + p2isRight);
				System.out.println("Est-ce que le " + np3 + " a deviné ? " + p3isRight);
					if (p1isRight) {
						System.out.println("Le " + np1 + " a gagné !");
					}
					if (p2isRight) {
						System.out.println("Le " + np2 + " a gagné !");
					}
					if (p3isRight) {
						System.out.println("Le " + np3 + " a gagné !");
					}
				System.out.println("Bravo! Le jeu est fini.");
				System.out.println("GAME OVER");
				break;
			} else {
				System.out.println("Essayez encore ! ;-)");
			}
		}
	}
}
