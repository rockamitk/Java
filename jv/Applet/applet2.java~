import java.awt.*;
import java.applet.*;

public class applet2 extends Applet
{
	TextField txt1,txt2;
	
	public void init()
	{
		txt1=new TextField(8);
		txt2=new TextField(8);
		
		add(txt1);add(txt2);
		txt1.setText("");txt2.setText("");
	}		
	
	public void paint(Graphics g)
	{
		int x=0,y=0,z=0;
		String s1,s2,s;
		
		g.drawString("add to Number",10,50);
		try{
			s1=txt1.getText();
			x=Integer.parseInt(s1);
			s2=txt2.getText();
			y=Integer.parseInt(s2);
		   }
		  catch(Exception e)
		   {g.drawString("Wrong  input ",100,100);
		   //init();
		   }
		   
		  z=y+x;
		  s=String.valueOf(z);
		  g.drawString("Sum :",10,75);
		  g.drawString(s,100,75);
	}
	public boolean action(Event event,Object object)
	{
		repaint();
		return true;
	}
}

