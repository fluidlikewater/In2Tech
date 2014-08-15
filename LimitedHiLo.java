import java.util.Random;
import java.util.Scanner;

public class LimitedHiLo
{
	public static void main ( String[] args )
	{
		Random r = new Random();
		Scanner k = new Scanner(System.in);
		
		int n = 1 + r.nextInt(100);
		
		System.out.print( "I'm thinking of a number from 1 to 100. You have 7 guesses.\nWhat is your first guess? " );
		int g = k.nextInt();
		
		int counter = 0;
		
		if ( g == n )
			System.out.println( "Wow! You got it on the first try!" );	
		
		else	
		{
			
			while ( g != n && counter < 7 )
			{
				if ( g > n )
					System.out.println( "\nSorry, you are too high." );
				else 
					System.out.println( "\nSorry, you are too low.." );
				
				counter ++;
				System.out.print( "Guess # " + (counter + 1) + ": " );
				g = k.nextInt();
			}
		
		if ( g == n )
			System.out.println( "You guessed it! The number was " + g + "." );
		else
			System.out.println( "Sorry, you ran out of tries." );
		}
	}
}