package assignment2;
/*Assignment 2 Question3
 * DistanceConverter.java
 * Oct 7, 2015
 */

public class DistanceConverter 
{

	public static void main(String args[])
	{
	
	final double yardtoinches = 3.0;
	final double feettoinches = 12.0;	
	double yards=3.5;
	
	//convertions
	double feet =yards * yardtoinches;
	double inches = feet * feettoinches;
	
	System.out.println(yards +"yards are " + feet + " feet");
	System.out.println(yards + "yards are " + inches + " inches");
	
	}
	
	
	
}
