package assignment1;
/*Question 1
 *commute.java
 *Carlos Fabregas
 *Sep 23, 2015
The purpose of this program is to calculate which method of transportation is cheaper to take
*/

import java.util.Scanner;

public class commute {

public static void main (String[] args){
		
		double distance=0;
		int gas =4;
		double carmaint= 0.05;
		
		Scanner commuting = new Scanner(System.in);
		//gas =miles per gallon
		//maintenance 5 cents per mile
		
		System.out.println("How many miles will you be traveling today?");
		distance = commuting.nextDouble();
		
		System.out.println("What is the cost of a one-way train ticket?");
		double trainticket = commuting.nextDouble();
		
		double costofcar = (distance*gas) +(carmaint*distance); //cost of traveling by car
		
		System.out.println("the cost of traveling by car is "+costofcar);
		
		
		//compares the value of the train ticket and the cost of taking the car
		if (costofcar > trainticket)
		{
			System.out.println("It is cheaper to take the train");
		}
		else if (costofcar < trainticket){
			
			System.out.println("it is cheaper to take the car");
		}
		else {
			System.out.println("They cost the same");
		}
		
		
	 commuting.close();	
		
	}
}
