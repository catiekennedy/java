import javax.swing.*;
import java.awt.*;

/**
 * RandomSkylinePanel --- A class that displays a rudimentary skyline
 *                  by calling 5 Building objects.
 * @author  Diego Otero-Caldwell & Caitlyn Kennedy
 * @version 1.0
 * @since   2016-09-15
 */

public class RandomSkylinePanel extends JPanel
{
   //private final long SEED;
  private int x;
   /**
    * Constructor
    *  1) sets size of window
    *  2) sets background color of window
    *  3) creates 5 Building objects
    * 
    * @return no return
    */
   public RandomSkylinePanel()
   {
      setPreferredSize(new Dimension(575, 400));
      setBackground(new Color(10, 0, 100));
      //SEED = (long)(Math.random() * 2000000000);
      x = 20;
   }
   
   // Draws the panel by requesting that each building draw itself and each window draw itself
   public void paintComponent(Graphics panel)
   {
      super.paintComponent(panel);

      int numberOfBuildings = (int) (Math.random() * 30 + 2);
      boolean spaceLeft = true;
      int width, height, gap;
      Building bldg;
      // if there's space for another building, continue
      // while x + w < right hand side of the panel, draw a building
      for(int i = 0; i < numberOfBuildings && spaceLeft == true; i++) {
        width = (int) (Math.random() * 100 + 50);
        if (width + x < 575)
        {
          height = (int) (Math.random() * 340 + 50);
          bldg = new Building(height, width, x);
          bldg.draw(panel);
          bldg.drawWindows(panel);
        }
        else
          spaceLeft = false;

        x += width + (int) (Math.random() * 10 + 5); //adds a gap between bldgs

        //panel.setColor(Color.white);
        //panel.drawString("test", (100 + i * 5), 100);
      }

      panel.setColor(Color.white);
      panel.drawString("City of Diego & Caitlyn", 50, 50);
   }
}
