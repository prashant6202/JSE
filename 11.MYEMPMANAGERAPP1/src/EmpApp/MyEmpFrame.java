/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package EmpApp;

import java.awt.Color;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import javax.swing.JOptionPane;

/**
 *
 * @author HP
 */
public class MyEmpFrame extends javax.swing.JFrame {
private Connection conn;
private PreparedStatement ps;
    public MyEmpFrame() {
        super("Emp Management App");
        initComponents();
        super.setLocationRelativeTo(null);
        connectDB();
        myPanel.setBackground(Color.CYAN);
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        myPanel = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jScrollPane1 = new javax.swing.JScrollPane();
        txtEmpNo = new javax.swing.JTextPane();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        jScrollPane2 = new javax.swing.JScrollPane();
        txtEmpName = new javax.swing.JTextPane();
        jScrollPane3 = new javax.swing.JScrollPane();
        txtEmpSalary = new javax.swing.JTextPane();
        btnAddRecord = new javax.swing.JButton();
        btnShowRecords = new javax.swing.JButton();
        jScrollPane4 = new javax.swing.JScrollPane();
        txtShowAll = new javax.swing.JTextArea();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jLabel1.setFont(new java.awt.Font("Tahoma", 1, 24)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(255, 0, 0));
        jLabel1.setText("EMPLOYEES MANAGEMENT APP");

        jLabel2.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        jLabel2.setText("Employee No");

        txtEmpNo.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        jScrollPane1.setViewportView(txtEmpNo);

        jLabel3.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        jLabel3.setText("Employee Name");

        jLabel4.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        jLabel4.setText("Employee Salary");

        txtEmpName.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        jScrollPane2.setViewportView(txtEmpName);

        txtEmpSalary.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        jScrollPane3.setViewportView(txtEmpSalary);

        btnAddRecord.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        btnAddRecord.setText("Add Record");
        btnAddRecord.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnAddRecordActionPerformed(evt);
            }
        });

        btnShowRecords.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        btnShowRecords.setText("Show Records");
        btnShowRecords.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnShowRecordsActionPerformed(evt);
            }
        });

        txtShowAll.setEditable(false);
        txtShowAll.setColumns(20);
        txtShowAll.setFont(new java.awt.Font("Tahoma", 1, 22)); // NOI18N
        txtShowAll.setRows(5);
        jScrollPane4.setViewportView(txtShowAll);

        javax.swing.GroupLayout myPanelLayout = new javax.swing.GroupLayout(myPanel);
        myPanel.setLayout(myPanelLayout);
        myPanelLayout.setHorizontalGroup(
            myPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(myPanelLayout.createSequentialGroup()
                .addGap(145, 145, 145)
                .addComponent(jLabel1)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, myPanelLayout.createSequentialGroup()
                .addGap(90, 90, 90)
                .addGroup(myPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(jScrollPane4)
                    .addGroup(javax.swing.GroupLayout.Alignment.LEADING, myPanelLayout.createSequentialGroup()
                        .addComponent(btnAddRecord, javax.swing.GroupLayout.PREFERRED_SIZE, 201, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 65, Short.MAX_VALUE)
                        .addComponent(btnShowRecords, javax.swing.GroupLayout.PREFERRED_SIZE, 194, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(myPanelLayout.createSequentialGroup()
                        .addComponent(jLabel4)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(jScrollPane3, javax.swing.GroupLayout.PREFERRED_SIZE, 212, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(javax.swing.GroupLayout.Alignment.LEADING, myPanelLayout.createSequentialGroup()
                        .addComponent(jLabel3)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(jScrollPane2, javax.swing.GroupLayout.PREFERRED_SIZE, 212, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(javax.swing.GroupLayout.Alignment.LEADING, myPanelLayout.createSequentialGroup()
                        .addComponent(jLabel2)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 212, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addGap(119, 119, 119))
        );
        myPanelLayout.setVerticalGroup(
            myPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(myPanelLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel1)
                .addGap(77, 77, 77)
                .addGroup(myPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(jScrollPane1)
                    .addComponent(jLabel2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addGap(53, 53, 53)
                .addGroup(myPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(jScrollPane2)
                    .addComponent(jLabel3, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addGap(49, 49, 49)
                .addGroup(myPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(jScrollPane3)
                    .addComponent(jLabel4, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addGap(69, 69, 69)
                .addGroup(myPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(btnAddRecord)
                    .addComponent(btnShowRecords))
                .addGap(30, 30, 30)
                .addComponent(jScrollPane4, javax.swing.GroupLayout.PREFERRED_SIZE, 291, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(34, Short.MAX_VALUE))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(myPanel, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(myPanel, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void btnAddRecordActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnAddRecordActionPerformed
       boolean result=validateInputs();
      if(!result){
       JOptionPane.showMessageDialog(null, "Plese! fill the all data");
       return;
      }
       try {
      int empNo=Integer.parseInt(txtEmpNo.getText().trim());
      String empName=txtEmpName.getText().trim();
      double empSalary=Double.parseDouble(txtEmpSalary.getText().trim());
      ps.setInt(1, empNo);
      ps.setString(2, empName);
      ps.setDouble(3, empSalary);
      int ans=ps.executeUpdate();
      if(ans==1){
      JOptionPane.showMessageDialog(null, "Record inseted");
      clearAll();
      }
    } catch (SQLException ex) {
       JOptionPane.showMessageDialog(null, "Sorry! can not connect to the Database");
       ex.printStackTrace(); 
    }
     catch(NumberFormatException ex){
     JOptionPane.showMessageDialog(null,"Plese input NUMERIC value" );
       ex.printStackTrace();
     }
    }//GEN-LAST:event_btnAddRecordActionPerformed

    private void btnShowRecordsActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnShowRecordsActionPerformed
      try{
        Statement st=conn.createStatement();
        ResultSet rs=st.executeQuery("Select * from employees");
        StringBuffer result=new StringBuffer();
        while(rs.next()){
        int empNo=rs.getInt(1);
        String empName=rs.getString(2);
        double empSalary=rs.getDouble(3);
        result.append(empNo+"\t");
        result.append(empName+"\t");
        result.append(empSalary+"\n");
        }
       txtShowAll.setText(result.toString());
        
      }catch(SQLException ex){
    JOptionPane.showMessageDialog(null, "Sorry! can not connect to the Database");
    ex.printStackTrace();
    }
        
    }//GEN-LAST:event_btnShowRecordsActionPerformed

    /**
     * @param args the command line arguments
     */
    public static void main(String args[]) {
        /* Set the Nimbus look and feel */
        //<editor-fold defaultstate="collapsed" desc=" Look and feel setting code (optional) ">
        /* If Nimbus (introduced in Java SE 6) is not available, stay with the default look and feel.
         * For details see http://download.oracle.com/javase/tutorial/uiswing/lookandfeel/plaf.html 
         */
        try {
            for (javax.swing.UIManager.LookAndFeelInfo info : javax.swing.UIManager.getInstalledLookAndFeels()) {
                if ("Nimbus".equals(info.getName())) {
                    javax.swing.UIManager.setLookAndFeel(info.getClassName());
                    break;
                }
            }
        } catch (ClassNotFoundException ex) {
            java.util.logging.Logger.getLogger(MyEmpFrame.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(MyEmpFrame.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(MyEmpFrame.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(MyEmpFrame.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new MyEmpFrame().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnAddRecord;
    private javax.swing.JButton btnShowRecords;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JScrollPane jScrollPane3;
    private javax.swing.JScrollPane jScrollPane4;
    private javax.swing.JPanel myPanel;
    private javax.swing.JTextPane txtEmpName;
    private javax.swing.JTextPane txtEmpNo;
    private javax.swing.JTextPane txtEmpSalary;
    private javax.swing.JTextArea txtShowAll;
    // End of variables declaration//GEN-END:variables

    private void connectDB() {
        
    try {
        conn=DriverManager.getConnection("jdbc:oracle:thin:@//localhost:1521/xe","myproject","mystudent");
        ps=conn.prepareStatement("insert into employees values(?,?,?)");
        
    }catch(SQLException ex){
    JOptionPane.showMessageDialog(null, "Sorry! can not connect to the Database");
    ex.printStackTrace();
    }
    } 

    private boolean validateInputs() {
    if(txtEmpNo.getText().trim().isEmpty()||txtEmpName.getText().trim().isEmpty()||txtEmpSalary.getText().trim().isEmpty()){
    return false;
    }
    return true;
    }

    private void clearAll() {
       txtEmpNo.setText("");
       txtEmpName.setText("");
       txtEmpSalary.setText("");
       txtEmpNo.requestFocus();
    }
}