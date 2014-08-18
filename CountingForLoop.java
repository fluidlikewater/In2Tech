// N = n+1 increments the value of n each time the loop runs removing it causes the loop to run indefinitely
// n = 1 instantiates n it won't even compile without it



import java.util.Scanner;

public class CountingForLoop
{
	public static void main( String[] args )
	{	
		Scanner k = new Scanner(System.in);
		
		System.out.println( "Type in a Message and I will display if five times." );
		System.out.print( "Message: " );
		String m = k.nextLine();
		
		for ( int n = 2; n <=10; n += 2 )
		{
			System.out.println( n + ". " + m );
		}
	}
}