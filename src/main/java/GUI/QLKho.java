/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JPanel.java to edit this template
 */
package GUI;

import BUS.KhoBUS;
import DAO_Hibernate.KhoDAO;
import DAO_Hibernate.TestProcedure;
import DTO.HoaDonDTO;
import DTO.KhachHangDTO;
import DTO.KhoDTO;
import DTO.SanPhamDTO;
import static GUI.DangNhap.nhanVien;

import java.awt.Component;
import java.sql.SQLException;
import java.util.Date;
import java.util.List;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JOptionPane;

/**
 *
 * @author Locc
 */
public class QLKho extends javax.swing.JPanel {

    private KhoBUS khoVanBUS;

    /**
     * Creates new form QLKho
     */
    public QLKho() {
        initComponents();
        jDialogAddLH.setLocationRelativeTo(null);
        jDialogDeleteLH.setLocationRelativeTo(null);
        khoVanBUS = new KhoBUS();
        for (int i = 0; i < khoVanBUS.getList_KhoVanDTOs().size(); i++) {
            LoHang loHang = new LoHang(khoVanBUS.getList_KhoVanDTOs().get(i));
            jPanel4.add(loHang);
        }
        jPanel4.revalidate();
        jPanel4.repaint();
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jDialogDeleteLH = new javax.swing.JDialog();
        panelRound1 = new GUI.PanelRound();
        jLabel20 = new javax.swing.JLabel();
        jLabel21 = new javax.swing.JLabel();
        jPanel12 = new javax.swing.JPanel();
        jLabel22 = new javax.swing.JLabel();
        jLabel23 = new javax.swing.JLabel();
        jDialogAddLH = new javax.swing.JDialog();
        jPanel5 = new javax.swing.JPanel();
        jPanel13 = new javax.swing.JPanel();
        jPanel14 = new javax.swing.JPanel();
        jLabel26 = new javax.swing.JLabel();
        jLabel27 = new javax.swing.JLabel();
        jTextFieldMaLH = new javax.swing.JTextField();
        jTextFieldTenNCC = new javax.swing.JTextField();
        jPanelSave1 = new javax.swing.JPanel();
        jLabel29 = new javax.swing.JLabel();
        jLabel30 = new javax.swing.JLabel();
        jLabel31 = new javax.swing.JLabel();
        jLabel32 = new javax.swing.JLabel();
        jPanel1 = new javax.swing.JPanel();
        jPanel16 = new javax.swing.JPanel();
        jLabel43 = new javax.swing.JLabel();
        panelRound2 = new GUI.PanelRound();
        jTextField5 = new javax.swing.JTextField();
        jPanel3 = new javax.swing.JPanel();
        jLabel4 = new javax.swing.JLabel();
        jPanel6 = new javax.swing.JPanel();
        jLabel6 = new javax.swing.JLabel();
        jPanel2 = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jLabel24 = new javax.swing.JLabel();
        jLabel25 = new javax.swing.JLabel();
        jScrollPane1 = new javax.swing.JScrollPane();
        jPanel4 = new javax.swing.JPanel();

        jDialogDeleteLH.setFocusable(false);
        jDialogDeleteLH.setFocusableWindowState(false);
        jDialogDeleteLH.setModal(true);
        jDialogDeleteLH.setUndecorated(true);
        jDialogDeleteLH.setResizable(false);
        jDialogDeleteLH.setSize(new java.awt.Dimension(625, 210));
        jDialogDeleteLH.getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        panelRound1.setBackground(new java.awt.Color(143, 203, 253));
        panelRound1.setMaximumSize(new java.awt.Dimension(625, 210));
        panelRound1.setMinimumSize(new java.awt.Dimension(625, 210));
        panelRound1.setRoundBottomLeft(20);
        panelRound1.setRoundBottomRight(20);
        panelRound1.setRoundTopLeft(20);
        panelRound1.setRoundTopRight(20);
        panelRound1.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel20.setFont(new java.awt.Font("Be Vietnam Pro SemiBold", 0, 22)); // NOI18N
        jLabel20.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel20.setText("Xác nhận xóa lô hàng đã chọn?");
        panelRound1.add(jLabel20, new org.netbeans.lib.awtextra.AbsoluteConstraints(8, 30, 610, -1));

        jLabel21.setFont(new java.awt.Font("Be Vietnam Pro SemiBold", 0, 18)); // NOI18N
        jLabel21.setForeground(new java.awt.Color(102, 115, 130));
        jLabel21.setText("Lưu ý lô hàng sẽ bị xoá hoàn toàn và không thể khôi phục");
        panelRound1.add(jLabel21, new org.netbeans.lib.awtextra.AbsoluteConstraints(8, 80, 610, -1));

        jPanel12.setBackground(new java.awt.Color(255, 255, 255));
        jPanel12.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(45, 96, 151), 2));
        jPanel12.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        jPanel12.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jPanel12MouseClicked(evt);
            }
        });
        jPanel12.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel22.setFont(new java.awt.Font("Be Vietnam Pro SemiBold", 0, 18)); // NOI18N
        jLabel22.setForeground(new java.awt.Color(45, 96, 151));
        jLabel22.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel22.setText("Hủy bỏ");
        jPanel12.add(jLabel22, new org.netbeans.lib.awtextra.AbsoluteConstraints(32, 5, 104, 32));

        panelRound1.add(jPanel12, new org.netbeans.lib.awtextra.AbsoluteConstraints(424, 143, 170, 45));

        jLabel23.setFont(new java.awt.Font("Be Vietnam Pro SemiBold", 0, 19)); // NOI18N
        jLabel23.setForeground(new java.awt.Color(255, 255, 255));
        jLabel23.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel23.setText("Xác nhận");
        jLabel23.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jLabel23MouseClicked(evt);
            }
        });
        panelRound1.add(jLabel23, new org.netbeans.lib.awtextra.AbsoluteConstraints(310, 150, 104, 32));

        jDialogDeleteLH.getContentPane().add(panelRound1, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 625, 210));

        jDialogAddLH.setModal(true);
        jDialogAddLH.setUndecorated(true);
        jDialogAddLH.setSize(new java.awt.Dimension(420, 510));
        jDialogAddLH.getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jPanel5.setBackground(new java.awt.Color(45, 96, 151));
        jPanel5.setMaximumSize(new java.awt.Dimension(420, 510));
        jPanel5.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jPanel13.setBackground(new java.awt.Color(143, 203, 253));
        jPanel13.setMaximumSize(new java.awt.Dimension(420, 460));
        jPanel13.setMinimumSize(new java.awt.Dimension(420, 460));
        jPanel13.setPreferredSize(new java.awt.Dimension(420, 460));
        jPanel13.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jPanel14.setBackground(new java.awt.Color(255, 255, 255));
        jPanel14.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(230, 225, 219)));
        jPanel14.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel26.setFont(new java.awt.Font("Be Vietnam Pro SemiBold", 0, 18)); // NOI18N
        jLabel26.setText("Mã lô hàng");
        jPanel14.add(jLabel26, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 30, 160, 24));

        jLabel27.setFont(new java.awt.Font("Be Vietnam Pro SemiBold", 0, 18)); // NOI18N
        jLabel27.setText("Tên nhà cung cấp");
        jPanel14.add(jLabel27, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 120, 160, 24));

        jTextFieldMaLH.setEditable(false);
        jTextFieldMaLH.setFont(new java.awt.Font("Be Vietnam Pro SemiBold", 0, 18)); // NOI18N
        jTextFieldMaLH.setForeground(new java.awt.Color(151, 151, 151));
        jTextFieldMaLH.setBorder(javax.swing.BorderFactory.createMatteBorder(0, 0, 2, 0, new java.awt.Color(45, 96, 151)));
        jPanel14.add(jTextFieldMaLH, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 65, 240, 30));

        jTextFieldTenNCC.setFont(new java.awt.Font("Be Vietnam Pro SemiBold", 0, 18)); // NOI18N
        jTextFieldTenNCC.setForeground(new java.awt.Color(151, 151, 151));
        jTextFieldTenNCC.setBorder(javax.swing.BorderFactory.createMatteBorder(0, 0, 2, 0, new java.awt.Color(45, 96, 151)));
        jPanel14.add(jTextFieldTenNCC, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 155, 240, 30));

        jPanelSave1.setBackground(new java.awt.Color(45, 96, 151));
        jPanelSave1.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        jPanelSave1.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jPanelSave1MouseClicked(evt);
            }
        });
        jPanelSave1.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel29.setFont(new java.awt.Font("Be Vietnam Pro SemiBold", 0, 20)); // NOI18N
        jLabel29.setForeground(new java.awt.Color(255, 255, 255));
        jLabel29.setText("Lưu");
        jPanelSave1.add(jLabel29, new org.netbeans.lib.awtextra.AbsoluteConstraints(54, -10, 40, 60));

        jLabel30.setIcon(new javax.swing.ImageIcon(getClass().getResource("/icon/download.png"))); // NOI18N
        jPanelSave1.add(jLabel30, new org.netbeans.lib.awtextra.AbsoluteConstraints(19, 8, 24, 24));

        jPanel14.add(jPanelSave1, new org.netbeans.lib.awtextra.AbsoluteConstraints(240, 390, 135, 41));

        jPanel13.add(jPanel14, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 10, 400, 450));

        jPanel5.add(jPanel13, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 50, 420, 460));

        jLabel31.setFont(new java.awt.Font("Be Vietnam Pro SemiBold", 0, 20)); // NOI18N
        jLabel31.setForeground(new java.awt.Color(255, 255, 255));
        jLabel31.setText("Thêm Lô hàng");
        jPanel5.add(jLabel31, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 0, 187, 60));

        jLabel32.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel32.setIcon(new javax.swing.ImageIcon(getClass().getResource("/icon/x.png"))); // NOI18N
        jLabel32.setVerticalAlignment(javax.swing.SwingConstants.TOP);
        jLabel32.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        jLabel32.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jLabel32MouseClicked(evt);
            }
        });
        jPanel5.add(jLabel32, new org.netbeans.lib.awtextra.AbsoluteConstraints(386, 13, 24, 24));

        jDialogAddLH.getContentPane().add(jPanel5, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 420, 510));

        setMaximumSize(new java.awt.Dimension(1200, 900));
        setMinimumSize(new java.awt.Dimension(1200, 900));
        setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jPanel1.setBackground(new java.awt.Color(143, 203, 253));
        jPanel1.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jPanel16.setBackground(new java.awt.Color(143, 203, 253));
        jPanel16.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel43.setIcon(new javax.swing.ImageIcon(getClass().getResource("/icon/search 1.png"))); // NOI18N
        jPanel16.add(jLabel43, new org.netbeans.lib.awtextra.AbsoluteConstraints(15, 21, 48, 48));

        panelRound2.setBackground(new java.awt.Color(255, 255, 255));
        panelRound2.setMaximumSize(new java.awt.Dimension(330, 50));
        panelRound2.setMinimumSize(new java.awt.Dimension(330, 50));
        panelRound2.setPreferredSize(new java.awt.Dimension(330, 50));
        panelRound2.setRoundBottomLeft(50);
        panelRound2.setRoundBottomRight(50);
        panelRound2.setRoundTopLeft(50);
        panelRound2.setRoundTopRight(50);
        panelRound2.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jTextField5.setFont(new java.awt.Font("Be Vietnam Pro", 0, 24)); // NOI18N
        jTextField5.setBorder(null);
        jTextField5.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jTextField5ActionPerformed(evt);
            }
        });
        panelRound2.add(jTextField5, new org.netbeans.lib.awtextra.AbsoluteConstraints(25, 0, 280, 50));

        jPanel16.add(panelRound2, new org.netbeans.lib.awtextra.AbsoluteConstraints(70, 20, 330, 50));

        jPanel1.add(jPanel16, new org.netbeans.lib.awtextra.AbsoluteConstraints(770, 0, 430, 90));

        jPanel3.setBackground(new java.awt.Color(45, 96, 151));
        jPanel3.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        jPanel3.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jPanel3MouseClicked(evt);
            }
        });
        jPanel3.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel4.setFont(new java.awt.Font("Be Vietnam Pro Medium", 0, 28)); // NOI18N
        jLabel4.setForeground(new java.awt.Color(255, 255, 255));
        jLabel4.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel4.setText("Xóa lô hàng");
        jPanel3.add(jLabel4, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 0, 210, 70));

        jPanel1.add(jPanel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(311, 10, 230, 70));

        jPanel6.setBackground(new java.awt.Color(45, 96, 151));
        jPanel6.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        jPanel6.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jPanel6MouseClicked(evt);
            }
        });
        jPanel6.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel6.setFont(new java.awt.Font("Be Vietnam Pro Medium", 0, 28)); // NOI18N
        jLabel6.setForeground(new java.awt.Color(255, 255, 255));
        jLabel6.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel6.setText("Thêm lô hàng");
        jPanel6.add(jLabel6, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 0, 210, 70));

        jPanel1.add(jPanel6, new org.netbeans.lib.awtextra.AbsoluteConstraints(545, 10, 230, 70));

        add(jPanel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 1200, 90));

        jPanel2.setBackground(new java.awt.Color(45, 96, 151));
        jPanel2.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel1.setFont(new java.awt.Font("Be Vietnam Pro SemiBold", 0, 24)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(255, 255, 255));
        jLabel1.setText("SL SP trong LH");
        jPanel2.add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(990, 0, 190, 60));

        jLabel2.setFont(new java.awt.Font("Be Vietnam Pro SemiBold", 0, 24)); // NOI18N
        jLabel2.setForeground(new java.awt.Color(255, 255, 255));
        jLabel2.setText("Tên nhà cung cấp");
        jPanel2.add(jLabel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(670, 0, 260, 60));

        jLabel3.setBackground(new java.awt.Color(255, 255, 255));
        jLabel3.setFont(new java.awt.Font("Be Vietnam Pro SemiBold", 0, 24)); // NOI18N
        jLabel3.setForeground(new java.awt.Color(255, 255, 255));
        jLabel3.setText("Mã lô hàng");
        jPanel2.add(jLabel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 0, 160, 60));

        jLabel24.setFont(new java.awt.Font("Be Vietnam Pro SemiBold", 0, 24)); // NOI18N
        jLabel24.setForeground(new java.awt.Color(255, 255, 255));
        jLabel24.setText("Ngày nhập");
        jPanel2.add(jLabel24, new org.netbeans.lib.awtextra.AbsoluteConstraints(430, 0, 170, 60));

        jLabel25.setFont(new java.awt.Font("Be Vietnam Pro SemiBold", 0, 24)); // NOI18N
        jLabel25.setForeground(new java.awt.Color(255, 255, 255));
        jLabel25.setText("Mã NV");
        jPanel2.add(jLabel25, new org.netbeans.lib.awtextra.AbsoluteConstraints(200, 0, 170, 60));

        add(jPanel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 90, 1200, 60));

        jScrollPane1.setBorder(null);
        jScrollPane1.setHorizontalScrollBarPolicy(javax.swing.ScrollPaneConstants.HORIZONTAL_SCROLLBAR_NEVER);

        jPanel4.setBackground(new java.awt.Color(255, 255, 255));
        jPanel4.setLayout(new javax.swing.BoxLayout(jPanel4, javax.swing.BoxLayout.Y_AXIS));
        jScrollPane1.setViewportView(jPanel4);

        add(jScrollPane1, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 150, 1200, 750));
    }// </editor-fold>//GEN-END:initComponents

    private void jPanel12MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jPanel12MouseClicked
        // TODO add your handling code here:
        jDialogDeleteLH.dispose();
    }//GEN-LAST:event_jPanel12MouseClicked

    private void jPanel3MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jPanel3MouseClicked
        // TODO add your handling code here:
        Component[] components = jPanel4.getComponents();

        // Iterate over the components in reverse order
        for (int i = components.length - 1; i >= 0; i--) {
            Component component = components[i];

            // Check if the component is an instance of Product
            if (component instanceof LoHang) {
                LoHang loHang = (LoHang) component;

                // Check if the product needs to be deleted
                if (loHang.isSelect()) {
                    jDialogDeleteLH.setVisible(true);
                }
            }
        }
    }//GEN-LAST:event_jPanel3MouseClicked

    private void jLabel23MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabel23MouseClicked
        // TODO add your handling code here:
        Component[] components = jPanel4.getComponents();

        // Iterate over the components in reverse order
        for (int i = components.length - 1; i >= 0; i--) {
            Component component = components[i];

            // Check if the component is an instance of Product
            if (component instanceof LoHang) {
                LoHang loHang = (LoHang) component;

                // Check if the product needs to be deleted
                if (loHang.isSelect()) {
                    // Remove the product from Database
                    try {
                        KhoDAO khoDAO = new KhoDAO();
                        if (khoDAO.deleteLoHang(loHang.getKhoDTO())) {
                            // Remove the product from the panel and update the UI
                            jPanel4.remove(loHang);
                            System.out.println("Xoa SP thanh cong!");
                            jDialogDeleteLH.dispose();
                        } else {
                            JOptionPane.showMessageDialog(null, "Xóa LH không được!");
                        }
                    } catch (Exception e) {
                        // TODO Auto-generated catch block
                        e.printStackTrace();
                        JOptionPane.showMessageDialog(null, "Xóa LH không được!");
//                        System.out.println("Lỗi ràng buộc khóa ngoại");
                    }
                }
            }
        }

        // Update the UI after all products have been removed
        jPanel4.revalidate();
        jPanel4.repaint();

    }//GEN-LAST:event_jLabel23MouseClicked

    private void jPanelSave1MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jPanelSave1MouseClicked
        // TODO add your handling code here:
        KhoDTO khoDTO = new KhoDTO();
        khoDTO.setMaLoHangString(jTextFieldMaLH.getText());
        khoDTO.setMaNhanVienString(nhanVien.getMaNVString());
        khoDTO.setTenNhaCungCapString(jTextFieldTenNCC.getText());
        khoDTO.setNgayNhapDate(new Date());

        KhoDAO khoDAO = new KhoDAO();
        try {
            khoDAO.insertLoHang(khoDTO);
            LoHang loHang = new LoHang(khoDTO);
            jPanel4.add(loHang);
            jPanel4.revalidate();
            jPanel4.repaint();
            jDialogAddLH.dispose();
        } catch (SQLException ex) {
            if (ex.getErrorCode() == -20000) {
                JOptionPane.showMessageDialog(null, ex.getMessage());
            } else {
                JOptionPane.showMessageDialog(null, "Lỗi không thêm lô hàng được!");
            }
            ex.printStackTrace();
            Logger.getLogger(QLKho.class.getName()).log(Level.SEVERE, null, ex);
        }
    }//GEN-LAST:event_jPanelSave1MouseClicked

    private void jLabel32MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabel32MouseClicked
        // TODO add your handling code here:
        jDialogAddLH.dispose();
    }//GEN-LAST:event_jLabel32MouseClicked

    private void jPanel6MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jPanel6MouseClicked
        // TODO add your handling code here:
        KhoDAO khoDAO = new KhoDAO();

        jTextFieldMaLH.setText(khoDAO.AutoGenerateMaLH());
        jDialogAddLH.setVisible(true);

