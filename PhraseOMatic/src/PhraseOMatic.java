
public class PhraseOMatic {

	public static void main(String[] args) {
		// Les listes de mots sont issues d'un tableau de langue de bois mis en ligne l� : http://www.huyghe.fr/dyndoc_actu/44b4a838af4d3.pdf
		String[] wordListOne ={"Mesdames, Messieurs,", "Je reste fondamentalement persuad� que", "D�s lors, sachez que je me battrai pour faire admettre que", "Par ailleurs, c�est en toute connaissance de cause que je peux affirmer aujourd�hui que", "Je tiens � vous dire ici ma d�termination sans faille pour clamer haut et fort que", "J�ai depuis longtemps (ai-je besoin de vous le rappeler ?), d�fendu l�id�e que", "Et c�est en toute conscience que je d�clare avec conviction que", "Et ce n�est certainement pas vous, mes chers compatriotes, qui me contredirez si je vous dis que"};
		String[] wordListTwo ={"la conjoncture actuelle", "la situation d�exclusion que certains d�entre vous connaissent", "l�acuit� des probl�mes de la vie quotidienne", "la volont� farouche de sortir notre pays de la crise", "l�effort prioritaire en faveur du statut pr�caire des exclus", "le particularisme d� � notre histoire unique", "l�aspiration plus que l�gitime de chacun au progr�s social", "la n�cessit� de r�pondre � votre inqui�tude journali�re, que vous soyez jeunes ou �g�s,"};
		String[] wordListThree ={"doit s�int�grer � la finalisation globale", "oblige � la prise en compte encore plus effective", "interpelle le citoyen que je suis et nous oblige tous � aller de l�avant dans la voie", "a pour cons�quence obligatoire l�urgente n�cessit�", "conforte mon d�sir incontestable d�aller dans le sens", "doit nous amener au choix r�ellement imp�ratif", "doit prendre en compte les pr�occupations de la population de base dans l��laboration", "entra�ne une mission somme toute des plus exaltantes pour moi : l��laboration"};
		String[] wordListFour ={"d�un processus allant vers plus d��galit�.", "d�un avenir s�orientant vers plus de progr�s et plus de justice.", "d�une restructuration dans laquelle chacun pourra enfin retrouver sa dignit�.", "d�une valorisation sans concession de nos caract�res sp�cifiques.", "d�un plan correspondant v�ritablement aux exigences l�gitimes de chacun.", "de solutions rapides correspondant aux grands axes sociaux prioritaires.", "d�un programme plus humain, plus fraternel et plus juste.", "d�un projet porteur de v�ritables espoirs, notamment pour les plus d�munis."};
		
		//nombre de mots disponibles
		int oneLength = wordListOne.length;
		int twoLength = wordListTwo.length;
		int threeLength = wordListThree.length;
		int fourLength = wordListFour.length;
		
		//cr�ation de 4 nombres al�atoires, avec cast
		int randOne = (int) (Math.random() * oneLength);
		int randTwo = (int) (Math.random() * twoLength);
		int randThree = (int) (Math.random() * threeLength);
		int randFour = (int) (Math.random() * fourLength);
		
		//constitution d'une phrase et affichage
		String phrase = wordListOne[randOne] + " " + wordListTwo[randTwo] + " " + wordListThree[randThree] + " " + wordListFour[randFour];
		System.out.println(phrase);
	}

}
