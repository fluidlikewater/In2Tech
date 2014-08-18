import java.util.Scanner;

public class CountingMachine
{
	public static void main( String[] args )
	{	
		Scanner k = new Scanner(System.in);

		System.out.print( "Count to: " );
		int m = k.nextInt();
		
		for ( int n = 0; n <=m; n ++ )
		{
			System.out.print( n + " " );
		}
		System.out.println();
	}
}