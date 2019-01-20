
public class YourMoney 
{
	//Member Variables
	public static final int YEAR = 2018;
	
	private double value;
	private String name;

	
	//Member Functions
	public YourMoney() 
	{
		value = 0;
		name = " ";
	}
	public YourMoney(double value1, String name1) 
	{
		this.value = value1;
		this.name = name1;
	}
	public double getValue() 
	{
		return value;
	}
	
	public String getName() {return name;}
	
	
	
}
