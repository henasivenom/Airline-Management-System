package AirlineSystem;

import java.awt.Color;
import java.sql.*;
import javax.swing.*;
import net.proteanit.sql.DbUtils;

public class FlightInfo extends JFrame{
	public FlightInfo() {
		setLayout(null);
		getContentPane().setBackground(Color.white);
		
		JTable table = new JTable();
		
		try {
			Conn conn = new Conn();
			
			ResultSet rs = conn.s.executeQuery("select * from flight");
			table.setModel(DbUtils.resultSetToTableModel(rs));
		}
		catch(Exception e) {
			e.printStackTrace();
		}
		
		table.setBounds(0, 0, 800, 500);
		add(table);
		
		JScrollPane jdp = new JScrollPane();
		add(jdp);
		
		setLocation(400,200);
		setSize(800,500);
		setVisible(true);
		
	}

	public static void main(String[] args) {
	

	}

}
