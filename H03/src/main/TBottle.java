package main;
import java.util.*;

public class TBottle {
    
    private int amount;
    // The array for the Bottle-objects
    private ArrayList<TBottle> dm_list;
    
    private TBottle[] list;
    private int money = 0;
    
    private String name;
    private String maker;
    private double volume;
    
    public TBottle create(String name, String maker, double volume)
    {
    	TBottle r = new TBottle();
    	r.name = name.isEmpty() ? "Pepsi Max" : name;
    	r.maker = maker.isEmpty() ? "Pepsi" : maker;
    	r.volume = (volume == 0) ? 0.3 : volume;
    	
    	return r;
    }
    
    public TBottle()
    {
    }
    
    public TBottle(int bottles, int money){
    	this.amount = bottles;
    	this.money = money;   	
    	
    	list = new TBottle[bottles];
    	
    	for (int i = 0; i < this.amount; i++)
    		list[i] = this.create("", "", 0.0);
    }
    
    public void addMoney() {
        money += 1;
        System.out.println("Klink! Money was added into the machine!");
    }
    
    public void buyBottle() {
        if (money < 1)
        {
        	System.out.println("Et ole antanut tarpeeksi rahaa!");
        	return;
        }
    	
        if (amount == 0)
        {
        	System.out.println("Pullot loppuneet, :(");
        	return;
        }
        
        if (amount > 0)
        	System.out.println("Pullon nimi: " + list[0].name);

        
        amount -= 1;
        
        System.out.println("KACHUNK! Bottle appeared from the machine!");
    }
    
    public void returnMoney() {
        money = 0;
        System.out.println("Klink klink. All money gone!");
    }
}

