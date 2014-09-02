import java.io.File;
import java.util.Scanner;

public class DisplayingAFile
{
	public static void main( String[] args ) throws Exception
	{
		Scanner k = new Scanner(System.in);
		
		System.out.print( "Which file would you like to read numbers from: " );
		String document = k.nextLine();
		
		Scanner fileIn = new Scanner( new File( document ) );
		
		while ( fileIn.hasNext() )
		{
			System.out.println( fileIn.nextLine() );
		}	
	}
}