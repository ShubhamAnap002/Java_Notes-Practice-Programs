import java.applet.*;
import java.awt.*;
import java.awt.event.*;

/* <applet code="AppletDemo9.class" width="600" height="550">
</applet> */

public class AppletDemo9 extends Applet implements ActionListener
{
	Label l1,l2,l3;
	TextField t1,t2,t3;
	Button b1,b2,b3,b4;

	public void init()
	{
		//setLayout(new GridLayout(5,2));
		setLayout(null);

		setBackground(Color.yellow);
		setForeground(Color.red);

		setFont(new Font("Arial",Font.PLAIN,30));

		l1 = new Label("Enter No1");
		l1.setBounds(50,50,150,30);
		l2 = new Label("Enter No2");
		l2.setBounds(50,100,150,30);
		l3 = new Label("Answer is");
		l3.setBounds(50,250,150,30);

		t1 = new TextField(10);
		t1.setBounds(200,50,150,40);
		t2 = new TextField(10);
		t2.setBounds(200,100,150,40);
		t3 = new TextField(10);
		t3.setBounds(200,250,150,40);

		b1 = new Button("Add");
		b1.setBounds(50,150,150,40);
		b2 = new Button("Sub");
		b2.setBounds(200,150,150,40);
		b3 = new Button("Mul");
		b3.setBounds(50,200,150,40);
		b4 = new Button("Div");
		b4.setBounds(200,200,150,40);

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
		double no1 = Double.parseDouble(t1.getText());
		double no2 = Double.parseDouble(t2.getText());

		double ans = 0;

		if(ae.getSource()==b1)
		{
			ans = no1+no2;
		}
		else if(ae.getSource()==b2)
		{
			ans = no1-no2;
		}
		else if(ae.getSource()==b3)
		{
			ans = no1*no2;
		}
		else if(ae.getSource()==b4)
		{
			ans = no1/no2;
		}
		else
		{
			ans = 0;
		}
		t3.setText(""+ans);
	}
}