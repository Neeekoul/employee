package employeemanagementsystem;

import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JTextField;
import javax.swing.JButton;
import javax.swing.JTable;
import javax.swing.JScrollPane;
import java.awt.Font;
import javax.swing.table.DefaultTableModel;
import java.awt.event.ActionListener;
import java.io.IOException;
import java.text.MessageFormat;
import java.util.jar.JarException;
import java.awt.event.ActionEvent;
import java.sql.*;

import javax.swing.*;


public class emplyee {

	protected static final String JOptionPanel = null;
	private JFrame frame;
	private JTextField txtEmployeeID;
	private JTable table;
	private JTextField jtxtNINumber;
	private JTextField jtxtFirstname;
	private JTextField jtxtSurname;
	private JTextField jtxtGender;
	private JTextField jtxtDOB;
	private JTextField jtxtAge;
	private JTextField jtxtSalary;
	Connection conn=null;
	PreparedStatement pst=null;
	ResultSet rs=null;
	
	
	DefaultTableModel model=new DefaultTableModel();
	private Object employeemanagedmentsystem;
	public void upadateTable() {
		
		if(conn !=null) {
			String sql="Select EmpID,NINumber,Firstname,Surname,Gender,DOB,Age,Salary";
	
		try {
			pst=conn.prepareStatement(sql);
			rs=pst.executeQuery();
			Object[] columnData=new Object[8];
			while(rs.next()) {
				columnData [0]=rs.getString("EmpID");
				columnData [0]=rs.getString("NINumber");
				columnData [0]=rs.getString("Firstname");
				columnData [0]=rs.getString("Surname");
				columnData [0]=rs.getString("Gender");
				columnData [0]=rs.getString("DOB");
				columnData [0]=rs.getString("Age");
				columnData [0]=rs.getString("Salary");
				model.addRow(columnData);
				
				 
			}
			
		}
		catch(Exception e) {
			Object JOptionPane = showMessageDialog(null,e);
		}
		
		}
	}
	private Object showMessageDialog(Object object, Exception e) {
		// TODO Auto-generated method stub
		return null;
	}
	/**
	 * Launch the application.
	 */


 static void main(String[] args){
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					emplyee window = new emplyee();
					window.frame.setVisible(true);
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
 }

	/**
	 * Create the application.
	 */
	public emplyee() {
		initialize();
			
		Object col[]= {"EmpID","NINumber","Firstname","Surname","Gender","DOB","Age","Salary"};
		model.setColumnIdentifiers(col);
		
	}


	
/**
	 * Initialize the contents of the frame.
	 */

