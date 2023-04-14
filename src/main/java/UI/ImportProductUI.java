/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */
package UI;

import BLL.ImportProductBLL;
import Entity.Category;
import Entity.Vegetable;
import com.mysql.cj.x.protobuf.MysqlxDatatypes;
import com.sun.jdi.connect.Connector;
import java.util.ArrayList;
import java.util.List;
import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
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
        vegetableList();
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
        txtPrice = new javax.swing.JTextField();
        btnImport = new javax.swing.JButton();
        categoryName = new javax.swing.JLabel();
        jLabel1 = new javax.swing.JLabel();
        btnAdd1 = new javax.swing.JButton();
        amount1 = new javax.swing.JLabel();
        txtAvailable = new javax.swing.JTextField();
        search = new javax.swing.JTextField();
        btnSearch = new javax.swing.JButton();
        photoPanel = new javax.swing.JPanel();
        photo = new javax.swing.JLabel();
        bg = new javax.swing.JLabel();
        tablePanel = new javax.swing.JPanel();
        jScrollPane1 = new javax.swing.JScrollPane();
        table = new javax.swing.JTable();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));

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
                .addGap(154, 154, 154)
                .addComponent(title)
                .addContainerGap(177, Short.MAX_VALUE))
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
        categoryDes.setHorizontalAlignment(javax.swing.SwingConstants.RIGHT);
        categoryDes.setText("Category:");
        categoryDes.setHorizontalTextPosition(javax.swing.SwingConstants.RIGHT);

        vegetableName.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        vegetableName.setHorizontalAlignment(javax.swing.SwingConstants.RIGHT);
        vegetableName.setText("Vegetable:");
        vegetableName.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);

        amount.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        amount.setHorizontalAlignment(javax.swing.SwingConstants.RIGHT);
        amount.setText("Available amount :");
        amount.setHorizontalTextPosition(javax.swing.SwingConstants.RIGHT);

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
        txtAmount.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtAmountActionPerformed(evt);
            }
        });
        txtAmount.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                txtAmount(evt);
            }
        });

        decreaseBtn.setFont(new java.awt.Font("Segoe UI", 1, 20)); // NOI18N
        decreaseBtn.setText("-");
        decreaseBtn.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
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
        price.setHorizontalAlignment(javax.swing.SwingConstants.RIGHT);
        price.setText("Price:");
        price.setHorizontalTextPosition(javax.swing.SwingConstants.RIGHT);

        txtPrice.setEditable(false);
        txtPrice.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        txtPrice.setHorizontalAlignment(javax.swing.JTextField.LEFT);
        txtPrice.setText("0");
        txtPrice.setMinimumSize(new java.awt.Dimension(100, 26));
        txtPrice.setPreferredSize(new java.awt.Dimension(100, 30));
        txtPrice.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                txtPrice(evt);
            }
        });

        btnImport.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        btnImport.setIcon(new javax.swing.ImageIcon(getClass().getResource("/icons/add.png"))); // NOI18N
        btnImport.setText("Import");
        btnImport.setHorizontalAlignment(javax.swing.SwingConstants.LEFT);
        btnImport.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnImportActionPerformed(evt);
            }
        });

        categoryName.setFont(new java.awt.Font("Segoe UI", 0, 18)); // NOI18N
        categoryName.setText("None");
        categoryName.setOpaque(true);

        jLabel1.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        jLabel1.setText("Or");

        btnAdd1.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        btnAdd1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/icons/add.png"))); // NOI18N
        btnAdd1.setText("Add a new vegetable");
        btnAdd1.setHorizontalAlignment(javax.swing.SwingConstants.LEFT);
        btnAdd1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnAdd1ActionPerformed(evt);
            }
        });

        amount1.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        amount1.setHorizontalAlignment(javax.swing.SwingConstants.RIGHT);
        amount1.setText("Import:");
        amount1.setHorizontalTextPosition(javax.swing.SwingConstants.RIGHT);

        txtAvailable.setEditable(false);
        txtAvailable.setFont(new java.awt.Font("Segoe UI", 1, 20)); // NOI18N
        txtAvailable.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        txtAvailable.setText("0");
        txtAvailable.setMinimumSize(new java.awt.Dimension(100, 26));
        txtAvailable.setPreferredSize(new java.awt.Dimension(100, 30));
        txtAvailable.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                txtAvailable(evt);
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
                        .addComponent(vegetableName, javax.swing.GroupLayout.PREFERRED_SIZE, 156, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(vegetableCB, 0, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, informationPanelLayout.createSequentialGroup()
                        .addComponent(categoryDes, javax.swing.GroupLayout.PREFERRED_SIZE, 161, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addGroup(informationPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(informationPanelLayout.createSequentialGroup()
                                .addGap(0, 189, Short.MAX_VALUE)
                                .addComponent(jLabel1)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(btnAdd1))
                            .addGroup(informationPanelLayout.createSequentialGroup()
                                .addComponent(categoryName, javax.swing.GroupLayout.PREFERRED_SIZE, 251, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(0, 0, Short.MAX_VALUE))))
                    .addGroup(informationPanelLayout.createSequentialGroup()
                        .addGroup(informationPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(price, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(amount, javax.swing.GroupLayout.Alignment.TRAILING))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(informationPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(txtPrice, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addGroup(informationPanelLayout.createSequentialGroup()
                                .addGroup(informationPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(txtAvailable, javax.swing.GroupLayout.PREFERRED_SIZE, 64, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addGroup(informationPanelLayout.createSequentialGroup()
                                        .addComponent(txtAmount, javax.swing.GroupLayout.PREFERRED_SIZE, 64, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                        .addComponent(increaseBtn)))
                                .addGap(0, 0, Short.MAX_VALUE))))
                    .addGroup(informationPanelLayout.createSequentialGroup()
                        .addComponent(amount1, javax.swing.GroupLayout.PREFERRED_SIZE, 115, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(decreaseBtn)
                        .addGap(0, 0, Short.MAX_VALUE))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, informationPanelLayout.createSequentialGroup()
                        .addGap(0, 0, Short.MAX_VALUE)
                        .addComponent(btnImport)))
                .addContainerGap())
        );
        informationPanelLayout.setVerticalGroup(
            informationPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(informationPanelLayout.createSequentialGroup()
                .addGap(10, 10, 10)
                .addGroup(informationPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(vegetableCB, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(vegetableName, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(informationPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(btnAdd1)
                    .addComponent(jLabel1))
                .addGap(18, 18, 18)
                .addGroup(informationPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(categoryDes, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(categoryName, javax.swing.GroupLayout.PREFERRED_SIZE, 43, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(12, 12, 12)
                .addGroup(informationPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(price)
                    .addComponent(txtPrice, javax.swing.GroupLayout.PREFERRED_SIZE, 42, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(informationPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(txtAvailable, javax.swing.GroupLayout.PREFERRED_SIZE, 42, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(amount))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(informationPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(txtAmount, javax.swing.GroupLayout.PREFERRED_SIZE, 42, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(amount1)
                    .addComponent(increaseBtn, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(decreaseBtn))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(btnImport)
                .addGap(71, 71, 71))
        );

        background.add(informationPanel, new org.netbeans.lib.awtextra.AbsoluteConstraints(180, 50, 590, 350));

        search.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                searchActionPerformed(evt);
            }
        });
        background.add(search, new org.netbeans.lib.awtextra.AbsoluteConstraints(170, 410, 400, 30));

        btnSearch.setIcon(new javax.swing.ImageIcon(getClass().getResource("/icons/find.png"))); // NOI18N
        btnSearch.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnSearchActionPerformed(evt);
            }
        });
        background.add(btnSearch, new org.netbeans.lib.awtextra.AbsoluteConstraints(580, 410, 34, 30));

        photoPanel.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0), 3));

        photo.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/vegetable.png"))); // NOI18N

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

        bg.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/background.png"))); // NOI18N
        bg.setText("jLabel2");
        background.add(bg, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 780, 500));

        table.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                tableMouseClicked(evt);
            }
        });
        jScrollPane1.setViewportView(table);

        javax.swing.GroupLayout tablePanelLayout = new javax.swing.GroupLayout(tablePanel);
        tablePanel.setLayout(tablePanelLayout);
        tablePanelLayout.setHorizontalGroup(
            tablePanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(tablePanelLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jScrollPane1)
                .addContainerGap())
        );
        tablePanelLayout.setVerticalGroup(
            tablePanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, tablePanelLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jScrollPane1, javax.swing.GroupLayout.DEFAULT_SIZE, 298, Short.MAX_VALUE)
                .addContainerGap())
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(background, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addComponent(tablePanel, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(background, javax.swing.GroupLayout.PREFERRED_SIZE, 458, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(tablePanel, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addContainerGap())
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void searchActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_searchActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_searchActionPerformed

    private void btnSearchActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnSearchActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_btnSearchActionPerformed

    private void btnImportActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnImportActionPerformed
        int index = table.getSelectedRow();
        DefaultTableModel model = (DefaultTableModel) table.getModel();
        int vegetableID = (int) model.getValueAt(index, 0);
        int availableAmount = Integer.parseInt(txtAvailable.getText());
        int importAmount = Integer.parseInt(txtAmount.getText());
        int updateAmount = availableAmount + importAmount;
        Vegetable v= ipBLL.getVegetable(vegetableID);
        v.setAmount(updateAmount);
        int result = JOptionPane.showConfirmDialog(this, "Import " + txtAmount.getText() +" for this vegetable?",
                "Confirmation",
                JOptionPane.YES_NO_OPTION,
                JOptionPane.QUESTION_MESSAGE);
        
        if (result == JOptionPane.YES_OPTION) {
            if (ipBLL.updateVegetable(v)) {
                JOptionPane.showMessageDialog(this,
                        "Vegeyable imported successfully!");
                vegetableList();
                emptyFields();
            }
        }
        ipBLL.updateVegetable(v);
    }//GEN-LAST:event_btnImportActionPerformed

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

    private void txtPrice(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txtPrice
        char c = evt.getKeyChar();
        if (!Character.isDigit(c)) {
            evt.consume();
        }
    }//GEN-LAST:event_txtPrice

    private void vegetableCBActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_vegetableCBActionPerformed
        if (vegetableCB.getSelectedIndex() == 0) {
            categoryName.setText("None");
            return;
        }
        String item = (String) vegetableCB.getSelectedItem();
        String splitedStrings[] = item.split(" - ");
        int id = Integer.parseInt(splitedStrings[0]);
        String des = ipBLL.getVegetable(id).getCategory().getName();
        categoryName.setText(des);
    }//GEN-LAST:event_vegetableCBActionPerformed

    private void btnAdd1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnAdd1ActionPerformed
        VegetableUI vegetableUI = new VegetableUI();
        vegetableUI.setVisible(true);
    }//GEN-LAST:event_btnAdd1ActionPerformed

    private void tableMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_tableMouseClicked
        int index = table.getSelectedRow();
        DefaultTableModel model = (DefaultTableModel) table.getModel();
        
        int vegetableID = (int) model.getValueAt(index, 0);
        System.out.println(vegetableID);
        Vegetable v = ipBLL.getVegetable(vegetableID);
        
        for (int i = 1; i < vegetableCB.getItemCount(); i++) {
            if (vegetableID == getIDFromCB(i)) {
                vegetableCB.setSelectedIndex(i);
            }
        }
        
        txtAvailable.setText(String.valueOf(model.getValueAt(index, 2)));
        txtPrice.setText(String.valueOf(model.getValueAt(index, 3)));
    }//GEN-LAST:event_tableMouseClicked

    private void txtAvailable(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txtAvailable
        // TODO add your handling code here:
    }//GEN-LAST:event_txtAvailable

    private void txtAmountActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtAmountActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtAmountActionPerformed
    
    private void emptyFields(){
        vegetableCB.setSelectedIndex(0);
        categoryName.setText("None");
        txtPrice.setText("");
        txtAvailable.setText("");
        txtAmount.setText("");
    }
    
    private int getIDFromCB(int index){
        String fullString = vegetableCB.getItemAt(index);
        String spiltedString[] = fullString.split(" - ");
        int id = Integer.parseInt(spiltedString[0]);
        return id;
    }
    
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
        for (int i = 0; i < ipBLL.vegetableList().size(); i++) {
            String item = ipBLL.vegetableList().get(i).getVegetableID() + " - " + ipBLL.vegetableList().get(i).getVegetableName();
            vegetableCB.addItem(item);
        }
    }

    private void vegetableList() {
        table.setModel(model(ipBLL.vegetableList()));
    }

    private DefaultTableModel model(ArrayList list) {
        String[] columnNames = {"ID", "Vegetable Name", "Amount", "Price"};
        System.out.println(list.size());
        Object[][] data = new Object[list.size()][4];
        for (int i = 0; i < list.size(); i++) {
            Vegetable vegetable = (Vegetable) list.get(i);
            data[i][0] = vegetable.getVegetableID();
            data[i][1] = vegetable.getVegetableName();
            data[i][2] = vegetable.getAmount();
            data[i][3] = vegetable.getPrice();
        }
        DefaultTableModel model = new DefaultTableModel(data, columnNames);
        return model;
    }
    
    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel amount;
    private javax.swing.JLabel amount1;
    private javax.swing.JPanel background;
    private javax.swing.JLabel bg;
    private javax.swing.JButton btnAdd1;
    private javax.swing.JButton btnImport;
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
    private javax.swing.JTextField txtAvailable;
    private javax.swing.JTextField txtPrice;
    private javax.swing.JComboBox<String> vegetableCB;
    private javax.swing.JLabel vegetableName;
    // End of variables declaration//GEN-END:variables
}
