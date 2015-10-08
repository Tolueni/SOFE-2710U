package assignment2;

public class Door 
{
	private String state;
	private String name;
	
	public void open(String sopen)
	{
		state=sopen;
	
	}
	
	public void close(String sclose)
	{
		state = sclose;
	}

	public String getName()
	{
		return name;
	}
	public String getState()
	{
		return state;
	}

	public void setName(String newName)
	{
		name=newName;
	}
	public void setState(String newState)
	{
		state=newState;
	}

	
	public Door(String initialstate, String name)
	{
	
	
	
	}
	
	
	
}
