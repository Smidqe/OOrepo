package main;

public class Dog {
	String name;
	
	public Dog(String s) {
		name = s;
	}
	
	public void speak() {
		System.out.println("Hei! Minun nimeni on " + name);
	}
}
