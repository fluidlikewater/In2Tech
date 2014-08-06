public class ModulusAnimation
{
	public static void main( String[] args ) throws Exception
	{
		for ( int i=0; i<85; i++ )
		{
			if ( i%17 == 0 )
				System.out.print("O;o;Q`...........\r");
			else if ( i%17 == 1 )
				System.out.print(".O;o;Q`..........\r");
			else if ( i%17 == 2 )
				System.out.print("..O;o;Q`.........\r");
			else if ( i%17 == 3 )
				System.out.print("...O;o;Q`........\r");
			else if ( i%17 == 4 )
				System.out.print("....O;o;Q`.......\r");
			else if ( i%17 == 5 )
				System.out.print(".....O;o;Q`......\r");
			else if ( i%17 == 6 )
				System.out.print("......O;o;Q`.....\r");
			else if ( i%17 == 7 )
				System.out.print(".......O;o;Q`....\r");
			else if ( i%17 == 8 )
				System.out.print("........O;o;Q`...\r");
			else if ( i%17 == 9 )
				System.out.print(".........O;o;Q`..\r");
			else if ( i%17 == 10 )
				System.out.print("..........O;o;Q`.\r");
			else if ( i%17 == 11 )	
				System.out.print("...........O;o;Q`\r");
			else if ( i%17 == 12 )	
				System.out.print("`...........O;o;Q\r");
			else if ( i%17 == 13 )	
				System.out.print("Q`...........O;o;\r");			
			else if ( i%17 == 14 )	
				System.out.print(";Q`...........O;o\r");
			else if ( i%17 == 15 )	
				System.out.print("o;Q`...........O;\r");
			else if ( i%17 == 16 )	
				System.out.print(";o;Q`...........O\r");
			Thread.sleep(100);
		}
	}
}