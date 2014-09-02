import java.io.File;
import java.util.Scanner;

public class SummingFromAnyFile
{
	public static void main( String[] args ) throws Exception
	{
		Scanner k = new Scanner(System.in);
		
		System.out.print( "Which file would you like to read numbers from: " );
		String document = k.nextLine();
		
		Scanner fileIn = new Scanner( new File( document ) );
		
		System.out.println( "Reading numbers from file \"" + document + "\"\n" );
		
		int one = fileIn.nextInt();
		int two = fileIn.nextInt();
		int three = fileIn.nextInt();
		fileIn.close();
		
		System.out.println( one + " + " + two + " + " + three + " = " + (one + two + three) );
		
	}
}