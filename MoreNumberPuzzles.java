import java.util.Scanner;

public class MoreNumberPuzzles
{
	public static void main( String[] args )
	{
		Scanner k = new Scanner(System.in);
		int choice;
		
		do
		{
			System.out.println( "1) Find two digit numbers <= 56 with sums of digits > 10" );
			System.out.println( "2) Find two digit number minus number reversed which equals sum of digits" );
			System.out.println( "3) Quit" );
			System.out.print( "\n>" );
			choice = k.nextInt();
			
			if ( choice == 1)
			{
				optionOne();
			}
			else if ( choice == 2)
			{
				optionTwo();
			}
			else if ( choice == 3)
			{
				System.out.println();
			}
			else
			{
				System.out.println( "That is not a valid choice." );
			}
		} while ( choice != 3 );
	}
	
	public static void optionOne()
	{
		for ( int n=1; n <= 5; n++ )
		{	
			for ( int i= 0; i <= 9; i++ )
			{
				int num = n * 10 + i;
				if ( num < 56 && (n + i) > 10 )
				{
					System.out.println( num );
				}
			}
		}
	}
	
	public static void optionTwo()
	{
		for ( int n=1; n <= 9; n++ )
		{
			for ( int i= 0; i <= 9; i++ )
			{
				int num1 = n * 10 + i, num2 = i * 10 + n;
				if ( (num1 - num2) == (i + n) )
				{
					System.out.println( num1 );
				}
			}

		}
	}
}