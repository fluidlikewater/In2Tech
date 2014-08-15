import java.util.Scanner;

public class SafeSquareRoot
{
	public static void main ( String[] args )
	{
		Scanner k = new Scanner(System.in);
		
		
		
		System.out.print( "SQUARE ROOT!\nEnter a number: " );
		int n = k.nextInt();
		
		while ( n < 0 )
		{
			System.out.println( "The square root of a negative number is imaginary." );
			System.out.print( "Do another: " );
			n = k.nextInt();
		} 
		
		double r = Math.sqrt(n);
		System.out.println( "The square root of " + n + " is " + r );
	}
}