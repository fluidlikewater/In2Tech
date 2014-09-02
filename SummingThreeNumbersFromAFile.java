import java.io.File;
import java.util.Scanner;

public class SummingThreeNumbersFromAFile
{
	public static void main( String[] args ) throws Exception
	{
		Scanner fileIn = new Scanner( new File("3nums.txt") );
		
		System.out.print( "Reading numbers from file \"3nums.txt\"..." );
		
		int one = fileIn.nextInt();
		int two = fileIn.nextInt();
		int three = fileIn.nextInt();
		fileIn.close();
		
		System.out.println( "done.\n" );
		System.out.println( one + " + " + two + " + " + three + " = " + (one + two + three) );
		
	}
}