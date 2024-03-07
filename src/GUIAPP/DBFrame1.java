//// 1. Import necessary packages and classes
//import java.sql.*;
//import java.util.Vector;
//import javax.swing.JOptionPane;
//import javax.swing.table.DefaultTableModel;
//
//// 2. Define the main class DBFrame
//public class DBFrame extends javax.swing.JFrame {
//
//    // 3. Declare instance variables for database connection and query
//    Connection con;
//    PreparedStatement ps;
//    ResultSet rs;
//
//    // 4. Constructor for initializing components and connecting to the database
//    public DBFrame() {
//        initComponents();
//        Connect();      // 4.1. Connect to the database
//        DisplayData();  // 4.2. Display existing data from the database
//        ClearData();    // 4.3. Clear input fields
//    }
//
//    // 5. Method to establish a connection to the MySQL database
//    public void Connect() {
//        try {
//            // 5.1. Load MySQL JDBC driver and establish the connection
//            Class.forName("com.mysql.cj.jdbc.Driver");
//            con = DriverManager.getConnection("jdbc:mysql://localhost/himalaya", "root", "");
//        } catch (Exception ex) {
//            ex.printStackTrace();
//        }
//    }
//
//    // 6. Method to display data in the JTable from the 'employee' table
//    public void DisplayData() {
//        try {
//            // 6.1. Get the table model and clear existing rows
//            DefaultTableModel dt = (DefaultTableModel) jTable1.getModel();
//            dt.setRowCount(0);
//
//            // 6.2. Prepare and execute a SELECT query to retrieve data from the 'employee' table
//            ps = con.prepareStatement("select * from employee");
//            rs = ps.executeQuery();
//
//            // 6.3. Iterate through the result set and add data to the table model
//            while (rs.next()) {
//                Vector v = new Vector();
//                v.add(rs.getInt(1));
//                v.add(rs.getString(2));
//                v.add(rs.getString(3));
//                v.add(rs.getString(4));
//
//                dt.addRow(v);
//            }
//
//        } catch (Exception ex) {
//            ex.printStackTrace();
//        }
//    }
//
//    // 7. Auto-generated GUI components
//    @SuppressWarnings("unchecked")
//    private void initComponents() {
//        // ... (component initialization code)
//
//        // 7.1. ActionListener for the "Insert" button
//        jButton1.addActionListener(new java.awt.event.ActionListener() {
//            public void actionPerformed(java.awt.event.ActionEvent evt) {
//                jButton1ActionPerformed(evt);  // 7.1.1. Call method for handling Insert button click
//            }
//        });
//
//        // 7.2. ActionListener for the "Update" button
//        jButton2.addActionListener(new java.awt.event.ActionListener() {
//            public void actionPerformed(java.awt.event.ActionEvent evt) {
//                jButton2ActionPerformed(evt);  // 7.2.1. Call method for handling Update button click
//            }
//        });
//
//        // 7.3. MouseListener for the JTable
//        jTable1.addMouseListener(new java.awt.event.MouseAdapter() {
//            public void mouseClicked(java.awt.event.MouseEvent evt) {
//                jTable1MouseClicked(evt);  // 7.3.1. Call method when a row in the table is clicked
//            }
//        });
//
//        // 7.4. ActionListener for the "Delete" button
//        jButton3.addActionListener(new java.awt.event.ActionListener() {
//            public void actionPerformed(java.awt.event.ActionEvent evt) {
//                jButton3ActionPerformed(evt);  // 7.4.1. Call method for handling Delete button click
//            }
//        });
//
//        // ... (layout and component placement code)
//    }
//
//    // 8. ActionListener method for the "Insert" button
//    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {
//        // 8.1. ... (code for handling data insertion)
//    }
//
//    // 9. ActionListener method for the "Update" button
//    private void jButton2ActionPerformed(java.awt.event.ActionEvent evt) {
//        // 9.1. ... (code for handling data update)
//    }
//
//    // 10. MouseListener method for the JTable
//    private void jTable1MouseClicked(java.awt.event.MouseEvent evt) {
//        // 10.1. ... (code for handling JTable row click and populating text fields)
//    }
//
//    // 11. ActionListener method for the "Delete" button
//    private void jButton3ActionPerformed(java.awt.event.ActionEvent evt) {
//        // 11.1. ... (code for handling data deletion)
//    }
//
//    // 12. Method to clear input fields
//    public void ClearData() {
//        jTextField1.setText("");
//        jTextField2.setText("");
//        jTextField3.setText("");
//        jTextField4.setText("");
//    }
//
//    // 13. Main method to start the application
//    public static void main(String args[]) {
//        java.awt.EventQueue.invokeLater(new Runnable() {
//            public void run() {
//                new DBFrame().setVisible(true);
//            }
//        });
//    }
//
//    // ... (GUI component declarations)
//}
