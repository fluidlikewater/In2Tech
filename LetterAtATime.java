import java.util.Scanner;

public class LetterAtATime
{
	public static void main( String[] args )
	{				
		Scanner k = new Scanner(System.in);
		
		System.out.print( "What is your message? " );
		String m = k.nextLine();
		int begin = 0, end = m.length() - 1;
		
		System.out.println( "Your message is " + m.length() + " characters long." );
		System.out.println( "The first character is at position " + begin + " and is '" + m.charAt(begin) + "'." );
		System.out.println( "The last character is at position " + end + " and is '" + m.charAt(end) + "'." );
		
		System.out.println( "\nHere are all the characters, one at a time:\n" );
		
		for ( int i = 0; i <= end; i++ )
		{
			System.out.println( "\t\t\t" + i + " - '" + m.charAt(i) + "'" ); 	
		}
	}
}