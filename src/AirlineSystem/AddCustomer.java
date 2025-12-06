package AirlineSystem;
import javax.swing.*;
import java.awt.event.*;
import java.awt.*;

public class AddCustomer extends JFrame implements ActionListener{
	
	JTextField tfname,tfnationality,tfaadhar,tfaddress,tfphoneno, tfpassword;
	JRadioButton male,female;
	JButton save;
	public AddCustomer() {
	getContentPane().setBackground(Color.white);
	setLayout(null);
		
	JLabel heading = new JLabel("Add Customer Details");
	heading.setBounds(220, 20, 500, 35);
	heading.setFont(new Font("Raleman",Font.BOLD,32));
	heading.setForeground(Color.blue);
	add(heading);
		
	JLabel lblname = new JLabel("Name");
	lblname.setBounds(60, 80, 150, 25);
	lblname.setFont(new Font("Tahoma", Font.BOLD,16));
	add(lblname);
	
	tfname = new JTextField();
	tfname.setBounds(220, 80, 150, 25);		
	add(tfname);
	
	JLabel nationality = new JLabel("Nationality");
	nationality.setBounds(60, 120, 150, 25);
	nationality.setFont(new Font("Tahoma", Font.BOLD,16));
	add(nationality);
	
	tfnationality = new JTextField();
	tfnationality.setBounds(220, 120, 150, 25);		
	add(tfnationality);
	
	JLabel aadhar = new JLabel("Aadhar Number");
	aadhar.setBounds(60, 160, 150, 25);
	aadhar.setFont(new Font("Tahoma", Font.BOLD,16));
	add(aadhar);
	
	tfaadhar = new JTextField();
	tfaadhar.setBounds(220, 160, 150, 25);		
	add(tfaadhar);
	
	JLabel address = new JLabel("Address");
	address.setBounds(60, 200, 150, 25);
	address.setFont(new Font("Tahoma", Font.BOLD,16));
	add(address);
	
	tfaddress = new JTextField();
	tfaddress.setBounds(220, 200, 150, 25); 		
	add(tfaddress);
		
	JLabel gender = new JLabel("Gender");
	gender.setFont(new Font("Tahoma", Font.BOLD,16));
	gender.setBounds(60, 240, 150, 25);
	add(gender);
	
	male = new JRadioButton("Male");
	male.setBounds(220, 240, 80, 25);
	male.setBackground(Color.white);
	add(male);

	female = new JRadioButton("Female");
	female.setBounds(300, 240, 80, 25);
	female.setBackground(Color.white);
	add(female);

	ButtonGroup bggender = new ButtonGroup();
	bggender.add(male);
	bggender.add(female);
	
	JLabel phoneno = new JLabel("Phone No");
	phoneno.setBounds(60, 280, 150, 25);
	phoneno.setFont(new Font("Tahoma", Font.BOLD,16));
	add(phoneno);
	
	tfphoneno = new JTextField();
	tfphoneno.setBounds(220, 280, 150, 25);		
	add(tfphoneno);
	
	JLabel passwordLabel = new JLabel("Password");
	passwordLabel.setBounds(60, 320, 150, 25);
	passwordLabel.setFont(new Font("Tahoma", Font.BOLD,16));
	add(passwordLabel);
	
	tfpassword = new JTextField();
	tfpassword.setBounds(220, 320, 150, 25);		
	add(tfpassword);
	
	save = new JButton("Save");
	save.setBounds(220, 360, 150, 25);	
	save.setBackground(Color.black);
	save.addActionListener(this);
	save.setForeground(Color.white);
	add(save);
	
	ImageIcon i1 = new ImageIcon(ClassLoader.getSystemResource("AirlineSystem/icons/emp.png"));
	JLabel image = new JLabel(i1);
	image.setBounds(450, 80, 280, 400);
	add(image);
	
	
	setSize(900,600);
	setLocation(300,150);
	setVisible(true);
	}
	
	public void actionPerformed(ActionEvent ae) {
		String name = tfname.getText();
		String nationality = tfnationality.getText();
		String phone = tfphoneno.getText();
		String address = tfaddress.getText();
		String aadhar = tfaadhar.getText();
		String password = tfpassword.getText();
		String gender = null;
		if(male.isSelected()) {
			gender = "Male";
		}
		else {
			gender = "Female";
		}
		
		try {
			Conn conn = new Conn();
			if (!conn.isConnected) {
				JOptionPane.showMessageDialog(null, "Database connection failed.\nEnsure MySQL is running and JDBC driver is in:\nd:\\J2EE\\Lib\\mysql-connector-java-8.0.33.jar");
				return;
			}
			String query = "insert into passeneger values('"+name+"', '"+nationality+"','"+phone+"','"+address+"','"+aadhar+"','"+gender+"')";
			conn.s.executeUpdate(query);
			JOptionPane.showMessageDialog(null, "Customer Details Added Successfully");
			setVisible(false);
			
		}
		catch (Exception e) {
			JOptionPane.showMessageDialog(null, "Error: " + e.getMessage());
			System.out.println(e);
		}
	}
	
	public static void main(String[] args) {
	new AddCustomer();

	}

}
