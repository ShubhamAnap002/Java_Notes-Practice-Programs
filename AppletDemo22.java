import java.applet.*;
import java.awt.*;

/* <applet code="AppletDemo22.class" width=400 height=400>
</applet> */

public class AppletDemo22 extends Applet implements Runnable
{
	Thread th=null;

	public void init()
	{
		th = new Thread();
		th.start();
	}

	public void paint(Graphics g)
	{
		while(true)
		{
			g.drawString("Welcome to Java",75,50);

			try
			{
				th.sleep(500);
			}
			catch(Exception e)
			{
			}

			g.clearRect(0,0,400,400);

			try
			{
				th.sleep(500);
			}
			catch(Exception e)
			{
			}
		}
	}

	public void run()
	{
		repaint();
	}
}