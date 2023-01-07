import java.applet.*;
import java.awt.*;
import java.awt.event.*;

/* <applet code="AppletDemo10.class" width=300 height=300>
</applet>
*/

public class AppletDemo10 extends Applet implements ActionListener
{
	Label l1,l2,l3;
	TextField t1,t2,t3;
	Button b1,b2,b3,b4;

	public void init()
	{
		setLayout(new GridLayout(5,2));

		setFont(new Font("Arial",Font.PLAIN,25));

		l1 = new Label("Enter No1");
		l2 = new Label("Enter No2");
		l3 = new Label("Answer");

		t1 = new TextField(10);
		t2 = new TextField(10);
		t3 = new TextField(10);

		b1 = new Button("Add");
		b2 = new Button("Sub");
		b3 = new Button("Mul");
		b4 = new Button("Div");

		add(l1);
		add(t1);

		add(l2);
		add(t2);

		add(b1);
		add(b2);
		add(b3);
		add(b4);

		add(l3);
		add(t3);

		b1.addActionListener(this);
		b2.addActionListener(this);
		b3.addActionListener(this);
		b4.addActionListener(this);
	}

	public void actionPerformed(ActionEvent ae)
	{
		double n1 = Double.parseDouble(t1.getText());
		double n2 = Double.parseDouble(t2.getText());

		double ans = 0;

		if(ae.getSource()==b1)
		{
			ans = n1+n2;
		}
		else if(ae.getSource()==b2)
		{
			ans = n1-n2;
		}
		else if(ae.getSource()==b3)
		{
			ans = n1*n2;
		}
		else if(ae.getSource()==b4)
		{
			ans = n1/n2;
		}

		t3.setText(String.valueOf(ans));
	}
}