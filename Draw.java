/*Write a Java program to create a frame which can be closed and use for drawing
line. Handle mouse pressed to drag a line. Also display coordinates of points.*/

import java.awt.*;
import java.awt.event.*;

class Draw extends Frame
{
	int x,y,x1,y1;

	Label l1,l2;

	Draw()
	{
		setSize(700,500);
		setVisible(true);

		setLayout(null);

		x = y = x1 = y1 = 0;

		l1 = new Label();
		l2 = new Label();

		add(l1);
		add(l2);

		addMouseListener(new MouseAdapter()
		{
			public void mousePressed(MouseEvent me)
			{
				x = me.getX();
				y = me.getY();

				l1.setText("x = "+x+", y = "+y);
				l1.setBounds(x,y,100,30);
			}

			public void mouseReleased(MouseEvent me)
			{
				x1 = me.getX();
				y1 = me.getY();

				l2.setText("x = "+x1+", y = "+y1);
				l2.setBounds(x1,y1,100,30);

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
		g.drawLine(x,y,x1,y1);
	}

	public static void main(String args[])
	{
		Draw m = new Draw();
	}
}