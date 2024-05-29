/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package admin;

import config.dbConnector;
import java.awt.Image;
import java.awt.image.BufferedImage;
import java.io.File;
import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.nio.file.StandardCopyOption;
import java.sql.ResultSet;
import java.sql.SQLException;
import javax.imageio.ImageIO;
import javax.swing.ImageIcon;
import javax.swing.JFileChooser;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import static testapp2.registrationForm.mail;
import static testapp2.registrationForm.usname;


/**
 *
 * @author USER
 */
public class createuserform extends javax.swing.JFrame {

    /**
     * Creates new form createuserform
     */
    public createuserform() {
        initComponents();
    }
    
    public String destination= "";
    File selectedFile;
    public String oldpath;
    public String path;
    
    public int FileExistenceChecker(String path){
        File file = new File(path);
        String fileName = file.getName();
        
        Path filePath = Paths.get("src/userimages", fileName);
        boolean fileExists = Files.exists(filePath);
        
        if (fileExists) {
            return 1;
        } else {
            return 0;
        }
    
    }
    public static int getHeightFromWidth(String imagePath, int desiredWidth) {
        try {
            // Read the image file
            File imageFile = new File(imagePath);
            BufferedImage image = ImageIO.read(imageFile);
            
            // Get the original width and height of the image
            int originalWidth = image.getWidth();
            int originalHeight = image.getHeight();
            
            // Calculate the new height based on the desired width and the aspect ratio
            int newHeight = (int) ((double) desiredWidth / originalWidth * originalHeight);
            
            return newHeight;
        } catch (IOException ex) {
            System.out.println("No image found!");
        }
        
        return -1;
    }
    
    
    
    
    public  ImageIcon ResizeImage(String ImagePath, byte[] pic, JLabel label) {
    ImageIcon MyImage = null;
        if(ImagePath !=null){
            MyImage = new ImageIcon(ImagePath);
        }else{
            MyImage = new ImageIcon(pic);
        }
        
    int newHeight = getHeightFromWidth(ImagePath, label.getWidth());

    Image img = MyImage.getImage();
    Image newImg = img.getScaledInstance(label.getWidth(), newHeight, Image.SCALE_SMOOTH);
    ImageIcon image = new ImageIcon(newImg);
    return image;
}
    
   public void imageUpdater(String existingFilePath, String newFilePath){
        File existingFile = new File(existingFilePath);
        if (existingFile.exists()) {
            String parentDirectory = existingFile.getParent();
            File newFile = new File(newFilePath);
            String newFileName = newFile.getName();
            File updatedFile = new File(parentDirectory, newFileName);
            existingFile.delete();
            try {
                Files.copy(newFile.toPath(), updatedFile.toPath(), StandardCopyOption.REPLACE_EXISTING);
                System.out.println("Image updated successfully.");
            } catch (IOException e) {
                System.out.println("Error occurred while updating the image: "+e);
            }
        } else {
            try{
                Files.copy(selectedFile.toPath(), new File(destination).toPath(), StandardCopyOption.REPLACE_EXISTING);
            }catch(IOException e){
                System.out.println("Error on update!");
            }
        }
   }  
    
    
    
    
    
    
    
