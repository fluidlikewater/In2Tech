import java.util.Scanner;

public class GenderGame
{
	public static void main( String[] args )
	{
		Scanner keyboard = new Scanner(System.in);

		String name1, name2, prefix, gender, married;
		int age;
		
		System.out.print( "What is your gender (M or F): " );
		gender = keyboard.next().toUpperCase().atChar(0);
		
		System.out.print( "First name: " );
		name1 = keyboard.next();
		
		System.out.print( "Last name: " );
		name2 = keyboard.next();
		
		System.out.print( "Age: " );
		age = keyboard.nextInt();
		
		if ( age < 20 )
			System.out.println( "Then I shall call you " + name1 + " " + name2 + "." );
					
		else
		{ 
			if ( gender.equals("F") )
			{
				System.out.print( "\nAre you married " + name1 + " (y or n)? " );
				married = keyboard.next().toLowerCase();
			
				if ( married.equals("y") )	
					prefix = "Mrs.";
					
			 	else 
			 		prefix = "Ms.";
			 		
			 System.out.println("Then I shall call you " + prefix + " " + name1 + " " + name2 + "." );
			 }
			 else if ( gender.equals("M") )
			 {
			 	prefix = "Mr.";
			 	System.out.println("Then I shall call you " + prefix + " " + name1 + " " + name2 + "." );
			 }
			 else
			 	System.out.println("I don't know what to call you." );
		}
	}
}