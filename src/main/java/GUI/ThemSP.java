/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */
package GUI;

import javax.swing.JOptionPane;

import BUS.SanPhamBUS;
import DTO.SanPhamDTO;

/**
 *
 * @author Locc
 */
public class ThemSP extends javax.swing.JFrame {

    private SanPhamBUS sanPhamBUS;

    /**
     * Creates new form ThemSP
     */
    public ThemSP() {
        initComponents();
        setLocationRelativeTo(null);
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        jPanel2 = new javax.swing.JPanel();
        jPanel3 = new javax.swing.JPanel();
        jPanelSave = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jPanel5 = new javax.swing.JPanel();
        jPanel6 = new javax.swing.JPanel();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        jLabel7 = new javax.swing.JLabel();
        jLabel8 = new javax.swing.JLabel();
        jLabel9 = new javax.swing.JLabel();
        jLabel10 = new javax.swing.JLabel();
        jLabel11 = new javax.swing.JLabel();
        jLabel12 = new javax.swing.JLabel();
        jTextField1 = new javax.swing.JTextField();
        jTextField2 = new javax.swing.JTextField();
        jTextField3 = new javax.swing.JTextField();
        jTextField4 = new javax.swing.JTextField();
        jTextField6 = new javax.swing.JTextField();
        jTextField7 = new javax.swing.JTextField();
        jTextField8 = new javax.swing.JTextField();
        jTextField9 = new javax.swing.JTextField();
        jComboBox1 = new javax.swing.JComboBox<>();
        jLabel13 = new javax.swing.JLabel();
        jLabel14 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setAlwaysOnTop(true);
        setBackground(new java.awt.Color(45, 96, 151));
        setMaximumSize(new java.awt.Dimension(420, 568));
        setMinimumSize(new java.awt.Dimension(420, 568));
        setUndecorated(true);
        setResizable(false);
        addWindowFocusListener(new java.awt.event.WindowFocusListener() {
            public void windowGainedFocus(java.awt.event.WindowEvent evt) {
            }
            public void windowLostFocus(java.awt.event.WindowEvent evt) {
                formWindowLostFocus(evt);
            }
        });
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jPanel1.setBackground(new java.awt.Color(45, 96, 151));
        jPanel1.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jPanel2.setBackground(new java.awt.Color(143, 203, 253));
        jPanel2.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jPanel3.setBackground(new java.awt.Color(255, 255, 255));
        jPanel3.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jPanelSave.setBackground(new java.awt.Color(45, 96, 151));
        jPanelSave.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        jPanelSave.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jPanelSaveMouseClicked(evt);
            }
        });
        jPanelSave.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel1.setFont(new java.awt.Font("Be Vietnam Pro SemiBold", 0, 20)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(255, 255, 255));
        jLabel1.setText("Lưu");
        jPanelSave.add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(54, -10, 40, 60));

        jLabel2.setIcon(new javax.swing.ImageIcon(getClass().getResource("/icon/download.png"))); // NOI18N
        jPanelSave.add(jLabel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(19, 8, 24, 24));

        jPanel3.add(jPanelSave, new org.netbeans.lib.awtextra.AbsoluteConstraints(248, 452, 135, 41));

        jPanel5.setBackground(new java.awt.Color(255, 255, 255));
        jPanel5.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));

        javax.swing.GroupLayout jPanel5Layout = new javax.swing.GroupLayout(jPanel5);
        jPanel5.setLayout(jPanel5Layout);
        jPanel5Layout.setHorizontalGroup(
            jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 102, Short.MAX_VALUE)
        );
        jPanel5Layout.setVerticalGroup(
            jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 93, Short.MAX_VALUE)
        );

        jPanel3.add(jPanel5, new org.netbeans.lib.awtextra.AbsoluteConstraints(15, 22, 104, 95));

        jPanel6.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel3.setBackground(new java.awt.Color(101, 77, 40));
        jLabel3.setFont(new java.awt.Font("Be Vietnam Pro SemiBold", 0, 10)); // NOI18N
        jLabel3.setText("Chọn file");
        jPanel6.add(jLabel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(19, -2, 48, 30));

        jPanel3.add(jPanel6, new org.netbeans.lib.awtextra.AbsoluteConstraints(23, 124, 86, 26));

        jLabel4.setFont(new java.awt.Font("Be Vietnam Pro SemiBold", 0, 12)); // NOI18N
        jLabel4.setText("Giá");
        jPanel3.add(jLabel4, new org.netbeans.lib.awtextra.AbsoluteConstraints(12, 222, 135, 24));

        jLabel5.setFont(new java.awt.Font("Be Vietnam Pro SemiBold", 0, 12)); // NOI18N
        jLabel5.setText("Mã sản phẩm");
        jPanel3.add(jLabel5, new org.netbeans.lib.awtextra.AbsoluteConstraints(12, 157, 135, 24));

        jLabel6.setFont(new java.awt.Font("Be Vietnam Pro SemiBold", 0, 12)); // NOI18N
        jLabel6.setText("Mô tả");
        jPanel3.add(jLabel6, new org.netbeans.lib.awtextra.AbsoluteConstraints(12, 289, 135, 24));

        jLabel7.setFont(new java.awt.Font("Be Vietnam Pro SemiBold", 0, 12)); // NOI18N
        jLabel7.setText("Thông tin chi tiết");
        jLabel7.setToolTipText("");
        jPanel3.add(jLabel7, new org.netbeans.lib.awtextra.AbsoluteConstraints(12, 377, 135, 24));

        jLabel8.setFont(new java.awt.Font("Be Vietnam Pro SemiBold", 0, 12)); // NOI18N
        jLabel8.setText("Tên sản phẩm");
        jPanel3.add(jLabel8, new org.netbeans.lib.awtextra.AbsoluteConstraints(224, 22, 135, 24));

        jLabel9.setFont(new java.awt.Font("Be Vietnam Pro SemiBold", 0, 12)); // NOI18N
        jLabel9.setText("Phân loại");
        jPanel3.add(jLabel9, new org.netbeans.lib.awtextra.AbsoluteConstraints(224, 87, 135, 24));

        jLabel10.setFont(new java.awt.Font("Be Vietnam Pro SemiBold", 0, 12)); // NOI18N
        jLabel10.setText("Số lượng");
        jPanel3.add(jLabel10, new org.netbeans.lib.awtextra.AbsoluteConstraints(224, 156, 135, 24));

        jLabel11.setFont(new java.awt.Font("Be Vietnam Pro SemiBold", 0, 12)); // NOI18N
        jLabel11.setText("NSX");
        jPanel3.add(jLabel11, new org.netbeans.lib.awtextra.AbsoluteConstraints(224, 223, 135, 24));

        jLabel12.setFont(new java.awt.Font("Be Vietnam Pro SemiBold", 0, 12)); // NOI18N
        jLabel12.setText("HSD");
        jPanel3.add(jLabel12, new org.netbeans.lib.awtextra.AbsoluteConstraints(224, 301, 135, 24));

        jTextField1.setFont(new java.awt.Font("Be Vietnam Pro SemiBold", 0, 12)); // NOI18N
        jTextField1.setBorder(javax.swing.BorderFactory.createMatteBorder(0, 0, 2, 0, new java.awt.Color(45, 96, 151)));
        jPanel3.add(jTextField1, new org.netbeans.lib.awtextra.AbsoluteConstraints(12, 181, 135, 24));

        jTextField2.setFont(new java.awt.Font("Be Vietnam Pro SemiBold", 0, 12)); // NOI18N
        jTextField2.setBorder(javax.swing.BorderFactory.createMatteBorder(0, 0, 2, 0, new java.awt.Color(45, 96, 151)));
        jPanel3.add(jTextField2, new org.netbeans.lib.awtextra.AbsoluteConstraints(12, 246, 135, 24));

        jTextField3.setFont(new java.awt.Font("Be Vietnam Pro SemiBold", 0, 12)); // NOI18N
        jTextField3.setBorder(javax.swing.BorderFactory.createMatteBorder(0, 0, 2, 0, new java.awt.Color(45, 96, 151)));
        jPanel3.add(jTextField3, new org.netbeans.lib.awtextra.AbsoluteConstraints(12, 313, 135, 24));

        jTextField4.setFont(new java.awt.Font("Be Vietnam Pro SemiBold", 0, 12)); // NOI18N
        jTextField4.setBorder(javax.swing.BorderFactory.createMatteBorder(0, 0, 2, 0, new java.awt.Color(45, 96, 151)));
        jPanel3.add(jTextField4, new org.netbeans.lib.awtextra.AbsoluteConstraints(224, 46, 135, 24));

        jTextField6.setFont(new java.awt.Font("Be Vietnam Pro SemiBold", 0, 12)); // NOI18N
        jTextField6.setBorder(javax.swing.BorderFactory.createMatteBorder(0, 0, 2, 0, new java.awt.Color(45, 96, 151)));
        jPanel3.add(jTextField6, new org.netbeans.lib.awtextra.AbsoluteConstraints(224, 180, 135, 24));

        jTextField7.setFont(new java.awt.Font("Be Vietnam Pro SemiBold", 0, 12)); // NOI18N
        jTextField7.setBorder(javax.swing.BorderFactory.createMatteBorder(0, 0, 2, 0, new java.awt.Color(45, 96, 151)));
        jPanel3.add(jTextField7, new org.netbeans.lib.awtextra.AbsoluteConstraints(224, 247, 135, 24));

        jTextField8.setFont(new java.awt.Font("Be Vietnam Pro SemiBold", 0, 12)); // NOI18N
        jTextField8.setBorder(javax.swing.BorderFactory.createMatteBorder(0, 0, 2, 0, new java.awt.Color(45, 96, 151)));
        jPanel3.add(jTextField8, new org.netbeans.lib.awtextra.AbsoluteConstraints(224, 325, 135, 24));

        jTextField9.setFont(new java.awt.Font("Be Vietnam Pro SemiBold", 0, 12)); // NOI18N
        jTextField9.setBorder(javax.swing.BorderFactory.createMatteBorder(0, 0, 2, 0, new java.awt.Color(45, 96, 151)));
        jPanel3.add(jTextField9, new org.netbeans.lib.awtextra.AbsoluteConstraints(12, 401, 347, 24));

        jComboBox1.setFont(new java.awt.Font("Be Vietnam Pro SemiBold", 0, 12)); // NOI18N
        jComboBox1.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "PL1", "PL2", "PL3", "PL4", "PL5" }));
        jComboBox1.setBorder(javax.swing.BorderFactory.createMatteBorder(0, 0, 2, 0, new java.awt.Color(45, 96, 151)));
        jComboBox1.setLightWeightPopupEnabled(false);
        jComboBox1.setOpaque(true);
        jPanel3.add(jComboBox1, new org.netbeans.lib.awtextra.AbsoluteConstraints(224, 111, 135, 24));

        jPanel2.add(jPanel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 10, 400, 507));

        jPanel1.add(jPanel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 51, 420, 517));

        jLabel13.setFont(new java.awt.Font("Be Vietnam Pro SemiBold", 0, 20)); // NOI18N
        jLabel13.setForeground(new java.awt.Color(255, 255, 255));
        jLabel13.setText("Thêm sản phẩm");
        jPanel1.add(jLabel13, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 0, 168, 60));

        jLabel14.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel14.setIcon(new javax.swing.ImageIcon(getClass().getResource("/icon/x.png"))); // NOI18N
        jLabel14.setVerticalAlignment(javax.swing.SwingConstants.TOP);
        jLabel14.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        jLabel14.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jLabel14MouseClicked(evt);
            }
        });
        jPanel1.add(jLabel14, new org.netbeans.lib.awtextra.AbsoluteConstraints(386, 13, 24, 24));

        getContentPane().add(jPanel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 420, 570));

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void jLabel14MouseClicked(java.awt.event.MouseEvent evt) {// GEN-FIRST:event_jLabel14MouseClicked
        // TODO add your handling code here:
        dispose();
    }// GEN-LAST:event_jLabel14MouseClicked

    private void formWindowLostFocus(java.awt.event.WindowEvent evt) {// GEN-FIRST:event_formWindowLostFocus
        // TODO add your handling code here:
//        dispose();
    }// GEN-LAST:event_formWindowLostFocus

    private void jPanelSaveMouseClicked(java.awt.event.MouseEvent evt) {// GEN-FIRST:event_jPanelSaveMouseClicked
        // TODO add your handling code here:
        sanPhamBUS = new SanPhamBUS();

        SanPhamDTO sanPhamDTO = new SanPhamDTO();
        sanPhamDTO.setMaSPString(jTextField1.getText());
        sanPhamDTO.setGiaInt(Integer.valueOf(jTextField2.getText()));
        sanPhamDTO.setMoTaString(jTextField3.getText());
        sanPhamDTO.setTenSPString(jTextField4.getText());
        sanPhamDTO.setPhanLoaiString(jComboBox1.getSelectedItem().toString());
        sanPhamDTO.setSoLuongSPInt(Integer.valueOf(jTextField6.getText()));
        sanPhamDTO.setNSXDate(jTextField7.getText());
        sanPhamDTO.setHSDDate(jTextField8.getText());
        

        try {
            if (sanPhamBUS.them(sanPhamDTO)) {
                dispose();
                Product_icon product_icon = new Product_icon(sanPhamDTO.getTenSPString(),
                        sanPhamDTO.getGiaInt().toString(), sanPhamDTO.getSoLuongSPInt().toString());

            }
        } catch (Exception e) {
            JOptionPane.showMessageDialog(null, "Không thể thêm sản phẩm!\nVui lòng thử lại sau");
            e.printStackTrace();
        }

    }// GEN-LAST:event_jPanelSaveMouseClicked

    /**
     * @param args the command line arguments
     */
    public static void main(String args[]) {
        /* Set the Nimbus look and feel */
        // <editor-fold defaultstate="collapsed" desc=" Look and feel setting code
        // (optional) ">
        /*
         * If Nimbus (introduced in Java SE 6) is not available, stay with the default
         * look and feel.
         * For details see
         * http://download.oracle.com/javase/tutorial/uiswing/lookandfeel/plaf.html
         */
        try {
            for (javax.swing.UIManager.LookAndFeelInfo info : javax.swing.UIManager.getInstalledLookAndFeels()) {
                if ("Nimbus".equals(info.getName())) {
                    javax.swing.UIManager.setLookAndFeel(info.getClassName());
                    break;
                }
            }
        } catch (ClassNotFoundException ex) {
            java.util.logging.Logger.getLogger(ThemSP.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(ThemSP.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(ThemSP.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(ThemSP.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        // </editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new ThemSP().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JComboBox<String> jComboBox1;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel10;
    private javax.swing.JLabel jLabel11;
    private javax.swing.JLabel jLabel12;
    private javax.swing.JLabel jLabel13;
    private javax.swing.JLabel jLabel14;
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
    private javax.swing.JPanel jPanel3;
    private javax.swing.JPanel jPanel5;
    private javax.swing.JPanel jPanel6;
    private javax.swing.JPanel jPanelSave;
    private javax.swing.JTextField jTextField1;
    private javax.swing.JTextField jTextField2;
    private javax.swing.JTextField jTextField3;
    private javax.swing.JTextField jTextField4;
    private javax.swing.JTextField jTextField6;
    private javax.swing.JTextField jTextField7;
    private javax.swing.JTextField jTextField8;
    private javax.swing.JTextField jTextField9;
    // End of variables declaration//GEN-END:variables
}
