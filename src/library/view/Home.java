/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */
package library.view;

import java.awt.Image;
import java.net.URL;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.ImageIcon;
import javax.swing.JFrame;

/**
 *
 * @author Nawanjana
 */
public class Home extends javax.swing.JFrame {

    /**
     * Creates new form Home
     */
    public Home() {
     initComponents();

        this.setLocationRelativeTo(null);

        DisplayImage();
         setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);
        
    }
    private void DisplayImage() {
        try {
            // Debugging: Print the URL to see if it is correctly loaded
            URL imgUrl = getClass().getResource("/images/Home.jfif");
            if (imgUrl != null) {
                System.out.println("Image URL: " + imgUrl.toString());
                ImageIcon imageIcon = new ImageIcon(imgUrl);
                Image image = imageIcon.getImage().getScaledInstance(lbl_bg.getWidth(), lbl_bg.getHeight(), Image.SCALE_SMOOTH);
                lbl_bg.setIcon(new ImageIcon(image));
            } else {
                Logger.getLogger(Login.class.getName()).log(Level.SEVERE, "Image not found");
            }
        } catch (NullPointerException e) {
            Logger.getLogger(Login.class.getName()).log(Level.SEVERE, "Image not found", e);
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

        jLabel3 = new javax.swing.JLabel();
        lbl_welcome = new javax.swing.JLabel();
        btn_student = new javax.swing.JButton();
        btn_categories = new javax.swing.JButton();
        btn_books = new javax.swing.JButton();
        btn_borrowing = new javax.swing.JButton();
        btn_fines = new javax.swing.JButton();
        lbl_bg = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());
        getContentPane().add(jLabel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(50, 20, -1, -1));

        lbl_welcome.setFont(new java.awt.Font("Segoe UI", 1, 36)); // NOI18N
        lbl_welcome.setText("WELCOME TO ADMIN PANEL");
        getContentPane().add(lbl_welcome, new org.netbeans.lib.awtextra.AbsoluteConstraints(150, 20, 530, 50));

        btn_student.setBackground(new java.awt.Color(153, 204, 255));
        btn_student.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        btn_student.setText("Students");
        btn_student.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_studentActionPerformed(evt);
            }
        });
        getContentPane().add(btn_student, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 440, 120, 40));

        btn_categories.setBackground(new java.awt.Color(153, 204, 255));
        btn_categories.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        btn_categories.setText("Book Categories");
        btn_categories.setOpaque(true);
        btn_categories.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_categoriesActionPerformed(evt);
            }
        });
        getContentPane().add(btn_categories, new org.netbeans.lib.awtextra.AbsoluteConstraints(160, 440, 150, 40));

        btn_books.setBackground(new java.awt.Color(153, 204, 255));
        btn_books.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        btn_books.setText("Books");
        btn_books.setOpaque(true);
        btn_books.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_booksActionPerformed(evt);
            }
        });
        getContentPane().add(btn_books, new org.netbeans.lib.awtextra.AbsoluteConstraints(340, 440, 120, 40));

        btn_borrowing.setBackground(new java.awt.Color(153, 204, 255));
        btn_borrowing.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        btn_borrowing.setText("Book Borrowing");
        btn_borrowing.setOpaque(true);
        btn_borrowing.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_borrowingActionPerformed(evt);
            }
        });
        getContentPane().add(btn_borrowing, new org.netbeans.lib.awtextra.AbsoluteConstraints(490, 440, 150, 40));

        btn_fines.setBackground(new java.awt.Color(153, 204, 255));
        btn_fines.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        btn_fines.setText("Fines");
        btn_fines.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_finesActionPerformed(evt);
            }
        });
        getContentPane().add(btn_fines, new org.netbeans.lib.awtextra.AbsoluteConstraints(660, 440, 120, 40));

        lbl_bg.setText("jLabel1");
        getContentPane().add(lbl_bg, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 800, 510));

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void btn_categoriesActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_categoriesActionPerformed
         try {
            new Category().setVisible(true);
        } catch (Exception ex) {
            Logger.getLogger(Home.class.getName()).log(Level.SEVERE, null, ex);
        }
    }//GEN-LAST:event_btn_categoriesActionPerformed

    private void btn_studentActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_studentActionPerformed
        try {
            new Student().setVisible(true);
        } catch (Exception ex) {
            Logger.getLogger(Home.class.getName()).log(Level.SEVERE, null, ex);
        }
    }//GEN-LAST:event_btn_studentActionPerformed

    private void btn_booksActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_booksActionPerformed
         try {
            new Books().setVisible(true);
        } catch (Exception ex) {
            Logger.getLogger(Home.class.getName()).log(Level.SEVERE, null, ex);
        }
    }//GEN-LAST:event_btn_booksActionPerformed

    private void btn_borrowingActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_borrowingActionPerformed
         new BookBorrowing().setVisible(true);
    }//GEN-LAST:event_btn_borrowingActionPerformed

    private void btn_finesActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_finesActionPerformed
        
    }//GEN-LAST:event_btn_finesActionPerformed

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
            java.util.logging.Logger.getLogger(Home.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Home.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Home.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Home.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(() -> {
            new Home().setVisible(true);
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btn_books;
    private javax.swing.JButton btn_borrowing;
    private javax.swing.JButton btn_categories;
    private javax.swing.JButton btn_fines;
    private javax.swing.JButton btn_student;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel lbl_bg;
    private javax.swing.JLabel lbl_welcome;
    // End of variables declaration//GEN-END:variables
}
