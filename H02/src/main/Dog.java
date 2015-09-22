package main;

public class Dog {
	String name;
	int age;
	
	public Dog(String s) {
		name = s;
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
	
	public void speak(String s) {
		System.out.println("Hei! Minun nimeni on " + name);
		
		if (!s.isEmpty())
			System.out.println(s);
	}
}
