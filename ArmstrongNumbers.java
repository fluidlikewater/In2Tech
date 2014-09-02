public class ArmstrongNumbers

{
	public static void main( String[] args )
	{
		for ( int hunds=1; hunds <= 9; hunds++ )
		{
			for ( int tens= 0; tens <= 9; tens++ )
			{
				for ( int ones= 0; ones <= 9; ones++ )
				{
					int num = (hunds * 100) + (tens * 10) + ones;
					
					if ( num == ( Math.pow( hunds, 3) + Math.pow( tens, 3) + Math.pow( ones, 3) ) )
					{
						System.out.println( num );
					}
				}
			}
		}
	}
}