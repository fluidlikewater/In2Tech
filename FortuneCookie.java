import java.util.Random;

public class FortuneCookie
{
	public static void main ( String[] args )
	{
		Random r = new Random();
		String fortune = "";
		String lotto = "\t";
		
		int chance = 1 + r.nextInt(6);
		
		if (chance == 1)
			fortune = "A new romance will spice up your life.";
		else if (chance == 2)
			fortune = "An unexpected outcome will bring an end to a stressful endeavor.";
		else if (chance == 3)
			fortune = "Help! I'm trapped in a fortune cookie factory!";
		else if (chance == 4)
			fortune = "...";
		else if (chance == 5)
			fortune = "You should get your affairs in order.";
		else if (chance == 6)
			fortune = "You're going to be rich.";
			
		System.out.println( "Fortune cookie says: " + fortune );
		
		System.out.println( "\t " + (1 + r.nextInt(53)) + " - " + (1 + r.nextInt(53)) + " - " 
									+ (1 + r.nextInt(53)) + " - " + (1 + r.nextInt(53)) + " - " 
									+ (1 + r.nextInt(53)) + " - " + (1 + r.nextInt(53)) );
	}
}	