import java.io.File;
import java.util.Scanner;

public class SummingSeveralNumbersFromAnyFile
{
	public static void main( String[] args ) throws Exception
	{
		Scanner k = new Scanner(System.in);
		
		System.out.print( "Which file would you like to read numbers from: " );
		String document = k.nextLine();
		
		System.out.println( "Reading numbers from file \"" + document + "\"\n" );
		
		Scanner fileIn = new Scanner( new File( document ) );
		int total = 0;
		
		while ( fileIn.hasNext() )
		{
			int num = fileIn.nextInt();
			System.out.print( num + " " );
			total += num;
		}
		
		System.out.println( "\nTotal is " + total);
	}
}