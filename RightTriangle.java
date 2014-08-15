import java.util.Scanner;

public class RightTriangle
{
	public static void main ( String[] args )
	{
		Scanner k = new Scanner(System.in);
		
		
		
		System.out.print( "Enter 3 integers:\nSide 1: " );
		int s1 = k.nextInt();
		
		System.out.print( "Side 2: " );
		int s2 = k.nextInt();
		
		while ( s2 < s1 )
		{
			System.out.println( s2 + " is smaller than " + s1 + ". Try again." );
			System.out.print( "Side 2: " );
			s2 = k.nextInt();
		} 
		
		System.out.print( "Side 3: " );
		int s3 = k.nextInt();
		
		while ( s3 < s2 )
		{
			System.out.println( s3 + " is smaller than " + s2 + ". Try again." );
			System.out.print( "Side 2: " );
			s3 = k.nextInt();
		} 
		
		System.out.println( "Your three sides are  " + s1 + ", " + s2 + " and " + s3 + "."  );
		
		if ( (s1 * s1) + (s2 * s2) == (s3 * s3) )
			System.out.println( "This is a right triangle." );
		else 
			System.out.println( "This is not a right triangle." );
	}
}