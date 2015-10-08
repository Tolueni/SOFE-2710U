package assignment2;

public class Car 
{

	public double fuelefficiency; //Miles per gallon
	public double amountoffuel; //Gallons

	public void drive(double distance)
	{
		
		amountoffuel= (amountoffuel*fuelefficiency) - distance;
		
		
	}
	
	public double getGasInTank()
	{
		return amountoffuel;
	}
	
	public void addGas(double amount)
	{
		amountoffuel= amountoffuel+amount;
	}

public Car()
{

	amountoffuel=0;
	
	
}
	
	
	
}
