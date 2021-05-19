/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package interfaces;

import itpm_project.DBConnect;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;
import net.proteanit.sql.DbUtils;



/**
 *
 * @author Ashan
 */
public class sessionTypes extends javax.swing.JFrame {

    Connection con = null;
    PreparedStatement pst = null;
    ResultSet rs = null;

    
    public sessionTypes() {
        initComponents();
        
        con = DBConnect.connect();
        
       tableload1();
       tableload2();
       tableload3();
        
    }

    public void tableload1(){
        
        try{
        
        String sql = "SELECT * FROM sessions";
        pst = con.prepareStatement(sql);
        rs = pst.executeQuery(sql);
            
           jTable1.setModel(DbUtils.resultSetToTableModel(rs));
           
      
           
        } catch (Exception e){
            JOptionPane.showMessageDialog(this,e);
            System.out.println(e);
        }
    }
    
    public void tableload2(){
        
        try{
        
        String sql = "SELECT * FROM sessions";
        pst = con.prepareStatement(sql);
        rs = pst.executeQuery(sql);
            
           jTable2.setModel(DbUtils.resultSetToTableModel(rs));
           
      
           
        } catch (Exception e){
            JOptionPane.showMessageDialog(this,e);
            System.out.println(e);
        }
    }
    
    public void tableload3(){
        
        try{
        
        String sql = "SELECT * FROM sessions";
        pst = con.prepareStatement(sql);
        rs = pst.executeQuery(sql);
            
           jTable3.setModel(DbUtils.resultSetToTableModel(rs));
           
      
           
        } catch (Exception e){
            JOptionPane.showMessageDialog(this,e);
            System.out.println(e);
        }
    }
 
    
    
    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jTabbedPane1 = new javax.swing.JTabbedPane();
        jPanel1 = new javax.swing.JPanel();
        jScrollPane1 = new javax.swing.JScrollPane();
        jTable1 = new javax.swing.JTable();
        jButton3 = new javax.swing.JButton();
        jButton4 = new javax.swing.JButton();
        jPanel2 = new javax.swing.JPanel();
        jScrollPane2 = new javax.swing.JScrollPane();
        jTable2 = new javax.swing.JTable();
        jButton5 = new javax.swing.JButton();
        jButton6 = new javax.swing.JButton();
        jPanel3 = new javax.swing.JPanel();
        jScrollPane3 = new javax.swing.JScrollPane();
        jTable3 = new javax.swing.JTable();
        jButton1 = new javax.swing.JButton();
        jButton2 = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setTitle("Session Types");

