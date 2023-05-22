/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */
package GUI.Admin;

import BUS.SanPhamBUS;
import GUI.Product_icon;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;
import javax.swing.SwingUtilities;

/**
 *
 * @author Locc
 */
public class AdminHomePage extends javax.swing.JFrame {

    private SanPhamBUS sanPhamBUS;

    /**
     * Creates new form AdminHomePage
     */
    public AdminHomePage() {
        initComponents();
        setLocationRelativeTo(null);
        // sanPhamBUS = new SanPhamBUS();
        // for (int i = 0; i < sanPhamBUS.getList_SanPhamDTOs().size(); i++) {
        // Product_icon product_icon = new
        // Product_icon(sanPhamBUS.getList_SanPhamDTOs().get(i).getTenSPString(),
        // sanPhamBUS.getList_SanPhamDTOs().get(i).getGiaInt().toString(),
        // sanPhamBUS.getList_SanPhamDTOs().get(i).getSoLuongSPInt().toString());
        // jPanelSanPham.add(product_icon);
        // }
        // jPanelSanPham.revalidate();
        // jPanelSanPham.repaint();
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

        jLabel3 = new javax.swing.JLabel();
        jPanel1 = new javax.swing.JPanel();
        jPanel2 = new javax.swing.JPanel();
        jLabel14 = new javax.swing.JLabel();
        jPanel3 = new javax.swing.JPanel();
        jLabel5 = new javax.swing.JLabel();
        jPanelTrangChu = new javax.swing.JPanel();
        jLabel4 = new javax.swing.JLabel();
        jPanel5 = new javax.swing.JPanel();
        jLabel6 = new javax.swing.JLabel();
        jPanel6 = new javax.swing.JPanel();
        jLabel15 = new javax.swing.JLabel();
        jPanel7 = new javax.swing.JPanel();
        jLabel13 = new javax.swing.JLabel();
        jPanel8 = new javax.swing.JPanel();
        jLabel16 = new javax.swing.JLabel();
        jPanel9 = new javax.swing.JPanel();
        jLabel7 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jPanel4 = new javax.swing.JPanel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setResizable(false);
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel3.setIcon(new javax.swing.ImageIcon(getClass().getResource("/icon/Cái lá.png"))); // NOI18N
        getContentPane().add(jLabel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(327, 756, -1, -1));

        jPanel1.setBackground(new java.awt.Color(143, 203, 253));
        jPanel1.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jPanel2.setBackground(new java.awt.Color(255, 255, 255));
        jPanel2.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(45, 96, 151), 3));
        jPanel2.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                jPanel2MouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                jPanel2MouseExited(evt);
            }
        });
        jPanel2.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel14.setFont(new java.awt.Font("Be Vietnam Pro SemiBold", 0, 24)); // NOI18N
        jLabel14.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel14.setText("HÓA ĐƠN");
        jPanel2.add(jLabel14, new org.netbeans.lib.awtextra.AbsoluteConstraints(8, 0, 220, 60));

        jPanel1.add(jPanel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(82, 462, 236, 67));

        jPanel3.setBackground(new java.awt.Color(255, 255, 255));
        jPanel3.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(45, 96, 151), 3));
        jPanel3.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                jPanel3MouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                jPanel3MouseExited(evt);
            }
        });
        jPanel3.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel5.setFont(new java.awt.Font("Be Vietnam Pro SemiBold", 0, 24)); // NOI18N
        jLabel5.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel5.setText("NHÂN VIÊN");
        jPanel3.add(jLabel5, new org.netbeans.lib.awtextra.AbsoluteConstraints(8, 0, 220, 60));

        jPanel1.add(jPanel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(82, 186, 236, 67));

        jPanelTrangChu.setBackground(new java.awt.Color(255, 255, 255));
        jPanelTrangChu.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(45, 96, 151), 3));
        jPanelTrangChu.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jPanelTrangChuMouseClicked(evt);
            }
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                jPanelTrangChuMouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                jPanelTrangChuMouseExited(evt);
            }
        });
        jPanelTrangChu.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel4.setFont(new java.awt.Font("Be Vietnam Pro SemiBold", 0, 24)); // NOI18N
        jLabel4.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel4.setText("TRANG CHỦ");
        jPanelTrangChu.add(jLabel4, new org.netbeans.lib.awtextra.AbsoluteConstraints(8, 0, 220, 60));

        jPanel1.add(jPanelTrangChu, new org.netbeans.lib.awtextra.AbsoluteConstraints(82, 94, 236, 67));

        jPanel5.setBackground(new java.awt.Color(255, 255, 255));
        jPanel5.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(45, 96, 151), 3));
        jPanel5.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                jPanel5MouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                jPanel5MouseExited(evt);
            }
        });
        jPanel5.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel6.setFont(new java.awt.Font("Be Vietnam Pro SemiBold", 0, 24)); // NOI18N
        jLabel6.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel6.setText("SẢN PHẨM");
        jPanel5.add(jLabel6, new org.netbeans.lib.awtextra.AbsoluteConstraints(8, 0, 220, 60));

        jPanel1.add(jPanel5, new org.netbeans.lib.awtextra.AbsoluteConstraints(82, 278, 236, 67));

        jPanel6.setBackground(new java.awt.Color(255, 255, 255));
        jPanel6.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(45, 96, 151), 3));
        jPanel6.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                jPanel6MouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                jPanel6MouseExited(evt);
            }
        });
        jPanel6.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel15.setFont(new java.awt.Font("Be Vietnam Pro SemiBold", 0, 24)); // NOI18N
        jLabel15.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel15.setText("KHO VẬN");
        jPanel6.add(jLabel15, new org.netbeans.lib.awtextra.AbsoluteConstraints(8, 0, 220, 60));

        jPanel1.add(jPanel6, new org.netbeans.lib.awtextra.AbsoluteConstraints(82, 554, 236, 67));

        jPanel7.setBackground(new java.awt.Color(255, 255, 255));
        jPanel7.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(45, 96, 151), 3));
        jPanel7.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                jPanel7MouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                jPanel7MouseExited(evt);
            }
        });
        jPanel7.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel13.setFont(new java.awt.Font("Be Vietnam Pro SemiBold", 0, 24)); // NOI18N
        jLabel13.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel13.setText("KHÁCH HÀNG");
        jPanel7.add(jLabel13, new org.netbeans.lib.awtextra.AbsoluteConstraints(8, 0, 220, 60));

        jPanel1.add(jPanel7, new org.netbeans.lib.awtextra.AbsoluteConstraints(82, 370, 236, 67));

        jPanel8.setBackground(new java.awt.Color(255, 255, 255));
        jPanel8.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(45, 96, 151), 3));
        jPanel8.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                jPanel8MouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                jPanel8MouseExited(evt);
            }
        });
        jPanel8.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel16.setFont(new java.awt.Font("Be Vietnam Pro SemiBold", 0, 24)); // NOI18N
        jLabel16.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel16.setText("LƯƠNG NV");
        jPanel8.add(jLabel16, new org.netbeans.lib.awtextra.AbsoluteConstraints(8, 0, 220, 60));

        jPanel1.add(jPanel8, new org.netbeans.lib.awtextra.AbsoluteConstraints(82, 646, 236, 67));

        jPanel9.setBackground(new java.awt.Color(255, 255, 255));
        jPanel9.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(234, 105, 95), 3));
        jPanel9.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                jPanel9MouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                jPanel9MouseExited(evt);
            }
        });
        jPanel9.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel7.setFont(new java.awt.Font("Be Vietnam Pro SemiBold", 0, 24)); // NOI18N
        jLabel7.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel7.setText("ĐĂNG XUẤT");
        jPanel9.add(jLabel7, new org.netbeans.lib.awtextra.AbsoluteConstraints(8, 0, 220, 60));

        jPanel1.add(jPanel9, new org.netbeans.lib.awtextra.AbsoluteConstraints(82, 738, 236, 67));

        jLabel2.setIcon(new javax.swing.ImageIcon(getClass().getResource("/icon/logo.png"))); // NOI18N
        jPanel1.add(jLabel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(59, -9, 282, 135));

        getContentPane().add(jPanel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 400, 900));

        jPanel4.setBackground(new java.awt.Color(255, 255, 255));
        jPanel4.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());
        getContentPane().add(jPanel4, new org.netbeans.lib.awtextra.AbsoluteConstraints(400, 0, 1200, 900));

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void jPanel3MouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jPanel3MouseExited
        // TODO add your handling code here:
        jPanel3.setBackground(new java.awt.Color(255, 255, 255));
        jLabel5.setForeground(new java.awt.Color(0, 0, 0));
        // TODO add your handling code here:
    }//GEN-LAST:event_jPanel3MouseExited

    private void jPanel3MouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jPanel3MouseEntered
        // TODO add your handling code here:
        jPanel3.setBackground(new java.awt.Color(45, 96, 151));
        jLabel5.setForeground(new java.awt.Color(255, 255, 255));
        // TODO add your handling code here:
    }//GEN-LAST:event_jPanel3MouseEntered

    private void jPanelTrangChuMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jPanelTrangChuMouseExited
        // TODO add your handling code here:
        jPanelTrangChu.setBackground(new java.awt.Color(255, 255, 255));
        jLabel4.setForeground(new java.awt.Color(0, 0, 0));
        // TODO add your handling code here:
    }//GEN-LAST:event_jPanelTrangChuMouseExited

    private void jPanelTrangChuMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jPanelTrangChuMouseEntered
        // TODO add your handling code here:
        jPanelTrangChu.setBackground(new java.awt.Color(45, 96, 151));
        jLabel4.setForeground(new java.awt.Color(255, 255, 255));
    }//GEN-LAST:event_jPanelTrangChuMouseEntered

    private void jPanelTrangChuMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jPanelTrangChuMouseClicked
        // TODO add your handling code here:
        jPanelTrangChu.addMouseListener(new MouseAdapter() {
            @Override
            public void mouseClicked(MouseEvent e) {
                // Kiểm tra xem sự kiện click có xảy ra bên ngoài panel hay không
                if (!SwingUtilities.isDescendingFrom(e.getComponent(), jPanelTrangChu)) {
                    System.out.println("Click bên ngoài panel");
                }
            }
        });        // TODO add your handling code here:
    }//GEN-LAST:event_jPanelTrangChuMouseClicked

    private void jPanel5MouseEntered(java.awt.event.MouseEvent evt) {// GEN-FIRST:event_jPanel5MouseEntered
        // TODO add your handling code here:
        jPanel5.setBackground(new java.awt.Color(45, 96, 151));
        jLabel6.setForeground(new java.awt.Color(255, 255, 255));
    }// GEN-LAST:event_jPanel5MouseEntered

    private void jPanel5MouseExited(java.awt.event.MouseEvent evt) {// GEN-FIRST:event_jPanel5MouseExited
        // TODO add your handling code here:
        jPanel5.setBackground(new java.awt.Color(255, 255, 255));
        jLabel6.setForeground(new java.awt.Color(0, 0, 0));
    }// GEN-LAST:event_jPanel5MouseExited

    private void jPanel7MouseEntered(java.awt.event.MouseEvent evt) {// GEN-FIRST:event_jPanel7MouseEntered
        // TODO add your handling code here:
        jPanel7.setBackground(new java.awt.Color(45, 96, 151));
        jLabel13.setForeground(new java.awt.Color(255, 255, 255));
    }// GEN-LAST:event_jPanel7MouseEntered

    private void jPanel7MouseExited(java.awt.event.MouseEvent evt) {// GEN-FIRST:event_jPanel7MouseExited
        // TODO add your handling code here:
        jPanel7.setBackground(new java.awt.Color(255, 255, 255));
        jLabel13.setForeground(new java.awt.Color(0, 0, 0));
    }// GEN-LAST:event_jPanel7MouseExited

    private void jPanel2MouseEntered(java.awt.event.MouseEvent evt) {// GEN-FIRST:event_jPanel2MouseEntered
        // TODO add your handling code here:
        jPanel2.setBackground(new java.awt.Color(45, 96, 151));
        jLabel14.setForeground(new java.awt.Color(255, 255, 255));
    }// GEN-LAST:event_jPanel2MouseEntered

    private void jPanel2MouseExited(java.awt.event.MouseEvent evt) {// GEN-FIRST:event_jPanel2MouseExited
        // TODO add your handling code here:
        jPanel2.setBackground(new java.awt.Color(255, 255, 255));
        jLabel14.setForeground(new java.awt.Color(0, 0, 0));
    }// GEN-LAST:event_jPanel2MouseExited

    private void jPanel6MouseEntered(java.awt.event.MouseEvent evt) {// GEN-FIRST:event_jPanel6MouseEntered
        // TODO add your handling code here:
        jPanel6.setBackground(new java.awt.Color(45, 96, 151));
        jLabel15.setForeground(new java.awt.Color(255, 255, 255));
    }// GEN-LAST:event_jPanel6MouseEntered

    private void jPanel6MouseExited(java.awt.event.MouseEvent evt) {// GEN-FIRST:event_jPanel6MouseExited
        jPanel6.setBackground(new java.awt.Color(255, 255, 255));
        jLabel15.setForeground(new java.awt.Color(0, 0, 0));
    }// GEN-LAST:event_jPanel6MouseExited

    private void jPanel8MouseEntered(java.awt.event.MouseEvent evt) {// GEN-FIRST:event_jPanel8MouseEntered
        // TODO add your handling code here:
        jPanel8.setBackground(new java.awt.Color(45, 96, 151));
        jLabel16.setForeground(new java.awt.Color(255, 255, 255));
    }// GEN-LAST:event_jPanel8MouseEntered

    private void jPanel8MouseExited(java.awt.event.MouseEvent evt) {// GEN-FIRST:event_jPanel8MouseExited
        // TODO add your handling code here:
        jPanel8.setBackground(new java.awt.Color(255, 255, 255));
        jLabel16.setForeground(new java.awt.Color(0, 0, 0));
    }// GEN-LAST:event_jPanel8MouseExited

    private void jPanel9MouseEntered(java.awt.event.MouseEvent evt) {// GEN-FIRST:event_jPanel9MouseEntered
        // TODO add your handling code here:
        jPanel9.setBackground(new java.awt.Color(234, 105, 95));
        jLabel7.setForeground(new java.awt.Color(255, 255, 255));
    }// GEN-LAST:event_jPanel9MouseEntered

    private void jPanel9MouseExited(java.awt.event.MouseEvent evt) {// GEN-FIRST:event_jPanel9MouseExited
        // TODO add your handling code here:
        jPanel9.setBackground(new java.awt.Color(255, 255, 255));
        jLabel7.setForeground(new java.awt.Color(0, 0, 0));
    }// GEN-LAST:event_jPanel9MouseExited

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
            java.util.logging.Logger.getLogger(AdminHomePage.class.getName()).log(java.util.logging.Level.SEVERE, null,
                    ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(AdminHomePage.class.getName()).log(java.util.logging.Level.SEVERE, null,
                    ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(AdminHomePage.class.getName()).log(java.util.logging.Level.SEVERE, null,
                    ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(AdminHomePage.class.getName()).log(java.util.logging.Level.SEVERE, null,
                    ex);
        }
        // </editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new AdminHomePage().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel jLabel13;
    private javax.swing.JLabel jLabel14;
    private javax.swing.JLabel jLabel15;
    private javax.swing.JLabel jLabel16;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JPanel jPanel3;
    private javax.swing.JPanel jPanel4;
    private javax.swing.JPanel jPanel5;
    private javax.swing.JPanel jPanel6;
    private javax.swing.JPanel jPanel7;
    private javax.swing.JPanel jPanel8;
    private javax.swing.JPanel jPanel9;
    private javax.swing.JPanel jPanelTrangChu;
    // End of variables declaration//GEN-END:variables
}
