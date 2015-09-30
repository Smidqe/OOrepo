package main;

import java.util.regex.Pattern;

public class Dog {
	String name;
	int age;
	
	public Dog(String s) 
	{	
		name = s.trim().isEmpty() ? "Doge" : s;
	}
	
	public void say()
	{
		System.out.println("Hei! Minun nimeni on " + name);
	}
	
	public String getName() {
		return name;
	}
	
	public int getAge() {
		return age;
	}
	
	public void bark() {
		System.out.println("Hau!");
	}
	
	public int speak(String s) {
		String t;
		String a[];

		if (s.trim().isEmpty())
		{
			System.out.println("Much wow!");
			return 1;
		}
		int m = 0;
		t = s.trim();
	    a = s.split(Pattern.quote(" "));
	    for (int i = 0; i < a.length; i++)
	    {
			if ((a[i].toLowerCase().equals("true")) || (a[i].toLowerCase().equals("false")))
			{
				System.out.println("Such boolean: " + a[i]);
				m++;
			}
			
			try {
				int j = Integer.parseInt(a[i]);
				m++;
				System.out.println("Annoit kokonaisluvun: " + j);
				} 
				catch (NumberFormatException e) 
			{
				//This is not the place you are looking for.
			}
		
	    }
		if (m == 0)
			System.out.println(t.trim());

		return t.trim().isEmpty() ? 1 : 0;
	}
}
