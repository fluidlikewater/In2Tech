import java.io.File;
import java.util.Scanner;

public class SimpleFileInput
{
	public static void main( String[] args ) throws Exception
	{
		Scanner fileIn = new Scanner( new File("name.txt") );
		
		String name = fileIn.nextLine();
		fileIn.close();
		
		System.out.println( "Using my psychic powers (aided by reading data from the file), I have" );
		System.out.println( "determined that your name is " + name + "." );
	}
}