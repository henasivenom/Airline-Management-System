package AirlineSystem;

import java.awt.*;
import java.awt.event.*;
import java.net.URL;
import java.sql.*;
import javax.swing.*;
import javax.swing.JSpinner;
import javax.swing.SpinnerDateModel;
import net.proteanit.sql.DbUtils;
import java.util.Date;

public class BookFlight extends JFrame implements ActionListener {
	
	JTextField tfpnr, tfadhaar, tffname, tflname, tfnationality, tfaddress, tfphone;
	JComboBox<String> cbsource, cbdestination;
	JButton bookflight, fetchDetails, resetBtn;
	JLabel lblflightname;
	JSpinner spinnerDate;
	JLabel lblflightdisplay;
	
	public BookFlight() {
		setLayout(null);
		getContentPane().setBackground(Color.white);
		
		// Heading
		JLabel heading = new JLabel("Book Flight");
		heading.setBounds(220, 20, 500, 35);
		heading.setFont(new Font("Tahoma", Font.BOLD, 32));
		heading.setForeground(Color.blue);
		add(heading);
		
		// PNR Label and Field
		JLabel lblpnr = new JLabel("PNR Details");
		lblpnr.setBounds(60, 80, 100, 25);
		lblpnr.setFont(new Font("Tahoma", Font.BOLD, 14));
		add(lblpnr);
		
		tfpnr = new JTextField();
		tfpnr.setBounds(220, 80, 150, 25);
		add(tfpnr);
		
		// Aadhar Label and Field
		JLabel lbadhaar = new JLabel("Aadhar Number");
		lbadhaar.setBounds(60, 120, 150, 25);
		lbadhaar.setFont(new Font("Tahoma", Font.BOLD, 14));
		add(lbadhaar);
		
		tfadhaar = new JTextField();
		tfadhaar.setBounds(220, 120, 150, 25);
		add(tfadhaar);
		
		// Fetch Details Button
		fetchDetails = new JButton("Fetch Details");
		fetchDetails.setBounds(380, 120, 120, 25);
		fetchDetails.setBackground(Color.black);
		fetchDetails.setForeground(Color.white);
		fetchDetails.addActionListener(this);
		add(fetchDetails);
		
		// Date of Travel
		JLabel lblDate = new JLabel("Date of Travel");
		lblDate.setBounds(60, 160, 100, 25);
		lblDate.setFont(new Font("Tahoma", Font.BOLD, 14));
		add(lblDate);
		
		SpinnerDateModel dateModel = new SpinnerDateModel(new Date(), new Date(), null, java.util.Calendar.DAY_OF_MONTH);
		spinnerDate = new JSpinner(dateModel);
		JSpinner.DateEditor dateEditor = new JSpinner.DateEditor(spinnerDate, "yyyy-MM-dd");
		spinnerDate.setEditor(dateEditor);
		spinnerDate.setBounds(220, 160, 150, 25);
		add(spinnerDate);
		
		// Source Location
		JLabel lblSource = new JLabel("Source");
		lblSource.setBounds(60, 200, 100, 25);
		lblSource.setFont(new Font("Tahoma", Font.BOLD, 14));
		add(lblSource);
		
		cbsource = new JComboBox<>(new String[]{"Select Source", "Delhi", "Mumbai", "Bangalore", "Chennai"});
		cbsource.setBounds(220, 200, 150, 25);
		cbsource.setBackground(Color.white);
		cbsource.addActionListener(this);
		add(cbsource);
		
		// Destination Location
		JLabel lblDestination = new JLabel("Destination");
		lblDestination.setBounds(60, 240, 100, 25);
		lblDestination.setFont(new Font("Tahoma", Font.BOLD, 14));
		add(lblDestination);
		
		cbdestination = new JComboBox<>(new String[]{"Select Destination", "Delhi", "Mumbai", "Bangalore", "Chennai"});
		cbdestination.setBounds(220, 240, 150, 25);
		cbdestination.setBackground(Color.white);
		cbdestination.addActionListener(this);
		add(cbdestination);
		
		// Flight Display (Read-Only)
		JLabel lblflight = new JLabel("Flight");
		lblflight.setBounds(60, 280, 100, 25);
		lblflight.setFont(new Font("Tahoma", Font.BOLD, 14));
		add(lblflight);
		
		lblflightdisplay = new JLabel("");
		lblflightdisplay.setBounds(220, 280, 150, 25);
		lblflightdisplay.setFont(new Font("Tahoma", Font.BOLD, 12));
		lblflightdisplay.setForeground(Color.blue);
		add(lblflightdisplay);
		
		// First Name
		JLabel lbfname = new JLabel("First Name");
		lbfname.setBounds(60, 320, 100, 25);
		lbfname.setFont(new Font("Tahoma", Font.BOLD, 14));
		add(lbfname);
		
		tffname = new JTextField();
		tffname.setBounds(220, 320, 150, 25);
		add(tffname);
		
		// Last Name
		JLabel lblname = new JLabel("Last Name");
		lblname.setBounds(60, 360, 100, 25);
		lblname.setFont(new Font("Tahoma", Font.BOLD, 14));
		add(lblname);
		
		tflname = new JTextField();
		tflname.setBounds(220, 360, 150, 25);
		add(tflname);
		
		// Nationality
		JLabel lbnationality = new JLabel("Nationality");
		lbnationality.setBounds(60, 400, 100, 25);
		lbnationality.setFont(new Font("Tahoma", Font.BOLD, 14));
		add(lbnationality);
		
		tfnationality = new JTextField();
		tfnationality.setBounds(220, 400, 150, 25);
		add(tfnationality);
		
		// Address
		JLabel lbladdress = new JLabel("Address");
		lbladdress.setBounds(60, 440, 100, 25);
		lbladdress.setFont(new Font("Tahoma", Font.BOLD, 14));
		add(lbladdress);
		
		tfaddress = new JTextField();
		tfaddress.setBounds(220, 440, 150, 25);
		add(tfaddress);
		
		// Phone
		JLabel lblphone = new JLabel("Phone");
		lblphone.setBounds(60, 480, 100, 25);
		lblphone.setFont(new Font("Tahoma", Font.BOLD, 14));
		add(lblphone);
		
		tfphone = new JTextField();
		tfphone.setBounds(220, 480, 150, 25);
		add(tfphone);
		
		// Book Flight Button
		bookflight = new JButton("Book Flight");
		bookflight.setBounds(220, 520, 150, 25);
		bookflight.setBackground(Color.black);
		bookflight.setForeground(Color.white);
		bookflight.addActionListener(this);
		add(bookflight);
		
		// Reset Button
		resetBtn = new JButton("Reset");
		resetBtn.setBounds(380, 520, 120, 25);
		resetBtn.setBackground(Color.black);
		resetBtn.setForeground(Color.white);
		resetBtn.addActionListener(this);
		add(resetBtn);
		
		// Add image on the right side below flight details
		URL imgUrl = ClassLoader.getSystemResource("AirlineSystem/icons/details.jpg");
		ImageIcon imgIcon;
		if (imgUrl != null) {
			imgIcon = new ImageIcon(imgUrl);
		} else {
			imgIcon = new ImageIcon("src/AirlineSystem/icons/details.jpg");
		}
		Image img = imgIcon.getImage().getScaledInstance(300, 350, Image.SCALE_SMOOTH);
		JLabel imageLabel = new JLabel(new ImageIcon(img));
		imageLabel.setBounds(550, 220, 300, 350);
		add(imageLabel);
		
		setSize(900, 700);
		setLocation(300, 100);
		setVisible(true);
	}
	
	
	
