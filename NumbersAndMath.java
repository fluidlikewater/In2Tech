public class NumbersAndMath
{
	public static void main( String[] args )
	{
		// Prints specified text.
		System.out.println( "I will now count my chickens:" );
		
		// Prints text plus result of equation.
		System.out.println( "Hens " + ( 25.0 + 30.0 / 6.0 ) );
		System.out.println( "Roosters " + ( 100.0 - 25.0 * 3.0 % 4.0 ) );
		
		// Prints text.
		System.out.println( "Now I will count the eggs:" );
		
		// Prints the result of the equation.
		System.out.println( 3.0 + 2.0 + 1.0 - 5.0 + 4.0 % 2.0 - 1.0 / 4.0 + 6.0 );

		// Prints text.
		System.out.println( "Is it true that 3.0 + 2.0 < 5.0 - 7.0?" );

		// Returns result as a boolean value.
		System.out.println( 3.0 + 2.0 < 5.0 - 7.0 );

		// Prints text plus result of equation.
		System.out.println( "What is 3.0 + 2.0? " + ( 3.0 + 2.0 ) );
		System.out.println( "What is 5.0 - 7.0? " + ( 5.0 - 7.0 ) );

		// Prints text.
		System.out.println( "Oh, that's why it's false." );

		System.out.println( "How about some more." );

		// Prints text plus boolean.
		System.out.println( "Is it greater? " + ( 5.0 > -2.0 ) );
		System.out.println( "Is it greater or equal? " + ( 5.0 >= -2.0 ) );
		System.out.println( "Is it less or equal? " + ( 5.0 <= -2.0 ) );
	}
}