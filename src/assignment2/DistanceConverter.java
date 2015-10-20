package assignment2;
/*Assignment 2 Question3
 * DistanceConverter.java
 * Oct 7, 2015
 */

public class DistanceConverter //Declared DistanceConverter as the public class
{

	public static void main(String args[])// main method of the program
	{
	
	final double yardtoinches = 3.0; //Defined yardtoinches as a double and 3.0 as the final value for this double variable.
	final double feettoinches = 12.0; //Defines feettoinches as a double and 12.0 asthe final value for this double cariable
	double yards=3.5;
	
	//convertions
	double feet =yards * yardtoinches; //defines the formulas for the conversion of feet to yard andinches to feet.
	double inches = feet * feettoinches;
	
	System.out.println(yards +"yards are " + feet + " feet"); // system.out is used to print the embedded information to the user. Makes use of the PrintStream import.
	System.out.println(yards + "yards are " + inches + " inches");
	
	}
	
	
	
}
