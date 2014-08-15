import java.util.Scanner;

public class LoopAddValues
{
	public static void main ( String[] args )
	{
		Scanner k = new Scanner(System.in);
		
		System.out.println( "I will add up the numbers you give me." );
		int t = 0;
		int n = 1;
		
		System.out.print( "Number: " );
		n = k.nextInt();
		
		while ( n != 0 )
		{
			t += n;
			System.out.println( "The total so far is " + t );
			System.out.print( "Number: " );
			n = k.nextInt();
		}
		System.out.println( "The total is " + t );	
	}
}