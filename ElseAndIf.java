// Else if only runs if the preceding if does not. Else runs if all preceding if and else if statements do not. 
// It causes the code to be checked even if the preceding if is executed. The following else only applies to this new if as well.

public class ElseAndIf
{
	public static void main( String[] args )
	{
		int people = 30;
		int cars = 40;
		int buses = 15;
		
		if ( cars > people )
		{
			System.out.println( "We should take the cars." );
		}
		
		if ( cars < people ) // removed else
		{
			System.out.println( "We should not take the cars." );
		}
		
		else // now this is executed
		{
			System.out.println( "We can't decide." );
		}
		
		if ( buses > cars )
		{
			System.out.println( "That's too many buses." );
		}
		
		else if ( buses < cars )
		{
			System.out.println( "Maybe we could take the buses." );
		}
		
		else
		{
			System.out.println( "We still can't decide." );
		}
		
		if ( people > buses )
		{
			System.out.println( "All right, let's just take the buses." );
		}
		
		else
		{
			System.out.println( "Fine, let's stay home then." );
		}
	}
}