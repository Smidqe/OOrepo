package main;
import main.Dog;
import java.awt.*;
import java.util.*;

public class Mainclass {
    public static void main(String[] args) {
    	Scanner s = new Scanner(System.in);
    	
    	System.out.print("Anna nimeni: ");
    	Dog dog = new Dog(s.nextLine());
    	
    	
    	dog.say();
    	int r = 1;
    	while (r == 1)
    	{
	    	System.out.print("Anna lausahdus: ");
	    	r = dog.speak(s.nextLine());
    	}	
    	
    	s.close();
    }
}
