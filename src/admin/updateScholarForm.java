/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package admin;

import config.dbConnector;
import java.io.File;
import java.sql.ResultSet;
import java.sql.SQLException;

import javax.swing.JOptionPane;
import static testapp2.registrationForm.mail;
import static testapp2.registrationForm.usname;

/**
 *
 * @author Hariell
 */
public class updateScholarForm extends javax.swing.JFrame {

    /**
     * Creates new form updateScholarForm
     */
    public static String name = "";
    public static String ads = "";

    public updateScholarForm() {
        initComponents();
    }
    
     public boolean updateCheck(){
    dbConnector dbc = new dbConnector();
    try{
        String query = "SELECT * FROM tbl_scholarship WHERE scholarship_id = "+sc_id.getText();

            ResultSet resultSet =dbc.getData(query);
        if(resultSet.next()){
           String type = resultSet.getString("scholarship_type");
            System.out.println(""+type);
            if(type.equals(sc_type.getText())){
                JOptionPane.showMessageDialog(null,"Schoalrship Type is Already Used!");
              sc_type.setText("");
            }
            String name = resultSet.getString("scholarship_name");
            if(name.equals(sc_name.getText())){
                JOptionPane.showMessageDialog(null,"Scholarship Name is Already Used!");
              sc_name.setText("");
            } 
           usname = resultSet.getString("scholarship_name");
             return true;
        }else{
            return false;
        }
    }catch(SQLException ex){
        System.out.println(""+ex);
        return false;
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

        jPanel34 = new javax.swing.JPanel();
        jPanel21 = new javax.swing.JPanel();
        jPanel20 = new javax.swing.JPanel();
        jLabel5 = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        sc_id = new javax.swing.JTextField();
        sc_type = new javax.swing.JTextField();
        jLabel9 = new javax.swing.JLabel();
        jLabel28 = new javax.swing.JLabel();
        sc_des = new javax.swing.JTextField();
        sc_name = new javax.swing.JTextField();
        jButton4 = new javax.swing.JButton();
        jLabel18 = new javax.swing.JLabel();
        jButton5 = new javax.swing.JButton();
        jLabel1 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setUndecorated(true);
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jPanel34.setBackground(new java.awt.Color(102, 102, 255));
        jPanel34.setPreferredSize(new java.awt.Dimension(543, 594));
        jPanel34.setLayout(null);

        jPanel21.setBackground(new java.awt.Color(204, 204, 204));
        jPanel21.setForeground(new java.awt.Color(204, 204, 204));
        jPanel21.setPreferredSize(new java.awt.Dimension(530, 770));

        jPanel20.setBackground(new java.awt.Color(204, 204, 255));
        jPanel20.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));
        jPanel20.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel5.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jLabel5.setText("Student ID :");
        jPanel20.add(jLabel5, new org.netbeans.lib.awtextra.AbsoluteConstraints(80, 100, -1, 33));

        jLabel6.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jLabel6.setText("Scholarship Name:");
        jPanel20.add(jLabel6, new org.netbeans.lib.awtextra.AbsoluteConstraints(60, 140, -1, 20));

        sc_id.setEditable(false);
        sc_id.setBackground(new java.awt.Color(255, 255, 255));
        sc_id.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));
        jPanel20.add(sc_id, new org.netbeans.lib.awtextra.AbsoluteConstraints(200, 100, 179, 28));

        sc_type.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));
        jPanel20.add(sc_type, new org.netbeans.lib.awtextra.AbsoluteConstraints(200, 180, 178, 25));

        jLabel9.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jLabel9.setText("Scholarship Type :");
        jPanel20.add(jLabel9, new org.netbeans.lib.awtextra.AbsoluteConstraints(60, 180, 130, 33));

        jLabel28.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jLabel28.setText("Scholarship Description:");
        jPanel20.add(jLabel28, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 250, 180, 33));
        jPanel20.add(sc_des, new org.netbeans.lib.awtextra.AbsoluteConstraints(200, 240, 190, 80));

        sc_name.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));
        jPanel20.add(sc_name, new org.netbeans.lib.awtextra.AbsoluteConstraints(200, 140, 178, 25));

        jButton4.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        jButton4.setForeground(new java.awt.Color(255, 0, 0));
        jButton4.setText("Cancel");
        jButton4.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton4ActionPerformed(evt);
            }
        });
        jPanel20.add(jButton4, new org.netbeans.lib.awtextra.AbsoluteConstraints(310, 380, 120, 40));

        jLabel18.setFont(new java.awt.Font("Tahoma", 1, 24)); // NOI18N
        jLabel18.setText("UPDATE SCHOLARSHIP FORM");
        jPanel20.add(jLabel18, new org.netbeans.lib.awtextra.AbsoluteConstraints(70, 30, 360, 40));

        jButton5.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        jButton5.setText("Update");
        jButton5.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton5ActionPerformed(evt);
            }
        });
        jPanel20.add(jButton5, new org.netbeans.lib.awtextra.AbsoluteConstraints(160, 380, 120, 40));

        jLabel1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/icons/scholarship.jpg"))); // NOI18N
        jPanel20.add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 480, 490));

        javax.swing.GroupLayout jPanel21Layout = new javax.swing.GroupLayout(jPanel21);
        jPanel21.setLayout(jPanel21Layout);
        jPanel21Layout.setHorizontalGroup(
            jPanel21Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel21Layout.createSequentialGroup()
                .addComponent(jPanel20, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addContainerGap())
        );
        jPanel21Layout.setVerticalGroup(
            jPanel21Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel21Layout.createSequentialGroup()
                .addComponent(jPanel20, javax.swing.GroupLayout.PREFERRED_SIZE, 491, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, Short.MAX_VALUE))
        );

        jPanel34.add(jPanel21);
        jPanel21.setBounds(0, 0, 490, 490);

        getContentPane().add(jPanel34, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 480, 490));

        pack();
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void jButton4ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton4ActionPerformed
    scholarshippage ssp = new scholarshippage();
      ssp.setVisible(true);
      this.dispose();
    }//GEN-LAST:event_jButton4ActionPerformed

    private void jButton5ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton5ActionPerformed
        if(sc_name.getText().isEmpty()|| sc_type.getText().isEmpty()){
            JOptionPane.showMessageDialog(null,"All Fields are Required!");
        }else{
        
        
        dbConnector dbc= new dbConnector();
       dbc.updateData("UPDATE tbl_scholarship SET scholarship_name='"+sc_name.getText()+"', scholarship_type='"+sc_type.getText()+"',"
               + " scholarship_description='"+sc_des.getText()+"' WHERE scholarship_id='"+sc_id.getText()+"'");
   
             
             scholarshippage uf= new scholarshippage();
               uf.setVisible(true);
               this.dispose(); 
        }
        
    }//GEN-LAST:event_jButton5ActionPerformed

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
            java.util.logging.Logger.getLogger(updateScholarForm.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(updateScholarForm.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(updateScholarForm.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(updateScholarForm.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new updateScholarForm().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    public javax.swing.JButton jButton4;
    public javax.swing.JButton jButton5;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel18;
    private javax.swing.JLabel jLabel28;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JPanel jPanel20;
    private javax.swing.JPanel jPanel21;
    private javax.swing.JPanel jPanel34;
    public javax.swing.JTextField sc_des;
    public javax.swing.JTextField sc_id;
    public javax.swing.JTextField sc_name;
    public javax.swing.JTextField sc_type;
    // End of variables declaration//GEN-END:variables
}
