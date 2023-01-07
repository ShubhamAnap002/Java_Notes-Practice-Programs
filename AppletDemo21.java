import java.awt.*;
import javax.swing.*;
import java.applet.*;

/*<applet code="AppletDemo21.class" width=300 height=300>
</applet>*/

public class AppletDemo21 extends Applet
{
	JCheckBox c1;
	Checkbox c2;
	
	public void init()
	{
		setLayout(null);

		c1 = new JCheckBox("Cricket");
		c1.setBounds(100,20,100,30);

		c2 = new Checkbox("Hockey");
		c2.setBounds(100,50,100,30);
		
		add(c1);
		add(c2);	
	}
}