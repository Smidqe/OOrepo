package main;
import java.util.*;
import java.text.*;
import java.math.*;

public class TBottle {
    
	
	
    private int amount;
    // The array for the Bottle-objects
    private ArrayList<TBottle> dm_list;

    private double money = 0;
    
    private String name;
    private String maker;
    private double volume;
    private double price;
    
    public TBottle create(String name, String maker, double volume, double price)
    {
    	TBottle r = new TBottle();
    	r.name = name.isEmpty() ? "Pepsi Max" : name;
    	r.maker = maker.isEmpty() ? "Pepsi" : maker;
    	r.volume = (volume == 0) ? 0.3 : volume;
    	r.price = (price == 0) ? 1.8 : price;
    	return r;
    }
    
    public TBottle()
    {
    }
    
    public TBottle(int bottles, int money){
    	this.amount = bottles;
    	this.money = money;   	
    	
    	dm_list = new ArrayList<TBottle>();
    	
    	for (int i = 0; i < this.amount; i++)
    		dm_list.add(create("", "", 0.0, 0.0));
    }
    
    public TBottle(int money)
    {
    	this.amount = 6;
    	this.money = money;
    	
    	dm_list = new ArrayList<TBottle>();
    	
    	dm_list.add(create("Pepsi Max", "", 0.5, 1.8));
    	dm_list.add(create("Pepsi Max", "", 1.5, 2.2));
    	dm_list.add(create("Coca-Cola Zero", "", 0.5, 2.0));
    	dm_list.add(create("Coca-Cola Zero", "", 1.5, 2.5));
    	dm_list.add(create("Fanta Zero", "", 0.5, 1.95));
    	dm_list.add(create("Fanta Zero", "", 0.5, 1.95));
    }
    
    public void printList(){
    	 DecimalFormat df = new DecimalFormat("#.#0"); df.setRoundingMode(RoundingMode.CEILING);     	
    	
    	for (int i = 0; i < this.amount; i++)
    		System.out.printf("%d. Nimi: %s\nKoko: %.1f\nHinta: %.2f\n\n", (i + 1), dm_list.get(i).name, dm_list.get(i).volume, df.format(dm_list.get(i).price));
    }
    
    public double getprice(int i)
    {
    	return dm_list.get(i).price;
    }
    
    public double getVolume(int i)
    {
    	return dm_list.get(i).volume;
    }
    
    public String getMaker(int i)
    {
    	return dm_list.get(i).maker;
    }
    
    public void addMoney() {
        money += 1;
        System.out.println("Klink! Money was added into the machine!");
    }
    
    public void buyBottle(int i) {
        if ((i < 0) || (i > dm_list.size()))
        	return;
    	
    	if (money < 1)
        {
        	System.out.println("Et ole antanut tarpeeksi rahaa!");
        	return;
        }
    	
        if (dm_list.size() == 0)
        {
        	System.out.println("Pullot loppuneet, :(");
        	return;
        }
        
        
        if (dm_list.size() > 0)
        	System.out.println("Pullon nimi: " + dm_list.get(i).name);

        amount -= 1;
        if (money > dm_list.get(i).price) 
		{	
			money -= dm_list.get(i).price;
			System.out.printf("KACHUNK! %s tipahti masiinasta!\n", dm_list.get(i).name);
			dm_list.remove(i);
		}
		else
			System.out.println("Syötä rahaa ensin!");
    }
    
    public void returnMoney() {

        System.out.printf("Klink klink. Sinne menivät rahat! Rahaa tuli ulos: %.2f€\n", money);
        money = 0;
    }
}

