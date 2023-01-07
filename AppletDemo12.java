import java.applet.*;
import java.awt.*;

/* <applet code="AppletDemo12.class" width=400 height=400>
</applet> */

public class AppletDemo12 extends Applet
{
	public void paint(Graphics g)
	{
		g.setColor(Color.red);
		g.drawLine(200,100,100,300);

		g.setColor(Color.blue);
		g.drawLine(100,300,300,300);

		g.setColor(Color.green);
		g.drawLine(200,100,300,300);
	}
}