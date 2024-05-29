/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package admin;

import static admin.updateScholarForm.ads;
import config.dbConnector;
import java.awt.Color;
import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.SQLException;
import javax.swing.JOptionPane;
import javax.swing.table.TableModel;
import net.proteanit.sql.DbUtils;
import testapp2.loginform;

/**
 *
 * @author USER
 */
public class studentPage extends javax.swing.JFrame {

    String ads;
    String ad;
    String uname;

    /**
     * Creates new form userform2
     */
    public studentPage() {
        initComponents();
        displayDatas();
    }
     Color navcolor = new Color(51,204,255);
     Color hovercolor = new Color (255,204,255);
   public void displayDatas(){
    try{
        dbConnector dbc = new dbConnector();
        ResultSet rs = dbc.getData("SELECT student_id,student_name,student_email,student_gender,student_course,student_contact,image FROM tbl_student");
        scholarshiptable.setModel(DbUtils.resultSetToTableModel(rs));
        rs.close();
    } catch(SQLException ex){
        System.out.println("Errors: "+ex.getMessage());
    }

   }

    
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        jPanel2 = new javax.swing.JPanel();
        jLabel7 = new javax.swing.JLabel();
        currentuser = new javax.swing.JLabel();
        userid = new javax.swing.JLabel();
        p_add = new javax.swing.JPanel();
        jLabel5 = new javax.swing.JLabel();
        update = new javax.swing.JPanel();
        jLabel3 = new javax.swing.JLabel();
        p_delete = new javax.swing.JPanel();
        jLabel9 = new javax.swing.JLabel();
        userstable = new javax.swing.JScrollPane();
        scholarshiptable = new javax.swing.JTable();
        jLabel1 = new javax.swing.JLabel();
        jButton2 = new javax.swing.JButton();
        jPanel3 = new javax.swing.JPanel();
        jLabel2 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jPanel1.setLayout(null);

        jPanel2.setBackground(new java.awt.Color(255, 255, 204));
        jPanel2.setLayout(null);

        jLabel7.setFont(new java.awt.Font("Arial", 1, 18)); // NOI18N
        jLabel7.setIcon(new javax.swing.ImageIcon(getClass().getResource("/icons/icons8-student-100.png"))); // NOI18N
        jPanel2.add(jLabel7);
        jLabel7.setBounds(470, 10, 120, 100);

        currentuser.setFont(new java.awt.Font("Arial", 3, 14)); // NOI18N
        currentuser.setText("Current User");
        jPanel2.add(currentuser);
        currentuser.setBounds(490, 120, 90, 17);

        userid.setText("User ID");
        jPanel2.add(userid);
        userid.setBounds(490, 150, 36, 14);

