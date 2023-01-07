import java.awt.*;
import java.awt.event.*;

class MyFrame10 extends Frame implements MouseListener,MouseMotionListener
{
	int x,y;

	MyFrame10()
	{
		setSize(400,400);
		setVisible(true);

		addMouseListener(this);
		addMouseMotionListener(this);
	}

	public void mouseEntered(MouseEvent me)
	{
		setBackground(Color.green);
	}

	public void mouseExited(MouseEvent me)
	{
		setBackground(Color.red);
	}

	public void mouseClicked(MouseEvent me)
	{
		setBackground(Color.blue);
	}

	public void mousePressed(MouseEvent me)
	{
		setBackground(Color.yellow);
	}

	public void mouseReleased(MouseEvent me)
	{
		setBackground(Color.pink);
	}

	public void mouseMoved(MouseEvent me)
	{
		x = me.getX();
		y = me.getY();

		repaint();
	}

	public void mouseDragged(MouseEvent me)
	{
	}

	public void paint(Graphics g)
	{
		g.drawString("X : "+x+", Y : "+y, x,y);
	}

	public static void main(String args[])
	{
		MyFrame10 m = new MyFrame10();
	}
}