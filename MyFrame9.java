import java.awt.*;
import java.awt.event.*;

class MyFrame9 extends Frame
{
	MyFrame9()
	{
		setSize(400,400);
		setVisible(true);

		addWindowListener(new WindowAdapter()
		{
			public void windowClosing(WindowEvent we)
			{
				System.exit(0);
			}
		});
	}

	public static void main(String args[])
	{
		MyFrame9 m = new MyFrame9();
	}
}