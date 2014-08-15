// n++ increments n by 1 if you remove it the loop runs forever
//


import java.util.Scanner;

public class CountingWhile
{
	public static void main( String[] args )
	{
		Scanner keyboard = new Scanner(System.in);

		System.out.println( "Type in a message, and I'll display it several times." );
		System.out.print( "Message: " );
		String message = keyboard.nextLine();
		
		int n = 0;
		
		System.out.print( "# of times: " );
		int x = keyboard.nextInt();	
		
		while ( n < x )
		{
			System.out.println( (n+1) * 10 + ". " + message );
			n++;
		}

	}
}