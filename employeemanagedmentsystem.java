package employeemanagementsystem;
import java.sql.*;

import javax.swing.*;


public class employeemanagedmentsystem {
	public static Connection connectDB() {
		try {
			Class.forName("org.sqlite.JDBC");
			Connection conn=DriverManager.getConnection
					("jdbc:sqlite:C:\\Users\\user\\eclipse-workspace\\employeemanagementsystem\\employee.db");
			JOptionPane.showMessageDialog(null,"Connection Made");
			return conn;
		}
		catch(Exception e) {
			JOptionPane.showMessageDialog(null,"Connection Error");
			return null;
		}
	}

}
