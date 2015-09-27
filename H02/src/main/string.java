package main;

public class string {
	public boolean toBool(String s)
	{
		String v = s.toLowerCase();
		
		if ((v != "true") || (v != "false"))
			return false;
		
		if (v == "true")
			return true;
		else
			return false;
	}
	

}