        p_add.setBackground(new java.awt.Color(51, 204, 255));
        p_add.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                p_addMouseClicked(evt);
            }
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                p_addMouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                p_addMouseExited(evt);
            }
        });
        p_add.setLayout(null);

        jLabel5.setFont(new java.awt.Font("Arial", 3, 14)); // NOI18N
        jLabel5.setText("ADD");
        p_add.add(jLabel5);
        jLabel5.setBounds(30, 10, 30, 17);

        jPanel2.add(p_add);
        p_add.setBounds(20, 60, 90, 30);

        update.setBackground(new java.awt.Color(51, 204, 255));
        update.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                updateMouseClicked(evt);
            }
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                updateMouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                updateMouseExited(evt);
            }
        });
        update.setLayout(null);

        jLabel3.setFont(new java.awt.Font("Arial", 3, 14)); // NOI18N
        jLabel3.setText("EDIT");
        update.add(jLabel3);
        jLabel3.setBounds(30, 10, 31, 17);

        jPanel2.add(update);
        update.setBounds(20, 100, 90, 30);

        p_delete.setBackground(new java.awt.Color(51, 204, 255));
        p_delete.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                p_deleteMouseClicked(evt);
            }
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                p_deleteMouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                p_deleteMouseExited(evt);
            }
        });
        p_delete.setLayout(null);

        jLabel9.setFont(new java.awt.Font("Arial", 3, 14)); // NOI18N
        jLabel9.setText("DELETE");
        p_delete.add(jLabel9);
        jLabel9.setBounds(20, 10, 60, 17);

        jPanel2.add(p_delete);
        p_delete.setBounds(20, 140, 90, 30);

        userstable.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                userstableMouseClicked(evt);
            }
        });

        scholarshiptable.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {

            }
        ));
        scholarshiptable.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                scholarshiptableMouseClicked(evt);
            }
        });
        userstable.setViewportView(scholarshiptable);

        jPanel2.add(userstable);
        userstable.setBounds(10, 180, 530, 280);

        jLabel1.setFont(new java.awt.Font("Arial", 3, 36)); // NOI18N
        jLabel1.setText("Student Information");
        jPanel2.add(jLabel1);
        jLabel1.setBounds(20, 10, 480, 40);

        jButton2.setFont(new java.awt.Font("Arial Black", 1, 12)); // NOI18N
        jButton2.setForeground(new java.awt.Color(51, 204, 255));
        jButton2.setText("Print");
        jButton2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton2ActionPerformed(evt);
            }
        });
        jPanel2.add(jButton2);
        jButton2.setBounds(570, 277, 90, 60);

        jPanel3.setBackground(new java.awt.Color(51, 204, 255));
        jPanel3.setLayout(null);

        jLabel2.setBackground(new java.awt.Color(255, 255, 255));
        jLabel2.setFont(new java.awt.Font("Arial", 1, 24)); // NOI18N
        jLabel2.setForeground(new java.awt.Color(0, 51, 51));
        jLabel2.setText("Back");
        jLabel2.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jLabel2MouseClicked(evt);
            }
        });
        jPanel3.add(jLabel2);
        jLabel2.setBounds(10, 0, 60, 30);

        jPanel2.add(jPanel3);
        jPanel3.setBounds(580, 400, 80, 30);

        jLabel4.setIcon(new javax.swing.ImageIcon(getClass().getResource("/icons/scholarship.jpg"))); // NOI18N
        jPanel2.add(jLabel4);
        jLabel4.setBounds(0, 0, 680, 470);

        jPanel1.add(jPanel2);
        jPanel2.setBounds(0, 0, 680, 470);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, 679, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, 468, Short.MAX_VALUE)
        );

        pack();
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void userstableMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_userstableMouseClicked

    }//GEN-LAST:event_userstableMouseClicked

    private void scholarshiptableMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_scholarshiptableMouseClicked

    }//GEN-LAST:event_scholarshiptableMouseClicked

    private void jLabel2MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabel2MouseClicked
        admindashboard ds = new admindashboard ();
        ds.setVisible(true);
        this.dispose();
    }//GEN-LAST:event_jLabel2MouseClicked

    private void p_deleteMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_p_deleteMouseExited
        p_delete.setBackground(navcolor);
    }//GEN-LAST:event_p_deleteMouseExited

    private void p_deleteMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_p_deleteMouseEntered
        p_delete.setBackground(hovercolor);
    }//GEN-LAST:event_p_deleteMouseEntered

    private void p_deleteMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_p_deleteMouseClicked
        int rowIndex = scholarshiptable.getSelectedRow();

        if (rowIndex < 0) {
            JOptionPane.showMessageDialog(null, "Please select a data first");
        } else {
            TableModel model = scholarshiptable.getModel();
            Object value = model.getValueAt(rowIndex, 0);
            String id = value.toString();
            int a = JOptionPane.showConfirmDialog(null, "Are you sure?");
            if (a == JOptionPane.YES_OPTION) {
                dbConnector dbc = new dbConnector();
                dbc.delete(Integer.parseInt(id));
                displayData();

            }

        }
    }//GEN-LAST:event_p_deleteMouseClicked

    private void updateMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_updateMouseExited
        update.setBackground(navcolor);
    }//GEN-LAST:event_updateMouseExited

    private void updateMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_updateMouseEntered
        update.setBackground(hovercolor);
    }//GEN-LAST:event_updateMouseEntered

    private void updateMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_updateMouseClicked
        int rowIndex = scholarshiptable.getSelectedRow();
