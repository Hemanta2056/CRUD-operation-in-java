package GUIAPP;

import java.sql.*;
import java.util.Vector;
import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;

public class DBFrame extends javax.swing.JFrame {
	public DBFrame() {
		initComponents();
		Connect();
		DisplayData();
		ClearData();
	}

	Connection con;
	PreparedStatement ps;
	ResultSet rs;

	public void Connect() {
		try {
			Class.forName("com.mysql.cj.jdbc.Driver");
			con = DriverManager.getConnection("jdbc:mysql://localhost/himalaya", "root", "");
		} catch (Exception ex) {
			ex.printStackTrace();
		}
	}

	public void DisplayData() {
		try {
			DefaultTableModel dt = (DefaultTableModel) jTable1.getModel();
			dt.setRowCount(0);
			ps = con.prepareStatement("select * from employee");
			rs = ps.executeQuery();

			while (rs.next()) {
				Vector v = new Vector();
				v.add(rs.getInt(1));
				v.add(rs.getString(2));
				v.add(rs.getString(3));
				v.add(rs.getString(4));

				dt.addRow(v);
			}

		} catch (Exception ex) {
			ex.printStackTrace();
		}
	}

	@SuppressWarnings("unchecked")
// <editor-fold defaultstate="collapsed" desc="Generated Code">
	private void initComponents() {

		jLabel1 = new javax.swing.JLabel();
		jLabel2 = new javax.swing.JLabel();
		jLabel3 = new javax.swing.JLabel();
		jLabel4 = new javax.swing.JLabel();
		jLabel5 = new javax.swing.JLabel();
		jTextField1 = new javax.swing.JTextField();
		jTextField2 = new javax.swing.JTextField();
		jTextField3 = new javax.swing.JTextField();
		jTextField4 = new javax.swing.JTextField();
		jButton1 = new javax.swing.JButton();
		jButton2 = new javax.swing.JButton();
		jButton3 = new javax.swing.JButton();
		jScrollPane1 = new javax.swing.JScrollPane();
		jTable1 = new javax.swing.JTable();

		setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
		setTitle("CRUD Operation in GUI");

		jLabel1.setFont(new java.awt.Font("Segoe UI", 0, 18)); // NOI18N
		jLabel1.setForeground(new java.awt.Color(255, 0, 51));
		jLabel1.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
		jLabel1.setText("GUI Based CRUD Operation");

		jLabel2.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
		jLabel2.setText("Employee ID");

		jLabel3.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
		jLabel3.setText("Employee Name");

		jLabel4.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
		jLabel4.setText("Employee Address");

		jLabel5.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
		jLabel5.setText("Employee Salary");
		jTextField1.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
		jTextField2.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
		jTextField3.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
		jTextField4.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
		jButton1.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
		jButton1.setText("Insert");
		jButton1.addActionListener(new java.awt.event.ActionListener() {
			public void actionPerformed(java.awt.event.ActionEvent evt) {
				jButton1ActionPerformed(evt);
			}
		});

		jButton2.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
		jButton2.setText("Update");
		jButton2.addActionListener(new java.awt.event.ActionListener() {
			public void actionPerformed(java.awt.event.ActionEvent evt) {
				jButton2ActionPerformed(evt);
			}
		});

		jButton3.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
		jButton3.setText("Delete");
		jButton3.addActionListener(new java.awt.event.ActionListener() {
			public void actionPerformed(java.awt.event.ActionEvent evt) {
				jButton3ActionPerformed(evt);
			}
		});
		jTable1.setModel(
				new javax.swing.table.DefaultTableModel(
						new Object[][] { { null, null, null, null }, { null, null, null, null },
								{ null, null, null, null }, { null, null, null, null } },
						new String[] { "EID", "Name", "Address", "Salary" }));
		jTable1.addMouseListener(new java.awt.event.MouseAdapter() {
			public void mouseClicked(java.awt.event.MouseEvent evt) {
				jTable1MouseClicked(evt);
			}
		});
		jScrollPane1.setViewportView(jTable1);

		javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
		getContentPane().setLayout(layout);
		layout.setHorizontalGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING).addGroup(layout
				.createSequentialGroup().addGap(47, 47, 47)
				.addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
						.addGroup(layout.createSequentialGroup().addComponent(jButton1).addGap(44, 44, 44)
								.addComponent(jButton2).addGap(42, 42, 42).addComponent(jButton3))
						.addGroup(layout.createSequentialGroup().addGroup(layout
								.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
								.addComponent(jLabel4, javax.swing.GroupLayout.DEFAULT_SIZE, 135, Short.MAX_VALUE)
								.addComponent(jLabel2, javax.swing.GroupLayout.DEFAULT_SIZE,
										javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
								.addComponent(jLabel3, javax.swing.GroupLayout.DEFAULT_SIZE,
										javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
								.addComponent(jLabel5, javax.swing.GroupLayout.DEFAULT_SIZE,
										javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
								.addGap(55, 55, 55)
								.addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
										.addComponent(jLabel1)
										.addGroup(layout
												.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
												.addComponent(jTextField4, javax.swing.GroupLayout.Alignment.LEADING,
														javax.swing.GroupLayout.DEFAULT_SIZE, 155, Short.MAX_VALUE)
												.addComponent(jTextField3, javax.swing.GroupLayout.Alignment.LEADING)
												.addComponent(jTextField2, javax.swing.GroupLayout.Alignment.LEADING)
												.addComponent(jTextField1,
														javax.swing.GroupLayout.Alignment.LEADING)))))
				.addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 27, Short.MAX_VALUE)
				.addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 371,
						javax.swing.GroupLayout.PREFERRED_SIZE)
				.addGap(66, 66, 66)));
		layout.setVerticalGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING).addGroup(layout
				.createSequentialGroup()
				.addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING).addGroup(layout
						.createSequentialGroup().addGap(203, 203, 203)
						.addComponent(jTextField3, javax.swing.GroupLayout.PREFERRED_SIZE,
								javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
						.addGap(18, 18, 18)
						.addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
								.addComponent(jLabel5).addComponent(jTextField4, javax.swing.GroupLayout.PREFERRED_SIZE,
										javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
						.addGap(62, 62, 62)
						.addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
								.addComponent(jButton1).addComponent(jButton2).addComponent(jButton3)))
						.addGroup(
								layout.createSequentialGroup().addGap(44, 44, 44).addComponent(jLabel1)
										.addGap(33, 33, 33)
										.addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
												.addGroup(layout.createSequentialGroup().addGroup(layout
														.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
														.addComponent(jLabel2).addComponent(jTextField1,
																javax.swing.GroupLayout.PREFERRED_SIZE,
																javax.swing.GroupLayout.DEFAULT_SIZE,
																javax.swing.GroupLayout.PREFERRED_SIZE))
														.addGap(24, 24, 24)
														.addGroup(layout
																.createParallelGroup(
																		javax.swing.GroupLayout.Alignment.BASELINE)
																.addComponent(jLabel3).addComponent(jTextField2,
																		javax.swing.GroupLayout.PREFERRED_SIZE,
																		javax.swing.GroupLayout.DEFAULT_SIZE,
																		javax.swing.GroupLayout.PREFERRED_SIZE))
														.addGap(18, 18, 18).addComponent(jLabel4))
												.addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 374,
														javax.swing.GroupLayout.PREFERRED_SIZE))))
				.addContainerGap(32, Short.MAX_VALUE)));
		pack();
	}// </editor-fold>

	private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {
		try {
			if (jTextField1.getText().equals("") && jTextField2.getText().equals("") && jTextField3.getText().equals("")
					&& jTextField4.getText().equals("")) {
				JOptionPane.showMessageDialog(rootPane, "Please Select the field");
			} else {
				int id = Integer.parseInt(jTextField1.getText());
				String name = jTextField2.getText();
				String address = jTextField3.getText();
				String salary = jTextField4.getText();

				ps = con.prepareStatement("insert into employee values(?,?,?,?)");
				ps.setInt(1, id);
				ps.setString(2, name);
				ps.setString(3, address);
				ps.setString(4, salary);
				int row = ps.executeUpdate();
				if (row > 0) {
					JOptionPane.showMessageDialog(rootPane, "Data Inserted Successfully");
				} else {
					JOptionPane.showMessageDialog(rootPane, "Error in Insertion");
				}

				DisplayData();
				ClearData();
			}
		} catch (Exception ex) {
			ex.printStackTrace();
		}
	}

	private void jButton2ActionPerformed(java.awt.event.ActionEvent evt) {
		try {
			if (jTextField1.getText().equals("")) {
				JOptionPane.showMessageDialog(rootPane, "Please Select The EID First");
			} else {

				int id = Integer.parseInt(jTextField1.getText());
				String name = jTextField2.getText();
				String address = jTextField3.getText();
				String salary = jTextField4.getText();
				ps = con.prepareStatement("update employee set Name=?,Address=?,Salary=? where Eid=?");
				ps.setString(1, name);
				ps.setString(2, address);
				ps.setString(3, salary);
				ps.setInt(4, id);
				int row = ps.executeUpdate();
				if (row > 0) {
					JOptionPane.showMessageDialog(rootPane, "Data updated Successfully");
				} else {
					JOptionPane.showMessageDialog(rootPane, "Error in Update");
				}

				DisplayData();
				ClearData();

			}
		} catch (Exception ex) {
			ex.printStackTrace();
		}
	}

	private void jTable1MouseClicked(java.awt.event.MouseEvent evt) {
		DefaultTableModel dt = (DefaultTableModel) jTable1.getModel();
		int rowindex = jTable1.getSelectedRow();
		jTextField1.setText(dt.getValueAt(rowindex, 0).toString());
		jTextField2.setText(dt.getValueAt(rowindex, 1).toString());
		jTextField3.setText(dt.getValueAt(rowindex, 2).toString());
		jTextField4.setText(dt.getValueAt(rowindex, 3).toString());
	}

	private void jButton3ActionPerformed(java.awt.event.ActionEvent evt) {
		try {
			if (jTextField1.getText().equals("")) {
				JOptionPane.showMessageDialog(rootPane, "Please Select Eid");
			} else {
				int id = Integer.parseInt(jTextField1.getText());
				ps = con.prepareStatement("delete from employee where Eid=?");
				ps.setInt(1, id);

				int row = ps.executeUpdate();
				if (row > 0) {
					JOptionPane.showMessageDialog(rootPane, "Data Deleted Successfully");
				} else {
					JOptionPane.showMessageDialog(rootPane, "Error in Deletion");
				}
				DisplayData();
				ClearData();
			}
		} catch (Exception ex) {
			ex.printStackTrace();
		}
	}

	public void ClearData() {
		jTextField1.setText("");
		jTextField2.setText("");
		jTextField3.setText("");
		jTextField4.setText("");
	}

	public static void main(String args[]) {
		java.awt.EventQueue.invokeLater(new Runnable() {
			public void run() {
				new DBFrame().setVisible(true);
			}
		});
	}

	private javax.swing.JButton jButton1;
	private javax.swing.JButton jButton2;
	private javax.swing.JButton jButton3;
	private javax.swing.JLabel jLabel1;
	private javax.swing.JLabel jLabel2;
	private javax.swing.JLabel jLabel3;
	private javax.swing.JLabel jLabel4;
	private javax.swing.JLabel jLabel5;
	private javax.swing.JScrollPane jScrollPane1;
	private javax.swing.JTable jTable1;
	private javax.swing.JTextField jTextField1;
	private javax.swing.JTextField jTextField2;
	private javax.swing.JTextField jTextField3;
	private javax.swing.JTextField jTextField4;
}
