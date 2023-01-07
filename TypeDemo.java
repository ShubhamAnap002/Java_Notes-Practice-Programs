/* Write a program to design a frame having a text box and a label. As the user
types characters in the text box simultaneously display these typed characters
in the label. Your program should exit when user presses the ‘X’ button of the
window. */

import java.awt.*;
import java.awt.event.*;

class TypeDemo extends Frame implements KeyListener
{
	TextField t;
	Label l;
	
	TypeDemo()
	{
		super("Type Demo");

		setSize(300,300);
		setVisible(true);

		setLayout(null);

		t = new TextField();
		t.setBounds(50,50,200,30);

		l = new Label();
		l.setBounds(50,90,200,30);

		add(t);
		add(l);	

		t.addKeyListener(this);

		addWindowListener(new WindowAdapter()
		{
			public void windowClosing(WindowEvent we)
			{
				System.exit(0);
			}
		});
	}

	public void keyTyped(KeyEvent k)
	{
		l.setText(t.getText());
	}

	public void keyPressed(KeyEvent k)
	{
	}

	public void keyReleased(KeyEvent k)
	{
	}

	public static void main(String args[])
	{
		TypeDemo m = new TypeDemo();
	}
}