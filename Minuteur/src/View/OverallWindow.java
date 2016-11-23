package View;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;

public class OverallWindow {
	
	JFrame window;
	JPanel panel;
	JLabel label;
	
	public JLabel getLabel() {
		return label;
	}

	public void setLabel(JLabel label) {
		this.label = label;
	}

	public OverallWindow()
	{
			window = new JFrame("Hours-Minutes-Seconds");
			panel = new JPanel();
			label = new JLabel();
			
			panel.add(label);
			window.add(panel);
			window.setSize(400, 0);
			window.setVisible(true);
	}

}
