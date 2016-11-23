package Model;

public class Minutes {
	private int value = 0;

	public int getValue() {
		return value;
	}

	public void setValue(int value) {
		this.value = value;
	}
	
	public Minutes()
	{
		value = 0;
	}
	
	public Minutes(int v)
	{
		value = v;
	}
}
