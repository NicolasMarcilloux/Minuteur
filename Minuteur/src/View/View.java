package View;

import java.util.Observable;
import java.util.Observer;
import Model.Model;

public class View implements Observer{
	
	private Model m;
	static Window MinWin;
	static Window SecWin;
	static Window HouWin;
	static OverallWindow AllWin;
	
	public static Window getMinWin() {
		return MinWin;
	}
	public void setMinWin(Window minWin) {
		MinWin = minWin;
	}
	public static Window getSecWin() {
		return SecWin;
	}
	public void setSecWin(Window secWin) {
		SecWin = secWin;
	}
	public static Window getHouWin() {
		return HouWin;
	}
	public void setHouWin(Window houWin) {
		HouWin = houWin;
	}
	public static OverallWindow getAllWin() {
		return AllWin;
	}
	public void setAllWin(OverallWindow allWin) {
		AllWin = allWin;
	}

	public View(Model model)
	{
		m = model;
		m.addObserver(this);
		MinWin = new Window("Minutes");
		SecWin = new Window("Secondes");
		HouWin = new Window("Heures");
		AllWin = new OverallWindow();
		update(m, this);
	}
	@Override
	public void update(Observable o, Object arg) {
		HouWin.getLabel().setText(Integer.toString(m.getH().getValue()));
		MinWin.getLabel().setText(Integer.toString(m.getM().getValue()));
		SecWin.getLabel().setText(Integer.toString(m.getS().getValue()));
		AllWin.getLabel().setText(Integer.toString(m.getH().getValue()) + ":" + Integer.toString(m.getM().getValue()) + ":" + Integer.toString(m.getS().getValue()));
		
	}

}
