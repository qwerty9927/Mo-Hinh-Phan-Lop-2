/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */
package UI;

/**
 *
 * @author MSIs
 */
public class THONGKEDOANHTHU extends javax.swing.JFrame {

    /**
     * Creates new form NewJFrame
     */
    public THONGKEDOANHTHU() {
        initComponents();
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        tieude = new javax.swing.JLabel();
        jScrollPane1 = new javax.swing.JScrollPane();
        table = new javax.swing.JTable();
        Month = new javax.swing.JComboBox<>();
        jLabel1 = new javax.swing.JLabel();
        background = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        tieude.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        tieude.setIcon(new javax.swing.ImageIcon(getClass().getResource("/icons/analysis.png"))); // NOI18N
        tieude.setText(" THỐNG KÊ DOANH THU SẢN PHẨM");
        getContentPane().add(tieude, new org.netbeans.lib.awtextra.AbsoluteConstraints(240, 20, 390, -1));

        table.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        table.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null},
                {null, null},
                {null, null},
                {null, null}
            },
            new String [] {
                "Name Category", "Revenue"
            }
        ));
        jScrollPane1.setViewportView(table);

        getContentPane().add(jScrollPane1, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 150, 800, 490));

        Month.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "January", "February", "March", "April", "May", "June", "July", "August", "September", "October", "November", "December", " " }));
        Month.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                MonthActionPerformed(evt);
            }
        });
        getContentPane().add(Month, new org.netbeans.lib.awtextra.AbsoluteConstraints(380, 110, 150, -1));

        jLabel1.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        jLabel1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/icons/month.png"))); // NOI18N
        jLabel1.setText("Month :");
        getContentPane().add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(280, 100, 120, 40));

        background.setIcon(new javax.swing.ImageIcon(getClass().getResource("/icons/backgound.jpg"))); // NOI18N
        background.setMaximumSize(new java.awt.Dimension(2000, 450));
        background.setPreferredSize(new java.awt.Dimension(1000, 450));
        getContentPane().add(background, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 800, 370));

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void MonthActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_MonthActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_MonthActionPerformed

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
            java.util.logging.Logger.getLogger(THONGKEDOANHTHU.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(THONGKEDOANHTHU.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(THONGKEDOANHTHU.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(THONGKEDOANHTHU.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
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
                new THONGKEDOANHTHU().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JComboBox<String> Month;
    private javax.swing.JLabel background;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTable table;
    private javax.swing.JLabel tieude;
    // End of variables declaration//GEN-END:variables
}
