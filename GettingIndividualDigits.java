public class GettingIndividualDigits
{
	public static void main( String[] args )
	{
		for ( int n=1; n <= 9; n++ )
		{
			for ( int i = 0; i <= 9; i++ )
			{
				System.out.println( n + "" + i + " " + n + "+" + i + " = " + (n + i) );
			}
		}
	}
}