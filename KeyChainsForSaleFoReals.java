import java.util.Scanner;

public class KeychainsForSaleFoReals
{
	public static void main ( String[] args )
	{
		Scanner keyboard = new Scanner(System.in);
		int choice, numKeys = 0, price = 10;
		
		System.out.println( "Ye Olde Keychain Shoppe" );
		
		do {
		System.out.println( "\n1. Add Keychains to Order" );
		System.out.println( "2. Remove Keychains from Order" );
		System.out.println( "3. View Current Order" );
		System.out.println( "4. Checkout" );
		System.out.print( "\nPlease enter your choice:" );
		choice = keyboard.nextInt();
		
		if ( choice == 1 )
		{
			numKeys = addKeychains(numKeys);
		}
		else if ( choice == 2 )
		{
			numKeys = removeKeychains(numKeys);
		}
		else if ( choice == 3 )
		{
			viewOrder(numKeys, price);
		}
		else if ( choice == 4 )
		{
			checkout(numKeys, price);
		}
		} while ( choice != 4 );
	}
	
	public static int addKeychains( int keys )
	{
		Scanner keyboard = new Scanner(System.in);
		System.out.print( "\nYou have " + keys + " keychains. How many to add? " );
		keys += keyboard.nextInt();
		return keys;
	}
	public static int removeKeychains( int keys )
	{
		Scanner keyboard = new Scanner(System.in);
		System.out.print( "\nYou have " + keys + " keychains. How many to remove? " );
		keys -= keyboard.nextInt();
		return keys;
	}
	public static void viewOrder(int keys, int price)
	{
		System.out.println( "\nYou have " + keys + " keychains." );
		System.out.println( "Keychains cost $" + price + " each." );
		System.out.println( "Total cost is $" + (price * keys) + "." );
	}
	public static void checkout(int key, int price)
	{
		Scanner keyboard = new Scanner(System.in);
		System.out.println( "\nCHECKOUT" );
		System.out.print( "What is your name? " );
		String name = keyboard.nextLine();
		viewOrder( key, price );
		System.out.println( "Thanks for your order, " + name + "!" );
		
	}
}