package assignment1;
//Question 8
//Mississippi.java
//Carlos Fabregas
//Sep 24,2015
//The purpose of this program is to Replace letters


import java.util.Scanner;
public class Mississippi 
{

	public static void main (String args[])
	{
		
		Scanner replace = new Scanner(System.in);
		
		System.out.println("Input a string");		
		String word = replace.next();//allows user input
		
				
		//replace s with $
		word = word.replace("s" , "$");
			
		//replace i with !
		word = word.replace("i","!");
		
		System.out.println("Your word is "+word);//outputs the word
		
				
		
		replace.close();
		
	}
	
	
}
