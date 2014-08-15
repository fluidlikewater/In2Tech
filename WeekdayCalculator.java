import java.util.Scanner;

public class WeekdayCalculator
{
	public static void main( String[] args )
	{
		Scanner keyboard = new Scanner(System.in);

		System.out.println("Welcome to Mr. Mitchell's fantastic birth-o-meter!");
		System.out.println();
		System.out.println("All you have to do is enter your birth date, and it will");
		System.out.println("tell you the day of the week on which you were born.");
		System.out.println();
		System.out.println("Some automatic tests....");
		System.out.println("12 10 2003 => " + weekday(12,10,2003));
		System.out.println(" 2 13 1976 => " + weekday(2,13,1976));
		System.out.println(" 2 13 1977 => " + weekday(2,13,1977));
		System.out.println(" 7  2 1974 => " + weekday(7,2,1974));
		System.out.println(" 1 15 2003 => " + weekday(1,15,2003));
		System.out.println("10 13 2000 => " + weekday(10,13,2000));
		System.out.println();

		System.out.println("Now it's your turn!  What's your birthday?");
		System.out.print("Birth date (mm dd yyyy): ");
		int mm = keyboard.nextInt();
		int dd = keyboard.nextInt();
		int yyyy = keyboard.nextInt();
		String day;

		// put a function call for weekday() here
		day = weekday(mm, dd, yyyy);
		
		System.out.println("You were born on " + day );
	}


	public static String weekday( int mm, int dd, int yyyy )
	{
		int yy, total, remainder;
		String date = "";
		
		// bunch of calculations go here
		yy = yyyy - 1900;
		
		total = yy / 4;
		total += yy;
		total += dd;
		total += month_offset(mm);
		
		if ( is_leap(yyyy) )
		{
			if ( month_name(mm).equals("January") || month_name(mm).equals("February") ) // yes I could do this with just mm == 1 or mm ==2 but thats not what it asks 
				total -= 1;
		}
		
		remainder = total % 7;
		
		date = weekday_name(remainder) + ", " +  month_name(mm) + " " + dd + ", " + yyyy;

		return date;
	}


	// paste your functions from MonthName, WeekdayName, and MonthOffset here
	public static int month_offset( int month )
	{
		int result;
		
		if ( month == 4 || month == 7 )
			result = 0;
		else if ( month == 1 || month == 10 )
			result = 1;
		else if ( month == 5 )
			result = 2;
		else if ( month == 8 )
			result = 3;
		else if ( month == 2 || month == 3 || month == 11 )
			result = 4;
		else if ( month == 6 )
			result = 5;
		else if ( month == 9 || month == 12 )
			result = 6;
		else 
			result = -1;

		return result;
	}
	
	public static String month_name( int month )
	{
		String result;
				
		switch(month)
		{
			case 1: 
				result = "January";
				break;
			case 2: 
				result = "February";
				break;
			case 3: 
				result = "March";
				break;
			case 4: 
				result = "April";
				break;
			case 5: 
				result = "May";
				break;
			case 6: 
				result = "June";
				break;
			case 7: 
				result = "July";
				break;
			case 8: 
				result = "August";
				break;
			case 9: 
				result = "September";
				break;
			case 10: 
				result = "October";
				break;	
			case 11: 
				result = "November";
				break;
			case 12: 
				result = "December";
				break;
			default: 
				result = "error";
				break;	
		}
		return result;
	}
	
	public static String weekday_name( int weekday )
	{
		String result = "";

		if ( weekday == 1 )
		{
			result = "Sunday";
		}
		else if ( weekday == 2 )
		{
			result = "Monday";
		}
		else if ( weekday == 3 )
		{
			result = "Tuesday";
		}
		else if ( weekday == 4 )
		{
			result = "Wednesday";
		}
		else if ( weekday == 5 )
		{
			result = "Thursday";
		}
		else if ( weekday == 6 )
		{
			result = "Friday";
		}
		else if ( weekday == 7 )
		{
			result = "Saturday";
		}
		else if ( weekday == 0 )
		{
			result = "Saturday";
		}		
		else
		{
			result = "\"error\"";
		}		
		
		return result;
	}

	public static boolean is_leap( int year )
	{
		// years which are evenly divisible by 4 are leap years,
		// but years divisible by 100 are not leap years,
		// though years divisible by 400 are leap years
		boolean result;

		if ( year%400 == 0 )
			result = true;
		else if ( year%100 == 0 )
			result = false;
		else if ( year%4 == 0 )
			result = true;
		else
			result = false;
		
		return result;
	}
}