loginform lb = new loginform();
admindashboard ad = new admindashboard();

Connection conn;
String newImage = null;


if (rowIndex < 0) {
    JOptionPane.showMessageDialog(null, "Please Select an Item!");
} else {
    TableModel model = scholarshiptable.getModel();
    int columnCount = model.getColumnCount();
    
    // Ensure the table has enough columns to avoid ArrayIndexOutOfBoundsException
    if (columnCount >= 5) {
        updateStudentForm usf = new updateStudentForm();
        
        usf.update_id.setText("" + model.getValueAt(rowIndex, 0));
        usf.fname.setText("" + model.getValueAt(rowIndex, 1));
        usf.email.setText("" + model.getValueAt(rowIndex, 2));
        usf.contact.setText("" + model.getValueAt(rowIndex, 3));
        usf.course.setText("" + model.getValueAt(rowIndex, 4));
        usf.genders.setSelectedItem(model.getValueAt(rowIndex, 4).toString());
        usf.status.setSelectedItem(model.getValueAt(rowIndex, 5).toString());
        usf.setVisible(true);
        this.hide();
        usf.ads = ads;
    } else {
        JOptionPane.showMessageDialog(null, "Table does not have enough columns!");
    }
}

    }//GEN-LAST:event_updateMouseClicked

    private void p_addMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_p_addMouseExited

        p_add.setBackground(navcolor);
    }//GEN-LAST:event_p_addMouseExited

    private void p_addMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_p_addMouseEntered

        p_add.setBackground(hovercolor);
    }//GEN-LAST:event_p_addMouseEntered

    private void p_addMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_p_addMouseClicked
      addStudentForm asf = new addStudentForm();
             asf.setVisible(true);
             this.dispose();
         
        this.dispose();
    }//GEN-LAST:event_p_addMouseClicked

    private void jButton2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton2ActionPerformed
        int rowIndex = scholarshiptable.getSelectedRow();

        if(rowIndex<0){
            JOptionPane.showMessageDialog(null,"Please Select some Item");
        }else{

            try{
                dbConnector dbc = new dbConnector();
                TableModel tbl = scholarshiptable.getModel();
                ResultSet rs = dbc.getData("SELECT * FROM tbl_user WHERE u_id = '"+tbl.getValueAt(rowIndex,0)+"'");
                if(rs.next()){
                    printform pf = new printform();
                    pf.uid.setText(""+rs.getInt("u_id"));
                    pf.fname.setText(""+rs.getString("u_fname"));
                    pf.lname.setText(""+rs.getString("u_lname"));
                    pf.email.setText(""+rs.getString("u_email"));
                    pf.username.setText(""+rs.getString("u_username"));
                    pf.usertype.setText(""+rs.getString("u_type"));
                    pf.status.setText(""+rs.getString("u_status"));
                    pf.image.setIcon(pf.ResizeImage(rs.getString("u_image"),null, pf.image));
                    pf.setVisible(true);
                    this.dispose();

                    this.dispose();

                }
            }catch(SQLException ex){
                System.out.println(""+ex);
            }
        }

    }//GEN-LAST:event_jButton2ActionPerformed

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
            java.util.logging.Logger.getLogger(studentPage.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(studentPage.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(studentPage.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(studentPage.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new studentPage().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    public javax.swing.JLabel currentuser;
    private javax.swing.JButton jButton2;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JPanel jPanel3;
    private javax.swing.JPanel p_add;
    private javax.swing.JPanel p_delete;
    private javax.swing.JTable scholarshiptable;
    private javax.swing.JPanel update;
    public javax.swing.JLabel userid;
    private javax.swing.JScrollPane userstable;
    // End of variables declaration//GEN-END:variables

    private void displayData() {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }
}
