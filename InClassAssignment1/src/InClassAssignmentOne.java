////////////////////////////////////////////////////////////////////////////////////
//  C212
//   
//  Released:  1/11/18
//
//  Lab 2
//  @Gary Baker and garybake
//  Last Edited: 1/22/18
//
//  Worked with Isaiah Sherfick on a lot of this In-Class Assignment. 
//
//               
//////////////////////////////////////////////////////////////////////////////////

import javax.swing.JFrame;



public class InClassAssignmentOne
/*This is the class that will view the rectangle, circle and ellipse
 * 
 */
{
	
	public static void main(String[] args)
	{
		JFrame frame = new JFrame(); //this creates a new frame window and then sets its size, and title.
		frame.setSize(300, 400); 
		frame.setTitle("An Ellipse inside A Circle inside a Rectangle");  
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE); 
		
		ShapesComponents component = new ShapesComponents();   //creating a new ShapesComponents object and adding it to the window
		frame.add(component);
		frame.setVisible(true);
		
	}

}
