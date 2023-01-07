import java.applet.*;
import java.awt.*;

/* <applet code="AppletDemo16.class" width=400 height=400>
</applet> */

public class AppletDemo16 extends Applet
{
	public void init()
	{
		setBackground(Color.yellow);
		setForeground(Color.red);
		setFont(new Font("Arial",Font.PLAIN,30));
	}

	public void paint(Graphics g)
	{
		int x=400;		

		while(true)
		{
			g.drawString("Welcome to Java",x,50);

			try
			{
				Thread.sleep(100);			
			}
			catch(Exception e)
			{
			}

			g.clearRect(0,0,400,400);

			x=x-5;

			if(x<=-200)
			{
				x=400;
			}
		}
	}
}