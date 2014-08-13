import java.util.Random;

public class Dice
{
	public static void main( String[] args )
	{	
		Random r = new Random();
		int roll1 = r.nextInt(6) + 1, roll2 = r.nextInt(5) + 1;
		
		System.out.println( "Here come the dice!\n" );
		System.out.println( "Roll : " + roll1 );
		System.out.println( "Roll #2: " + roll2 );
		System.out.println( "The total is " + (roll1 + roll2) + "!" );
	}
}