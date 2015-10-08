package assignment2;
/*Question 2
 * SmallerInteger.java
 */


import java.util.Scanner;

public class SmallerInteger 
{
	public static void main(String args[])
	{
		
		Scanner number = new Scanner(System.in);
		
		System.out.println("Enter the first integer");
		int num1 = number.nextInt();
		
		System.out.println("Enter the second number");
		int num2 = number.nextInt();
		
		if (num1 > num2)
		{
			System.out.println("The smallest number you inputed is " +num2);
		}
		else if (num1 < num2)
		{
			System.out.println("The smallest number you inputed is " +num1);
		}
		else
		{
			System.out.println("both numbers are equal to each other");
		}
		
		number.close();
	}
	
	
	
}
