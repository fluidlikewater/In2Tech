import java.util.Scanner;

public class MoreUserInput
{
	public static void main( String[] args )
	{
		Scanner keyboard = new Scanner(System.in);
		
		String login, name1, name2;
		int id, grade;
		double gpa;
		
		System.out.println( "Please enter the following information so I can sell it for a profit!" );
		System.out.println();
		
		System.out.print( "First name: " );
		name1 = keyboard.next();
		
		System.out.print( "Last name: " );
		name2 = keyboard.next();
		
		System.out.print( "Grade (9-12): " );
		grade = keyboard.nextInt();
		
		System.out.print( "Student ID: " );
		id = keyboard.nextInt();
		
		System.out.print( "Login: " );
		login = keyboard.next();
		
		System.out.print( "GPA (0.0-4.0): " );
		gpa = keyboard.nextDouble();
		
		System.out.println();
		System.out.println( "Your information:" +
		"\n\t" + "Login: " + login + 
		"\n\t" + "ID:    " + id +
		"\n\t" + "Name:  " + name1 + " " + name2 +
		"\n\t" + "GPA:   " + gpa +
		"\n\t" + "Grade: " + grade ); 
	}
}