package main;
import main.Dog;
//import java.awt.*;

public class Mainclass {
    public static void main(String[] args) {
    	Dog dog = new Dog("Wuff");
    	//hello
    	TPoint p = new TPoint(5, 5);
    	
    	p.print();
    	p.offset(5);
    	p.print();
    	p.offset(-5);
    	p.print();
    	
    	p.offset(-5, 5);
    	p.print();
    	
    	System.out.println(p.distance(new TPoint(4, 4)));
    	
    	p.pos();
    	p.print();
    	
    	dog.speak("hello");
    }
}
