/* Write an interactive program in Java using applet which input two numbers in
different text boxes and sum of two number is display by giving an appropriate
label. */

import java.applet.*;
import java.awt.*;
import java.awt.event.*;

/*<applet code="Add.class" width=300 height=300>
</applet>*/

public class Add extends Applet implements ActionListener
{
	Label lblAns;
	TextField txtNo1,txtNo2;
	Button btnAdd;

	public void init()
	{
		lblAns = new Label("");

		txtNo1 = new TextField(10);
		txtNo2 = new TextField(10);

		btnAdd = new Button("Add");

		add(txtNo1);
		add(txtNo2);
		add(btnAdd);
		add(lblAns);

		btnAdd.addActionListener(this);
	}

	public void actionPerformed(ActionEvent ae)
	{
		double no1 = Double.parseDouble(txtNo1.getText());
		double no2 = Double.parseDouble(txtNo2.getText());

		double ans = no1+no2;
		
		lblAns.setText(String.valueOf(ans));
	}
}
