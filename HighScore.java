import java.io.FileWriter;
import java.io.PrintWriter;
import java.util.Scanner;

public class HighScore
{
	public static void main( String[] args ) throws Exception
	{
		Scanner k = new Scanner(System.in);
		
		PrintWriter fileout;
		
		fileout = new PrintWriter( new FileWriter("high score.txt") );
		
		System.out.println( "You got a high score!" );
		
		System.out.print( "\nPlease enter your score: " );
		String score = k.next();
		
		System.out.print( "Please enter your name: " );
		String name = k.next();
		System.out.println( "Data stored into high score.txt." );
		
		fileout.println( name + " " + score );
		fileout.close();
	}
}