import java.applet.*;
import java.awt.*;

/* <applet code="AppletDemo17.class" width=400 height=400>
</applet> */

public class AppletDemo17 extends Applet
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
			g.drawString("Welcome to Java",50,50);

			try
			{
				Thread.sleep(500);			
			}
			catch(Exception e)
			{
			}

			g.clearRect(0,0,400,400);

			try
			{
				Thread.sleep(500);			
			}
			catch(Exception e)
			{
			}
		}
	}
}