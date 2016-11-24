package App;
import Controller.Controller;
import Model.*;
import View.View;

public class App {

	public static void main(String[] args) {
		Color couleur = null;
		Model model = new Model();
		View view = new View();
		Controller c = new Controller();
		
		
		Player p = new Player("Yoann");
		NormalCard nc = new NormalCard(10, Color.Coeur);
		NormalCard nc2 = new NormalCard('R', Color.Carreau);
		TrumpCard tc = new TrumpCard(20);
		
		
		p.getCard(tc);
		p.getCard(nc);
		p.getCard(nc2);
		
		p.showHand();
	}

}
