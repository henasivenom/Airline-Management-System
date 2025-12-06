package AirlineSystem;
import javax.swing.*;
import java.awt.*;
public class AddCustomer extends JFrame{
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
	
	JTextField tfname = new JTextField();
	tfname.setBounds(220, 80, 150, 25);		
	add(tfname);
	
	JLabel nationality = new JLabel("Nationality");
	nationality.setBounds(60, 120, 150, 25);
	nationality.setFont(new Font("Tahoma", Font.BOLD,16));
	add(nationality);
	
	JTextField tfnationality = new JTextField();
	tfnationality.setBounds(220, 120, 150, 25);		
	add(tfnationality);
	
	JLabel aadhar = new JLabel("Aadhar Number");
	aadhar.setBounds(60, 160, 150, 25);
	aadhar.setFont(new Font("Tahoma", Font.BOLD,16));
	add(aadhar);
	
	JTextField tfaadhar = new JTextField();
	tfaadhar.setBounds(220, 160, 150, 25);		
	add(tfaadhar);
	
	JLabel address = new JLabel("Address");
	address.setBounds(60, 200, 150, 25);
	address.setFont(new Font("Tahoma", Font.BOLD,16));
	add(address);
	
	JTextField tfaddress = new JTextField();
	tfaddress.setBounds(220, 200, 150, 25); 		
	add(tfaddress);
		
	JLabel gender = new JLabel("Gender");
	gender.setFont(new Font("Tahoma", Font.BOLD,16));
	gender.setBounds(60, 240, 150, 25);
	add(gender);
	
	JRadioButton male = new JRadioButton("Male");
	male.setBounds(220, 240, 80, 25);
	male.setBackground(Color.white);
	add(male);

	JRadioButton female = new JRadioButton("Female");
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
	
	JTextField tfphoneno = new JTextField();
	tfphoneno.setBounds(220, 280, 150, 25);		
	add(tfphoneno);
	
	JButton save = new JButton("Save");
	save.setBounds(220, 320, 150, 25);	
	save.setBackground(Color.black);
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
	
	
	public static void main(String[] args) {
	new AddCustomer();

	}

}
