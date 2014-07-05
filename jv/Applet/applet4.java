import java.applet.Applet;
import java.awt.*;

public class applet4 extends Applet
{
	
	public void paint(Graphics g)
	{
	int inset,width,height;
	g.setColor(new Color(120,130,60));
	g.filRect(0,0,300,160);
	
	inset=0;
	width=299;
	height=159;
	g.setColor(new Color(160,110,80));
	g.drawString("Rectangles",150,200);
	
	while(width >=0 && height >=0)
	{
	g.drawString(String.valueOf(inset),width,height);
	inset+=15;
	
	width-=30;
	height-=30;
	
	}
	
	}
}