	private String getFlightForRoute(String source, String destination) {
		String route = source + " to " + destination;
		
		if (route.equals("Delhi to Mumbai")) {
			return "AI 101";
		} else if (route.equals("Delhi to Bangalore")) {
			return "AI 102";
		} else if (route.equals("Delhi to Chennai")) {
			return "AI 103";
		} else if (route.equals("Mumbai to Delhi")) {
			return "AI 101";
		} else if (route.equals("Mumbai to Bangalore")) {
			return "AI 102";
		} else if (route.equals("Bangalore to Delhi")) {
			return "AI 102";
		} else if (route.equals("Chennai to Delhi")) {
			return "AI 103";
		}
		return "NO_FLIGHT";
	}
	
	private void updateFlightByRoute() {
		String source = (String) cbsource.getSelectedItem();
		String destination = (String) cbdestination.getSelectedItem();
		
		if (source.equals("Select Source") || destination.equals("Select Destination")) {
			lblflightdisplay.setText("");
			return;
		}
		
		// Route to Flight mapping
		String route = source + " to " + destination;
		
		if (route.equals("Delhi to Mumbai")) {
			lblflightdisplay.setText("AI 101");
		} else if (route.equals("Delhi to Bangalore")) {
			lblflightdisplay.setText("AI 102");
		} else if (route.equals("Delhi to Chennai")) {
			lblflightdisplay.setText("AI 103");
		} else if (route.equals("Mumbai to Delhi")) {
			lblflightdisplay.setText("AI 101");
		} else if (route.equals("Mumbai to Bangalore")) {
			lblflightdisplay.setText("AI 102");
		} else if (route.equals("Bangalore to Delhi")) {
			lblflightdisplay.setText("AI 102");
		} else if (route.equals("Chennai to Delhi")) {
			lblflightdisplay.setText("AI 103");
		} else {
			lblflightdisplay.setText("No flight");
		}
	}
	
