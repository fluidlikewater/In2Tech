import java.util.Scanner;

public class KeychainsForSale
{
	public static void main ( String[] args )
	{
		Scanner keyboard = new Scanner(System.in);
		int choice;
		
		System.out.println( "Ye Olde Keychain Shoppe" );
		
		do {
		System.out.println( "\n1. Add Keychains to Order" );
		System.out.println( "2. Remove Keychains from Order" );
		System.out.println( "3. View Current Order" );
		System.out.println( "4. Checkout\n" );
		System.out.print( "Please enter your choice:" );
		choice = keyboard.nextInt();
		
		if ( choice == 1 )
		{
			addKeychains();
		}
		else if ( choice == 2 )
		{
			removeKeychains();
		}
		else if ( choice == 3 )
		{
			viewOrder();
		}
		else if ( choice == 4 )
		{
			checkout();
		}
		} while ( choice != 4 );
	}
	
	public static void addKeychains()
	{
		System.out.println( "\nADD KEYCHAINS" );
	}
	public static void removeKeychains()
	{
		System.out.println( "\nREMOVE KEYCHAINS" );
	}
	public static void viewOrder()
	{
		System.out.println( "\nVIEW ORDER" );
	}
	public static void checkout()
	{
		System.out.println( "\nCHECKOUT" );
	}
}