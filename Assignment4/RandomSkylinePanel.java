import javax.swing.*;
import java.awt.*;

/**
 * RandomSkylinePanel --- A class that displays a rudimentary skyline and draws a random number of buildings each with random number of windows.
 * @author  Diego Otero-Caldwell & Caitlyn Kennedy
 * @version 1.0
 * @since   2016-10-04
 * paintComponent method:
 *    input: panel as a Graphics object
 *    output: we will see random white stars, random black buildings with yellow windows, green String with authors' names
 *    steps for random buildings: 
 *      generate a random number, numberOfBuildings
 *      repeat from one to the random number, for i = 0, i less than numberOfBuildings
 *        generate random width, int width
 *        as long as the width  and the building's x coordinate are less than the width of the window, if width plus x less than 575
 *          generate random height, int height
 *          instantiate a new building, bldg
 *          draw the building
 *          draw the windows
 *        else
 *          there's no more space for another building
 *        generate a random gap between the next building
 */

public class RandomSkylinePanel extends JPanel
{
  private int x;
   /**
    * Constructor
    *  1) sets size of window
    *  2) sets background color of window
    *  3) sets the inital x coordinate of the first drawn building
    * 
    * @return no return
    */
   public RandomSkylinePanel()
   {
      setPreferredSize(new Dimension(575, 400));
      setBackground(new Color(10, 0, 100));
      x = 20;
   }
   
   // Draws the panel by requesting that each building draw itself and each window draw itself
   public void paintComponent(Graphics panel)
   {
      super.paintComponent(panel);

      Star stars = new Star();
      stars.draw(panel);

      int numberOfBuildings = (int) (Math.random() * 30 + 2);
      boolean spaceLeft = true;
      int width, height, gap;
      Building bldg;
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

      }
      
      panel.setColor(Color.green);
      panel.drawString("City of Diego & Caitlyn", 50, 50);
   }
}
