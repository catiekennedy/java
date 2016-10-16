public class Temperature
{

  private double degrees;
  private char type;

  public Temperature(double dDegrees, char cType)
  {
    degrees = dDegrees;
    type = cType;
  }
  public Temperature(double dDegrees)
  {
    degrees = dDegrees;
    type = 'C';
  }
  public Temperature(char cType)
  {
    type = cType;
    degrees = 0.0;
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
    {
  		System.out.println(getC());
    }
  }
  public void writeF() 
  {
    if (type == 'F') 
    {
      System.out.println(degrees);
    }
    else
    {
      System.out.println(getF());
    }
  }
  public double getC() 
  {
  	double c;
  	if (type == 'C') 
  	{
  		c = degrees;
  	}
  	else if (type == 'F') 
  	{
  		c = ((degrees - 32) / 1.8);
  	}
  	else
  	{
      c = 10.0;
  		System.out.println("Please enter a different value: ");
  	}
  	return c;
  }
  public double getF() 
  {
    double f;
    if (type == 'C') 
    {
      f = degrees;
    }
    else if (type == 'F') 
    {
      f = ((degrees * 1.8) + 32);
    }
    else
    {
      f = 10.0;
      System.out.println("Please enter a different value: ");
    }
    return f;
  }
}


