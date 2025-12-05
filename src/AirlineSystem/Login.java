package AirlineSystem;

import java.awt.*;
import java.awt.event.*;
import javax.swing.*;


public class Login extends JFrame implements ActionListener{
	
	JButton submit, reset, close;
	JTextField tfusername,tfpassword;
	
	public Login() {
		setLayout(null);
		getContentPane().setBackground(Color.white);
		
		JLabel lblusername = new JLabel("Username");
		lblusername.setBounds(20, 20, 100, 20);
		add(lblusername);
		
		JLabel lblpassword = new JLabel("Password");
		lblpassword.setBounds(20, 60, 100, 20);
		add(lblpassword);
		
		tfusername = new JTextField();
		tfusername.setBounds(130, 20, 200, 20);
		add(tfusername);
		
		tfpassword = new JTextField();
		tfpassword.setBounds(130, 60, 200, 20);
		add(tfpassword);
		
		reset = new JButton("Reset");
		reset.setBounds(40, 120, 120, 20);
		reset.addActionListener(this);
		add(reset);
		

		submit = new JButton("Reset");
		submit.setBounds(190, 120, 120, 20);
		submit.addActionListener(this);
		add(submit);
		

		close = new JButton("Reset");
		close.setBounds(120, 160, 120, 20);
		close.addActionListener(this);
		add(close);
		
		
		
		
		
		setSize(400,250);
		setLocation(600,250);
		setVisible(true);
	}
	
public void actionPerformed(ActionEvent ae) {
	if(ae.getSource() == submit) {
		
	}
	else if (ae.getSource() == reset) {
		tfusername.setText("");
		tfpassword.setText("");
	}
	else if (ae.getSource() == close) {
		setVisible(false);
	}
	
	
}
	public static void main(String[] args) {
	new Login();

	}

}