	private void initialize() {
		frame = new JFrame();
		frame.setBounds(0, 0, 1450, 800);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame.getContentPane().setLayout(null);
		
		JLabel lblNewLabel = new JLabel("Employee ID");
		lblNewLabel.setFont(new Font("Tahoma", Font.PLAIN, 18));
		lblNewLabel.setBounds(109, 50, 192, 31);
		frame.getContentPane().add(lblNewLabel);
		
		txtEmployeeID = new JTextField();
		txtEmployeeID.setFont(new Font("Tahoma", Font.PLAIN, 18));
		txtEmployeeID.setBounds(393, 33, 260, 47);
		frame.getContentPane().add(txtEmployeeID);
		txtEmployeeID.setColumns(10);
		
		JScrollPane scrollPane = new JScrollPane();
		scrollPane.setBounds(677, 61, 450, 395);
		frame.getContentPane().add(scrollPane);
		
		table = new JTable();
		table.setModel(new DefaultTableModel(
			new Object[][] {
			},
			new String[] {
				"EmpID", "NINumber", "Firstname", "Surname", "Gender", "DOB", "Age", "Salary"
			}
		));
		table.setFont(new Font("Tahoma", Font.BOLD, 14));
		scrollPane.setViewportView(table);
		
		JLabel lblNewLabel_1 = new JLabel("NI Number");
		lblNewLabel_1.setFont(new Font("Tahoma", Font.PLAIN, 18));
		lblNewLabel_1.setBounds(109, 108, 192, 31);
		frame.getContentPane().add(lblNewLabel_1);
		
		jtxtNINumber = new JTextField();
		jtxtNINumber.setFont(new Font("Tahoma", Font.PLAIN, 18));
		jtxtNINumber.setColumns(10);
		jtxtNINumber.setBounds(393, 100, 260, 47);
		frame.getContentPane().add(jtxtNINumber);
		
		JLabel lblNewLabel_1_1 = new JLabel("Firstname");
		lblNewLabel_1_1.setFont(new Font("Tahoma", Font.PLAIN, 18));
		lblNewLabel_1_1.setBounds(109, 164, 192, 31);
		frame.getContentPane().add(lblNewLabel_1_1);
		
		JLabel lblNewLabel_1_2 = new JLabel("Surname");
		lblNewLabel_1_2.setFont(new Font("Tahoma", Font.PLAIN, 18));
		lblNewLabel_1_2.setBounds(109, 223, 192, 31);
		frame.getContentPane().add(lblNewLabel_1_2);
		
		JLabel lblNewLabel_1_3 = new JLabel("Gender");
		lblNewLabel_1_3.setFont(new Font("Tahoma", Font.PLAIN, 18));
		lblNewLabel_1_3.setBounds(109, 263, 192, 31);
		frame.getContentPane().add(lblNewLabel_1_3);
		
		JLabel lblNewLabel_1_4 = new JLabel("DOB");
		lblNewLabel_1_4.setFont(new Font("Tahoma", Font.PLAIN, 18));
		lblNewLabel_1_4.setBounds(109, 292, 192, 31);
		frame.getContentPane().add(lblNewLabel_1_4);
		
		JLabel lblNewLabel_1_5 = new JLabel("Age");
		lblNewLabel_1_5.setFont(new Font("Tahoma", Font.PLAIN, 18));
		lblNewLabel_1_5.setBounds(109, 319, 192, 31);
		frame.getContentPane().add(lblNewLabel_1_5);
		
		JLabel lblNewLabel_1_6 = new JLabel("Salary");
		lblNewLabel_1_6.setFont(new Font("Tahoma", Font.PLAIN, 18));
		lblNewLabel_1_6.setBounds(109, 360, 192, 31);
		frame.getContentPane().add(lblNewLabel_1_6);
		
		jtxtFirstname = new JTextField();
		jtxtFirstname.setFont(new Font("Tahoma", Font.PLAIN, 18));
		jtxtFirstname.setColumns(10);
		jtxtFirstname.setBounds(393, 157, 260, 47);
		frame.getContentPane().add(jtxtFirstname);
		
		jtxtSurname = new JTextField();
		jtxtSurname.setFont(new Font("Tahoma", Font.PLAIN, 18));
		jtxtSurname.setColumns(10);
		jtxtSurname.setBounds(393, 215, 260, 47);
		frame.getContentPane().add(jtxtSurname);
		
		jtxtGender = new JTextField();
		jtxtGender.setFont(new Font("Tahoma", Font.PLAIN, 18));
		jtxtGender.setColumns(10);
		jtxtGender.setBounds(393, 276, 260, 47);
		frame.getContentPane().add(jtxtGender);
		
		jtxtDOB = new JTextField();
		jtxtDOB.setFont(new Font("Tahoma", Font.PLAIN, 18));
		jtxtDOB.setColumns(10);
		jtxtDOB.setBounds(393, 333, 260, 47);
		frame.getContentPane().add(jtxtDOB);
		
		jtxtAge = new JTextField();
		jtxtAge.setFont(new Font("Tahoma", Font.PLAIN, 18));
		jtxtAge.setColumns(10);
		jtxtAge.setBounds(403, 390, 260, 47);
		frame.getContentPane().add(jtxtAge);
		
		jtxtSalary = new JTextField();
		jtxtSalary.setFont(new Font("Tahoma", Font.PLAIN, 18));
		jtxtSalary.setColumns(10);
		jtxtSalary.setBounds(403, 457, 260, 47);
		frame.getContentPane().add(jtxtSalary);
		
		JButton btnAddNew = new JButton("Add New");
		btnAddNew.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				String sql="Insert into employee(EMpID,NINumber,Firstname,Surname,Gender,DOB,Age,Salary)VALUES(?,?,?,?,?,?,?,?)";
				try
				{
					pst=conn.prepareStatement(sql);
					JLabel jtxtEmployeeID;
					pst.setString(1,jtxtEmployeeID.getText());
					pst.setString(2,jtxtNINumber.getText());
					pst.setString(3,jtxtFirstname.getText());
					pst.setString(4,jtxtSurname.getText());
					pst.setString(5,jtxtGender.getText());
					pst.setString(6,jtxtDOB.getText());
					pst.setString(7,jtxtAge.getText());
					pst.setString(8,jtxtSalary.getText());
					pst.execute();
					rs.close();
					pst.close();
				}
				catch(Exception ev) {
					JOptionPane.showMessageDialog(null,"System Update Completed");
			}
			DefaultTableModel model	= (DefaultTableModel) table.getModel();
			
			
			}});
		

		btnAddNew.setFont(new Font("Tahoma", Font.PLAIN, 18));
		btnAddNew.setBounds(348, 637, 105, 21);
		frame.getContentPane().add(btnAddNew);
		
		JButton btnNewButton_1_1 = new JButton("Print");
		btnNewButton_1_1.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				MessageFormat header=newMessageFormat("Printing in Progress");
				MessageFormat footer=newMessageFormat("Page{0,Number,integer}");
				
				try 
				{
					table.print();
				}
				catch(java.awt.print.PrinterException ev) {
					System.err.format("No Printer found",ev.getMessage());
				}
				
			}

			private MessageFormat newMessageFormat(String string) {
				// TODO Auto-generated method stub
				return null;
			}
		});
		btnNewButton_1_1.setFont(new Font("Tahoma", Font.PLAIN, 18));
		btnNewButton_1_1.setBounds(474, 634, 85, 21);
		frame.getContentPane().add(btnNewButton_1_1);
		
		JButton btnNewButton_1_2 = new JButton("Reset");
		btnNewButton_1_2.addActionListener(new ActionListener() {
			

			public void actionPerformed(ActionEvent e) {
				txtEmployeeID.setText(null);
				jtxtNINumber.setText(null);
				jtxtFirstname.setText(null);
				jtxtSurname.setText(null);
				jtxtGender.setText(null);
				jtxtDOB.setText(null);
				jtxtAge.setText(null);
				jtxtSalary.setText(null);
				
				
				
			}
		});
		btnNewButton_1_2.setFont(new Font("Tahoma", Font.PLAIN, 18));
		btnNewButton_1_2.setBounds(597, 634, 85, 21);
		frame.getContentPane().add(btnNewButton_1_2);
		
		JButton btnNewButton_1_2_1 = new JButton("New button");
		btnNewButton_1_2_1.setFont(new Font("Tahoma", Font.PLAIN, 18));
		btnNewButton_1_2_1.setBounds(793, 684, 85, 0);
		frame.getContentPane().add(btnNewButton_1_2_1);
		
		JButton btnNewButton_1_2_2 = new JButton("Exit");
		btnNewButton_1_2_2.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				frame=new JFrame("Exit");
				if (JOptionPane.showConfirmDialog(frame,"Confirm if you want to exit","Employee Database System",
					JOptionPane.YES_NO_OPTION)==JOptionPane.YES_NO_OPTION) {
					System.exit(0);
				}
			}
		});
		btnNewButton_1_2_2.setFont(new Font("Tahoma", Font.PLAIN, 18));
		btnNewButton_1_2_2.setBounds(739, 634, 85, 21);
		frame.getContentPane().add(btnNewButton_1_2_2);
	}

