import java.awt.*;
import java.awt.event.*;

class MyFrame8 extends Frame implements WindowListener
{
	MyFrame8()
	{
		setSize(400,400);
		setVisible(true);

		addWindowListener(this);
	}

	public void windowOpened(WindowEvent we)
	{
	}

	public void windowClosed(WindowEvent we)
	{
	}

	public void windowActivated(WindowEvent we)
	{
		setBackground(Color.red);
	}

	public void windowDeactivated(WindowEvent we)
	{
	}

	public void windowIconified(WindowEvent we)
	{
	}

	public void windowDeiconified(WindowEvent we)
	{
	}

	public void windowClosing(WindowEvent we)
	{
		System.exit(0);
	}

	public static void main(String args[])
	{
		MyFrame8 m = new MyFrame8();
	}
}