import java.util.Scanner;

public class LittleQuiz
{
	public static void main ( String[] args )
	{
		Scanner keyboard = new Scanner(System.in);
		String name, color;
		int answer1, answer2, answer3, score = 0;
		
		System.out.print( "What is your name? " );
		name = keyboard.next();
		System.out.print( "What is your favorite color? " );
		color = keyboard.next();
		System.out.print( "Are you ready for a quiz? " );
		keyboard.next();
		System.out.println( "Ready or not, hear it comes!" );
		
		System.out.print( "\nWhat is your name?"
					+ "\n\t1) " + name
					+ "\n\t2) Billy Bob"
					+ "\n\t3) Sally O'Mally"
					+ "\n\nAnswer: ");
							
		answer1 = keyboard.nextInt();
		if ( answer1 == 1 ) {
			score += 1;
			System.out.println( "\nGood Job!" ); }
		else
			System.out.println( "\nYou should see a doctor about that multiple personality." );
		
		System.out.print( "\nWhat is your quest?"
					+ "\n\t1) To seek the grail"
					+ "\n\t2) To drink lots of beer"
					+ "\n\t3) To learn Java"
					+ "\n\nAnswer: ");
		
		answer2 = keyboard.nextInt();
		if ( answer2 == 3 ) {
			score +=1;
			System.out.println( "\nWay to go!" ); }
		else
			System.out.println( "\nNo I'm sorry that isn't correct" );
			
		System.out.print( "\nWhat is your favorite color?"
					+ "\n\t1) Magenta"
					+ "\n\t2) " + color
					+ "\n\t3) Periwinkle"
					+ "\n\nAnswer: ");
					
		answer3 = keyboard.nextInt();
		if ( answer3 == 2 ) {
			score +=1;
			System.out.println( "\nExcellent!" ); }
		else
			System.out.println( "\nSo indecisive today." );
			
		System.out.println( "\nOverall you got " + score + " out of 3 correct." );
		System.out.println( "Thank you for your cooperation." );
		
	}		
}