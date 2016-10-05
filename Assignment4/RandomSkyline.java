import javax.swing.*;

/**
* RandomSkyline --- A program that displays a line of buildings,
*             each of which are individual objects.      
* @author  Diego Otero-Caldwell & Caitlyn Kennedy
* @version 1.0
* @since   2016-09-5
* <h1>RandomSkyline will have 5 rectangular buildings with windows.</h1>
* <p>
*input: RandomSkylinePanel
*output: 5 black buildings with yellow windows on a blue background
*/

public class RandomSkyline 
{
   /**
    * Creates a frame "RandomSkyline"and adds RandomSkylinePanel to it. Presents a collection of buildings.
    * @param args A string array containing the command line 
    * arguments
    * @exception Any exception
    * @return No return
    */
   public static void main(String[] args)
   {
      JFrame frame = new JFrame("RandomSkyline");
      frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
         
      frame.getContentPane().add(new RandomSkylinePanel());
         //
      frame.pack();
      frame.setVisible(true);
   }

}