    public boolean duplicateCheck(){
    dbConnector dbc = new dbConnector();
    try{
       String query = "SELECT * FROM tbl_user WHERE u_username = '" + username.getText() + "' OR u_email = '" + email.getText() + "'";

            ResultSet resultSet =dbc.getData(query);
        if(resultSet.next()){
           mail = resultSet.getString("u_email");
            System.out.println(""+mail);
            if(mail.equals(email.getText())){
                JOptionPane.showMessageDialog(null,"Email is Already Used!");
              email.setText("");
            }
            usname = resultSet.getString("u_username");
            if(usname.equals(username.getText())){
                JOptionPane.showMessageDialog(null,"Username is Already Used!");
              username.setText("");
            } 
           usname = resultSet.getString("u_username");
             return true;
        }else{
            return false;
        }
    }catch(SQLException ex){
        System.out.println(""+ex);
        return false;
    }
}
    public boolean updateCheck(){
    dbConnector dbc = new dbConnector();
    try{
        String query = "SELECT * FROM tbl_user WHERE (u_username = '"+username.getText()+"' OR u_email = '"+email.getText()+"') AND u_id !='"+uid.getText()+"'";

            ResultSet resultSet =dbc.getData(query);
        if(resultSet.next()){
           mail = resultSet.getString("u_email");
            System.out.println(""+mail);
            if(mail.equals(email.getText())){
                JOptionPane.showMessageDialog(null,"Email is Already Used!");
              email.setText("");
            }
            usname = resultSet.getString("u_username");
            if(usname.equals(username.getText())){
                JOptionPane.showMessageDialog(null,"Username is Already Used!");
              username.setText("");
            } 
           usname = resultSet.getString("u_username");
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

        jLabel9 = new javax.swing.JLabel();
        jPanel1 = new javax.swing.JPanel();
        fname = new javax.swing.JTextField();
        password = new javax.swing.JTextField();
        jLabel7 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        us = new javax.swing.JComboBox<>();
        uid = new javax.swing.JTextField();
        jLabel8 = new javax.swing.JLabel();
        username = new javax.swing.JTextField();
        email = new javax.swing.JTextField();
        usertype = new javax.swing.JComboBox<>();
        jLabel6 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        lname = new javax.swing.JTextField();
        jLabel1 = new javax.swing.JLabel();
        REFRESH = new javax.swing.JButton();
        CANCEL = new javax.swing.JButton();
        UPDATE = new javax.swing.JButton();
        ADD = new javax.swing.JButton();
        jPanel2 = new javax.swing.JPanel();
        image = new javax.swing.JLabel();
        remove = new javax.swing.JButton();
        select = new javax.swing.JButton();
        jLabel10 = new javax.swing.JLabel();

        jLabel9.setText("jLabel9");

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jPanel1.setBackground(new java.awt.Color(153, 255, 153));
        jPanel1.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());
        jPanel1.add(fname, new org.netbeans.lib.awtextra.AbsoluteConstraints(170, 100, 125, -1));
        jPanel1.add(password, new org.netbeans.lib.awtextra.AbsoluteConstraints(170, 230, 125, -1));

        jLabel7.setBackground(new java.awt.Color(255, 255, 255));
        jLabel7.setFont(new java.awt.Font("Arial Black", 1, 12)); // NOI18N
        jLabel7.setForeground(new java.awt.Color(204, 204, 0));
        jLabel7.setText("Userstatus :");
        jPanel1.add(jLabel7, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 290, -1, 20));

        jLabel3.setBackground(new java.awt.Color(255, 255, 255));
        jLabel3.setFont(new java.awt.Font("Arial Black", 1, 12)); // NOI18N
        jLabel3.setForeground(new java.awt.Color(204, 204, 0));
        jLabel3.setText("Email :");
        jPanel1.add(jLabel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 170, -1, 20));

