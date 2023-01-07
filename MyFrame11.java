import java.awt.*;
import java.awt.event.*;

class MyFrame11 extends Frame
{
	MyFrame11()
	{
		setSize(400,400);
		setVisible(true);

		addMouseListener(new MouseAdapter()
		{
			public void mouseEntered(MouseEvent me)
			{
				setBackground(Color.green);
			}

			public void mouseExited(MouseEvent me)
			{
				setBackground(Color.red);
			}
		});
	}

	public static void main(String args[])
	{
		MyFrame11 m = new MyFrame11();
	}
}