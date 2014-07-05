import java.awt.*;
import java.awt.Graphics;
import java.applet.*;

public class applet1 extends Applet
{
	public void paint(Graphics g)
	{
		int value1=10,value2=20,sum;
		sum=value1+value2;
		String s="Sum : "+String.valueOf(sum);
		g.drawString(s,100,100);
		
	}
}
