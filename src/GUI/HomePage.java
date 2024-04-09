package src.GUI;

import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JLabel;

public class HomePage extends JFrame{

	JLabel welcome;
		
	public HomePage() {
	
		this.setVisible(true);
		this.setBounds(100, 100, 450, 300);
		//this.setSize(400,400);
		this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		this.getContentPane().setLayout(null);
		
		welcome = new JLabel("WELOME HOME");
		welcome.setBounds(94, 70, 200, 16);
		this.getContentPane().add(welcome);
		
	}

	public static void main(String[] args) {
		new HomePage();
	}

}
