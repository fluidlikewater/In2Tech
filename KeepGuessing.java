import java.util.Random;
import java.util.Scanner;

public class KeepGuessing
{
	public static void main ( String[] args )
	{
		Random r = new Random();
		Scanner k = new Scanner(System.in);
		
		int n = 1 + r.nextInt(10), g = 11;
		
		System.out.println( "I'm thinking of a number from 1 to 10." );
		
		while ( g != n )
		{
			System.out.print( "Your guess: " );
			g = k.nextInt();
			
			if ( g == n )
				System.out.println( "That's right! My secret number was " + n + "!" );
			else
				System.out.println( "Sorry that isn't correct." );
		}	
	}
}