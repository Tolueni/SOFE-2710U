package assignment1;
/* Question 4
 * Cafeteria.java
 * By:Carlos Fabregas & Jason Dang
 * Sep 27, 2015
 */

import java.util.Scanner;

public class Cafeteria 
{
	public static void main(String args[])
	{
		Scanner cafeteria = new Scanner(System.in);
	
		
		//price of discount card
		System.out.println("What is the price of the discount card?");
		int priceofcard= cafeteria.nextInt();
		//period of discount (days)
		System.out.println("How many days is the discount for?");
		int discountperiod = cafeteria.nextInt();		
		//how many numbers of meals do you have to buy to get one free? (meals)
		System.out.println("How many number of meals do you have to buy to get one free? ");
		int numberofmealsfordiscount= cafeteria.nextInt();
		
		//number meals bought a week
		System.out.println("What's the average number of meals you buy a week?");
		int numberofmealsaweek = cafeteria.nextInt();
		
		//whats the price of each meal
		System.out.println("Whats the price of each meal?");
		int priceofmeal= cafeteria.nextInt();
		
		
		
		
		int dailynumberofmeals=numberofmealsaweek /7;
		//meals bought during discount
		//double mealsboughtduringdiscount=discountperiod
		
			
		 
		 //number of meals per day to get discount
		  int numberofmealsperdaytogetdiscount= numberofmealsfordiscount/discountperiod;
		  
		  System.out.println("You have to buy "+numberofmealsperdaytogetdiscount +" meal a day to be qualified for the discount");
		  
		 if (numberofmealsperdaytogetdiscount < dailynumberofmeals )
		 {
			System.out.println("you qualify for the discount");
			
			int numberofdiscounts= dailynumberofmeals/numberofmealsperdaytogetdiscount;
						
			//money spent with discount
			 double amountwithdiscount = priceofcard +(dailynumberofmeals*priceofmeal)-(priceofmeal*numberofdiscounts);
			 System.out.println("price with discount" + amountwithdiscount);
			 
			//money spent without the discount card
			double amountwithoutdiscount = priceofmeal*dailynumberofmeals; 
			System.out.println("the price without discount "+amountwithoutdiscount);
			
			//if statement comparing if the discount is worth it
			if (amountwithdiscount < amountwithoutdiscount)
			{
				System.out.println("The discount is worth it");				
				
			}
			else if(amountwithdiscount> amountwithoutdiscount)
			{
				System.out.println("The discount is not worth it");
			}
			else {
				
				System.out.println("They cost the same");
			}
			
			System.out.println("You will spend" +amountwithdiscount+"if you get the discount and you will spend" +amountwithoutdiscount +"without the discount");
			
			
			 
		 }
		 else {
			 System.out.println("You will not qualify for the discount this week");
		 }
		 
		 
		
		System.out.println();
	
		cafeteria.close();
	}
		
}
