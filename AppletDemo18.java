import java.applet.*;
import java.awt.*;
import java.util.*;

/* <applet code="AppletDemo18.class" width=400 height=400>
</applet> */

public class AppletDemo18 extends Applet
{
	public void init()
	{
		setBackground(Color.yellow);
		setForeground(Color.red);
		setFont(new Font("Arial",Font.PLAIN,30));
	}

	public void paint(Graphics g)
	{
		while(true)
		{
			Date dt = new Date();

			String time = dt.getHours()+":"+dt.getMinutes()+":"+dt.getSeconds();

			g.drawString(time,50,50);

			try
			{
				Thread.sleep(1000);			
			}
			catch(Exception e)
			{
			}

			g.clearRect(0,0,400,400);
		}
	}
}