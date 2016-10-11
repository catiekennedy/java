import java.awt.*;
import java.util.*;

/**
* Building.java --- a constructor class that has information for buidling objects that will be drawn on the RandomSkylinePanel 
* @author  Diego Otero-Caldwell & Caitlyn Kennedy
* @version 1.0
* @since   2016-10-04
*input:
*  1) a building has a height(height), width(width), x coordinate(xPlacement), y coordinate(yPlacement)
*  2) a window has a seed (constant long WINDOW_SEED)
*output: 
*  1) draw
*    will draw a building
*  2) drawWindows
*    will draw windows
*  3) getter and setter methods for the building constructor data
*/
public class Building
{
   //integers to hold the buildings' dimensions and location
   private int height, width, xPlacement, yPlacement;
   //seed for random window gen lives for the life of the object
   private final long WINDOW_SEED;
   
   /**
    * Constructor --- sets up the building with specified values
    * 
    * @param hgt The buildings height
    * @param wdth The building's width
    * @param xLoc The x coordinate of the buildings left side
    * @return no return
    */
   public Building(int hgt, int wdth, int xLoc)
   {
      height = hgt;
      width = wdth;
      xPlacement = xLoc;
      yPlacement = 400 - hgt; //places the building at the base of the the frame
                              //provided the frame is 400 px tall
      WINDOW_SEED = (long)(Math.random() * 2000000000);  //creates a unique and random seed for drawWindows function to use
   }
   
   /**
    * draws the building
    * @param panel The draw method for the buildings that will be called in skylinePanel to draw the buildings on the panel
    */
   public void draw(Graphics panel)
   {
      panel.setColor(Color.BLACK);
      panel.fillRect(xPlacement, yPlacement, width, height);
   }
   
   public void drawWindows(Graphics panel)
   {
      Random windowGen = new Random(WINDOW_SEED);
      int xStart, yStart; //where the window-building loop starts
      double windowChance = 0.4;
      
      xStart = xPlacement + 5;
      yStart = yPlacement + 5;
      
      panel.setColor(Color.YELLOW);
            
      for(int x = xStart; x <= (xPlacement + width - 8); x = x + 8) {
         for(int y = yStart; y <= 390; y = y + 12) {
            if (windowGen.nextDouble() < windowChance)
               panel.fillRect(x, y, 5, 8);
         }
      }
      
   }
   
   /**
    * height getter
    * @return int Height of building
    */
   public int getHeight()
   {
      return height;
   }

   /**
    * height setter
    * @param height New building height
    * @return No return
    */
   public void setHeight(int height)
   {
      this.height = height;
   }

   /**
    * width getter
    * @return int Building width
    */
   public int getWidth()
   {
      return width;
   }

   /**
    * width setter
    * @param width New building width
    */
   public void setWidth(int width)
   {
      this.width = width;
   }

   /**
    * xPlacement getter
    * @return int Building x coordinate
    */
   public int getxPlacement()
   {
      return xPlacement;
   }

   /**
    * xPlacement setter
    * @param xPlacement New building x coordinate
    */
   public void setxPlacement(int xPlacement)
   {
      this.xPlacement = xPlacement;
   }

   /**
    * yPlacement getter
    * @return int Building roof y coordinate
    */
   public int getyPlacement()
   {
      return yPlacement;
   }

   /**
    * yPlacement setter
    * @param yPlacement New building roof placement
    */
   public void setyPlacement(int yPlacement)
   {
      this.yPlacement = yPlacement;
   }
   
   
}
