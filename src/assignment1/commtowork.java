package assignment1;
//Question 2
//commtowork.java
//Carlos Fabregas
//Sep 23, 2015
//The purpose of this program is to determine which fraction of your total milage is for commuting to work.


import java.util.Scanner; 

public class commtowork {

	
	public static void main(String args[]){
		
		Scanner work = new Scanner(System.in);
		
		System.out.println("What is the distance from home to work in miles? ");
		int distance = work.nextInt();//Allows user to input an integer
		
		System.out.println("How many days a week do you work? ");
		int days = work.nextInt();
		
		System.out.println("What is the distance recorded in the odometer?");
		int totalmilage = work.nextInt();
		
		
		int wwmilage = distance*days; //weekly milage distance 
		
		System.out.println("The total distance traveled this week to work is "+wwmilage);//outputs the total distance traveled
			
		int personaluse = totalmilage - wwmilage;//calculates what milage of the car was used for personal use
		
		System.out.println(personaluse +" miles was traveled for personal use");
		
		
		work.close();
	}
}
