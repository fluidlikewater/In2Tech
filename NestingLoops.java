public class NestingLoops
{
	public static void main( String[] args )
	{
		// this is #1 - I'll call it "CN" ( Switching the loops causes 
		for ( int n=1; n <= 3; n++ )
		{
			for ( char c='A'; c <= 'E'; c++ )
			{
				System.out.println( c + " " + n ); // n iterates faster and is controlled by the inner loop
			}
		}

		System.out.println("\n");

		// this is #2 - I'll call it "AB"
		for ( int a=1; a <= 3; a++ )
		{
			for ( int b=1; b <= 3; b++ )
			{
				System.out.print( a + "-" + b + " " ); // The print is no longer on one line.
			}
			System.out.println( "My added line" ); // This runs at the end of each outer loop.	
		}

		System.out.println("\n");

	}
}