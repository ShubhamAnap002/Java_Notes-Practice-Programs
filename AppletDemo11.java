import java.applet.*;
import java.awt.*;

/* <applet code="AppletDemo11.class" width=400 height=300>
</applet> */

public class AppletDemo11 extends Applet
{
	public void paint(Graphics g)
	{
		int x[] = {200,100,300};
		int y[] = {50,200,200};

		g.drawPolygon(x,y,3);
	}
}