import java.awt.*;
import java.awt.Graphics;
import java.applet.*;

public class applet extends Applet
{
	String str;
	public void run()
	{
		str=getParameter("string");
		if(str == null)
		str=", U should passed some string ! ";
			
		str="Hello " + str;
	}
	
	public void paint(Graphics g)
	{
		g.drawString(str,10,100);
	}
}