        us.setForeground(new java.awt.Color(204, 204, 0));
        us.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Active", "Pending", " " }));
        us.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                usActionPerformed(evt);
            }
        });
        jPanel1.add(us, new org.netbeans.lib.awtextra.AbsoluteConstraints(170, 290, 125, -1));

        uid.setEnabled(false);
        jPanel1.add(uid, new org.netbeans.lib.awtextra.AbsoluteConstraints(170, 70, 125, -1));

        jLabel8.setBackground(new java.awt.Color(255, 255, 255));
        jLabel8.setFont(new java.awt.Font("Arial Black", 1, 12)); // NOI18N
        jLabel8.setForeground(new java.awt.Color(204, 204, 0));
        jLabel8.setText("UserID :");
        jPanel1.add(jLabel8, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 70, -1, 20));
        jPanel1.add(username, new org.netbeans.lib.awtextra.AbsoluteConstraints(170, 200, 125, -1));

        email.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                emailActionPerformed(evt);
            }
        });
        jPanel1.add(email, new org.netbeans.lib.awtextra.AbsoluteConstraints(170, 170, 125, -1));

        usertype.setForeground(new java.awt.Color(204, 204, 0));
        usertype.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Admin", "Student" }));
        usertype.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                usertypeActionPerformed(evt);
            }
        });
        jPanel1.add(usertype, new org.netbeans.lib.awtextra.AbsoluteConstraints(170, 260, 125, -1));

        jLabel6.setBackground(new java.awt.Color(255, 255, 255));
        jLabel6.setFont(new java.awt.Font("Arial Black", 1, 12)); // NOI18N
        jLabel6.setForeground(new java.awt.Color(204, 204, 0));
        jLabel6.setText("Usertype :");
        jPanel1.add(jLabel6, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 260, -1, 20));

        jLabel5.setBackground(new java.awt.Color(255, 255, 255));
        jLabel5.setFont(new java.awt.Font("Arial Black", 1, 12)); // NOI18N
        jLabel5.setForeground(new java.awt.Color(204, 204, 0));
        jLabel5.setText("Password :");
        jPanel1.add(jLabel5, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 230, -1, 20));

        jLabel4.setBackground(new java.awt.Color(255, 255, 255));
        jLabel4.setFont(new java.awt.Font("Arial Black", 1, 12)); // NOI18N
        jLabel4.setForeground(new java.awt.Color(204, 204, 0));
        jLabel4.setText("Username :");
        jPanel1.add(jLabel4, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 200, -1, 20));

        jLabel2.setBackground(new java.awt.Color(255, 255, 255));
        jLabel2.setFont(new java.awt.Font("Arial Black", 1, 12)); // NOI18N
        jLabel2.setForeground(new java.awt.Color(204, 204, 0));
        jLabel2.setText("Lastname :");
        jPanel1.add(jLabel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 140, -1, 20));
        jPanel1.add(lname, new org.netbeans.lib.awtextra.AbsoluteConstraints(170, 130, 125, -1));

        jLabel1.setBackground(new java.awt.Color(255, 255, 255));
        jLabel1.setFont(new java.awt.Font("Arial Black", 1, 12)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(204, 204, 0));
        jLabel1.setText("Firstname :");
        jPanel1.add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 100, -1, 20));

        REFRESH.setBackground(new java.awt.Color(255, 255, 255));
        REFRESH.setFont(new java.awt.Font("Arial Black", 1, 12)); // NOI18N
        REFRESH.setForeground(new java.awt.Color(204, 204, 0));
        REFRESH.setText("Refresh");
        REFRESH.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                REFRESHActionPerformed(evt);
            }
        });
        jPanel1.add(REFRESH, new org.netbeans.lib.awtextra.AbsoluteConstraints(170, 380, 90, -1));

        CANCEL.setBackground(new java.awt.Color(255, 255, 255));
        CANCEL.setFont(new java.awt.Font("Arial Black", 1, 12)); // NOI18N
        CANCEL.setForeground(new java.awt.Color(204, 204, 0));
        CANCEL.setText("Cancel");
        CANCEL.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                CANCELActionPerformed(evt);
            }
        });
        jPanel1.add(CANCEL, new org.netbeans.lib.awtextra.AbsoluteConstraints(60, 380, 90, -1));

        UPDATE.setBackground(new java.awt.Color(255, 255, 255));
        UPDATE.setFont(new java.awt.Font("Arial Black", 1, 12)); // NOI18N
        UPDATE.setForeground(new java.awt.Color(204, 204, 0));
        UPDATE.setText("Update");
        UPDATE.setEnabled(false);
        UPDATE.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                UPDATEActionPerformed(evt);
            }
        });
        jPanel1.add(UPDATE, new org.netbeans.lib.awtextra.AbsoluteConstraints(170, 340, 90, -1));

        ADD.setBackground(new java.awt.Color(255, 255, 255));
        ADD.setFont(new java.awt.Font("Arial Black", 1, 12)); // NOI18N
        ADD.setForeground(new java.awt.Color(204, 204, 0));
        ADD.setText("Add");
        ADD.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                ADDActionPerformed(evt);
            }
        });
        jPanel1.add(ADD, new org.netbeans.lib.awtextra.AbsoluteConstraints(60, 340, 90, -1));

        jPanel2.setLayout(null);
        jPanel2.add(image);
        image.setBounds(4, 14, 170, 210);

        jPanel1.add(jPanel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(380, 51, 180, 240));

        remove.setForeground(new java.awt.Color(204, 204, 0));
        remove.setText("REMOVE");
        remove.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                removeActionPerformed(evt);
            }
        });
        jPanel1.add(remove, new org.netbeans.lib.awtextra.AbsoluteConstraints(470, 330, -1, -1));

        select.setForeground(new java.awt.Color(204, 204, 0));
        select.setText("SELECT");
        select.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                selectMouseClicked(evt);
            }
        });
        jPanel1.add(select, new org.netbeans.lib.awtextra.AbsoluteConstraints(370, 330, -1, -1));

        jLabel10.setIcon(new javax.swing.ImageIcon(getClass().getResource("/icons/scholarship.jpg"))); // NOI18N
        jPanel1.add(jLabel10, new org.netbeans.lib.awtextra.AbsoluteConstraints(-10, 0, 880, 560));

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );

        pack();
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void emailActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_emailActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_emailActionPerformed

    private void ADDActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_ADDActionPerformed
        
          
        if(fname.getText().isEmpty()|| lname.getText().isEmpty()|| email.getText().isEmpty()
            || username.getText().isEmpty()|| password.getText().isEmpty()){
            JOptionPane.showMessageDialog(null,"All Fields are Required!");
        }else if(password.getText().length()<8){
            password.setText("");
            JOptionPane.showMessageDialog(null,"Password character should be 8 above!");
        }else if(duplicateCheck()){
            System.out.println("Duplicate Exist");
       
        }else{
            dbConnector dbc = new dbConnector();
            if(dbc.insertData("INSERT INTO tbl_user(u_fname,u_lname,u_email,u_username,u_password,u_type,u_status,u_image)"
                + "VALUES('"+fname.getText()+"','"+lname.getText()+"','"+email.getText()+"','"+username.getText()+"',"
               + "'"+password.getText()+"','"+usertype.getSelectedItem()+"','"+us.getSelectedItem()+"','"+destination+"')"))
        {
            try{
            Files.copy(selectedFile.toPath(),new File(destination).toPath(),StandardCopyOption.REPLACE_EXISTING);
            JOptionPane.showMessageDialog(null,"Registration Success!");
            userform uf= new userform();
            uf.setVisible(true);
            this.dispose(); 
        }catch(IOException ex){
                System.out.println("Insert Image Error "+ex);
                }
        }else{
     
            JOptionPane.showMessageDialog(null,"Connection Error!");
                }
        }
    }//GEN-LAST:event_ADDActionPerformed

    private void usertypeActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_usertypeActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_usertypeActionPerformed

    private void usActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_usActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_usActionPerformed

    private void UPDATEActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_UPDATEActionPerformed
       if(fname.getText().isEmpty()|| lname.getText().isEmpty()|| email.getText().isEmpty()
            || username.getText().isEmpty()|| password.getText().isEmpty()){
            JOptionPane.showMessageDialog(null,"All Fields are Required!");
        }else if(password.getText().length()<8){
            password.setText("");
            JOptionPane.showMessageDialog(null,"Password character should be 8 above!");
        }else if(updateCheck()){
            System.out.println("Duplicate Exist");
       
        }else{
        
        
        dbConnector dbc= new dbConnector();
       dbc.updateData("UPDATE tbl_user SET u_fname= '"+fname.getText()+"', u_lname='"+lname.getText()+"', u_email='"+email.getText()+"',"
               + " u_username='"+username.getText()+"',u_password='"+password.getText()+"', u_type='"+usertype.getSelectedItem()+"',"
               + " u_status= '"+us.getSelectedItem()+"',u_image='"+destination+"' WHERE u_id= '"+uid.getText()+"'");
   
               if(destination.isEmpty()){
                   File existingFile = new File (oldpath);
                   if(existingFile.exists   ()){
                       existingFile.delete();
                   }
               }else{
                   if(!(oldpath.equals(path))){
                       imageUpdater(oldpath,path);
                   }
               }
               userform uf= new userform();
               uf.setVisible(true);
               this.dispose(); 
        }
    }//GEN-LAST:event_UPDATEActionPerformed

    private void CANCELActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_CANCELActionPerformed
      userform uf= new userform();
      uf.setVisible(true);
      this.dispose();
    }//GEN-LAST:event_CANCELActionPerformed

    private void REFRESHActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_REFRESHActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_REFRESHActionPerformed

    private void selectMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_selectMouseClicked
     JFileChooser fileChooser = new JFileChooser();
                int returnValue = fileChooser.showOpenDialog(null);
                if (returnValue == JFileChooser.APPROVE_OPTION) {
                    try {
                        selectedFile = fileChooser.getSelectedFile();
                        destination = "src/userimages/" + selectedFile.getName();
                        path  = selectedFile.getAbsolutePath();
                        
                        
                        if(FileExistenceChecker(path) == 1){
                          JOptionPane.showMessageDialog(null, "File Already Exist, Rename or Choose another!");
                            destination = "";
                            path="";
                        }else{
                            image.setIcon(ResizeImage(path, null, image));
                            select.setEnabled(false);
                            remove.setEnabled(true);   
                        }
                    } catch (Exception ex) {
                        System.out.println("File Error!");
                    }
                }
    }//GEN-LAST:event_selectMouseClicked

    private void removeActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_removeActionPerformed
     remove.setEnabled(false);
     select.setEnabled(true);
     image.setIcon(null);
     destination ="";
     path =  "";
    }//GEN-LAST:event_removeActionPerformed

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
            java.util.logging.Logger.getLogger(createuserform.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(createuserform.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(createuserform.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(createuserform.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new createuserform().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    public javax.swing.JButton ADD;
    public javax.swing.JButton CANCEL;
    public javax.swing.JButton REFRESH;
    public javax.swing.JButton UPDATE;
    public javax.swing.JTextField email;
    public javax.swing.JTextField fname;
    public javax.swing.JLabel image;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel10;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    public javax.swing.JTextField lname;
    public javax.swing.JTextField password;
    public javax.swing.JButton remove;
    public javax.swing.JButton select;
    public javax.swing.JTextField uid;
    public javax.swing.JComboBox<String> us;
    public javax.swing.JTextField username;
    public javax.swing.JComboBox<String> usertype;
    // End of variables declaration//GEN-END:variables

    private void displayData() {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }
}
