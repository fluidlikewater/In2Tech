import java.util.Scanner;

public class CollatzSequence
{
	public static void main( String[] args )
	{
		Scanner keyboard = new Scanner(System.in);
		
		int num, count = 0, max = 0;
		
		System.out.print("Starting Number: ");
		num = keyboard.nextInt();
		
		System.out.print( num + "\t");
		
		while ( num != 1 )
		{
			if ( num%2 ==0 )
				num = num / 2;
			
			else
				num = 3 * num + 1;	
		
			System.out.print( num + "\t");
			count += 1;
			if ( num > max )
				max = num;		
		}
		
		System.out.println("\nTerminated after " + count + " steps. The largest value was " + max + ".");
	}
		
}

