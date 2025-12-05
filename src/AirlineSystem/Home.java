package AirlineSystem;

import java.awt.*;
import javax.swing.*;

public class Home extends JFrame {
	public Home() {
	setLayout(null);
	
	ImageIcon i1 = new ImageIcon(ClassLoader.getSystemResource("AirlineSystem/icons/front.jpg"));	
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
	details.add(flightdetails);
	
	JMenuItem customerdetails = new JMenuItem("Add Customer Details");
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
	public static void main(String[] args) {
		new Home();
		}
}
