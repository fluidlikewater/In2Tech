import java.util.Scanner;

public class AlphabeticOrder
{
	public static void main( String[] args )
	{
		Scanner keyboard = new Scanner(System.in);
		
		String name;
		
		System.out.print("What's your last name? ");
		name = keyboard.next();
		
		if ( name.compareToIgnoreCase("Carswell") < 0 || name.compareToIgnoreCase("Carswell") == 0  )
		System.out.println(name + "? You don't have to wait long.");	
		
		else if ( name.compareToIgnoreCase("Jones") < 0 || name.compareToIgnoreCase("Jones") == 0  )
		System.out.println(name + "? That's not bad.");
		
		else if ( name.compareToIgnoreCase("Smith") < 0 || name.compareToIgnoreCase("Smith") == 0  )
		System.out.println(name + "? Looks like a bit of a wait.");
		
		else if ( name.compareToIgnoreCase("Young") < 0 || name.compareToIgnoreCase("Young") == 0  )
		System.out.println(name + "? It's gonna be a while.");
		
		else
		System.out.println(name + "? You're not going anywhere for a while.");
		
	}
}