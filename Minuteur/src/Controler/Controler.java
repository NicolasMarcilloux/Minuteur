package Controler;

public class Controler {	
	
	
	public static void change(int c, String s)
	{
		if(c == 0)
		{
			switch(s)
			{
				case "Heures":
					App.getModel().decrease(2);
					break;
				case "Minutes":
					App.getModel().decrease(1);
					break;
				case "Secondes":
					App.getModel().decrease(0);
					break;	
			}
		}
			
			
		else if (c == 1)
		{
			switch(s)
			{
				case "Heures":
					App.getModel().increase(2);
					break;
				case "Minutes":
					App.getModel().increase(1);
					break;
				case "Secondes":
					App.getModel().increase(0);
					break;	
			}
		}
		
	}
}
