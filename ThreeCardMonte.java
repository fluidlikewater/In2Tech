import java.util.Random;
import java.util.Scanner;

public class ThreeCardMonte
{
	public static void main ( String[] args )
	{
		Random r = new Random();
		Scanner k = new Scanner(System.in);
		
		int n = 1 + r.nextInt(3), g;
		
		System.out.print( "You slide up to Fast Eddie's card table and plop down your cash."
						+ "\nHe glances at you out of the corner of his eye and starts shuffling."
						+ "\nHe lays down three cards.\n" 
						+ "\nWhich one is the ace?\n\n" 
						+ "\t\t## ## ##\n"
						+ "\t\t## ## ##\n"
						+ "\t\t## ## ##\n"
						+ "\t\t1  2  3\n\n"
						+ "> " );
		
		g = k.nextInt();
		
		if ( g == n )
			System.out.println( "\nYou nailed it! Fast Eddie reluctantly hands over your winnings, scowling.\n" );
		else
			System.out.println( "\nHa! Fast Eddie wins again! The ace was card number " + n + ".\n" );
		
		if (n == 1)
			System.out.println( "\t\tAA ## ##\n" + "\t\tAA ## ##\n" + "\t\tAA ## ##\n" + "\t\t1  2  3" );
		else if (n == 2) 
			System.out.println( "\t\t## AA ##\n" + "\t\t## AA ##\n" + "\t\t## AA ##\n" + "\t\t1  2  3" );
		else
			System.out.println( "\t\t## ## AA\n" + "\t\t## ## AA\n" + "\t\t## ## AA\n" + "\t\t1  2  3" );
	}
}

