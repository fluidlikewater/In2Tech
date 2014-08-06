// I don't get the point of this one. We must be using it later or something...

import java.util.Scanner;

public class WorstNumberGuesser
{
	public static void main( String[] args )
	{
		Scanner keyboard = new Scanner(System.in);
		
		int guess, num = 4;
		
		System.out.println("TEH WORST NUBMER GESSING GAME EVAR!!!!!!!1!");

		System.out.print("\nWI\"M THKING OF A NBR FROM 1-10.  TRY 2 GESS! ");
		guess = keyboard.nextInt();
		
		if ( guess == 4 )
			System.out.println("\nLOL!!! U GOT IT!  I CANT BELEIVE U GESSED IT WAS 4!");
		
		else
			System.out.println("\nW00T!  U SUX0R!!!  I PWN J00!!!  IT WAS 4!");
		
	}
}