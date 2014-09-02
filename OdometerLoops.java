import java.util.Scanner;

public class OdometerLoops // Removing the opening braces breaks everything. It won't even compile.
{
	public static void main( String[] args ) throws Exception
	{
		Scanner k = new Scanner( System.in );
		System.out.print( "Which base? " );
		int base = k.nextInt();
		
		for ( int thous=0; thous<base; thous++ )
		{
			for ( int hund=0; hund<base; hund++ )
			{
				for ( int tens=0; tens<base; tens++ )
				{
					for ( int ones=0; ones<base; ones++ )
					{
						System.out.print( " " + thous + "" + hund + "" + tens + "" + ones + "\r" );
						Thread.sleep(100);
					}
				}
			}
		}

		System.out.println();
	}
}