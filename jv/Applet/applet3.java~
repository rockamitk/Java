import java.applet.*;
import java.awt.*;
import java.awt.event.*;
//import java.awt.event.KeyListener.*;

public class applet3 extends Applet implements KeyListener
{
	
	public void init()
	{
	addKeyListener(this);
	}		
	
	public void keyTyped(KeyEvent KB){}
	public void keyReleased(KeyEvent KB)
	{
	showStatus("Key on the Key board released");
	}
	
	public void keyPressed(KeyEvent KB)
	{
	showStatus("A Key on the Key board pressed");
	}

	Font f=new Font("Courier New",Font.BOLD,20);
	
	public void paint(Graphics g)
	{
	g.setFont(f);
	g.setColor(new Color(120,180,60));
	g.drawString("Applet for move up/down",20,120);
	}
}

