package assignment1;
//Question 5
//DialogViewer.java
//Carlos Fabregas
//Sep 23, 2015
//The purpose of this program is to give you the greetings

import javax.swing.JOptionPane;//package


public class DialogViewer 
{

	public static void main(String args[])
	{
		
		String name = JOptionPane.showInputDialog("What is your name?"); //creates an option window which allows you to input a string called name
		System.out.print("Hello, ");
		System.out.print(name +"!");//outputs the string stored after clicking Ok
		
		
	}
	
	
}
