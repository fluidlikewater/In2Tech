import java.util.Scanner;

public class AddingValuesForLoop
{
	public static void main( String[] args )
	{
		Scanner k = new Scanner(System.in);
		
		System.out.print( "Number: " );
		int num = k.nextInt();
		int total = 0;
		
		for ( int i = 1; i <= num; i++ )
		{
			System.out.print( i + " " );
			total += i;
		}
		System.out.println( "\nThe sum is " + total + "."); 
	}
}