import java.awt.*;
import java.awt.event.*;
import java.applet.*;

/*<applet code="AppletDemo14.class" width=400 height=400>
</applet> */

public class AppletDemo14 extends Applet implements ItemListener
{
	CheckboxGroup cg;
	Checkbox a,b,c;

	public void init()
	{
		cg = new CheckboxGroup();

		a = new Checkbox("Red",cg,true);
		b = new Checkbox("Green",cg,false);
		c = new Checkbox("Blue",cg,false);

		add(a);
		add(b);
		add(c);

		a.addItemListener(this);
		b.addItemListener(this);
		c.addItemListener(this);
	}

	public void itemStateChanged(ItemEvent ie)
	{
		if(a.getState()==true)
		{
			setBackground(Color.red);
		}
		else if(b.getState()==true)
		{
			setBackground(Color.green);
		}
		else if(c.getState()==true)
		{
			setBackground(Color.blue);
		}
	}
}