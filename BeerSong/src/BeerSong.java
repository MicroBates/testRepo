/* 
 * This was encoded in UTF-8
 * */
public class BeerSong {

	public static void main(String[] args) {
		//init et déclaration de variables
		int beerNum = 99;
		String word ="bottles";
		
		//boucle de traitement
		while (beerNum > 0) {
			//traitement
			System.out.println(beerNum + " " + word + " of beer on the wall");
			System.out.println(beerNum + " " + word + " of beer.");
			System.out.println("Take one down, Pass it around.");
			//changement de valeur de variable
			beerNum = beerNum - 1;
			//condition sur la valeur de la variable modifiée
			if (beerNum == 1) {
				word = "bottle";
			}
			//condition sur la valeur de la variable modifiée avant sous-traitement
			if (beerNum > 0) {
				System.out.println(beerNum + " " + word + " of beer on the wall");
				System.out.println("");
			} else {
				System.out.println("No more bottles of beer on the wall");
			}

		}
	}
}