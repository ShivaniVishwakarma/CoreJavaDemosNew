package src.AWTDemo;

import java.awt.Button;
import java.awt.Frame;
import java.awt.Label;
import java.awt.Panel;
import java.awt.TextField;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.WindowEvent;
import java.awt.event.WindowListener;

public class SimpleCalculator extends Frame implements WindowListener, ActionListener {

	Panel p1;
	Label l1, l2, result;
	TextField t1, t2;
	Button b1, b2;

	public SimpleCalculator() {

		this.setVisible(true);
		this.setSize(400, 400);
		this.setTitle("FORM");
		addWindowListener(this);

		p1 = new Panel();

		l1 = new Label("First Number");
		l2 = new Label("Second Number");

		t1 = new TextField(20);
		t2 = new TextField(20);

		b1 = new Button("Add");
		b2 = new Button("Subtract");

		result = new Label("Result: ");

		p1.add(l1);
		p1.add(t1);
		p1.add(l2);
		p1.add(t2);
		p1.add(b1);
		p1.add(b2);
		p1.add(result);

		this.add(p1);

		b1.addActionListener(null);
		b2.addActionListener(null);
	}

	@Override
	public void actionPerformed(ActionEvent e) {
		Double value1 = Double.parseDouble(t1.getText());
		Double value2 = Double.parseDouble(t2.getText());
		Double r;

		if (e.getSource() == b1) {
			r = value1 + value2;
			result.setText(r.toString());
		}
		if (e.getSource() == b2) {
			r = value1 - value2;
			result.setText(r.toString());
		}

	}

	@Override
	public void windowActivated(WindowEvent e) {
	}

	@Override
	public void windowClosed(WindowEvent e) {
	}

	@Override
	public void windowClosing(WindowEvent e) {
		dispose();
		//or System.exit(0);
	}

	@Override
	public void windowDeactivated(WindowEvent e) {
	}

	@Override
	public void windowDeiconified(WindowEvent e) {
	}

	@Override
	public void windowIconified(WindowEvent e) {
	}

	@Override
	public void windowOpened(WindowEvent e) {
	}

	public static void main(String[] args) {

		new SimpleCalculator();

	}

}
