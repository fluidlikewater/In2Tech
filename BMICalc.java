import java.util.Scanner;

public class BMICalc
{
	public static void main( String[] args )
	{
		Scanner keyboard = new Scanner(System.in);
		
		double heightFt, heightIn, heightM, weightLb, weightKg;
		
		System.out.print( "Your height (feet only): " );
		heightFt = keyboard.nextDouble();
		
		System.out.print( "Your height (inches): " );
		heightIn = keyboard.nextDouble() + (heightFt * 12);
		
		System.out.print( "Your weight (pounds): " );
		weightLb = keyboard.nextDouble();
		
		heightM = heightIn * 0.0254;
		weightKg = weightLb * 0.453592;
		
		System.out.println( "\nYour BMI is " + weightKg / (heightM * heightM) );
	}
}