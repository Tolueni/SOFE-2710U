package assignment2;
/*Question 2
 * SmallerInteger.java
 */


import java.util.Scanner; //importing the java scanner enables the program to request user input as well as produce an output. In general, the scanner serves as an interactive base between the program and the user.

public class SmallerInteger 
{
	public static void main(String args[]) //main method of the program. 
	{
		
		Scanner number = new Scanner(System.in); //The declaration of the new scanner enmables the user to type an input into the program.
		
		System.out.println("Enter the first integer");
		int num1 = number.nextInt();
		
		System.out.println("Enter the second number");
		int num2 = number.nextInt();
		
		if (num1 > num2)//the following if-else statements create the conditions for measuring the conditions inputted by the user. The condition num1 > num2  requests the program to run a boolean and then follwot the unstructions of the if command.
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
