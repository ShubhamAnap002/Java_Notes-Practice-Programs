/* Write a program that displays three concentric circles wherever the user
clicks the mouse on a frame. The program must exit when user clicks ‘X’ on
the frame. */

import java.awt.*;
import java.awt.event.*;

class CirclesDemo extends Frame
{
	int x=0,y=0;

	CirclesDemo()
	{
		setSize(300,300);
		setVisible(true);

		addMouseListener(new MouseAdapter()
		{
			public void mouseClicked(MouseEvent me)
			{
				x = me.getX();
				y = me.getY();

				repaint();
			}
		});	

		addWindowListener(new WindowAdapter()
		{
			public void windowClosing(WindowEvent we)
			{
				System.exit(0);
			}
		});
	}

	public void paint(Graphics g)
	{
		g.drawOval(x,y,20,20);
		g.drawOval(x-10,y-10,40,40);
		g.drawOval(x-20,y-20,60,60);
	}

	public static void main(String args[])
	{
		CirclesDemo m = new CirclesDemo();
	}
}