package src.GUI;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.sql.DriverManager;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JRadioButton;
import javax.swing.JTextField;

import java.sql.*;

public class SignUp extends JFrame implements ActionListener {

	JTextField txtName, txtAge, txtEmail, txtContact;
	JLabel lblName, lblAge, lblEmail, lblContact, lblGender;
	JButton btnSave, btnClear;
	JRadioButton rdbtnMale, rdbtnFemale;

	public SignUp() {

		this.setVisible(true);
		this.setBounds(100, 100, 450, 300);
		this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		this.getContentPane().setLayout(null);

		lblName = new JLabel("Name");
		lblName.setBounds(31, 31, 51, 16);
		this.getContentPane().add(lblName);

		lblAge = new JLabel("Age");
		lblAge.setBounds(31, 59, 61, 16);
		this.getContentPane().add(lblAge);

		lblEmail = new JLabel("Email ID");
		lblEmail.setBounds(31, 87, 61, 16);
		this.getContentPane().add(lblEmail);

		lblContact = new JLabel("Contact");
		lblContact.setBounds(31, 115, 61, 16);
		this.getContentPane().add(lblContact);

		lblGender = new JLabel("Gender");
		lblGender.setBounds(31, 143, 61, 16);
		this.getContentPane().add(lblGender);

		rdbtnMale = new JRadioButton("Male");
		rdbtnMale.setBounds(136, 139, 141, 23);
		this.getContentPane().add(rdbtnMale);

		rdbtnFemale = new JRadioButton("Female");
		rdbtnFemale.setBounds(240, 139, 141, 23);
		this.getContentPane().add(rdbtnFemale);

		txtName = new JTextField();
		txtName.setBounds(122, 26, 130, 26);
		this.getContentPane().add(txtName);
		txtName.setColumns(10);

		txtAge = new JTextField();
		txtAge.setBounds(122, 54, 130, 26);
		this.getContentPane().add(txtAge);
		txtAge.setColumns(10);

		txtEmail = new JTextField();
		txtEmail.setBounds(122, 82, 130, 26);
		this.getContentPane().add(txtEmail);
		txtEmail.setColumns(10);

		txtContact = new JTextField();
		txtContact.setBounds(122, 110, 130, 26);
		this.getContentPane().add(txtContact);
		txtContact.setColumns(10);

		btnSave = new JButton("SAVE");
		btnSave.setBounds(31, 195, 117, 29);
		this.getContentPane().add(btnSave);
		btnSave.addActionListener(this);

		btnClear = new JButton("CLEAR");
		btnClear.setBounds(146, 195, 117, 29);
		this.getContentPane().add(btnClear);
		btnClear.addActionListener(this);

	}

	@Override
	public void actionPerformed(ActionEvent e) {

		if (e.getSource() == btnSave) {
			String name, age, email, contact, gender;

			name = txtName.getText();
			age = txtAge.getText();
			email = txtEmail.getText();
			contact = txtContact.getText();
			gender="F";

			try {
				Class.forName("com.mysql.jdbc.Driver");
				Connection con = DriverManager.getConnection("jdbc:mysql://localhost:3306/shivani", "root",
						"Shivani_1993");
				System.out.println("Connection successfull..!!");
				
				PreparedStatement ps = con.prepareStatement("insert into iris values (?,?,?,?,?,?)");
				ps.setString(1, name);
				ps.setString(2, age);
				ps.setString(3, email);
				ps.setString(4, contact);
				ps.setString(5, gender);
				ps.setString(6, "1234");
			
				int i = ps.executeUpdate();
				
				if (i != 0) {
					System.out.println("insert success..!!");
				} else {
					System.out.println("insert failed..!!");
				}

			} catch (Exception e1) {
				e1.printStackTrace();
			}

		}

		if (e.getSource() == btnClear) {
			txtName.setText("");
			txtAge.setText("");
			txtEmail.setText("");
			txtContact.setText("");
		}

	}

	public static void main(String[] args) {
		new SignUp();
	}

}
