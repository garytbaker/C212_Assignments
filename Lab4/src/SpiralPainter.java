import java.awt.Graphics;
import javax.swing.JComponent;
public class SpiralPainter extends JComponent //class that will draw the spiral. must extend JComponent
{
	public void paintComponent(Graphics g)
	/*This is the paint component that will actually draw the spiral. 
	 * The drawLines below are each part of the spiral starting from the out and then going in,
	 */
	{
		g.drawLine(20, 20, 380, 20);
		g.drawLine(380, 20, 380, 380);
		g.drawLine(380, 380, 20, 380);
		g.drawLine(20, 380, 20, 60);
		g.drawLine(20, 60, 340, 60);
		g.drawLine(340, 60, 340, 340);
		g.drawLine(340, 340, 60, 340);
		g.drawLine(60, 340, 60, 100);
		g.drawLine(60, 100, 300, 100);
		g.drawLine(300, 100, 300, 300);
		g.drawLine(300, 300, 100, 300);
		g.drawLine(100, 300, 100, 140);
		g.drawLine(100, 140, 260, 140);
		g.drawLine(260, 140, 260, 260);
		g.drawLine(260, 260, 140, 260);
		g.drawLine(140, 260, 140, 180);
		g.drawLine(140, 180, 220, 180);
		g.drawLine(220, 180, 220, 220);
		g.drawLine(220, 220, 180, 220);
	}
}
