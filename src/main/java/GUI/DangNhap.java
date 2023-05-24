/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */
package GUI;

import DAO_Hibernate.NguoiDungDAO;
import DTO.NguoiDungDTO;
import java.awt.Cursor;
import javax.swing.JOptionPane;

/**
 *
 * @author Locc
 */
public class DangNhap extends javax.swing.JFrame {

    private NguoiDungDAO nguoiDungDAO;

    /**
     * Creates new form DangNhap
     */
    public DangNhap() {
        initComponents();
        setLocationRelativeTo(null);
        Cursor cursor = Cursor.getPredefinedCursor(Cursor.HAND_CURSOR);
        panelRound1.setCursor(cursor);
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        jTextFieldUsername = new javax.swing.JTextField();
        jPasswordField = new javax.swing.JPasswordField();
        panelRound1 = new GUI.PanelRound();
        jLabel5 = new javax.swing.JLabel();
        jLabel1 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setBackground(new java.awt.Color(255, 255, 255));
        setResizable(false);
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel2.setFont(new java.awt.Font("Be Vietnam Pro ExtraBold", 0, 45)); // NOI18N
        jLabel2.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel2.setText("ĐĂNG NHẬP");
        getContentPane().add(jLabel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(1005, 74, 391, 55));

        jLabel3.setFont(new java.awt.Font("Be Vietnam Pro Medium", 0, 25)); // NOI18N
        jLabel3.setText("Mật khẩu");
        getContentPane().add(jLabel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(900, 313, 230, 31));

        jLabel4.setFont(new java.awt.Font("Be Vietnam Pro Medium", 0, 25)); // NOI18N
        jLabel4.setText("Tên đăng nhập");
        getContentPane().add(jLabel4, new org.netbeans.lib.awtextra.AbsoluteConstraints(899, 170, 238, 31));

        jTextFieldUsername.setFont(new java.awt.Font("Be Vietnam Pro Medium", 0, 20)); // NOI18N
        getContentPane().add(jTextFieldUsername, new org.netbeans.lib.awtextra.AbsoluteConstraints(900, 209, 604, 69));

        jPasswordField.setFont(new java.awt.Font("Be Vietnam Pro Medium", 0, 20)); // NOI18N
        getContentPane().add(jPasswordField, new org.netbeans.lib.awtextra.AbsoluteConstraints(900, 352, 604, 68));

        panelRound1.setBackground(new java.awt.Color(45, 96, 151));
        panelRound1.setRoundBottomLeft(50);
        panelRound1.setRoundBottomRight(50);
        panelRound1.setRoundTopLeft(50);
        panelRound1.setRoundTopRight(50);
        panelRound1.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                panelRound1MouseClicked(evt);
            }
        });
        panelRound1.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel5.setFont(new java.awt.Font("Be Vietnam Pro SemiBold", 0, 34)); // NOI18N
        jLabel5.setForeground(new java.awt.Color(255, 255, 255));
        jLabel5.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel5.setText("Đăng nhập");
        panelRound1.add(jLabel5, new org.netbeans.lib.awtextra.AbsoluteConstraints(44, 10, 251, 56));

        getContentPane().add(panelRound1, new org.netbeans.lib.awtextra.AbsoluteConstraints(1038, 515, 338, 76));

        jLabel1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/icon/Ảnh đăng nhập.jpg"))); // NOI18N
        getContentPane().add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 1600, 900));

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void panelRound1MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_panelRound1MouseClicked
        // TODO add your handling code here:
        nguoiDungDAO = new NguoiDungDAO();
        String inputUsername = jTextFieldUsername.getText();
        char[] inputPassword = jPasswordField.getPassword();
        String inputPasswordText = new String(inputPassword);
        NguoiDungDTO nguoiDungDTO = nguoiDungDAO.tim(inputUsername);
        if (inputUsername.equals("") && inputPasswordText.equals("")) {
            JOptionPane.showMessageDialog(null, "Vui lòng nhập đủ");
        } else if (inputUsername.equals("")) {
            JOptionPane.showMessageDialog(null, "Vui lòng nhập tài khoản");
        } else if (inputPasswordText.equals("")) {
            JOptionPane.showMessageDialog(null, "Vui lòng nhập mật khẩu");
        } else if (nguoiDungDTO.getPasswordString().equals(inputPasswordText)) {
            JOptionPane.showMessageDialog(null, "Đăng nhập thành công!");
        } else {
            JOptionPane.showMessageDialog(null, "Đăng nhập thất bại!");
        }
    }//GEN-LAST:event_panelRound1MouseClicked

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
            java.util.logging.Logger.getLogger(DangNhap.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(DangNhap.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(DangNhap.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(DangNhap.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new DangNhap().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JPasswordField jPasswordField;
    private javax.swing.JTextField jTextFieldUsername;
    private GUI.PanelRound panelRound1;
    // End of variables declaration//GEN-END:variables
}