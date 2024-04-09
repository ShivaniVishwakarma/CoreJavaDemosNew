package src.GUI;

import java.awt.Color;
import java.awt.Font;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JPasswordField;
import javax.swing.JTextField;
import javax.swing.SwingConstants;

import java.sql.*;

public class Login extends JFrame implements ActionListener {

	JTextField txtUsername, txtPassword;
	JButton btnLogin, btnSignUp;
	JLabel lblUsername, lblPassword;

	public Login() {
		this.setVisible(true);
		this.setBounds(100, 100, 450, 300);
		this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		this.getContentPane().setLayout(null);

		lblUsername = new JLabel("Username");
		lblUsername.setBounds(94, 70, 62, 16);

		txtUsername = new JTextField();
		txtUsername.setBounds(164, 65, 130, 26);
		txtUsername.setToolTipText("Enter your username");
		txtUsername.setColumns(10);
		

		lblPassword = new JLabel("Password");
		lblPassword.setBounds(94, 111, 59, 16);

		btnLogin = new JButton("LOGIN");
		btnLogin.setBounds(81, 150, 117, 29);

		btnSignUp = new JButton("SIGN UP");
		btnSignUp.setBounds(210, 150, 117, 29);

		txtPassword = new JPasswordField();
		txtPassword.setToolTipText("Enter your password");
		txtPassword.setBounds(164, 106, 130, 26);

		JLabel lbl1 = new JLabel("Welcome to IRIS F-1001");
		lbl1.setHorizontalAlignment(SwingConstants.CENTER);
		lbl1.setForeground(new Color(75, 0, 130));
		lbl1.setFont(new Font("Cochin", Font.BOLD, 23));
		lbl1.setBounds(6, 6, 427, 39);
		
		btnLogin.addActionListener(this);
		btnSignUp.addActionListener(this);

		this.getContentPane().add(lbl1);
		this.getContentPane().add(lblUsername);
		this.getContentPane().add(txtUsername);
		this.getContentPane().add(txtPassword);
		this.getContentPane().add(lblPassword);
		this.getContentPane().add(btnLogin);
		this.getContentPane().add(btnSignUp);

	}

	public static void main(String[] args) {
		new Login();

	}

	@Override
	public void actionPerformed(ActionEvent e) {

		if (e.getSource() == btnLogin) {
			
			String user, pass, passDB = null;
			user = txtUsername.getText();
			pass = txtPassword.getText();

			try {
				Class.forName("com.mysql.jdbc.Driver");
				Connection con = DriverManager.getConnection("jdbc:mysql://localhost:3306/shivani", "root",
						"Shivani_1993");

				String sql = "select password from iris where name='" + user + "';";
				Statement stmt = con.createStatement();
				ResultSet rs = stmt.executeQuery(sql);

				while (rs.next()) {
					passDB = rs.getString("password");

					if (pass.equals(passDB)) {
						new HomePage();
					} else {
						JOptionPane.showMessageDialog(null, "Incorrect username or password..!!");
					}
				}

			} catch (Exception ex) {
				ex.printStackTrace();
			}

		}
		if (e.getSource() == btnSignUp) {
			new SignUp();
		}

	}

}
