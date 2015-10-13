package h02;

class WeaponBehavior{
	public String name;
	
	public WeaponBehavior(String name)
	{
		this.name = name;
	}
}
public class character {
	
	public WeaponBehavior weapon;
	public String name;
	
	public character(int name, int weapon) {
		String chars[] = {"King", "Knight", "Queen", "Troll"};
		String weapons[] = {"Knife", "Axe", "Sword", "Club"};
		
		this.name = chars[name];
		this.weapon = new WeaponBehavior(weapons[weapon]);
	}

	public void fight(){
		System.out.printf("%s taistelee aseella %s", this.name, this.weapon.name);
	}
	
}
