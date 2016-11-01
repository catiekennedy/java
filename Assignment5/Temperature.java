import java.text.*;
import java.util.*;

/**
 * Temperature --- A class to store a representation of a temperature in either 
 *                 degrees Celsius or Fahrenheit  
 * @author Caitlyn Kennedy & Diego Otero-Caldwell
 * @version 1.0
 * @since 2016-10-20
 * 
 * Algorithm: 
 *  using double degrees to represent an number and char type to represent Celsius and Farenheit
 *  four constructors
 *    1) Temperature(double dDegrees, char cType)
 *    2) Temperature(double dDegrees)
 *    3) Temperature(char cType)
 *    4) Temperature() - default
 *  three write methods
 *    1) void writeOutput()
 *    2) void writeC()
 *    3) void writeF()
 *  two accessor methods
 *    1) double getC()
 *    2) double getF()
 *  three mutator methods
 *    1) void set(double dDegrees)
 *    2) void set(char cType)
 *    3) void set(double dDegrees, char cType)
 *  comparison method boolean equals(Temperature otherTemp)
 *  String toString()
 *  extra credit: void readInput()
 */
public class Temperature
{
    private double degrees;
    private char type;

    /**
     * Assigns values to both the type and degrees variables
     * @param dDegrees double indicating the temp's numeric value
     * @param cType char representing either Celsius or Fahrenheit
     */
    public Temperature(double dDegrees, char cType)
    {
        degrees = dDegrees;
        //validate passed char argument
        if (cType == 'C' || cType == 'F' || cType == 'c' || cType == 'f')
        {
            type = Character.toUpperCase(cType);//keep type either 'C' or 'F'
        }
        else
        {
            type = 'C';
            System.out.println("Invalid type. Defaulted to Celcius.");
        }
    }
    /**
     * Assigns values to only degrees variable, type defaults to C
     * @param dDegrees double indicating the temp's numeric value
     */
    public Temperature(double dDegrees)
    {
        degrees = dDegrees;
        type = 'C';
    }
    /**
     * Assigns values to only typ variable, degrees defaults to 0.0
     * @param cType char representing either Celsius or Fahrenheit
     */
    public Temperature(char cType)
    {
        degrees = 0.0;
        //validate passed char argument
        if (cType == 'C' || cType == 'F' || cType == 'c' || cType == 'f')
        {
            type = Character.toUpperCase(cType);
        }
        else
        {
            type = 'C'; //invalid arguments result in type deafuling to 'C'
            System.out.println("Invalid type. Defaulted to Celcius.");
        }

    }
    /**
     * Default constructor sets temp to 0.0 C
     */
    public Temperature()
    {
        degrees = 0;
        type = 'C';
    }
    /**
     * Prints out the degrees & type in the terminal
     */
    public void writeOutput() 
    {
        NumberFormat formatter = new DecimalFormat("#0.##");
        if (type == 'C') 
        {
             System.out.println(formatter.format(degrees) + " degrees Celsius");
        }
        else if (type == 'F') 
        {
             System.out.println(formatter.format(degrees) + " degrees Fahrenheit");
        }
        else
        {
            System.out.println("Error");
        }
    }
    /**
     * Prints out the temp in degrees Celsius
     */
    public void writeC() 
    {
        NumberFormat formatter = new DecimalFormat("#0.#");
        if (type == 'C') 
        {
             System.out.println(formatter.format(degrees) + " degrees Celsius");
        }
        else
        {
            System.out.println(formatter.format(getC()) + " degrees Celsius");
        }
    }
    /**
     * Prints out the temp in degrees Fahrenheit
     */
    public void writeF() 
    {
        NumberFormat formatter = new DecimalFormat("#0.#");
        if (type == 'F') 
        {
             System.out.println(formatter.format(degrees) + " degrees Fahrenheit");
        }
        else
        {
            System.out.println(formatter.format(getF()) + " degrees Fahrenheit");
        }
    }
    /**
     * Returns the temp in degrees Celsius without changing the stored type
     * @return double degrees Celsius
     */
    public double getC() 
    {
        String formattedOut;
        double out;
        if (type == 'C') 
        {
            out = degrees;
        }
        else if (type == 'F') 
        {
            //convert to C
            out = ((degrees - 32) / 1.8);
        }
        else
        {
            //this indicates an invalid char was somehow stored in type
            out = -9999.9;
            System.out.println("nope");
        }
        formattedOut = String.format("%.01f", out);
        double d = Double.parseDouble(formattedOut);
        return d;
    }
    /**
     * Returns the temp in degrees Fahrenheit without changing the stored type
     * @return double degrees Fahrenheit
     */
    public double getF()
    {
        String formattedOut;
        double out;
        if (type == 'F')
        {
            out = degrees;
        }
        else if (type == 'C')
        {
            //convert to F
            out = ((degrees * 1.8) + 32);
        }
        else
        {
            //this indicates an invalid char was somehow stored in type
            out = -9999.9;
            System.out.println("nope");
        }
        formattedOut = String.format("%.01f", out);
        double d = Double.parseDouble(formattedOut);
        return d;
    }
    /**
     * Setter for degrees
     * @param dDegrees double new degrees value
     */
    public void set(double dDegrees)
    {
        degrees = dDegrees;
    }
    /**
     * Setter for type
     * @param cType char new type value. Either 'C' or 'F'
     */
    public void set(char cType)
    {
        //input validation
        if (cType == 'C' || cType == 'F' || cType == 'c' || cType == 'f')
        {
            type = Character.toUpperCase(cType);
        }
        else
        {
            //type remains unaltered in the case of invalid arguments
            System.out.println("Incompatable char");
        }
    }
    /**
     * Setter for both degrees and type simultaniously
     * @param dDegrees double new degrees value
     * @param cType char new type value. Either 'C' or 'F'
     */
    public void set(double dDegrees, char cType)
    {
        degrees = dDegrees;
        if (cType == 'C' || cType == 'F' || cType == 'c' || cType == 'f')
        {
            type = Character.toUpperCase(cType);
        }
        else
        {
            System.out.println("Incompatable char");
        }
    }
    /**
     * Compares two Temperature objects to see if they are equivalent,
     * not necessarily identical
     * @param otherTemp Temperature object for comparison
     * @return boolean returns true if temps are equivalent
     */
    public boolean equals(Temperature otherTemp)
    {
        if (otherTemp.getC() == getC())
        {
            return true;
        }
        else
        {
            return false;
        }
    }
    /**
     * toString that formats the temperature and type nicely
     */
    public String toString()
    {
        NumberFormat formatter = new DecimalFormat("#0.##");
        if (type == 'C') 
        {
             return (formatter.format(degrees) + " degrees Celsius");
        }
        else if (type == 'F') 
        {
             return (formatter.format(degrees) + " degrees Fahrenheit");
        }
        else
        {
            return ("Error");
        }
    }
    /**
     * Guides the user through setting the degrees and type in the terminal
     */
    public void readInput()
    {
        double dDegrees;
        char cType;
        
        
        Scanner scan = new Scanner(System.in);
        System.out.println("Enter temperature: ");
        dDegrees = scan.nextDouble();
        scan.nextLine();
        do //ensures type is either 'C' or 'F'
        {
            System.out.println("Celcius or Farenheight? (C/F) "); 
            cType = Character.toUpperCase(scan.nextLine().charAt(0));
            //cType = Character.toUpperCase(cType);
        } while (!(cType == 'C' || cType == 'F'));
        degrees = dDegrees;
        type = cType;
    }
}


