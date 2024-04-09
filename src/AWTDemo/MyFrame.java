package src.AWTDemo;

import java.awt.Button;
import java.awt.Color;
import java.awt.FlowLayout;
import java.awt.Frame;
import java.awt.GridLayout;
import java.awt.Label;
import java.awt.Panel;
import java.awt.TextField;
import java.awt.event.WindowEvent;
import java.awt.event.WindowListener;

public class MyFrame extends Frame implements WindowListener{

	public MyFrame()
	{
	
		this.setVisible(true);
		this.setSize(400, 400);
		this.setTitle("FORM");
		addWindowListener(this);  
		
		Panel p1=new Panel();
	 
		Label l1=new Label("First Name");
		Label l2=new Label("Last Name");
		
		TextField t1= new TextField(20);
		TextField t2= new TextField(20);
		
		Button b1 = new Button("Submit");
		Button b2 = new Button("Clear");
		
		p1.add(l1);
		p1.add(t1);
		p1.add(l2);
		p1.add(t2);
		p1.add(b1);
		p1.add(b2);
		
		this.add(p1);
		
		
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
		
		MyFrame f = new MyFrame();

	}
}
