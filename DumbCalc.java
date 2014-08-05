import java.util.Scanner;

public class DumbCalc
{
	public static void main( String[] args )
	{
		Scanner keyboard = new Scanner(System.in);
		
		double num1, num2, num3;
		
		System.out.print( "What is your first number? " );
		num1 = keyboard.nextDouble();
		
		System.out.print( "What is your first number? " );
		num2 = keyboard.nextDouble();
		
		System.out.print( "What is your first number? " );
		num3 = keyboard.nextDouble();
		
		System.out.println( "\n( " + num1 + " + " + num2 + " + " + num3 + " ) / 2 is... " + (num1 + num2 + num3) / 2 );
	}
}