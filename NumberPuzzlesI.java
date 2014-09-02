public class NumberPuzzlesI
{
	public static void main( String[] args )
	{
		for ( int n=10; n <= 50; n++ )
		{
			for ( int i = 10; i <= 50; i++ )
			{
				if ( (n + i) == 60 && (n - i) == 14 )
					System.out.println( n + ", " + i );
			}
		}
	}
}