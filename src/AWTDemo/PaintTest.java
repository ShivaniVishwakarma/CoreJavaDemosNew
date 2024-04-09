package src.AWTDemo;

import java.awt.Color;
import java.awt.Font;
import java.awt.Frame;
import java.awt.Graphics;
import java.awt.event.WindowEvent;
import java.awt.event.WindowListener;

public class PaintTest extends Frame implements WindowListener{

	@Override
	public void paint(Graphics g) {
		Font f = new Font("arial", Font.ITALIC,25);
		g.setFont(f);
		g.drawString("Welcome to My Page", 100,100);
	}
	
	@Override
	public void windowActivated(WindowEvent e) {}

	@Override
	public void windowClosed(WindowEvent e) {}

	@Override
	public void windowClosing(WindowEvent e) {
		dispose(); 
	}

	@Override
	public void windowDeactivated(WindowEvent e) {}

	@Override
	public void windowDeiconified(WindowEvent e) {}

	@Override
	public void windowIconified(WindowEvent e) {}

	@Override
	public void windowOpened(WindowEvent e) {}
	
	public static void main(String[] args) {
		PaintTest p = new PaintTest();
		p.setVisible(true);
		p.setSize(400,400);
		p.setBackground(Color.CYAN);
		p.setTitle("Paint page");
		p.addWindowListener(p);

	}

}
