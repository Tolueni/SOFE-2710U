package assignment1;
/*Question 7
 * AreaTester.java
 *Carlos Fabregas & Mankin Ho
 *Sept 24th,2015
 *The purpose of this program is to calculate the area of a rectangle
*/

import java.awt.Rectangle;//package

public class AreaTester {
	
	public static void main(String args[])
	{
			
				
    Rectangle box = new Rectangle(5,10,20,30); //Declaring a rectangle which is an object that contains 4 sets of numbers
    
    double Area = box.getWidth() * box.getHeight(); //Calculates the area by using an Accessor method to get the width and height value and multiplying.
	System.out.println("The area of the rectangle is"+Area);//prints out the area
    
	
	System.out.println("The expected answer is 600");
    
    
    
		
	}
	

}
