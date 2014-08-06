import java.util.Scanner;

public class BMICategories
{
	public static void main( String[] args )
	{
		Scanner keyboard = new Scanner(System.in);
		
		double heightFt, heightIn, heightM, weightLb, weightKg, bmi;
		String health = "";
		
		System.out.print( "Your height (feet only): " );
		heightFt = keyboard.nextDouble();
		
		System.out.print( "Your height (inches): " );
		heightIn = keyboard.nextDouble() + (heightFt * 12);
		
		System.out.print( "Your weight (pounds): " );
		weightLb = keyboard.nextDouble();
		
		heightM = heightIn * 0.0254;
		weightKg = weightLb * 0.453592;
		bmi = weightKg / (heightM * heightM);
		
		System.out.println( "\nYour BMI is " + bmi );
		
		if ( bmi < 15.0  )
			health = "very severely underweight";
		if ( bmi >= 15.0 && bmi <=16.0 )
			health = "severely underweight";
		if ( bmi > 16.0 && bmi < 18.5)
			health = "underweight";
		if ( bmi >= 18.5 && bmi < 25.0 )
			health = "normal weight";
		if ( bmi >= 25.0 && bmi < 30.0 )
			health = "overweight";
		if ( bmi >= 30.0 && bmi < 35.0 )
			health = "moderately obese";
		if ( bmi >= 35.0 && bmi < 40.0 )
			health = "severely obese";
		if ( bmi >= 40.0  )
			health = "Very severely (or \"morbidly\") obese";
		
		System.out.println( "BMI Category: " + health );
		
	}
}