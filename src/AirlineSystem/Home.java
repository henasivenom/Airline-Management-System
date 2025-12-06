package AirlineSystem;

import java.awt.*;
import java.awt.event.*;
import java.net.URL;
import javax.swing.*;

public class Home extends JFrame implements ActionListener{
	public Home() {
	setLayout(null);
	
	URL imgUrl = ClassLoader.getSystemResource("AirlineSystem/icons/front.jpg");
	ImageIcon i1;
	if (imgUrl != null) {
		i1 = new ImageIcon(imgUrl);
	} else {
		// fallback to filesystem path
		i1 = new ImageIcon("src/AirlineSystem/icons/front.jpg");
	}
	JLabel image = new JLabel(i1);
	image.setBounds(0, 0, 1600, 800);
	add(image);
	
	JLabel heading = new JLabel("Air India Welcomes You...");
	heading.setBounds(500, 20, 1000, 40);
	heading.setForeground(Color.blue);
	heading.setFont(new Font("Tahoma", Font.BOLD,36));
	image.add(heading);
	
	JMenuBar menubar = new JMenuBar();
	setJMenuBar(menubar);
	
	JMenu details = new JMenu("Details");
	menubar.add(details);
	
	JMenuItem flightdetails = new JMenuItem("Flight Details");
	flightdetails.addActionListener(this);
	details.add(flightdetails);
	
	JMenuItem customerdetails = new JMenuItem("Add Customer Details");
	customerdetails.addActionListener(this);
	details.add(customerdetails);
	
	JMenuItem bookflight = new JMenuItem("Book Flight");
	details.add(bookflight);
	
	JMenuItem journeydetails = new JMenuItem("Flight Details");
	details.add(journeydetails);
	
	JMenuItem ticketCancellation = new JMenuItem("Cancel Ticket");
	details.add(ticketCancellation);
	
	JMenu ticket = new JMenu("Ticket");
	menubar.add(ticket);
	
	JMenuItem boardingpass = new JMenuItem("Boarding Pass");
	ticket.add(boardingpass);
	
	
	
	
	setExtendedState(JFrame.MAXIMIZED_BOTH);
	setVisible(true);
}
	
	public void actionPerformed(ActionEvent ae) {
		String text = ae.getActionCommand();
		
		if(text.equals("Add Customer Details")) {
			new AddCustomer();
		}
		else if(text.equals("Flight Details")) {
			new FlightInfo();
		}
		
		
		}
	public static void main(String[] args) {
		new Home();
		}
}
