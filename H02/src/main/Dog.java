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
		if (!s.trim().isEmpty())
			System.out.println(s.trim());
		else
			System.out.println("Much wow!");

		return s.trim().isEmpty() ? 1 : 0;
	}
}
