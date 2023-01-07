/* Write a program using swing to display the names of four hobbies using
check boxes. Display the selected hobbies in a text field when the user clicks
the “OK” button. */

import java.awt.*;
import java.awt.event.*;
import javax.swing.*;

class HobbiesDemo extends JFrame implements ActionListener
{
	JCheckBox c1,c2,c3,c4;
	JTextField txtAns;
	JButton btnOk;
	
	HobbiesDemo()
	{
		super("Hobbies Demo");

		setSize(300,300);
		setVisible(true);
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

		setLayout(null);

		c1 = new JCheckBox("Reading");
		c1.setBounds(100,20,100,30);

		c2 = new JCheckBox("Driving");
		c2.setBounds(100,50,100,30);

		c3 = new JCheckBox("Singing");
		c3.setBounds(100,80,100,30);
		
		c4 = new JCheckBox("Playing");
		c4.setBounds(100,110,100,30);

		btnOk = new JButton("Ok");
		btnOk.setBounds(100,140,100,30);

		txtAns = new JTextField();
		txtAns.setBounds(50,180,200,30);

		add(c1);
		add(c2);	
		add(c3);
		add(c4);	

		add(btnOk);
		add(txtAns);
		
		btnOk.addActionListener(this);
	}

	public void actionPerformed(ActionEvent ae)
	{
		txtAns.setText("");

		if(c1.isSelected()==true)
		{
			txtAns.setText(txtAns.getText()+"Reading");
		}
		if(c2.isSelected()==true)
		{
			txtAns.setText(txtAns.getText()+" Driving");
		}
		if(c3.isSelected()==true)
		{
			txtAns.setText(txtAns.getText()+" Singing");
		}
		if(c4.isSelected()==true)
		{
			txtAns.setText(txtAns.getText()+" Playing");
		}
	}

	public static void main(String args[])
	{
		HobbiesDemo m = new HobbiesDemo();
	}
}