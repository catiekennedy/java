import java.awt.*;

/**
 * Star.java --- a class that draws 1x1 stars randomly onto a frame
 * 
 * @author  Diego Otero-Caldwell & Caitlyn Kennedy
 * @version 1.0
 * @since   2016-10-10
 */

public class Star
{
   private int numberOfStars;
   
   /**
    * Constructor --- Sets the number of stars to a random value
    * 
    * @return no return
    */
   public Star()
   {
      numberOfStars = (int)(Math.random() * 20000);
   }
   
   /**
    * Constructor --- takes a set int and sets numberOfStars to that value
    * 
    * @param iNumberOfStars Number of stars to draw
    */
   public Star(int iNumberOfStars)
   {
      numberOfStars = iNumberOfStars;
   }
   
   /**
    * draw --- draws the stars at random locations
    * @param panel The panel to draw to
    */
   public void draw(Graphics panel)
   {
      panel.setColor(Color.WHITE);
      for(int i = 0; i < numberOfStars; i++)
      {
         //this is set for a 575 x 400 panel, change these numbers for different panel sizes
         panel.fillRect((int)(Math.random() * 575), (int)(Math.random() * 200), 1, 1);
      }
   }
}
