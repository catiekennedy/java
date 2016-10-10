import java.awt.*;
import java.util.*;

/**
* Star.java --- a constructor class that has information for buidling objects that will be drawn on the SkylinePanel 
* @author  Diego Otero-Caldwell & Caitlyn Kennedy
* @version 1.0
* @since   2016-10-08
*input:
*  1) a Star has a height(height), width(width), x coordinate(xPlacement), y coordinate(yPlacement)
*  2) a window has a seed (constant long WINDOW_SEED)
*output: 
*  1) draw
*    will draw a Star
*  2) drawWindows
*    will draw windows
*  3) getter and setter methods for the Star constructor data
 */
public class Star
{
   //integers to hold the Stars' dimensions and location
   private int height, width, xPlacement, yPlacement;
   //seed for random window gen lives for the life of the object
   private final long WINDOW_SEED;
   
   /**
    * Constructor --- sets up the Star with specified values
    * 
    * @param hgt The Stars height
    * @param wdth The Star's width
    * @param xLoc The x coordinate of the Stars left side
    * @return no return
    */
   public Star(int hgt, int wdth, int xLoc, int yLoc)
   {
      height = hgt;
      width = wdth;
      xPlacement = xLoc;
      yPlacement = yLoc; //places the Star at the base of the the frame
      WINDOW_SEED = (long)(Math.random() * 2000000000);
   }
   
   /**
    * draws the Star
    * @param panel The draw method for the Stars that will be called in skylinePanel to draw the Stars on the panel
    */
   public void draw(Graphics panel)
   {
      panel.setColor(Color.red);
      panel.fillRect(xPlacement, yPlacement, width, height);
      Random windowGen = new Random(WINDOW_SEED);
      int xStart, yStart; //where the window-Star loop starts
      double windowChance = 0.4;
      
      xStart = xPlacement + 5;
      yStart = yPlacement + 5;
            
      for(int x = xStart; x <= (xPlacement + width - 8); x = x + 8) {
         for(int y = yStart; y <= 390; y = y + 12) {
            if (windowGen.nextDouble() < windowChance)
               panel.fillRect(x, y, 5, 8);
         }
      }      
   }
   
   /**
    * height getter
    * @return int Height of Star
    */
   public int getHeight()
   {
      return height;
   }

   /**
    * height setter
    * @param height New Star height
    * @return No return
    */
   public void setHeight(int height)
   {
      this.height = height;
   }

   /**
    * width getter
    * @return int Star width
    */
   public int getWidth()
   {
      return width;
   }

   /**
    * width setter
    * @param width New Star width
    */
   public void setWidth(int width)
   {
      this.width = width;
   }

   /**
    * xPlacement getter
    * @return int Star x coordinate
    */
   public int getxPlacement()
   {
      return xPlacement;
   }

   /**
    * xPlacement setter
    * @param xPlacement New Star x coordinate
    */
   public void setxPlacement(int xPlacement)
   {
      this.xPlacement = xPlacement;
   }

   /**
    * yPlacement getter
    * @return int Star roof y coordinate
    */
   public int getyPlacement()
   {
      return yPlacement;
   }

   /**
    * yPlacement setter
    * @param yPlacement New Star roof placement
    */
   public void setyPlacement(int yPlacement)
   {
      this.yPlacement = yPlacement;
   }
   
   
}