	public void actionPerformed(ActionEvent ae) {
		if (ae.getSource() == fetchDetails) {
			String aadhar = tfadhaar.getText();
			try {
				Conn conn = new Conn();
				if (!conn.isConnected) {
					JOptionPane.showMessageDialog(null, "Database connection failed.");
					return;
				}
				String query = "select * from passenger where aadhar = '" + aadhar + "'";
				ResultSet rs = conn.s.executeQuery(query);
				
				if (rs.next()) {
					tffname.setText(rs.getString("fname"));
					tflname.setText(rs.getString("lname"));
					tfnationality.setText(rs.getString("nationality"));
					tfaddress.setText(rs.getString("address"));
					tfphone.setText(rs.getString("phone"));
				} else {
					JOptionPane.showMessageDialog(null, "Passenger not found. Please add customer details first.");
				}
			} catch (Exception e) {
				JOptionPane.showMessageDialog(null, "Error: " + e.getMessage());
			}
		} 
		else if (ae.getSource() == cbsource || ae.getSource() == cbdestination) {
			updateFlightByRoute();
		}
		else if (ae.getSource() == bookflight) {
			String aadhar = tfadhaar.getText();
			String source = (String) cbsource.getSelectedItem();
			String destination = (String) cbdestination.getSelectedItem();
			
			if (source.equals("Select Source") || destination.equals("Select Destination")) {
				JOptionPane.showMessageDialog(null, "Please select source and destination.");
				return;
			}
			
			// Determine flight based on route
			String flight = getFlightForRoute(source, destination);
			
			try {
				Conn conn = new Conn();
				if (!conn.isConnected) {
					JOptionPane.showMessageDialog(null, "Database connection failed.");
					return;
				}
				String query = "insert into booking (aadhar, flight, fname, lname, nationality, address, phone) values ('" 
					+ aadhar + "', '" + flight + "', '" + tffname.getText() + "', '" + tflname.getText() + "', '" 
					+ tfnationality.getText() + "', '" + tfaddress.getText() + "', '" + tfphone.getText() + "')";
				conn.s.executeUpdate(query);
				JOptionPane.showMessageDialog(null, "Flight booked successfully!");
				setVisible(false);
			} catch (Exception e) {
				JOptionPane.showMessageDialog(null, "Error: " + e.getMessage());
			}
		} 
		else if (ae.getSource() == resetBtn) {
			tfpnr.setText("");
			tfadhaar.setText("");
			tffname.setText("");
			tflname.setText("");
			tfnationality.setText("");
			tfaddress.setText("");
			tfphone.setText("");
			cbsource.setSelectedIndex(0);
			cbdestination.setSelectedIndex(0);
			lblflightdisplay.setText("");
		}
	}
	
	public static void main(String[] args) {
		new BookFlight();
	}
}
