import java.util.Scanner;

public class TwoMoreQuestions
{
	public static void main ( String[] args )
	{
		Scanner keyboard = new Scanner(System.in);
		
		String answer;
		
		System.out.println( "TWO MORE QUESTIONS, BABY!" );
		System.out.println( "Think of something and I'll try to guess it." );
		
		System.out.print( "\nQuestion 1) Does it belong inside, outside, or both?\n>" );
		
		String place = keyboard.next().toLowerCase();
		
		
		System.out.print( "\nQuestion 2) Is it alive?\n>");
		
		String alive = keyboard.next().toLowerCase();


		if ( place.equals("indoors") && alive.equals("yes") ) 
		answer = "a house cat";
		
		else if ( place.equals("indoors") && alive.equals("no") ) 
		answer = "a lamp";
		
		else if ( place.equals("outdoors") && alive.equals("yes") ) 
		answer = "a tree";
		
		else if ( place.equals("outdoors") && alive.equals("no") ) 
		answer = "a volcano";
		
		else if ( place.equals("both") && alive.equals("yes") ) 
		answer = "a human";
		
		else if ( place.equals("both") && alive.equals("no") ) 
		answer = "shoes";
		
		else
		answer = "cheating";
		
		System.out.println( "\nMy guess is that you are thinking of " + answer + ".");
		System.out.println( "My logic is undeniable.");
	}
}