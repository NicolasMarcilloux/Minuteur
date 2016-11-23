package Model;

import java.util.Observable;

public class Model extends Observable{

	private Hours h;
	private Minutes m;
	private Seconds s;

	public Model() {
		h = new Hours();
	    m = new Minutes();
	    s = new Seconds();
	}

	public Hours getH() {
		return h;
	}

	public void setH(Hours h) {
		this.h = h;
	}

	public Minutes getM() {
		return m;
	}

	public void setM(Minutes m) {
		this.m = m;
	}

	public Seconds getS() {
		return s;
	}

	public void setS(Seconds s) {
		this.s = s;
	}
	
	public void increase(int type)
	{
		if(type == 0)
		{
			if(s.getValue() == 59)
			{
				if(m.getValue() == 59)
				{
					m.setValue(0);
					if(h.getValue() == 23)
						h.setValue(0);
					else
						h.setValue(h.getValue()+1);
				}
				else
					m.setValue(m.getValue()+1);
				
				s.setValue(0);
			}
			else
				s.setValue(s.getValue()+1);
		}
		
		if(type == 1)
		{
			if(m.getValue() == 59)
			{
				if(h.getValue() == 23)
					h.setValue(0);
				else
					h.setValue(h.getValue()+1);
				
				m.setValue(0);
			}
			else
				m.setValue(m.getValue()+1);
		}
		
		if(type == 2)
		{
			if(h.getValue() == 23)
			{
				h.setValue(0);
			}
			else
				h.setValue(h.getValue()+1);
		}
		
		this.setChanged();
		this.notifyObservers();
	}
	
	public void decrease(int type)
	{
		if(type == 0)
		{
			if(s.getValue() == 0)
			{
				if(m.getValue() == 0)
				{
					if(h.getValue() == 0)
						h.setValue(23);
					else
						h.setValue(h.getValue()-1);
					
					s.setValue(59);
					m.setValue(59);
				}
				
				else
				{
					s.setValue(59);
					m.setValue(m.getValue()-1);
				}
			}
			else
				s.setValue(s.getValue()-1);
		}
		
		if(type == 1)
		{
			if(m.getValue() == 0)
			{
				if(h.getValue() == 0)
				{
					h.setValue(23);
				}
				else
				{
					h.setValue(h.getValue()-1);
				}
				
				m.setValue(59);
			}
			else
				m.setValue(m.getValue()-1);
		}
		
		if(type == 2)
		{
			if(h.getValue() == 0)
				h.setValue(23);
			else
				h.setValue(h.getValue()-1);
		}
		
		this.setChanged();
		this.notifyObservers();
	}

}
