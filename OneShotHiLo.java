import java.util.Random;
import java.util.Scanner;

public class OneShotHiLo
{
	public static void main ( String[] args )
	{
		Random r = new Random();
		Scanner k = new Scanner(System.in);
		
		int n = 1 + r.nextInt(100), g;
		
		System.out.print( "I'm thinking of a number from 1 to 100.\nWhat is your guess? " );
		g = k.nextInt();
		
		if ( g == n )
			System.out.println( "\nYou guessed it! What are the odds?" ); // 1%
		else if ( g > n )
			System.out.println( "\nSorry, you are too high. I was thinking of " + n + "." );
		else 
			System.out.println( "\nSorry, you are too low. I was thinking of " + n + "." );
	}
}