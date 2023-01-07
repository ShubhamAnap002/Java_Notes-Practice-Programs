import java.awt.*;
import java.awt.event.*;
import java.applet.*;

/*<applet code="AppletDemo15.class" width=400 height=400>
</applet> */

public class AppletDemo15 extends Applet implements ItemListener
{
	Choice c;
	TextField t;

	public void init()
	{
		c = new Choice();

		c.addItem("BCS");
		c.addItem("BCA");
		c.addItem("BBA");

		t = new TextField(10);

		add(c);
		add(t);

		c.addItemListener(this);
	}

	public void itemStateChanged(ItemEvent ie)
	{
		if(c.getSelectedItem()=="BCS")
		{
			t.setText("BCS");
		}
		else if(c.getSelectedItem()=="BCA")
		{
			t.setText("BCA");
		}
		else if(c.getSelectedItem()=="BBA")
		{
			t.setText("BBA");
		}
	}
}