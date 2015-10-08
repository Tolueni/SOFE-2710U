package assignment1;
//Question 6
//BackToSchool.java
//Carlos Fabregas
//Sep 23,2015
//the objective of this program is to display the UOIT logo and give you greetings

import java.net.URL;
import javax.swing.ImageIcon;
import javax.swing.JOptionPane;

public class BackToSchool {

	public static void main(String args[])throws Exception{
		
		URL imageLocation = new URL ("https://shared.uoit.ca/site-images/layout/header_UOITlogo.gif");//gets the gif file thats located in the URL
		JOptionPane.showMessageDialog(null,"Welcome back to school!",null, JOptionPane.PLAIN_MESSAGE, new ImageIcon(imageLocation));//outputs image with welcome back to school
		
	}
}
