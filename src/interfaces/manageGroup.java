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
public class manageGroup extends javax.swing.JFrame {
    
    Connection con = null;
    PreparedStatement pst = null;
    ResultSet rs = null;

    String yr,prog,gno,subgno,gid,subgid;
    
    /**
     * Creates new form manageGroup
     */
    public manageGroup() {
        initComponents();
        
        con = DBConnect.connect();
        
       tableload();
    }

    
    public void tableload(){
        
        try{
        
        String sql = "SELECT * FROM studentgroup";
        pst = con.prepareStatement(sql);
        rs = pst.executeQuery(sql);
        
           jTable2.setModel(DbUtils.resultSetToTableModel(rs));
      
           
        } catch (Exception e){
            JOptionPane.showMessageDialog(this,e);
            System.out.println(e);
        }
    }
    
    public void autoGenerateID(){
       
        
      
        
     try{
        
        this.yr = yearsembox.getSelectedItem().toString();
        this.prog = programmebox.getSelectedItem().toString();
        this.gno = groupnobox.getValue().toString();
        this.subgno = subgroupnobox.getValue().toString();
        
        this.gid = yr + "." + prog + "." + gno;
        this.subgid = yr + "." + prog + "." + gno + "." + subgno;
        
        groupidbox.setText(gid);
        subgroupidbox.setText(subgid);
     
           
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

        jScrollPane1 = new javax.swing.JScrollPane();
        jTable2 = new javax.swing.JTable();
        jLabel4 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        yearsembox = new javax.swing.JComboBox<>();
        programmebox = new javax.swing.JComboBox<>();
        groupnobox = new javax.swing.JSpinner();
        jLabel7 = new javax.swing.JLabel();
        jLabel8 = new javax.swing.JLabel();
        jLabel9 = new javax.swing.JLabel();
        subgroupnobox = new javax.swing.JSpinner();
        groupidbox = new javax.swing.JTextField();
        subgroupidbox = new javax.swing.JTextField();
        jButton1 = new javax.swing.JButton();
        jButton2 = new javax.swing.JButton();
        jButton3 = new javax.swing.JButton();
        idbox = new javax.swing.JLabel();
        jButton4 = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setTitle("Manage Student Groups");

        jTable2.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null}
            },
            new String [] {
                "ID", "Acedemic Year Semester", "Programme", "Group No","Group ID","Sub Group No","Sub Group ID",
            }
        ));
        jTable2.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jTable2MouseClicked(evt);
            }
        });
        jScrollPane1.setViewportView(jTable2);

        jLabel4.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        jLabel4.setText("Academic Year Semester");

        jLabel5.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        jLabel5.setText("Programme");

        jLabel6.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        jLabel6.setText("Group No");

        yearsembox.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "--Select--", "Y1S1", "Y1S2", "Y2S1", "Y2S2", "Y3S1", "Y3S2", "Y4S1", "Y4S2", " " }));
        yearsembox.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                yearsemboxActionPerformed(evt);
            }
        });

        programmebox.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "--Select--", "IT", "CSSE", "IM", "CSE" }));
        programmebox.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                programmeboxActionPerformed(evt);
            }
        });

        groupnobox.setModel(new javax.swing.SpinnerNumberModel(1, 1, null, 1));
        groupnobox.addChangeListener(new javax.swing.event.ChangeListener() {
            public void stateChanged(javax.swing.event.ChangeEvent evt) {
                groupnoboxStateChanged(evt);
            }
        });

        jLabel7.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        jLabel7.setText("Sub Group No");

        jLabel8.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        jLabel8.setText("Group ID");

        jLabel9.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        jLabel9.setText("Sub Group ID");

        subgroupnobox.setModel(new javax.swing.SpinnerNumberModel(1, 1, null, 1));
        subgroupnobox.addChangeListener(new javax.swing.event.ChangeListener() {
            public void stateChanged(javax.swing.event.ChangeEvent evt) {
                subgroupnoboxStateChanged(evt);
            }
        });

        groupidbox.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                groupidboxActionPerformed(evt);
            }
        });
        groupidbox.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyPressed(java.awt.event.KeyEvent evt) {
                groupidboxKeyPressed(evt);
            }
        });

        subgroupidbox.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyPressed(java.awt.event.KeyEvent evt) {
                subgroupidboxKeyPressed(evt);
            }
        });

        jButton1.setBackground(new java.awt.Color(22, 195, 29));
        jButton1.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        jButton1.setText("Update");
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });

        jButton2.setBackground(new java.awt.Color(253, 16, 16));
        jButton2.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        jButton2.setText("Delete");
        jButton2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton2ActionPerformed(evt);
            }
        });

        jButton3.setBackground(new java.awt.Color(229, 244, 3));
        jButton3.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        jButton3.setText("Clear All");
        jButton3.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton3ActionPerformed(evt);
            }
        });

        idbox.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N

        jButton4.setIcon(new javax.swing.ImageIcon("E:\\Documents\\NetBeansProjects\\images\\icons8-home-26.png")); // NOI18N
        jButton4.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton4ActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                        .addGroup(layout.createSequentialGroup()
                            .addGap(445, 445, 445)
                            .addComponent(jButton1, javax.swing.GroupLayout.PREFERRED_SIZE, 130, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addGap(93, 93, 93)
                            .addComponent(jButton2, javax.swing.GroupLayout.PREFERRED_SIZE, 130, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addGap(83, 83, 83)
                            .addComponent(jButton3, javax.swing.GroupLayout.PREFERRED_SIZE, 130, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGroup(layout.createSequentialGroup()
                            .addGap(65, 65, 65)
                            .addComponent(idbox, javax.swing.GroupLayout.PREFERRED_SIZE, 49, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addGap(121, 121, 121)
                            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                .addComponent(jLabel6, javax.swing.GroupLayout.PREFERRED_SIZE, 140, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addComponent(jLabel5, javax.swing.GroupLayout.PREFERRED_SIZE, 238, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addComponent(jLabel4, javax.swing.GroupLayout.PREFERRED_SIZE, 187, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGap(50, 50, 50)
                            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                .addComponent(yearsembox, javax.swing.GroupLayout.PREFERRED_SIZE, 130, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addComponent(programmebox, javax.swing.GroupLayout.PREFERRED_SIZE, 130, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addComponent(groupnobox, javax.swing.GroupLayout.PREFERRED_SIZE, 130, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGap(101, 101, 101)
                            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                .addGroup(layout.createSequentialGroup()
                                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                        .addComponent(jLabel7, javax.swing.GroupLayout.PREFERRED_SIZE, 130, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addComponent(jLabel9, javax.swing.GroupLayout.PREFERRED_SIZE, 130, javax.swing.GroupLayout.PREFERRED_SIZE))
                                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                        .addGroup(layout.createSequentialGroup()
                                            .addGap(90, 90, 90)
                                            .addComponent(subgroupnobox, javax.swing.GroupLayout.PREFERRED_SIZE, 130, javax.swing.GroupLayout.PREFERRED_SIZE))
                                        .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                                            .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                            .addComponent(subgroupidbox, javax.swing.GroupLayout.PREFERRED_SIZE, 130, javax.swing.GroupLayout.PREFERRED_SIZE))))
                                .addGroup(layout.createSequentialGroup()
                                    .addComponent(jLabel8, javax.swing.GroupLayout.PREFERRED_SIZE, 130, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                    .addComponent(groupidbox, javax.swing.GroupLayout.PREFERRED_SIZE, 130, javax.swing.GroupLayout.PREFERRED_SIZE)))))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(44, 44, 44)
                        .addComponent(jButton4)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 801, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(41, 41, 41)))
                .addContainerGap(676, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(63, 63, 63)
                        .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 249, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(33, 33, 33)
                        .addComponent(jButton4, javax.swing.GroupLayout.PREFERRED_SIZE, 53, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addGap(81, 81, 81)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                            .addComponent(jLabel4, javax.swing.GroupLayout.DEFAULT_SIZE, 30, Short.MAX_VALUE)
                            .addComponent(idbox, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createSequentialGroup()
                                .addGap(93, 93, 93)
                                .addComponent(jLabel6, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(layout.createSequentialGroup()
                                .addGap(31, 31, 31)
                                .addComponent(jLabel5, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE))))
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel7, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(subgroupnobox, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createSequentialGroup()
                                .addGap(93, 93, 93)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                    .addComponent(jLabel9, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(subgroupidbox, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)))
                            .addGroup(layout.createSequentialGroup()
                                .addGap(31, 31, 31)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                    .addComponent(jLabel8, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(groupidbox, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)))))
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(yearsembox, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createSequentialGroup()
                                .addGap(93, 93, 93)
                                .addComponent(groupnobox, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(layout.createSequentialGroup()
                                .addGap(31, 31, 31)
                                .addComponent(programmebox, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)))))
                .addGap(73, 73, 73)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jButton1, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jButton2, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jButton3, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(75, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void groupidboxActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_groupidboxActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_groupidboxActionPerformed

    private void jTable2MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jTable2MouseClicked
       
        int r = jTable2.getSelectedRow();
        
        String gid       =   jTable2.getValueAt(r, 0).toString();
        String year     =   jTable2.getValueAt(r, 1).toString();
        String program  =   jTable2.getValueAt(r, 2).toString();
        Object grpno    =   jTable2.getValueAt(r, 3);
        Object subgrpno =   jTable2.getValueAt(r, 4);
        String grpid    =   jTable2.getValueAt(r, 5).toString();
        String subgrpid =   jTable2.getValueAt(r, 6).toString();
        
        
        idbox.setText(gid);
        yearsembox.setSelectedItem(year);
        programmebox.setSelectedItem(program);
        groupidbox.setText(grpid); 
        subgroupidbox.setText(subgrpid);   
        groupnobox.setValue(grpno);
        subgroupnobox.setValue(subgrpno);
        
 
        
        
    }//GEN-LAST:event_jTable2MouseClicked

    
    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed

         // Check row selected or not
         if(!jTable2.getSelectionModel().isSelectionEmpty()){
             
             // Validations 
             String year1 = yearsembox.getSelectedItem().toString();
             String program2 = programmebox.getSelectedItem().toString();
             
             if(year1.equals("--Select--")||program2.equals("--Select--")){

                JOptionPane.showMessageDialog(this, "Please insert valid data to update!");
                
            }
             else{
               
                // confirm message 
                int x = JOptionPane.showConfirmDialog(null, "DO you really want to Update?");
        
                if(x==0){
            
          
                 String gid = idbox.getText();
                 String year = yearsembox.getSelectedItem().toString();
                 String program = programmebox.getSelectedItem().toString();
                 String grpno =  groupnobox.getValue().toString();
                 String subgrpno =  subgroupnobox.getValue().toString();  
                 String grpid = groupidbox.getText();
                 String subgrpid = subgroupidbox.getText();

            
                 String sql = "UPDATE studentgroup SET AcademicYearSemester = '"+ year +"', Programme = '"+ program +"', GroupNo = '"+ grpno +"', SubGroupNo = '"+ subgrpno +"', GroupId = '"+ grpid +"', SubGroupId = '"+ subgrpid +"' where ID = '"+ gid +"' "; 
           
                try{
            
                    pst = con.prepareStatement(sql);
                    pst.execute();
                    tableload();

                   } catch (Exception e){

                    JOptionPane.showMessageDialog(this,e);
                    System.out.println(e);

                    }
                }  
            }       
    }//GEN-LAST:event_jButton1ActionPerformed

         else{
            JOptionPane.showMessageDialog(this, "Select a row ");
        }
    }
  
    
    private void yearsemboxActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_yearsemboxActionPerformed
      
        //Year Semester Generate
        
        String year = yearsembox.getSelectedItem().toString();
        String program = programmebox.getSelectedItem().toString();
        String grpno =  groupnobox.getValue().toString();
        String subgrpno =  subgroupnobox.getValue().toString();
        String grpid = groupidbox.getText();
        String subgrpid = subgroupidbox.getText();  
        
      if(year.equals("--Select--")||program.equals("--Select--")){
          
        groupidbox.setText(""); 
        subgroupidbox.setText(""); 
        
      }else{
          
          autoGenerateID();
          
      }
        
        
    }//GEN-LAST:event_yearsemboxActionPerformed

    private void programmeboxActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_programmeboxActionPerformed
       
        //programme generate
        
        String year = yearsembox.getSelectedItem().toString();
        String program = programmebox.getSelectedItem().toString();
        String grpno =  groupnobox.getValue().toString();
        String subgrpno =  subgroupnobox.getValue().toString();
        String grpid = groupidbox.getText();
        String subgrpid = subgroupidbox.getText();  
        
      if(year.equals("--Select--")||program.equals("--Select--")){
          
        groupidbox.setText(""); 
        subgroupidbox.setText(""); 
        
      }else{
          
          autoGenerateID();
      }
        
    }//GEN-LAST:event_programmeboxActionPerformed

    private void groupnoboxStateChanged(javax.swing.event.ChangeEvent evt) {//GEN-FIRST:event_groupnoboxStateChanged
       
        // Group number generate
        
        String year = yearsembox.getSelectedItem().toString();
        String program = programmebox.getSelectedItem().toString();
        String grpno =  groupnobox.getValue().toString();
        String subgrpno =  subgroupnobox.getValue().toString();
        String grpid = groupidbox.getText();
        String subgrpid = subgroupidbox.getText();  
        
      if(year.equals("--Select--")||program.equals("--Select--")){
          
        groupidbox.setText(""); 
        subgroupidbox.setText(""); 
        
      }else{
          
          autoGenerateID();
      }
        
    }//GEN-LAST:event_groupnoboxStateChanged

    private void subgroupnoboxStateChanged(javax.swing.event.ChangeEvent evt) {//GEN-FIRST:event_subgroupnoboxStateChanged
       
        //Sub Group number Generate
        
        String year = yearsembox.getSelectedItem().toString();
        String program = programmebox.getSelectedItem().toString();
        String grpno =  groupnobox.getValue().toString();
        String subgrpno =  subgroupnobox.getValue().toString();
        String grpid = groupidbox.getText();
        String subgrpid = subgroupidbox.getText();
        
        if(year.equals("--Select--")||program.equals("--Select--")){
          
        groupidbox.setText(""); 
        subgroupidbox.setText(""); 
        
      }else{
          
          autoGenerateID();
      }
        
    }//GEN-LAST:event_subgroupnoboxStateChanged

    private void jButton2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton2ActionPerformed

        //Delete Button
        
        if(!jTable2.getSelectionModel().isSelectionEmpty()){
        
        int x = JOptionPane.showConfirmDialog(null,"Do You want to Delete Group?" );
        
        if(x==0){
            
           String gid = idbox.getText();
           String sql = "DELETE from studentgroup where ID = '"+ gid +"' ";
           
           try{
           pst = con.prepareStatement(sql);
           pst.execute();
           tableload();
           
           } catch (Exception e){
               
               JOptionPane.showMessageDialog(this,e);
               System.out.println(e);
               
           }
      
            
        }
    }//GEN-LAST:event_jButton2ActionPerformed

        else{
            JOptionPane.showMessageDialog(this, "Select a row to delete ");
        }
    }
        
    private void jButton3ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton3ActionPerformed
       
        //Clear All Button
        
        if(!jTable2.getSelectionModel().isSelectionEmpty()){
        
        try{
            
        int r = jTable2.getSelectedRow();
       
        String gid      =  jTable2.getValueAt(r, 0).toString();
        String year     =   jTable2.getValueAt(r, 1).toString();
        String program  =   jTable2.getValueAt(r, 2).toString();
        Object grpno    =   jTable2.getValueAt(r, 3);
        Object subgrpno =   jTable2.getValueAt(r, 4);
        String grpid    =   jTable2.getValueAt(r, 5).toString();
        String subgrpid =   jTable2.getValueAt(r, 6).toString();
        
     
        yearsembox.setSelectedItem("--Select--");
        programmebox.setSelectedItem("--Select--");
        groupidbox.setText(""); 
        subgroupidbox.setText("");   
        groupnobox.setValue(1);
        subgroupnobox.setValue(1);
        
        } catch (Exception e){
               
               JOptionPane.showMessageDialog(this,e);
               System.out.println(e);
               
           }
        
    }//GEN-LAST:event_jButton3ActionPerformed

      else{
            JOptionPane.showMessageDialog(this, "Select a row to clear data");
        }
    }
    
    private void groupidboxKeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_groupidboxKeyPressed
       
        groupidbox.setEditable(false);
        
    }//GEN-LAST:event_groupidboxKeyPressed

    private void subgroupidboxKeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_subgroupidboxKeyPressed
        
        subgroupidbox.setEditable(false);
        
    }//GEN-LAST:event_subgroupidboxKeyPressed

    private void jButton4ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton4ActionPerformed
        
        myMain m1 = new myMain();
        m1.setVisible(true);
        this.dispose();
        
    }//GEN-LAST:event_jButton4ActionPerformed

    
    
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
            java.util.logging.Logger.getLogger(manageGroup.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(manageGroup.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(manageGroup.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(manageGroup.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new manageGroup().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JTextField groupidbox;
    private javax.swing.JSpinner groupnobox;
    private javax.swing.JLabel idbox;
    private javax.swing.JButton jButton1;
    private javax.swing.JButton jButton2;
    private javax.swing.JButton jButton3;
    private javax.swing.JButton jButton4;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTable jTable2;
    private javax.swing.JComboBox<String> programmebox;
    private javax.swing.JTextField subgroupidbox;
    private javax.swing.JSpinner subgroupnobox;
    private javax.swing.JComboBox<String> yearsembox;
    // End of variables declaration//GEN-END:variables
}