        jTabbedPane1.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jTabbedPane1MouseClicked(evt);
            }
        });

        jTable1.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null}
            },
            new String [] {
                "ID", "Lecturer 1", "Lecturer 2", "Subject Code","Subject","Tag","Group ID","Student Count","Duration",
            }
        ));
        jScrollPane1.setViewportView(jTable1);

        jButton3.setBackground(new java.awt.Color(92, 86, 86));
        jButton3.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        jButton3.setText("Add Consecutive Session");
        jButton3.setToolTipText("");
        jButton3.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton3ActionPerformed(evt);
            }
        });

        jButton4.setBackground(new java.awt.Color(0, 102, 255));
        jButton4.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        jButton4.setText("View");
        jButton4.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton4ActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(33, 33, 33)
                        .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 1264, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(315, 315, 315)
                        .addComponent(jButton3)
                        .addGap(371, 371, 371)
                        .addComponent(jButton4, javax.swing.GroupLayout.PREFERRED_SIZE, 155, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap(478, Short.MAX_VALUE))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(44, 44, 44)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 293, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(108, 108, 108)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jButton3, javax.swing.GroupLayout.PREFERRED_SIZE, 58, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jButton4, javax.swing.GroupLayout.PREFERRED_SIZE, 58, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(209, Short.MAX_VALUE))
        );

        jTabbedPane1.addTab("Consecutive", jPanel1);

        jTable2.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null}
            },
            new String [] {
                "ID", "Lecturer 1", "Lecturer 2", "Subject Code","Subject","Tag","Group ID","Student Count","Duration",
            }
        ));
        jScrollPane2.setViewportView(jTable2);

        jButton5.setBackground(new java.awt.Color(92, 86, 86));
        jButton5.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        jButton5.setText("Add Parallel  Session");
        jButton5.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton5ActionPerformed(evt);
            }
        });

        jButton6.setBackground(new java.awt.Color(0, 102, 255));
        jButton6.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        jButton6.setText("View");
        jButton6.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton6ActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addGap(33, 33, 33)
                        .addComponent(jScrollPane2, javax.swing.GroupLayout.PREFERRED_SIZE, 1264, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addGap(310, 310, 310)
                        .addComponent(jButton5, javax.swing.GroupLayout.PREFERRED_SIZE, 193, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(366, 366, 366)
                        .addComponent(jButton6, javax.swing.GroupLayout.PREFERRED_SIZE, 164, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap(478, Short.MAX_VALUE))
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addGap(44, 44, 44)
                .addComponent(jScrollPane2, javax.swing.GroupLayout.PREFERRED_SIZE, 293, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(96, 96, 96)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jButton5, javax.swing.GroupLayout.PREFERRED_SIZE, 60, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jButton6, javax.swing.GroupLayout.PREFERRED_SIZE, 60, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(219, Short.MAX_VALUE))
        );

        jTabbedPane1.addTab("Parallel", jPanel2);

        jTable3.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null}
            },
            new String [] {
                "ID", "Lecturer 1", "Lecturer 2", "Subject Code","Subject","Tag","Group ID","Student Count","Duration",
            }
        ));
        jScrollPane3.setViewportView(jTable3);

        jButton1.setBackground(new java.awt.Color(0, 102, 255));
        jButton1.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        jButton1.setText("View");
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });

        jButton2.setBackground(new java.awt.Color(92, 86, 86));
        jButton2.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        jButton2.setText("Add Non Overlapping Session");
        jButton2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton2ActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel3Layout = new javax.swing.GroupLayout(jPanel3);
        jPanel3.setLayout(jPanel3Layout);
        jPanel3Layout.setHorizontalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel3Layout.createSequentialGroup()
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel3Layout.createSequentialGroup()
                        .addGap(33, 33, 33)
                        .addComponent(jScrollPane3, javax.swing.GroupLayout.PREFERRED_SIZE, 1264, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(jPanel3Layout.createSequentialGroup()
                        .addGap(331, 331, 331)
                        .addComponent(jButton2)
                        .addGap(353, 353, 353)
                        .addComponent(jButton1, javax.swing.GroupLayout.PREFERRED_SIZE, 170, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap(478, Short.MAX_VALUE))
        );
        jPanel3Layout.setVerticalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel3Layout.createSequentialGroup()
                .addGap(44, 44, 44)
                .addComponent(jScrollPane3, javax.swing.GroupLayout.PREFERRED_SIZE, 293, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(25, 25, 25)
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jButton1, javax.swing.GroupLayout.PREFERRED_SIZE, 58, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jButton2, javax.swing.GroupLayout.PREFERRED_SIZE, 58, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(292, Short.MAX_VALUE))
        );

        jTabbedPane1.addTab("Non Overlapping", jPanel3);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jTabbedPane1)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jTabbedPane1)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void jTabbedPane1MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jTabbedPane1MouseClicked
       
    }//GEN-LAST:event_jTabbedPane1MouseClicked

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
        
        viewNonOverlapping m1 = new viewNonOverlapping();
        m1.setVisible(true);
        this.dispose();
        
        
    }//GEN-LAST:event_jButton1ActionPerformed

    private void jButton2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton2ActionPerformed
       
        if(!jTable3.getSelectionModel().isSelectionEmpty()){
        
        
        int x = JOptionPane.showConfirmDialog(null, "DO you want to add Non overlapping session?");
        
        if(x==0){
          
         int r = jTable3.getSelectedRow();
        
        String sid       =   jTable3.getValueAt(r, 0).toString();
        String lec1      =   jTable3.getValueAt(r, 1).toString();
        String lec2      =   jTable3.getValueAt(r, 2).toString();
        String subcode   =   jTable3.getValueAt(r, 3).toString();
        String subname   =   jTable3.getValueAt(r, 4).toString();
        String tag       =   jTable3.getValueAt(r, 5).toString();
        String grpid     =   jTable3.getValueAt(r, 6).toString();
        String stdcount  =   jTable3.getValueAt(r, 7).toString();
        String dura      =   jTable3.getValueAt(r, 8).toString();
        
        String sql = "INSERT INTO nonoverlapping (session_id, lecturer_1, lecturer_2, subject_code, subject_name, tag, group_id, student_count, duration) values('"+ sid +"', '"+ lec1 +"', '"+ lec2 +"', '"+ subcode +"', '"+ subname +"', '"+ tag +"', '"+ grpid +"', '"+ stdcount +"', '"+ dura +"')";
            
         try{
            
            pst = con.prepareStatement(sql);
            pst.execute();
            JOptionPane.showMessageDialog(this, "Non Overlapping session added successfully!");
            
            } catch (Exception e){
               
                JOptionPane.showMessageDialog(this,e);
                System.out.println(e);
            
            }
         }
          
    }//GEN-LAST:event_jButton2ActionPerformed
        else{
            JOptionPane.showMessageDialog(this, "Select a Non Overlapping session ");
        }
    }
    
    private void jButton3ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton3ActionPerformed
        
        if(!jTable1.getSelectionModel().isSelectionEmpty()){
        
        int x = JOptionPane.showConfirmDialog(null, "DO you want to add Consecutive session?");
        
        if(x==0){
             
            
        int r = jTable1.getSelectedRow();
        
        String sid       =   jTable1.getValueAt(r, 0).toString();
        String lec1      =   jTable1.getValueAt(r, 1).toString();
        String lec2      =   jTable1.getValueAt(r, 2).toString();
        String subcode   =   jTable1.getValueAt(r, 3).toString();
        String subname   =   jTable1.getValueAt(r, 4).toString();
        String tag       =   jTable1.getValueAt(r, 5).toString();
        String grpid     =   jTable1.getValueAt(r, 6).toString();
        String stdcount  =   jTable1.getValueAt(r, 7).toString();
        String dura      =   jTable1.getValueAt(r, 8).toString();
        
        String sql = "INSERT INTO consecutive (session_id, lecturer_1, lecturer_2, subject_code, subject_name, tag, group_id, student_count, duration) values('"+ sid +"', '"+ lec1 +"', '"+ lec2 +"', '"+ subcode +"', '"+ subname +"', '"+ tag +"', '"+ grpid +"', '"+ stdcount +"', '"+ dura +"')";
            
         try{
            
            pst = con.prepareStatement(sql);
            pst.execute();
            JOptionPane.showMessageDialog(this, "Consecutive session added successfully!");
            
            } catch (Exception e){
                
                JOptionPane.showMessageDialog(this,e);
                System.out.println(e);
            
            }
        
    
        
        }  
        
    }//GEN-LAST:event_jButton3ActionPerformed

        else{
            JOptionPane.showMessageDialog(this, "Select a Consecutive session ");
        }
    }
    
    private void jButton4ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton4ActionPerformed
       
       
        viewConsecutive m1 = new viewConsecutive();
        m1.setVisible(true);
        this.dispose();
           
        
    
         
    }//GEN-LAST:event_jButton4ActionPerformed

    private void jButton5ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton5ActionPerformed
       
        if(!jTable2.getSelectionModel().isSelectionEmpty()){
        
        int x = JOptionPane.showConfirmDialog(null, "DO you want to add Parallel session?");
        
        if(x==0){
        
         int r = jTable2.getSelectedRow();
        
        String sid       =   jTable2.getValueAt(r, 0).toString();
        String lec1      =   jTable2.getValueAt(r, 1).toString();
        String lec2      =   jTable2.getValueAt(r, 2).toString();
        String subcode   =   jTable2.getValueAt(r, 3).toString();
        String subname   =   jTable2.getValueAt(r, 4).toString();
        String tag       =   jTable2.getValueAt(r, 5).toString();
        String grpid     =   jTable2.getValueAt(r, 6).toString();
        String stdcount  =   jTable2.getValueAt(r, 7).toString();
        String dura      =   jTable2.getValueAt(r, 8).toString();
        
        String sql = "INSERT INTO parallel (session_id, lecturer_1, lecturer_2, subject_code, subject_name, tag, group_id, student_count, duration) values('"+ sid +"', '"+ lec1 +"', '"+ lec2 +"', '"+ subcode +"', '"+ subname +"', '"+ tag +"', '"+ grpid +"', '"+ stdcount +"', '"+ dura +"')";
            
         try{
            
            pst = con.prepareStatement(sql);
            pst.execute();
            JOptionPane.showMessageDialog(this, "Parallel session added successfully!");
            
            } catch (Exception e){
                
                JOptionPane.showMessageDialog(this,e);
                System.out.println(e);
            
            }
        
    
        }  
        
        
    }//GEN-LAST:event_jButton5ActionPerformed

        else{
            JOptionPane.showMessageDialog(this, "Select a Parallel session ");
        }
    }
        
    private void jButton6ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton6ActionPerformed

      
        viewParallel m1 = new viewParallel();
        m1.setVisible(true);
        this.dispose();
        
        
        
    }//GEN-LAST:event_jButton6ActionPerformed
    
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
            java.util.logging.Logger.getLogger(sessionTypes.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(sessionTypes.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(sessionTypes.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(sessionTypes.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new sessionTypes().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton jButton1;
    private javax.swing.JButton jButton2;
    private javax.swing.JButton jButton3;
    private javax.swing.JButton jButton4;
    private javax.swing.JButton jButton5;
    private javax.swing.JButton jButton6;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JPanel jPanel3;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JScrollPane jScrollPane3;
    private javax.swing.JTabbedPane jTabbedPane1;
    private javax.swing.JTable jTable1;
    private javax.swing.JTable jTable2;
    private javax.swing.JTable jTable3;
    // End of variables declaration//GEN-END:variables
}
