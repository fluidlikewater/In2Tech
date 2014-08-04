public class VariablesAndNames
{
	public static void main( String[] args )
	{
		int cars, drivers, passengers, cars_not_driven, cars_driven;
		double space_in_a_car, carpool_capacity, average_passengers_per_car;
		// Assign cars.
		cars = 100;
		// Assign space_in_a_car.
		space_in_a_car = 4;
		// Assign drivers.
		drivers = 30;
		// Assign passengers.
		passengers = 90;
		// Assign cars_not_driven.
		cars_not_driven = cars - drivers;
		// Assign cars_driven.
		cars_driven = drivers;
		// Calculate carpool_capacity. I like (cars * space_in_a_car) / (passengers + drivers).
		carpool_capacity = cars_driven * space_in_a_car;
		// Calculate passengers per driver.
		average_passengers_per_car = passengers / cars_driven;
		
		
		System.out.println( "There are " + cars + " cars available." );
		System.out.println( "There are only " + drivers + " drivers available.");
		System.out.println( "There will be " + cars_not_driven + " empty cars today." );
		System.out.println( "We can transport " + carpool_capacity + " people today.");
		System.out.println( "We have " + passengers + " to carpool today."	);
		System.out.println( "We need to put about " + average_passengers_per_car + " in each car." );
	}
}