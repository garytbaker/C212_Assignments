import javax.swing.JFrame;



public class DrawSpiral
/*This is the class that will view the spiral
 * 
 */
{
	
	public static void main(String[] args)
	{
		JFrame frame = new JFrame(); //this creates a new frame window and then sets its size, and title.
		frame.setSize(400, 400); 
		frame.setTitle("A Spiral");  
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		SpiralPainter spiral = new SpiralPainter();//this creates an instance of the Spiral painter class and then adds it to the frame to be shown.
		frame.add(spiral);
		frame.setVisible(true);
	}
}
