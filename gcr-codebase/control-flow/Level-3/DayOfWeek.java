//Creating a class name with DayOfWeek indicating to purpose is to prints the day of the week that the date falls on.

class DayOfWeek
{	public static void main(String args[])
	{	//Create a int vairable name with month, day and year.
		int month, day, year;
	

		//Taking input using command line arguments.
		month = Integer.parseInt(args[0]);
		day = Integer.parseInt(args[1]);
		year = Integer.parseInt(args[2]);

		//USing formula to find the day of the week it falls on.
		int y = year - ( 14 - month ) / 12;      			
		int x = y + ( y / 4 ) - ( y / 100 ) + ( y / 400 );
		int m= month + 12 * ( ( 14 - month ) / 12 ) - 2;
		int d= ( day + x + 31 * m / 12 ) % 7;

		//Print Date.
		System.out.println("The day of the week is: " + d);
	
	}
}