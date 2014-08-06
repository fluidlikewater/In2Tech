import java.util.Scanner;

public class TwentyQuestions
{
	public static void main ( String[] args )
	{
		Scanner keyboard = new Scanner(System.in);
		
		String answer;
		
		System.out.println( "TWO QUESTIONS!" );
		System.out.println( "Think of an object and I'll try to guess it." );
		
		System.out.print( "\nQuestion 1) Is it animal, vegetable, or mineral?\n>" );
		
		String type = keyboard.next().toLowerCase();
		
		
		System.out.print( "\nQuestion 2) Is it bigger than a breadbox?\n>");
		
		String size = keyboard.next().toLowerCase();


		if ( type.equals("animal") && size.equals("yes") ) 
		answer = "a moo cow";
		
		else if ( type.equals("animal") && size.equals("no") ) 
		answer = "a shrew";
		
		else if ( type.equals("vegetable") && size.equals("yes") ) 
		answer = "a tree";
		
		else if ( type.equals("vegetable") && size.equals("no") ) 
		answer = "a pea";
		
		else if ( type.equals("mineral") && size.equals("yes") ) 
		answer = "a volcano";
		
		else if ( type.equals("mineral") && size.equals("no") ) 
		answer = "a suppository";
		
		else
		answer = "cheating";
		
		System.out.println( "\nMy guess is that you are thinking of " + answer + ".");
		System.out.println( "My logic is undeniable.");
	}
}