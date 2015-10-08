package assignment1;
/*Question 3
 *CelsiusToFahrenheit.java
 *Carlos Fabregas
 *Sep 23,2015
 *The purpose of this program is to convert from Celsius to Fahrenheit
*/

import java.util.Scanner;
public class CelsiusToFahrenheit {

	
	public static void main(String args[])
	{
		Scanner temperature= new Scanner(System.in);
		
		System.out.println("What is the temperature in celcius?");
		double Celsius = temperature.nextDouble();//lets user input the temperature
		
		double Fahrenheit = Celsius *(9.0/5.0)+32.0 ;//formula for converting celsius to fahrenheit
		
		System.out.println("The temperature in Fahrenheit is "+Fahrenheit);//outputs degrees in Fahrenheit
				
		
		
		temperature.close();
	}
}
