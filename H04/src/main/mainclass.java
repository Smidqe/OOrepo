package main;

import java.io.IOException;

public class mainclass {
	public static void main(String[] args) {
		IO2 file = new IO2();

		try
		{
			file.readZip("zipinput.zip");
		}
			catch (IOException e)
		{
			e.printStackTrace();
		}
		
	}
}
