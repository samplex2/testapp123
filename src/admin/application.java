/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package admin;

import config.Tableprinter;
import config.dbConnector;
import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JOptionPane;
import javax.swing.table.TableModel;
import net.proteanit.sql.DbUtils;
import testapp2.loginform;

/**
 *
 * @author USER
 */
public class application extends javax.swing.JFrame {

    String ad;

    /**
     * Creates new form userform3
     */
    public application() {
        initComponents();
          }
  
    public void display(){
        dbConnector dbc = new dbConnector();
        
        try {
            ResultSet res = dbc.getData(("SELECT app.application_id ,stud.student_name, sch.scholarship_id , sch.scholarship_name,sch.scholarship_type, sch.scholarship_status,sch.scholarship_description "
                    + "FROM tbl_application AS app "
                    + "JOIN tbl_student AS stud ON app.student_id= stud.student_id "
                    + "JOIN tbl_scholarship AS sch ON app.scholarship_id = sch.scholarship_id; "));
           application.setModel(DbUtils.resultSetToTableModel(res));
        } catch (SQLException ex) {
            Logger.getLogger(applyscholarship.class.getName()).log(Level.SEVERE, null, ex);
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

        jPanel1 = new javax.swing.JPanel();
        jScrollPane2 = new javax.swing.JScrollPane();
        application = new javax.swing.JTable();
        jButton2 = new javax.swing.JButton();
        jButton1 = new javax.swing.JButton();
        DELETE = new javax.swing.JButton();
        jButton4 = new javax.swing.JButton();
        jButton3 = new javax.swing.JButton();
        jLabel1 = new javax.swing.JLabel();
        DELETE1 = new javax.swing.JButton();
        jLabel3 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        addWindowListener(new java.awt.event.WindowAdapter() {
            public void windowActivated(java.awt.event.WindowEvent evt) {
                formWindowActivated(evt);
            }
            public void windowClosed(java.awt.event.WindowEvent evt) {
                formWindowClosed(evt);
            }
        });

        jPanel1.setLayout(null);

        application.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                applicationMouseClicked(evt);
            }
        });
        jScrollPane2.setViewportView(application);

        jPanel1.add(jScrollPane2);
        jScrollPane2.setBounds(20, 120, 582, 425);

        jButton2.setText("ADD");
        jButton2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton2ActionPerformed(evt);
            }
        });
        jPanel1.add(jButton2);
        jButton2.setBounds(30, 50, 70, 40);

        jButton1.setFont(new java.awt.Font("Arial", 1, 12)); // NOI18N
        jButton1.setForeground(new java.awt.Color(255, 0, 0));
        jButton1.setText("BACK");
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });
        jPanel1.add(jButton1);
        jButton1.setBounds(510, 50, 79, 40);

        DELETE.setText("ARCHIVE");
        DELETE.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                DELETEActionPerformed(evt);
            }
        });
        jPanel1.add(DELETE);
        DELETE.setBounds(310, 50, 79, 40);

        jButton4.setText("REFRESH");
        jButton4.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton4ActionPerformed(evt);
            }
        });
        jPanel1.add(jButton4);
        jButton4.setBounds(210, 50, 77, 40);

        jButton3.setText("EDIT");
        jButton3.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton3ActionPerformed(evt);
            }
        });
        jPanel1.add(jButton3);
        jButton3.setBounds(120, 50, 77, 40);

        jLabel1.setFont(new java.awt.Font("Tahoma", 1, 24)); // NOI18N
        jLabel1.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel1.setText("REPORTS");
        jPanel1.add(jLabel1);
        jLabel1.setBounds(-150, -70, 130, 30);

        DELETE1.setText("PRINT");
        DELETE1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                DELETE1ActionPerformed(evt);
            }
        });
        jPanel1.add(DELETE1);
        DELETE1.setBounds(410, 50, 79, 40);

        jLabel3.setIcon(new javax.swing.ImageIcon(getClass().getResource("/icons/scholarship.jpg"))); // NOI18N
        jPanel1.add(jLabel3);
        jLabel3.setBounds(0, 0, 610, 580);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, 612, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, 574, Short.MAX_VALUE)
        );

        pack();
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void applicationMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_applicationMouseClicked

    }//GEN-LAST:event_applicationMouseClicked

    private void jButton2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton2ActionPerformed
      applyscholarship usf = new applyscholarship();
        usf.setVisible(true);
        this.dispose();
    }//GEN-LAST:event_jButton2ActionPerformed

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
      admindashboard usf = new admindashboard();
        usf.setVisible(true);
        this.dispose();        
    }//GEN-LAST:event_jButton1ActionPerformed

    private void jButton3ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton3ActionPerformed
int rowIndex = application.getSelectedRow();

        if (rowIndex < 0) {
            JOptionPane.showMessageDialog(null, "Please Select an Item!");
        } else {
            TableModel model = application.getModel();
           upscholar usf = new upscholar();
            usf.sc_id.setText("" + model.getValueAt(rowIndex, 2));
            usf.sname.setText("" + model.getValueAt(rowIndex, 3));
            usf.stype.setText("" + model.getValueAt(rowIndex, 4));
            usf.sstatus.setSelectedItem("" + model.getValueAt(rowIndex, 5));
            usf.sdescription.setText("" + model.getValueAt(rowIndex, 6));
          
            usf.setVisible(true);
            this.hide();
         
        }

    }//GEN-LAST:event_jButton3ActionPerformed

    private void formWindowActivated(java.awt.event.WindowEvent evt) {//GEN-FIRST:event_formWindowActivated
       display();
    }//GEN-LAST:event_formWindowActivated

    private void DELETEActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_DELETEActionPerformed
    dbConnector dbc= new dbConnector();
    TableModel model = application.getModel();
        int rowIndex = application.getSelectedRow();

        if (rowIndex < 0) {
            JOptionPane.showMessageDialog(null, "Please Select an Item!");
        } else {
            dbc.deleteData(Integer.parseInt(model.getValueAt(rowIndex, 0).toString()), "tbl_applications", "application_id");
  
        }
    }//GEN-LAST:event_DELETEActionPerformed

    private void jButton4ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton4ActionPerformed
        display();
    }//GEN-LAST:event_jButton4ActionPerformed

    private void DELETE1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_DELETE1ActionPerformed
     Tableprinter tl= new Tableprinter(application,"Reports"); 
     tl.print();
    }//GEN-LAST:event_DELETE1ActionPerformed

    private void formWindowClosed(java.awt.event.WindowEvent evt) {//GEN-FIRST:event_formWindowClosed
        // TODO add your handling code here:
    }//GEN-LAST:event_formWindowClosed

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
            java.util.logging.Logger.getLogger(application.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(application.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(application.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(application.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new application().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton DELETE;
    private javax.swing.JButton DELETE1;
    public javax.swing.JTable application;
    private javax.swing.JButton jButton1;
    private javax.swing.JButton jButton2;
    private javax.swing.JButton jButton3;
    private javax.swing.JButton jButton4;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JScrollPane jScrollPane2;
    // End of variables declaration//GEN-END:variables
}