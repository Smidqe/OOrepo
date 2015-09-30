package main;
import main.TBottle;
import java.util.*;

public class Mainclass {
	public static void menu()
	{
		System.out.println("1) Lis‰‰ rahaa koneeseen");
		System.out.println("2) Osta pullo");
		System.out.println("3) Ota rahat ulos");
		System.out.println("4) Listaa koneessa olevat pullot");
		System.out.println("0) Lopeta");
	}
	
	public static void main(String[] args) {
		Scanner s = new Scanner(System.in);
		TBottle a = new TBottle(5);
		int c = -1;
		
		System.out.println();
		while (c != 0)
		{
			System.out.println("*** LIMSA-AUTOMAATTI ***");
			menu();
			System.out.print("Valintasi: ");
			c = s.nextInt();
			
			switch (c)
			{
				case 0:
				{
					break;
				}
				case 1:
				{
					a.addMoney();
					break;
				}
				case 2:
				{
					a.printList();
					int b = -1;
					
					System.out.print("Valintasi: ");
					b = s.nextInt();
					
					a.buyBottle(b);
					break;
				}
				case 3:
				{
					
					a.returnMoney();
					break;
				}
				case 4:
				{
					a.printList();
					break;
				}
			}
			System.out.println();
		}
		
		s.close();
	}
}
