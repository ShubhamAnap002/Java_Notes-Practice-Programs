import java.awt.*;
import java.awt.event.*;
import javax.swing.*;

class MyFrame7 implements AdjustmentListener
{
	JFrame f;
	Container con=null;
	JScrollBar red, green, blue;

	MyFrame7()
	{
		f = new JFrame("Frame Demo");

		f.setSize(800,600);
		f.setVisible(true);
		f.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

		f.setLayout(null);

		red = new JScrollBar(JScrollBar.HORIZONTAL, 0, 10, 0, 255);
		red.setBounds(100, 20, 500, 50);

		green = new JScrollBar(JScrollBar.HORIZONTAL, 0, 10, 0, 255);
		green.setBounds(100, 80, 500, 50);

		blue = new JScrollBar(JScrollBar.HORIZONTAL, 0, 10, 0, 255);
		blue.setBounds(100, 140, 500, 50);

		f.add(red);
		f.add(green);
		f.add(blue);
		
		con = f.getContentPane();

		red.addAdjustmentListener(this);
		green.addAdjustmentListener(this);
		blue.addAdjustmentListener(this);
	}

	public void adjustmentValueChanged(AdjustmentEvent ae)
	{
		Color c = new Color(red.getValue(), green.getValue(), blue.getValue());
		con.setBackground(c);
	}

	public static void main(String args[])
	{
		MyFrame7 m = new MyFrame7();
	}
}