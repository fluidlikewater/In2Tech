import java.util.Scanner;

public class CountingMachineRevisited
{
	public static void main( String[] args )
	{	
		Scanner k = new Scanner(System.in);
		
		System.out.print( "Count from: " );
		int start = k.nextInt();
		
		System.out.print( "Count to  : " );
		int end = k.nextInt();
		
		System.out.print( "Count by  : " );
		int by = k.nextInt();
		
		for ( int n = start; n <= end; n += by )
		{
			System.out.print( n + " " );
		}
		System.out.println();
	}
}