//        System.out.println("Thêm lô hàng");6
    }//GEN-LAST:event_jPanel6MouseClicked

    private void jTextField5ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jTextField5ActionPerformed
        // TODO add your handling code here:
        String keyword = jTextField5.getText();
        TestProcedure testProcedure = new TestProcedure();
        jPanel4.removeAll();
        if (keyword.length() != 0) { // Có nhập
            List<KhoDTO> khoDTOs = testProcedure.SEARCH_LOHANG(keyword);
            if (!khoDTOs.isEmpty()) { // Tìm thấy
                for (KhoDTO khoDTO : khoDTOs) {
                    LoHang loHang = new LoHang(khoDTO);
                    jPanel4.add(loHang);
                }
            }
        } else { // Không nhập
            for (int i = 0; i < khoVanBUS.getList_KhoVanDTOs().size(); i++) {
                LoHang loHang = new LoHang(khoVanBUS.getList_KhoVanDTOs().get(i));
                jPanel4.add(loHang);
            }
        }
        jPanel4.revalidate();
        jPanel4.repaint();
    }//GEN-LAST:event_jTextField5ActionPerformed

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JDialog jDialogAddLH;
    private javax.swing.JDialog jDialogDeleteLH;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel20;
    private javax.swing.JLabel jLabel21;
    private javax.swing.JLabel jLabel22;
    private javax.swing.JLabel jLabel23;
    private javax.swing.JLabel jLabel24;
    private javax.swing.JLabel jLabel25;
    private javax.swing.JLabel jLabel26;
    private javax.swing.JLabel jLabel27;
    private javax.swing.JLabel jLabel29;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel30;
    private javax.swing.JLabel jLabel31;
    private javax.swing.JLabel jLabel32;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel43;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel12;
    private javax.swing.JPanel jPanel13;
    private javax.swing.JPanel jPanel14;
    private javax.swing.JPanel jPanel16;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JPanel jPanel3;
    private javax.swing.JPanel jPanel4;
    private javax.swing.JPanel jPanel5;
    private javax.swing.JPanel jPanel6;
    private javax.swing.JPanel jPanelSave1;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTextField jTextField5;
    private javax.swing.JTextField jTextFieldMaLH;
    private javax.swing.JTextField jTextFieldTenNCC;
    private GUI.PanelRound panelRound1;
    private GUI.PanelRound panelRound2;
    // End of variables declaration//GEN-END:variables
}
