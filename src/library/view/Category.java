/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */
package library.view;

import java.util.ArrayList;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JFrame;
import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;
import library.Controller.CategoryController;
import library.Dto.CategoryDto;

/**
 *
 * @author Nawanjana
 */
public class Category extends javax.swing.JFrame {
    private final CategoryController categoryController;

    /**
     * Creates new form Category
     * @throws java.lang.Exception
     */
    public Category()throws Exception {
      initComponents();
        categoryController = new CategoryController();
        this.setLocationRelativeTo(null);
        
        loadTable();
        setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);
    
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jLabel1 = new javax.swing.JLabel();
        jPanel1 = new javax.swing.JPanel();
        lblBookId = new javax.swing.JLabel();
        txtBookId = new javax.swing.JTextField();
        lblName = new javax.swing.JLabel();
        txtName = new javax.swing.JTextField();
        lblAuthor = new javax.swing.JLabel();
        txtAuthor = new javax.swing.JTextField();
        txtCategoryName = new javax.swing.JLabel();
        jTextField4 = new javax.swing.JTextField();
        btn_delete = new javax.swing.JButton();
        btn_update = new javax.swing.JButton();
        btn_save = new javax.swing.JButton();
        jScrollPane1 = new javax.swing.JScrollPane();
        tblcategory = new javax.swing.JTable();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel1.setFont(new java.awt.Font("Segoe UI", 1, 36)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(51, 51, 255));
        jLabel1.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel1.setText("Manage Book Categories");
        getContentPane().add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(278, 0, 522, 61));

        jPanel1.setBackground(new java.awt.Color(51, 51, 255));

        lblBookId.setBackground(new java.awt.Color(204, 204, 255));
        lblBookId.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        lblBookId.setText("BookId");
        lblBookId.setOpaque(true);

        lblName.setBackground(new java.awt.Color(204, 204, 255));
        lblName.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        lblName.setText("Name");
        lblName.setOpaque(true);

        lblAuthor.setBackground(new java.awt.Color(204, 204, 255));
        lblAuthor.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        lblAuthor.setText("Author");
        lblAuthor.setOpaque(true);

        txtCategoryName.setBackground(new java.awt.Color(204, 204, 255));
        txtCategoryName.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        txtCategoryName.setText("CategoryName");
        txtCategoryName.setOpaque(true);

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(14, 14, 14)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(lblName, javax.swing.GroupLayout.PREFERRED_SIZE, 89, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(lblBookId, javax.swing.GroupLayout.PREFERRED_SIZE, 89, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(txtBookId)
                    .addComponent(txtName)
                    .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                        .addComponent(lblAuthor, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(txtCategoryName, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                    .addComponent(txtAuthor)
                    .addComponent(jTextField4, javax.swing.GroupLayout.DEFAULT_SIZE, 242, Short.MAX_VALUE))
                .addContainerGap(14, Short.MAX_VALUE))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(51, 51, 51)
                .addComponent(lblBookId, javax.swing.GroupLayout.PREFERRED_SIZE, 31, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(txtBookId, javax.swing.GroupLayout.PREFERRED_SIZE, 33, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 28, Short.MAX_VALUE)
                .addComponent(lblName, javax.swing.GroupLayout.PREFERRED_SIZE, 31, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(txtName, javax.swing.GroupLayout.PREFERRED_SIZE, 33, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(29, 29, 29)
                .addComponent(lblAuthor, javax.swing.GroupLayout.PREFERRED_SIZE, 31, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(txtAuthor, javax.swing.GroupLayout.PREFERRED_SIZE, 33, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(27, 27, 27)
                .addComponent(txtCategoryName, javax.swing.GroupLayout.PREFERRED_SIZE, 31, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jTextField4, javax.swing.GroupLayout.PREFERRED_SIZE, 33, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(55, 55, 55))
        );

        getContentPane().add(jPanel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 270, 500));

        btn_delete.setBackground(new java.awt.Color(51, 102, 255));
        btn_delete.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        btn_delete.setText("Delete");
        btn_delete.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_deleteActionPerformed(evt);
            }
        });
        getContentPane().add(btn_delete, new org.netbeans.lib.awtextra.AbsoluteConstraints(470, 430, 140, 40));

        btn_update.setBackground(new java.awt.Color(51, 102, 255));
        btn_update.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        btn_update.setText("Update");
        btn_update.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_updateActionPerformed(evt);
            }
        });
        getContentPane().add(btn_update, new org.netbeans.lib.awtextra.AbsoluteConstraints(640, 430, 140, 40));

        btn_save.setBackground(new java.awt.Color(51, 102, 255));
        btn_save.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        btn_save.setText("Save");
        btn_save.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_saveActionPerformed(evt);
            }
        });
        getContentPane().add(btn_save, new org.netbeans.lib.awtextra.AbsoluteConstraints(300, 433, 140, 40));

        tblcategory.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        tblcategory.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null}
            },
            new String [] {
                "Book Id", "Name", "Author", "Category Name"
            }
        ));
        tblcategory.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                tblcategoryMouseClicked(evt);
            }
        });
        jScrollPane1.setViewportView(tblcategory);

        getContentPane().add(jScrollPane1, new org.netbeans.lib.awtextra.AbsoluteConstraints(310, 110, 470, 280));

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void btn_saveActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_saveActionPerformed
       try {
            saveCategory();
        } catch (Exception ex) {
            Logger.getLogger(Category.class.getName()).log(Level.SEVERE, null, ex);
        }
    }//GEN-LAST:event_btn_saveActionPerformed

    private void btn_updateActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_updateActionPerformed
        try {
            updateCategory();
        } catch (Exception ex) {
            Logger.getLogger(Category.class.getName()).log(Level.SEVERE, null, ex);
        }
    }//GEN-LAST:event_btn_updateActionPerformed

    private void btn_deleteActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_deleteActionPerformed
         try {
            deleteCategory();
        } catch (Exception ex) {
            Logger.getLogger(Category.class.getName()).log(Level.SEVERE, null, ex);
        }
    }//GEN-LAST:event_btn_deleteActionPerformed

    private void tblcategoryMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_tblcategoryMouseClicked
         try {
            searchCategory();
        } catch (Exception ex) {
            Logger.getLogger(Category.class.getName()).log(Level.SEVERE, null, ex);
        }
    }//GEN-LAST:event_tblcategoryMouseClicked

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
            java.util.logging.Logger.getLogger(Category.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Category.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Category.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Category.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(() -> {
            try {
                new Category().setVisible(true);
            } catch (Exception ex) {
                Logger.getLogger(Category.class.getName()).log(Level.SEVERE, null, ex);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btn_delete;
    private javax.swing.JButton btn_save;
    private javax.swing.JButton btn_update;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTextField jTextField4;
    private javax.swing.JLabel lblAuthor;
    private javax.swing.JLabel lblBookId;
    private javax.swing.JLabel lblName;
    private javax.swing.JTable tblcategory;
    private javax.swing.JTextField txtAuthor;
    private javax.swing.JTextField txtBookId;
    private javax.swing.JLabel txtCategoryName;
    private javax.swing.JTextField txtName;
    // End of variables declaration//GEN-END:variables
private void saveCategory() throws Exception{
          try {
        CategoryDto dto = new CategoryDto(txtBookId.getText(), txtName.getText(), txtAuthor.getText(), txtCategoryName.getText());

            String resp = categoryController.save(dto);

            JOptionPane.showMessageDialog(this, resp);
            clearForm();
            loadTable();
    } catch (Exception e) {
        
        JOptionPane.showMessageDialog(this, "Error at save Data");

    }
            
          
            
        

    }

    private void clearForm() {
        txtBookId.setText("");
        txtName.setText("");
        txtAuthor.setText("");
        txtCategoryName.setText("");

    }

    private void loadTable() throws Exception {
       try {
            String columns[] = {"Book Id", "Name", "Author", "Category Name"};
            DefaultTableModel dtm = new DefaultTableModel(columns, 0) {
                @Override
                public boolean isCellEditable(int row, int column) {
                    return false;
                }
            };
            tblcategory.setModel(dtm);
            tblcategory.revalidate();
            tblcategory.repaint();
            


            ArrayList<CategoryDto> categoryDtos = categoryController.getAll();
            
           for (CategoryDto dto : categoryDtos) {
                Object[] rowData = {dto.getBookId(), dto.getName(), dto.getAuthor(), dto.getCategoryName()};
                dtm.addRow(rowData);
            }



        } catch (Exception e) {
            
            JOptionPane.showMessageDialog(this, "Error at Loading Data to Category Table");
        }
}

    private void searchCategory() throws Exception {
       try {
            String bookId = tblcategory.getValueAt(tblcategory.getSelectedRow(), 0).toString();
            CategoryDto dto = (CategoryDto) categoryController.get(bookId);

            if (dto != null) {
                txtBookId.setText(dto.getBookId());
                txtName.setText(dto.getName());
                txtAuthor.setText(dto.getAuthor());
                txtCategoryName.setText(dto.getCategoryName());

            } else {
                JOptionPane.showMessageDialog(this, "Category Not Found");
            }

       } catch (Exception e) {
            JOptionPane.showMessageDialog(this, "Error at loading Category");
       }
    }

    private void deleteCategory() throws Exception {
        try {
            String bookId = txtBookId.getText();
            String resp = categoryController.delete(bookId);
            JOptionPane.showMessageDialog(this, resp);
            clearForm();
            loadTable();
        } catch (Exception e) {
            JOptionPane.showMessageDialog(this, "Error at Delete Category");
        }
    }

    private void updateCategory() throws Exception {
        try {
            CategoryDto categoryDto = new CategoryDto(txtBookId.getText(), txtName.getText(), txtAuthor.getText(), txtCategoryName.getText());
            String resp = categoryController.update(categoryDto);
            JOptionPane.showMessageDialog(this, resp);
            loadTable();
            clearForm();

        } catch (Exception e) {
            JOptionPane.showMessageDialog(this, "Error at update Category");
        }
    }
}
