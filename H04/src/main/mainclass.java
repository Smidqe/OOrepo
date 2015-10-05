package main;

import java.io.IOException;

public class mainclass {
	public static void main(String[] args) {
		IO2 file = new IO2();
		
		String s = "";
		
		try
		{
			s = file.read("input.txt");
		}
			catch (IOException e)
		{
			e.printStackTrace();
		}
		
		
		if (!s.isEmpty())
			System.out.println(s);
		
		try {
			file.write("output.txt", s);
		} catch (IOException e) {
			// TODO: handle exception
		}
		
	}
}
