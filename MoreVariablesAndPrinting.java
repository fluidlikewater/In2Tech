public class MoreVariablesAndPrinting
{
	public static void main( String[] args )
	{
		String name, eyes, teeth, hair;
		double age, height, weight, cmHeight, kgWeight;
		
		name = "John Harris";
		age = 32;    // not a lie
		height = 72.0;  // in inches
		cmHeight = height * 2.54;
		weight = 185.0; // in lbs
		kgWeight = weight * 0.453592;
		eyes = "Blue";
		teeth = "White";
		hair = "Blonde";
		
		System.out.println( "Let's talk about " + name + "." );
        System.out.println( "He's " + height + " inches (" + cmHeight + " cm) tall." );
        System.out.println( "He's " + weight + " pounds (" + kgWeight + " kg) heavy." );
        System.out.println( "Actually, that's not too heavy." );
        System.out.println( "He's got " + eyes + " eyes and " + hair + " hair." );
        System.out.println( "His teeth are usually " + teeth + " depending on the coffee." );
        
        // This line is tricky; try to get it exactly right
        System.out.println( "If I add " + age + ", " + height + ", and " + weight + 
        " I get " + (age + height + weight) + "." );
    }
}