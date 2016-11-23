package View;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;

import Controler.Controler;

@SuppressWarnings("serial")
public class Window extends JFrame implements ActionListener{
	
	JPanel panel = new JPanel();
	JLabel label = new JLabel();
	JButton IncButton = new JButton("+");
	JButton DecButton = new JButton("-");
	
	public JLabel getLabel() {
		return label;
	}

	public void setLabel(JLabel label) {
		this.label = label;
	}

	public Window(String nom)
	{
			this.setTitle(nom);
			
			IncButton.addActionListener(this);
			IncButton.setSize(10, 10);
			DecButton.addActionListener(this);
			DecButton.setSize(10, 10);
			
			panel.add(label);
			panel.add(IncButton);
			panel.add(DecButton);
			
			this.add(panel);
			this.setSize(200, 100);
			this.setVisible(true);
	}
	
	public void actionPerformed(ActionEvent arg0)
	{
		if(arg0.getSource() == IncButton)
			Controler.change(1,this.getTitle());
		
		else if(arg0.getSource() == DecButton)
			Controler.change(0, this.getTitle());
	}
}
