public class DistanceFormula
{
	public static void main( String[] args )
	{
		// test the formula a bit
		double d1 = distance(-2,1 , 1,5);
		System.out.println(" (-2,1) to (1,5) => " + d1 );
 
		double d2 = distance(-2,-3 , -4,4);
		System.out.println(" (-2,-3) to (-4,4) => " + d2 );
 
		System.out.println(" (2,-3) to (-1,-2) => " + distance(2,-3,-1,-2) );
 
		System.out.println(" (4,5) to (4,5) => " + distance(4,5,4,5) );
	}
 
	public static double distance( int x1, int y1, int x2, int y2 )
	{
		double result, grp1, grp2;
		
		grp1 = x2 - x1;
		grp2 = y2 - y1;
		
		grp1 = grp1 * grp1;
		grp2 = grp2 * grp2;
		
		result = grp1 + grp2;
	
		//result = Math.sqrt(result);
		
		// or result = Math.sqrt((Math.pow((x2 - x1),2) + Math.pow((y2 - y1),2))); but that is confusing to read
		
		return result;
	}
}