import java.util.Random;

public class DiceDoubles
{
	public static void main( String[] args )
	{	
		Random r = new Random();
		System.out.println( "Here come the dice!\n" );
		int roll1 = 1, roll2 = 2;
		while ( roll1 != roll2 )
		{
			roll1 = r.nextInt(6) + 1;
			roll2 = r.nextInt(5) + 1;
			System.out.println( "Roll #1: " + roll1 );
			System.out.println( "Roll #2: " + roll2 );
			System.out.println( "The total is " + (roll1 + roll2) + "!\n" );
		}
	}
}