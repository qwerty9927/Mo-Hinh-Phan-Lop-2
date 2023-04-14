/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */
package UI;

import BLL.ImportProductBLL;
import Entity.Category;
import Entity.Vegetable;
import com.mysql.cj.x.protobuf.MysqlxDatatypes;
import java.util.ArrayList;
import java.util.List;
import javax.swing.ImageIcon;
import javax.swing.JLabel;
import javax.swing.table.DefaultTableModel;

/**
 *
 * @author MSIs
 */
public class ImportProductUI extends javax.swing.JFrame {

    ImportProductBLL ipBLL;

    /**
     * Creates new form INSTRUCTORINFORMATION
     */
    public ImportProductUI() {
        initComponents();
        ipBLL = new ImportProductBLL();
        productList();
        loadToCombobox();
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        background = new javax.swing.JPanel();
        titlePanel = new javax.swing.JPanel();
        title = new javax.swing.JLabel();
        informationPanel = new javax.swing.JPanel();
        categoryDes = new javax.swing.JLabel();
        vegetableName = new javax.swing.JLabel();
        amount = new javax.swing.JLabel();
        vegetableCB = new javax.swing.JComboBox<>();
        txtAmount = new javax.swing.JTextField();
        decreaseBtn = new javax.swing.JButton();
        increaseBtn = new javax.swing.JButton();
        price = new javax.swing.JLabel();
        txtAmount1 = new javax.swing.JTextField();
        btnAdd = new javax.swing.JButton();
        categoryName = new javax.swing.JLabel();
        jLabel1 = new javax.swing.JLabel();
        btnAdd1 = new javax.swing.JButton();
        search = new javax.swing.JTextField();
        btnSearch = new javax.swing.JButton();
        photoPanel = new javax.swing.JPanel();
        photo = new javax.swing.JLabel();
        bg = new javax.swing.JLabel();
        tablePanel = new javax.swing.JPanel();
        jScrollPane1 = new javax.swing.JScrollPane();
        table = new javax.swing.JTable();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        background.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        titlePanel.setOpaque(false);

        title.setFont(new java.awt.Font("Segoe UI", 1, 24)); // NOI18N
        title.setIcon(new javax.swing.ImageIcon(getClass().getResource("/icons/boxes.png"))); // NOI18N
        title.setText("NHẬP HÀNG");

        javax.swing.GroupLayout titlePanelLayout = new javax.swing.GroupLayout(titlePanel);
        titlePanel.setLayout(titlePanelLayout);
        titlePanelLayout.setHorizontalGroup(
            titlePanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(titlePanelLayout.createSequentialGroup()
                .addGap(150, 150, 150)
                .addComponent(title)
                .addContainerGap(181, Short.MAX_VALUE))
        );
        titlePanelLayout.setVerticalGroup(
            titlePanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(titlePanelLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(title)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        background.add(titlePanel, new org.netbeans.lib.awtextra.AbsoluteConstraints(150, 10, -1, -1));

        informationPanel.setOpaque(false);

        categoryDes.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        categoryDes.setText("Category:");

        vegetableName.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        vegetableName.setText("Vegetable:");

        amount.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        amount.setText("Amout :");

        vegetableCB.setFont(new java.awt.Font("Segoe UI", 1, 20)); // NOI18N
        vegetableCB.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                vegetableCBActionPerformed(evt);
            }
        });

