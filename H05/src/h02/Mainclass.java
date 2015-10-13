package h02;

import java.util.Scanner;

//{"Veitsi", "Kirves", "Miekka", "Nuija"};
public class Mainclass {
	
	public static void weapons()
	{
		String s[] = {"Veitsi", "Kirves", "Miekka", "Nuija"};
		
		for (int i = 0; i < s.length; i++)
			System.out.printf("%d) %s\n", i + 1, s[i]);
	}
	
	public static void chars()
	{
		String s[] = {"Kuningas", "Ritari", "Kuningatar", "Peikko"};
		
		for (int i = 0; i < s.length; i++)
			System.out.printf("%d) %s\n", i + 1, s[i]);
	}
	
	public static void menu()
	{
		String s[] = {"Luo hahmo", "Taistele hahmolla", "Lopeta"};
		
		for (int i = 0; i < s.length; i++)
			System.out.printf("%d) %s\n", (i == 2) ? 0 : i + 1, s[i]);
	}
	
	public static void main(String[] args) {
		int c = -1;
		
		character ch = null;
	
		
    	Scanner s = new Scanner(System.in);
		while (c != 0)
		{
			System.out.println("*** TAISTELUSIMULAATTORI ***");
			menu();
			
			System.out.print("Valintasi: ");
			c = s.nextInt();
			switch(c){
			
				case 0:
					break;
					
				case 1:
				{			 
					System.out.println("Valitse hahmosi: ");
			    	chars();
			    	System.out.print("Valintasi: ");
			    	int chr = s.nextInt();
			    	
			    	System.out.println("Valitse aseesi: ");
			    	weapons();
			    	System.out.print("Valintasi: ");
			    	int wep = s.nextInt();

			    	ch = new character(chr - 1, wep - 1);
			    	break;
				}
					
				case 2:
				{
					ch.fight();
					break;
				}
			}
		}
		
		s.close();
	}

}
