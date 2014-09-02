import java.util.Scanner;

public class KeychainsForSaleRealPower
{
	public static void main ( String[] args )
	{
		Scanner keyboard = new Scanner(System.in);
		int choice, numKeys = 0;
		double price = 10.0, tax = 0.0825, baseShipping = 5.0, additionalShipping = 1.0;
		
		System.out.println( "Ye Olde Keychain Shoppe" );
		
		do {
			System.out.println( "\nYour order currently contains " + numKeys + " keychains." );
			System.out.println( "\n1. Add Keychains to Order" );
			System.out.println( "2. Remove Keychains from Order" );
			System.out.println( "3. View Current Order" );
			System.out.println( "4. Checkout" );
			System.out.print( "\nPlease enter your choice: " );
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
				viewOrder(numKeys, price, tax, baseShipping, additionalShipping );
			}
			else if ( choice == 4 )
			{
				checkout(numKeys, price, tax, baseShipping, additionalShipping );
			}
			else
			{
				System.out.println("Sorry that is not a valid selection");
			}
		
		} while ( choice != 4 );
	}
	
	public static int addKeychains( int keys )
	{
		Scanner keyboard = new Scanner(System.in);
		int addKeys = 0;
		
		do
		{
			System.out.print( "\nYou have " + keys + " keychains. How many to add? " );
			addKeys = keyboard.nextInt();
			if ( addKeys < 0 )
			{
				System.out.println( "Please enter a positive integer." );
			}
		} while ( addKeys < 0 );
		
		keys += addKeys;
		return keys;
	}
	public static int removeKeychains( int keys )
	{
		int subKeys = 0;
		Scanner keyboard = new Scanner(System.in);
		
		do
		{
			System.out.print( "\nYou have " + keys + " keychains. How many to remove? " );
			subKeys = keyboard.nextInt();
			if ( (keys - subKeys) < 0 )
			{
				System.out.println ( "You cannot have fewer than 0 keys" );
			}
		} while ( (keys - subKeys) < 0 ); 
		
		keys -= subKeys;
		
		return keys;
	}
	public static void viewOrder(int keys, double price, double tax, double baseShipping, double additionalShipping )
	{
		double total = (price * keys) + baseShipping + ( additionalShipping * keys );
		System.out.println( "\nYou have " + keys + " keychains." );
		System.out.println( "\nKeychains cost $" + price + " each." );
		System.out.println( "The cost for shipping is $" + baseShipping  + " plus $" + ( additionalShipping * keys ) + " ($1 for each keychain)." );
		System.out.println( "Total cost is $" + (total + (total * tax)) + " after adding tax amount of $" + (total * tax) + "." );
	}
	public static void checkout( int keys, double price, double tax, double baseShipping, double additionalShipping )
	{
		Scanner keyboard = new Scanner(System.in);
		System.out.println( "\nCHECKOUT" );
		System.out.print( "What is your name? " );
		String name = keyboard.nextLine();
		viewOrder( keys, price, tax, baseShipping, additionalShipping );
		System.out.println( "Thanks for your order, " + name + "!" );
		
	}
}