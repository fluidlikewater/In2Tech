public class ANewHope

{
	public static void main( String[] args )
	{
		for ( int a = 1; a <= 45; a++ )
		{
			for ( int b = 1; b <= 45; b++ )
			{
				for ( int c = 1; c <= 45; c++ )
				{
					for ( int d = 1; d <= 45; d++ )
					{
						int x = a + 2;
						
						if ( b - 2 == x && c * 2 == x && d / 2 == x && a + b + c + d == 45 )
						{
							System.out.println( a + " " + b + " " + c + " " + d );
						}
					}
				}
			}
		}
	}
}