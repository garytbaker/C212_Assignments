import java.awt.Color;
import java.awt.Graphics;
import java.awt.Graphics2D;
import java.awt.Rectangle;
import javax.swing.JComponent;

public class ShapesComponents extends JComponent
/* This is the class that will be called in the InClassAssignmentOne.java to actually paint the shapes
 * to the screen. You have to extend JComponent.
 */
{
	public void paintComponent(Graphics g)
	{
		Graphics2D g2 = (Graphics2D) g; //this creates an object,g2,that will allow us to draw shapes.
		g2.setPaint(Color.BLUE);  //this is a method that changes the color that g2 draws and fills with.
		Rectangle rect = new Rectangle(50,50,180,180); //this is the creation of a rectangle object from a Rectangle class.
		g2.draw(rect);  // this draws a rectangle to the screen.
		g2.fill(rect);	//this fills the rectangle with the set color.
		g2.setPaint(Color.RED); 
		g2.fillOval(100,100,80,80);  //this fills an oval area on the screen. using this with two of the same radiuses
		g2.setPaint(Color.GREEN);
		g2.fillOval(130, 110, 20, 60);
		
	}
}