        txtAmount.setFont(new java.awt.Font("Segoe UI", 1, 20)); // NOI18N
        txtAmount.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        txtAmount.setText("0");
        txtAmount.setMinimumSize(new java.awt.Dimension(100, 26));
        txtAmount.setPreferredSize(new java.awt.Dimension(100, 30));
        txtAmount.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                txtAmount(evt);
            }
        });

        decreaseBtn.setFont(new java.awt.Font("Segoe UI", 1, 20)); // NOI18N
        decreaseBtn.setText("-");
        decreaseBtn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                decreaseBtnActionPerformed(evt);
            }
        });

        increaseBtn.setFont(new java.awt.Font("Segoe UI", 1, 20)); // NOI18N
        increaseBtn.setText("+");
        increaseBtn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                increaseBtnActionPerformed(evt);
            }
        });

        price.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        price.setText("Price:");

        txtAmount1.setEditable(false);
        txtAmount1.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        txtAmount1.setHorizontalAlignment(javax.swing.JTextField.LEFT);
        txtAmount1.setText("0");
        txtAmount1.setMinimumSize(new java.awt.Dimension(100, 26));
        txtAmount1.setPreferredSize(new java.awt.Dimension(100, 30));
        txtAmount1.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                txtAmount1(evt);
            }
        });

        btnAdd.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        btnAdd.setIcon(new javax.swing.ImageIcon(getClass().getResource("/icons/add.png"))); // NOI18N
        btnAdd.setText("Import products");
        btnAdd.setHorizontalAlignment(javax.swing.SwingConstants.LEFT);
        btnAdd.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnAddActionPerformed(evt);
            }
        });

        categoryName.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        categoryName.setText("None");

        jLabel1.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        jLabel1.setText("Or");

        btnAdd1.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        btnAdd1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/icons/add.png"))); // NOI18N
        btnAdd1.setText("Add a new product");
        btnAdd1.setHorizontalAlignment(javax.swing.SwingConstants.LEFT);
        btnAdd1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnAdd1ActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout informationPanelLayout = new javax.swing.GroupLayout(informationPanel);
        informationPanel.setLayout(informationPanelLayout);
        informationPanelLayout.setHorizontalGroup(
            informationPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(informationPanelLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(informationPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(informationPanelLayout.createSequentialGroup()
                        .addGroup(informationPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                            .addComponent(categoryDes, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(vegetableName, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(informationPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(informationPanelLayout.createSequentialGroup()
                                .addComponent(vegetableCB, javax.swing.GroupLayout.PREFERRED_SIZE, 243, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addComponent(jLabel1)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 14, Short.MAX_VALUE)
                                .addComponent(btnAdd1))
                            .addComponent(categoryName, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)))
                    .addGroup(informationPanelLayout.createSequentialGroup()
                        .addGroup(informationPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(amount)
                            .addComponent(price))
                        .addGap(27, 27, 27)
                        .addGroup(informationPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(txtAmount1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addGroup(informationPanelLayout.createSequentialGroup()
                                .addComponent(decreaseBtn)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addComponent(txtAmount, javax.swing.GroupLayout.PREFERRED_SIZE, 64, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addComponent(increaseBtn)
                                .addGap(0, 0, Short.MAX_VALUE))))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, informationPanelLayout.createSequentialGroup()
                        .addGap(0, 0, Short.MAX_VALUE)
                        .addComponent(btnAdd)))
                .addContainerGap())
        );
        informationPanelLayout.setVerticalGroup(
            informationPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(informationPanelLayout.createSequentialGroup()
                .addGap(10, 10, 10)
                .addGroup(informationPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(vegetableCB, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(vegetableName, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btnAdd1)
                    .addComponent(jLabel1))
                .addGap(11, 11, 11)
                .addGroup(informationPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(categoryName, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(categoryDes, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(informationPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(price)
                    .addComponent(txtAmount1, javax.swing.GroupLayout.PREFERRED_SIZE, 42, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(informationPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(txtAmount, javax.swing.GroupLayout.PREFERRED_SIZE, 42, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(increaseBtn)
                    .addComponent(decreaseBtn)
                    .addComponent(amount))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(btnAdd)
                .addContainerGap())
        );

        background.add(informationPanel, new org.netbeans.lib.awtextra.AbsoluteConstraints(180, 50, 610, 250));

        search.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                searchActionPerformed(evt);
            }
        });
        background.add(search, new org.netbeans.lib.awtextra.AbsoluteConstraints(180, 310, 400, 30));

        btnSearch.setIcon(new javax.swing.ImageIcon(getClass().getResource("/icons/find.png"))); // NOI18N
        btnSearch.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnSearchActionPerformed(evt);
            }
        });
        background.add(btnSearch, new org.netbeans.lib.awtextra.AbsoluteConstraints(590, 310, 34, 30));

        photoPanel.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0), 3));

        photo.setIcon(new javax.swing.ImageIcon(getClass().getResource("/icons/def-veg 1.jpg"))); // NOI18N

        javax.swing.GroupLayout photoPanelLayout = new javax.swing.GroupLayout(photoPanel);
        photoPanel.setLayout(photoPanelLayout);
        photoPanelLayout.setHorizontalGroup(
            photoPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(photoPanelLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(photo, javax.swing.GroupLayout.PREFERRED_SIZE, 132, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        photoPanelLayout.setVerticalGroup(
            photoPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(photoPanelLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(photo, javax.swing.GroupLayout.PREFERRED_SIZE, 130, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(8, Short.MAX_VALUE))
        );

        background.add(photoPanel, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 60, 150, 150));

        bg.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/background.jpg"))); // NOI18N
        bg.setText("jLabel2");
        background.add(bg, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 800, 350));

        jScrollPane1.setViewportView(table);

        javax.swing.GroupLayout tablePanelLayout = new javax.swing.GroupLayout(tablePanel);
        tablePanel.setLayout(tablePanelLayout);
        tablePanelLayout.setHorizontalGroup(
            tablePanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(tablePanelLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jScrollPane1, javax.swing.GroupLayout.DEFAULT_SIZE, 788, Short.MAX_VALUE)
                .addContainerGap())
        );
        tablePanelLayout.setVerticalGroup(
            tablePanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, tablePanelLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jScrollPane1, javax.swing.GroupLayout.DEFAULT_SIZE, 346, Short.MAX_VALUE)
                .addContainerGap())
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(background, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addGroup(layout.createSequentialGroup()
                .addComponent(tablePanel, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(background, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(tablePanel, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void searchActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_searchActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_searchActionPerformed

    private void btnSearchActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnSearchActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_btnSearchActionPerformed

    private void btnAddActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnAddActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_btnAddActionPerformed

    private void decreaseBtnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_decreaseBtnActionPerformed
        String amountString = txtAmount.getText();
        int amountInt = Integer.parseInt(amountString);
        if ((!amountString.equals("")) && (amountInt > 0)) {
            int updateAmount = Integer.parseInt(txtAmount.getText());
            updateAmount -= 1;
            txtAmount.setText(String.valueOf(updateAmount));
        }
    }//GEN-LAST:event_decreaseBtnActionPerformed

    private void txtAmount(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txtAmount
        char c = evt.getKeyChar();
        if (!Character.isDigit(c)) {
            evt.consume();
        }
    }//GEN-LAST:event_txtAmount

    private void increaseBtnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_increaseBtnActionPerformed
        if (!txtAmount.getText().equals("")) {
            int updateAmount = Integer.parseInt(txtAmount.getText());
            updateAmount += 1;
            txtAmount.setText(String.valueOf(updateAmount));
        }
    }//GEN-LAST:event_increaseBtnActionPerformed

    private void txtAmount1(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txtAmount1
        char c = evt.getKeyChar();
        if (!Character.isDigit(c)) {
            evt.consume();
        }
    }//GEN-LAST:event_txtAmount1

    private void vegetableCBActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_vegetableCBActionPerformed
        if (vegetableCB.getSelectedIndex() == 0) {
            categoryName.setText("None");
            return;
        }
        String item = (String) vegetableCB.getSelectedItem();
        String splitedStrings[] = item.split(" - ");
        int id = Integer.parseInt(splitedStrings[0]);
        String des = ipBLL.getProduct(id).getCategory().getName();
        categoryName.setText(des);
    }//GEN-LAST:event_vegetableCBActionPerformed

    private void btnAdd1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnAdd1ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_btnAdd1ActionPerformed

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
            java.util.logging.Logger.getLogger(ImportProductUI.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(ImportProductUI.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(ImportProductUI.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(ImportProductUI.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
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
                new ImportProductUI().setVisible(true);
            }
        });
    }

    private void loadToCombobox() {
        vegetableCB.addItem("--Select vegetable");
        for (int i = 0; i < ipBLL.productList().size(); i++) {
            String item = ipBLL.productList().get(i).getVegetableID() + " - " + ipBLL.productList().get(i).getVegetableName();
            vegetableCB.addItem(item);
        }
    }

    private void productList() {
        table.setModel(model(ipBLL.productList()));
    }

    private DefaultTableModel model(ArrayList list) {
        String[] columnNames = {"ID", "Vegetable Name", "Amount", "Price"};
        System.out.println(list.size());
        Object[][] data = new Object[list.size()][4];
        for (int i = 0; i < list.size(); i++) {
            Vegetable vegetable = (Vegetable) list.get(i);
            data[i][0] = vegetable.getVegetableID();
            data[i][1] = vegetable.getVegetableName();
            data[i][3] = vegetable.getAmount();
            data[i][4] = vegetable.getPrice();
        }
        DefaultTableModel model = new DefaultTableModel(data, columnNames);
        return model;
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel amount;
    private javax.swing.JPanel background;
    private javax.swing.JLabel bg;
    private javax.swing.JButton btnAdd;
    private javax.swing.JButton btnAdd1;
    private javax.swing.JButton btnSearch;
    private javax.swing.JLabel categoryDes;
    private javax.swing.JLabel categoryName;
    private javax.swing.JButton decreaseBtn;
    private javax.swing.JButton increaseBtn;
    private javax.swing.JPanel informationPanel;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JLabel photo;
    private javax.swing.JPanel photoPanel;
    private javax.swing.JLabel price;
    private javax.swing.JTextField search;
    private javax.swing.JTable table;
    private javax.swing.JPanel tablePanel;
    private javax.swing.JLabel title;
    private javax.swing.JPanel titlePanel;
    private javax.swing.JTextField txtAmount;
    private javax.swing.JTextField txtAmount1;
    private javax.swing.JComboBox<String> vegetableCB;
    private javax.swing.JLabel vegetableName;
    // End of variables declaration//GEN-END:variables
}
