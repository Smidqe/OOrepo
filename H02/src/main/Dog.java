package main;

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
		boolean b;
		String t;
		int i;
		
		t = s.trim();
		System.out.println(s.trim());

		if (!t.trim().isEmpty())
		{	
			if ((t.toLowerCase().equals("true")) || (t.toLowerCase().equals("false")))
			{
				System.out.println("Annoit boolean arvon: " + s);
				return 1;
			}
			
			try {
				i = Integer.parseInt(t);
				System.out.println("Annoit kokonaisluvun: " + s);
				return 1;
				} 
				catch (NumberFormatException e) 
			{
				//This is not the place you are looking for.
			}
			System.out.println(t.trim());
		}
		else
			System.out.println("Much wow!");

		return t.trim().isEmpty() ? 1 : 0;
	}
}
