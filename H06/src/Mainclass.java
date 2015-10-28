import java.util.Scanner;

class account_helper
{
	public String id;
	public int money;
	public int limit;
	
	public account_helper()
	{	
	}
	
	public void clear()
	{
		id = "";
		money = 0;
		limit = 0;
	}
}

//yep, yep, yep, yep, aha aha aha
public class Mainclass {
	
	public static void menu()
	{
		String s[] = {"Lis‰‰ tavallinen tili", "Lis‰‰ luotollinen tili", "Tallenna tilille rahaa", "Nosta tililt‰", "Poista tili", "Tulosta tili", "Tulosta kaikki tilit", "Lopeta"};
		
		for (int i = 0; i < s.length; i++)
			System.out.printf("%d) %s\n", (i == (s.length - 1)) ? 0 : i + 1, s[i]);
	}
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
    	Scanner s = new Scanner(System.in);
    	Bank bank = new Bank();
    	account_helper ac = new account_helper();
		
    	System.out.printf("\n");
		int c = -1;
		while (c != 0)
		{
			ac.clear();
			
			System.out.println("*** PANKKIJƒRJESTELMƒ ***");
			menu();
			
			System.out.print("Valintasi: ");
			
			c = s.nextInt();
			switch(c){
			
				case 0:
					System.exit(0);
				case 1:
				{			 
					System.out.printf("Syˆt‰ tilinumero: ");
					s.nextLine();
					ac.id = s.nextLine();
				
					System.out.printf("Syˆt‰ raham‰‰r‰: ");
					ac.money = s.nextInt();
					
					bank.create(ac.id, true, ac.money, 0);
			    	break;
				}
					
				case 2:
				{
					System.out.printf("Syˆt‰ tilinumero: ");
					s.nextLine();
					ac.id = s.nextLine();
				
					System.out.printf("Syˆt‰ raham‰‰r‰: ");
					ac.money = s.nextInt();
					
					System.out.printf("Syˆt‰ luottoraja: ");
					ac.limit = s.nextInt();
					
					bank.create(ac.id, false, ac.money, ac.limit);
					break;
				}
				case 3:
				{
					System.out.printf("Syˆt‰ tilinumero: ");
					s.nextLine();
					ac.id = s.nextLine();
				
					System.out.printf("Syˆt‰ raham‰‰r‰: ");
					ac.money = s.nextInt();
					
					//System.out.printf("Talletetaan tilille: %s rahaa %d\n", ac.id, ac.money);
					bank.deposit(ac.id, (double)ac.money);
					break;
				}
				case 4:
				{
					System.out.printf("Syˆt‰ tilinumero: ");
					s.nextLine();
					ac.id = s.nextLine();
				
					System.out.printf("Syˆt‰ raham‰‰r‰: ");
					ac.money = s.nextInt();
					
					//System.out.printf("Nostetaan tililt‰: %s rahaa %d\n", ac.id, ac.money);
					bank.withdraw(ac.id, (double)ac.money);
					break;
				}
				case 5:
				{
					System.out.printf("Syˆt‰ poistettava tilinumero: ");
					s.nextLine();
					ac.id = s.nextLine();
					
					System.out.println("Tili poistettu.");
					break;
				}
				case 6:
				{
					System.out.printf("Syˆt‰ tulostettava tilinumero: ");
					s.nextLine();
					ac.id = s.nextLine();
									
					bank.print(ac.id);
					break;
				}
				case 7:
				{
					System.out.println("Kaikki tilit:");
					bank.print_all();
					break;
				}
				default:
				{
					System.out.println("Valinta ei kelpaa.");
				}
			}
			
			System.out.printf("\n");
		}
		
		s.close();
		
	}

}
