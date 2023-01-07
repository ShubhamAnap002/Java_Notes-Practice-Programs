import java.applet.*;
import java.awt.*;

/* <applet code="AppletDemo13.class" width=400 height=400>
</applet> */

public class AppletDemo13 extends Applet
{
	public void paint(Graphics g)
	{
		// For Face
		g.drawOval(50,50,200,150);

		// For Eyes
		g.fillOval(90,90,30,30);
		g.fillOval(170,90,30,30);

		// For Ears
		g.drawOval(30,110,20,30);
		g.drawOval(250,110,20,30);

		// For Nose
		g.drawLine(150,90,150,140);

		// For Mouth
		g.drawArc(130,130,50,50,200,140);
	}
}
