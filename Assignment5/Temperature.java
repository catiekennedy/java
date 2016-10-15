public class Temperature
{

  private double degrees;
  private char type;

  public Temperature(double dDegrees, char cType)
  {

  }
  public Temperature(double dDegrees)
  {

  }
  public Temperature(char cType)
  {

  }
  public Temperature()
  {
  	degrees = 0;
  	type = 'C';
  }

  public void writeOutput() 
  {
  	System.out.println(degrees + type);
  }
  public void writeC() 
  {
  	if (type == 'C') 
  	{
  		System.out.println(degrees);
  	}
  	else
  		System.out.println(getC());
  }
  public void writeF() 
  {

  }
  public double getC() 
  {
  	double out;
  	if (type == 'C') 
  	{
  		out = degrees;
  	}
  	else if (type == 'F') 
  	{
  		out = ((degrees - 32) / 1.8);
  	}
  	else
  	{
  		out = 10.0;
  		System.out.println("nope");
  	}
  	return out;
  }
}


