import java.util.Scanner;

public class SpaceBoxing
{
	public static void main ( String[] args )
	{
		Scanner keyboard = new Scanner(System.in);
		
		System.out.print( "Please enter your current Earth weight: " );
		double weight = keyboard.nextDouble();
		double pweight;
		
		System.out.println( "\nI have information for the following planets:" +
   						  "\n\t1. Venus   2. Mars    3. Jupiter" + 
   						  "\n\t4. Saturn  5. Uranus  6. Neptune" );
   		
   		System.out.print( "\nWhich planet are you visiting? " );
   		int planet = keyboard.nextInt();
		
		switch(planet)
		{
			case 1: pweight = weight * 0.78;
					break;
			case 2: pweight = weight * 0.39;
					break;
			case 3: pweight = weight * 2.65;
					break;
			case 4: pweight = weight * 1.17;
					break;
			case 5: pweight = weight * 1.05;
					break;
			case 6: pweight = weight * 1.23;
					break;
			default: pweight = 0;
		}
		
		System.out.println( "\nYour weight would be " + pweight + " pounds on that planet." );
		
	}
}