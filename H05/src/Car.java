import java.util.ArrayList;

class Wheel {
	public Wheel()
	{
		System.out.println("Valmistetaan: Wheel");
	}
}

class Body {
	public Body()
	{
		System.out.println("Valmistetaan: Body");
	}
}

class Chassis {
	public Chassis()
	{
		System.out.println("Valmistetaan: Chassis");
	}
}

class Engine {
	public Engine()
	{
		System.out.println("Valmistetaan: Engine");
	}
}

public class Car {
	Engine engine;
	Chassis chassis;
	Body body;
	ArrayList<Wheel> wheels;
	
	public Car()
	{
		body = new Body();
		chassis = new Chassis();
		engine = new Engine();	
		
		wheels = new ArrayList<Wheel>();
		for (int i = 0; i < 4; i++)
			wheels.add(new Wheel());
	}
	
	public void print()
	{
		System.out.printf("Autoon kuuluu:\n\t%s\n\t%s\n\t%s\n\t%d %s\n", 
							this.body.getClass().getName(),
							this.chassis.getClass().getName(),
							this.engine.getClass().getName(),
							this.wheels.size(), this.wheels.get(0).getClass().getName()
				);
	}
}
