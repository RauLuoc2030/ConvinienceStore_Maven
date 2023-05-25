/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JPanel.java to edit this template
 */
package GUI;

import BUS.SanPhamBUS;
import javax.swing.JFrame;

/**
 *
 * @author Locc
 */
public class QLSanPham extends javax.swing.JPanel {

    private SanPhamBUS sanPhamBUS;

    /**
     * Creates new form QLSanPham
     */
    public QLSanPham() {
        initComponents();
        jDialogAddSP.setLocationRelativeTo(null);
        jDialogDeleteSP.setLocationRelativeTo(null);

        sanPhamBUS = new SanPhamBUS();
        for (int i = 0; i < sanPhamBUS.getList_SanPhamDTOs().size(); i++) {
            Product_icon product_icon1 = new Product_icon(sanPhamBUS.getList_SanPhamDTOs().get(i));
            jPanel4.add(product_icon1);
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

        jDialogAddSP = new javax.swing.JDialog();
        jPanel6 = new javax.swing.JPanel();
        jPanel7 = new javax.swing.JPanel();
        jPanel8 = new javax.swing.JPanel();
        jPanelSave = new javax.swing.JPanel();
        jLabel5 = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        jPanel9 = new javax.swing.JPanel();
        jPanel10 = new javax.swing.JPanel();
        jLabel7 = new javax.swing.JLabel();
        jLabel8 = new javax.swing.JLabel();
        jLabel9 = new javax.swing.JLabel();
        jLabel10 = new javax.swing.JLabel();
        jLabel11 = new javax.swing.JLabel();
        jLabel12 = new javax.swing.JLabel();
        jLabel13 = new javax.swing.JLabel();
        jLabel14 = new javax.swing.JLabel();
        jLabel15 = new javax.swing.JLabel();
        jLabel16 = new javax.swing.JLabel();
        jTextField1 = new javax.swing.JTextField();
        jTextField2 = new javax.swing.JTextField();
        jTextField3 = new javax.swing.JTextField();
        jTextField4 = new javax.swing.JTextField();
        jTextField6 = new javax.swing.JTextField();
        jTextField9 = new javax.swing.JTextField();
        jComboBox1 = new javax.swing.JComboBox<>();
        jDateChooser1 = new com.toedter.calendar.JDateChooser();
        jDateChooser2 = new com.toedter.calendar.JDateChooser();
        jLabel17 = new javax.swing.JLabel();
        jLabel18 = new javax.swing.JLabel();
        jDialogDeleteSP = new javax.swing.JDialog();
        panelRound1 = new GUI.PanelRound();
        jLabel19 = new javax.swing.JLabel();
        jLabel20 = new javax.swing.JLabel();
        jPanel11 = new javax.swing.JPanel();
        jLabel21 = new javax.swing.JLabel();
        jLabel22 = new javax.swing.JLabel();
        jPanelDel = new javax.swing.JPanel();
        jLabel2 = new javax.swing.JLabel();
        jPanelAdd = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        jPanel1 = new javax.swing.JPanel();
        jScrollPane1 = new javax.swing.JScrollPane();
        jPanel4 = new javax.swing.JPanel();

        jDialogAddSP.setMaximumSize(new java.awt.Dimension(420, 570));
        jDialogAddSP.setModal(true);
        jDialogAddSP.setUndecorated(true);
        jDialogAddSP.setResizable(false);
        jDialogAddSP.setSize(new java.awt.Dimension(420, 570));
        jDialogAddSP.getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jPanel6.setBackground(new java.awt.Color(45, 96, 151));
        jPanel6.setMaximumSize(new java.awt.Dimension(420, 568));
        jPanel6.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jPanel7.setBackground(new java.awt.Color(143, 203, 253));
        jPanel7.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jPanel8.setBackground(new java.awt.Color(255, 255, 255));
        jPanel8.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(209, 202, 191)));
        jPanel8.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jPanelSave.setBackground(new java.awt.Color(45, 96, 151));
        jPanelSave.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        jPanelSave.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jPanelSaveMouseClicked(evt);
            }
        });
        jPanelSave.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel5.setFont(new java.awt.Font("Be Vietnam Pro SemiBold", 0, 20)); // NOI18N
        jLabel5.setForeground(new java.awt.Color(255, 255, 255));
        jLabel5.setText("Lưu");
        jPanelSave.add(jLabel5, new org.netbeans.lib.awtextra.AbsoluteConstraints(54, -10, 40, 60));

        jLabel6.setIcon(new javax.swing.ImageIcon(getClass().getResource("/icon/download.png"))); // NOI18N
        jPanelSave.add(jLabel6, new org.netbeans.lib.awtextra.AbsoluteConstraints(19, 8, 24, 24));

        jPanel8.add(jPanelSave, new org.netbeans.lib.awtextra.AbsoluteConstraints(248, 452, 135, 41));

        jPanel9.setBackground(new java.awt.Color(255, 255, 255));
        jPanel9.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));

        javax.swing.GroupLayout jPanel9Layout = new javax.swing.GroupLayout(jPanel9);
        jPanel9.setLayout(jPanel9Layout);
        jPanel9Layout.setHorizontalGroup(
            jPanel9Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 102, Short.MAX_VALUE)
        );
        jPanel9Layout.setVerticalGroup(
            jPanel9Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 93, Short.MAX_VALUE)
        );

        jPanel8.add(jPanel9, new org.netbeans.lib.awtextra.AbsoluteConstraints(15, 22, 104, 95));

        jPanel10.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel7.setBackground(new java.awt.Color(101, 77, 40));
        jLabel7.setFont(new java.awt.Font("Be Vietnam Pro SemiBold", 0, 10)); // NOI18N
        jLabel7.setText("Chọn file");
        jPanel10.add(jLabel7, new org.netbeans.lib.awtextra.AbsoluteConstraints(19, -2, 48, 30));

        jPanel8.add(jPanel10, new org.netbeans.lib.awtextra.AbsoluteConstraints(23, 124, 86, 26));

        jLabel8.setFont(new java.awt.Font("Be Vietnam Pro SemiBold", 0, 12)); // NOI18N
        jLabel8.setText("Giá");
        jPanel8.add(jLabel8, new org.netbeans.lib.awtextra.AbsoluteConstraints(12, 222, 135, 24));

        jLabel9.setFont(new java.awt.Font("Be Vietnam Pro SemiBold", 0, 12)); // NOI18N
        jLabel9.setText("Mã sản phẩm");
        jPanel8.add(jLabel9, new org.netbeans.lib.awtextra.AbsoluteConstraints(12, 157, 135, 24));

        jLabel10.setFont(new java.awt.Font("Be Vietnam Pro SemiBold", 0, 12)); // NOI18N
        jLabel10.setText("Mô tả");
        jPanel8.add(jLabel10, new org.netbeans.lib.awtextra.AbsoluteConstraints(12, 289, 135, 24));

        jLabel11.setFont(new java.awt.Font("Be Vietnam Pro SemiBold", 0, 12)); // NOI18N
        jLabel11.setText("Thông tin chi tiết");
        jLabel11.setToolTipText("");
        jPanel8.add(jLabel11, new org.netbeans.lib.awtextra.AbsoluteConstraints(12, 377, 135, 24));

        jLabel12.setFont(new java.awt.Font("Be Vietnam Pro SemiBold", 0, 12)); // NOI18N
        jLabel12.setText("Tên sản phẩm");
        jPanel8.add(jLabel12, new org.netbeans.lib.awtextra.AbsoluteConstraints(224, 22, 135, 24));

        jLabel13.setFont(new java.awt.Font("Be Vietnam Pro SemiBold", 0, 12)); // NOI18N
        jLabel13.setText("Phân loại");
        jPanel8.add(jLabel13, new org.netbeans.lib.awtextra.AbsoluteConstraints(224, 87, 135, 24));

        jLabel14.setFont(new java.awt.Font("Be Vietnam Pro SemiBold", 0, 12)); // NOI18N
        jLabel14.setText("Số lượng");
        jPanel8.add(jLabel14, new org.netbeans.lib.awtextra.AbsoluteConstraints(224, 156, 135, 24));

        jLabel15.setFont(new java.awt.Font("Be Vietnam Pro SemiBold", 0, 12)); // NOI18N
        jLabel15.setText("NSX");
        jPanel8.add(jLabel15, new org.netbeans.lib.awtextra.AbsoluteConstraints(224, 223, 135, 24));

        jLabel16.setFont(new java.awt.Font("Be Vietnam Pro SemiBold", 0, 12)); // NOI18N
        jLabel16.setText("HSD");
        jPanel8.add(jLabel16, new org.netbeans.lib.awtextra.AbsoluteConstraints(224, 301, 135, 24));

        jTextField1.setFont(new java.awt.Font("Be Vietnam Pro SemiBold", 0, 12)); // NOI18N
        jTextField1.setBorder(javax.swing.BorderFactory.createMatteBorder(0, 0, 2, 0, new java.awt.Color(45, 96, 151)));
        jPanel8.add(jTextField1, new org.netbeans.lib.awtextra.AbsoluteConstraints(12, 181, 135, 24));

        jTextField2.setFont(new java.awt.Font("Be Vietnam Pro SemiBold", 0, 12)); // NOI18N
        jTextField2.setBorder(javax.swing.BorderFactory.createMatteBorder(0, 0, 2, 0, new java.awt.Color(45, 96, 151)));
        jPanel8.add(jTextField2, new org.netbeans.lib.awtextra.AbsoluteConstraints(12, 246, 135, 24));

        jTextField3.setFont(new java.awt.Font("Be Vietnam Pro SemiBold", 0, 12)); // NOI18N
        jTextField3.setBorder(javax.swing.BorderFactory.createMatteBorder(0, 0, 2, 0, new java.awt.Color(45, 96, 151)));
        jPanel8.add(jTextField3, new org.netbeans.lib.awtextra.AbsoluteConstraints(12, 313, 135, 24));

        jTextField4.setFont(new java.awt.Font("Be Vietnam Pro SemiBold", 0, 12)); // NOI18N
        jTextField4.setBorder(javax.swing.BorderFactory.createMatteBorder(0, 0, 2, 0, new java.awt.Color(45, 96, 151)));
        jPanel8.add(jTextField4, new org.netbeans.lib.awtextra.AbsoluteConstraints(224, 46, 135, 24));

        jTextField6.setFont(new java.awt.Font("Be Vietnam Pro SemiBold", 0, 12)); // NOI18N
        jTextField6.setBorder(javax.swing.BorderFactory.createMatteBorder(0, 0, 2, 0, new java.awt.Color(45, 96, 151)));
        jPanel8.add(jTextField6, new org.netbeans.lib.awtextra.AbsoluteConstraints(224, 180, 135, 24));

        jTextField9.setFont(new java.awt.Font("Be Vietnam Pro SemiBold", 0, 12)); // NOI18N
        jTextField9.setBorder(javax.swing.BorderFactory.createMatteBorder(0, 0, 2, 0, new java.awt.Color(45, 96, 151)));
        jPanel8.add(jTextField9, new org.netbeans.lib.awtextra.AbsoluteConstraints(12, 401, 347, 24));

        jComboBox1.setFont(new java.awt.Font("Be Vietnam Pro SemiBold", 0, 12)); // NOI18N
        jComboBox1.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "PL1", "PL2", "PL3", "PL4", "PL5" }));
        jComboBox1.setBorder(javax.swing.BorderFactory.createMatteBorder(0, 0, 2, 0, new java.awt.Color(45, 96, 151)));
        jComboBox1.setLightWeightPopupEnabled(false);
        jComboBox1.setOpaque(true);
        jPanel8.add(jComboBox1, new org.netbeans.lib.awtextra.AbsoluteConstraints(224, 111, 135, 24));

        jDateChooser1.setBackground(new java.awt.Color(255, 255, 255));
        jDateChooser1.setBorder(javax.swing.BorderFactory.createMatteBorder(0, 0, 2, 0, new java.awt.Color(45, 96, 151)));
        jDateChooser1.setDateFormatString("dd/MM/yyyy");
        jDateChooser1.setFont(new java.awt.Font("Be Vietnam Pro", 0, 10)); // NOI18N
        jPanel8.add(jDateChooser1, new org.netbeans.lib.awtextra.AbsoluteConstraints(224, 325, 135, 24));

        jDateChooser2.setBackground(new java.awt.Color(255, 255, 255));
        jDateChooser2.setBorder(javax.swing.BorderFactory.createMatteBorder(0, 0, 2, 0, new java.awt.Color(45, 96, 151)));
        jDateChooser2.setDateFormatString("dd/MM/yyyy");
        jDateChooser2.setFont(new java.awt.Font("Be Vietnam Pro", 0, 10)); // NOI18N
        jPanel8.add(jDateChooser2, new org.netbeans.lib.awtextra.AbsoluteConstraints(224, 247, 135, 24));

        jPanel7.add(jPanel8, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 10, 400, 507));

        jPanel6.add(jPanel7, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 51, 420, 517));

        jLabel17.setFont(new java.awt.Font("Be Vietnam Pro SemiBold", 0, 20)); // NOI18N
        jLabel17.setForeground(new java.awt.Color(255, 255, 255));
        jLabel17.setText("Thêm sản phẩm");
        jPanel6.add(jLabel17, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 0, 168, 60));

        jLabel18.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel18.setIcon(new javax.swing.ImageIcon(getClass().getResource("/icon/x.png"))); // NOI18N
        jLabel18.setVerticalAlignment(javax.swing.SwingConstants.TOP);
        jLabel18.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        jLabel18.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jLabel18MouseClicked(evt);
            }
        });
        jPanel6.add(jLabel18, new org.netbeans.lib.awtextra.AbsoluteConstraints(386, 13, 24, 24));

        jDialogAddSP.getContentPane().add(jPanel6, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 420, 570));

        jDialogDeleteSP.setMinimumSize(new java.awt.Dimension(625, 210));
        jDialogDeleteSP.setModal(true);
        jDialogDeleteSP.setUndecorated(true);
        jDialogDeleteSP.setResizable(false);
        jDialogDeleteSP.setSize(new java.awt.Dimension(625, 210));
        jDialogDeleteSP.getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        panelRound1.setBackground(new java.awt.Color(143, 203, 253));
        panelRound1.setMaximumSize(new java.awt.Dimension(625, 210));
        panelRound1.setMinimumSize(new java.awt.Dimension(625, 210));
        panelRound1.setRoundBottomLeft(20);
        panelRound1.setRoundBottomRight(20);
        panelRound1.setRoundTopLeft(20);
        panelRound1.setRoundTopRight(20);
        panelRound1.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel19.setFont(new java.awt.Font("Be Vietnam Pro SemiBold", 0, 22)); // NOI18N
        jLabel19.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel19.setText("Xác nhận xóa sản phẩm đã chọn?");
        panelRound1.add(jLabel19, new org.netbeans.lib.awtextra.AbsoluteConstraints(8, 30, 610, -1));

        jLabel20.setFont(new java.awt.Font("Be Vietnam Pro SemiBold", 0, 18)); // NOI18N
        jLabel20.setForeground(new java.awt.Color(102, 115, 130));
        jLabel20.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel20.setText("Lưu ý sản phẩm sẽ bị xoá hoàn toàn và không thể khôi phục");
        panelRound1.add(jLabel20, new org.netbeans.lib.awtextra.AbsoluteConstraints(8, 80, 610, -1));

        jPanel11.setBackground(new java.awt.Color(255, 255, 255));
        jPanel11.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(45, 96, 151), 2));
        jPanel11.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        jPanel11.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jPanel11MouseClicked(evt);
            }
        });
        jPanel11.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel21.setFont(new java.awt.Font("Be Vietnam Pro SemiBold", 0, 18)); // NOI18N
        jLabel21.setForeground(new java.awt.Color(45, 96, 151));
        jLabel21.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel21.setText("Hủy bỏ");
        jPanel11.add(jLabel21, new org.netbeans.lib.awtextra.AbsoluteConstraints(32, 5, 104, 32));

        panelRound1.add(jPanel11, new org.netbeans.lib.awtextra.AbsoluteConstraints(424, 143, 170, 45));

        jLabel22.setFont(new java.awt.Font("Be Vietnam Pro SemiBold", 0, 19)); // NOI18N
        jLabel22.setForeground(new java.awt.Color(255, 255, 255));
        jLabel22.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel22.setText("Xác nhận");
        panelRound1.add(jLabel22, new org.netbeans.lib.awtextra.AbsoluteConstraints(310, 150, 104, 32));

        jDialogDeleteSP.getContentPane().add(panelRound1, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 625, 210));

        setBackground(new java.awt.Color(255, 255, 255));
        setMaximumSize(new java.awt.Dimension(1200, 810));
        addFocusListener(new java.awt.event.FocusAdapter() {
            public void focusGained(java.awt.event.FocusEvent evt) {
                formFocusGained(evt);
            }
        });
        setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jPanelDel.setBackground(new java.awt.Color(45, 96, 151));
        jPanelDel.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        jPanelDel.setMaximumSize(new java.awt.Dimension(80, 80));
        jPanelDel.setMinimumSize(new java.awt.Dimension(80, 80));
        jPanelDel.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jPanelDelMouseClicked(evt);
            }
        });
        jPanelDel.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel2.setFont(new java.awt.Font("Be Vietnam Pro Medium", 0, 48)); // NOI18N
        jLabel2.setForeground(new java.awt.Color(255, 255, 255));
        jLabel2.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel2.setText("x");
        jPanelDel.add(jLabel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 10, 60, 60));

        add(jPanelDel, new org.netbeans.lib.awtextra.AbsoluteConstraints(1090, 223, 80, 80));

        jPanelAdd.setBackground(new java.awt.Color(45, 96, 151));
        jPanelAdd.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        jPanelAdd.setMaximumSize(new java.awt.Dimension(80, 80));
        jPanelAdd.setMinimumSize(new java.awt.Dimension(80, 80));
        jPanelAdd.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jPanelAddMouseClicked(evt);
            }
        });
        jPanelAdd.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel1.setFont(new java.awt.Font("Be Vietnam Pro Medium", 0, 48)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(255, 255, 255));
        jLabel1.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel1.setText("+");
        jPanelAdd.add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 10, 60, 60));

        add(jPanelAdd, new org.netbeans.lib.awtextra.AbsoluteConstraints(1090, 140, 80, 80));

        jPanel1.setBackground(new java.awt.Color(143, 203, 253));

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 1200, Short.MAX_VALUE)
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 90, Short.MAX_VALUE)
        );

        add(jPanel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 1200, 90));

        jScrollPane1.setBorder(null);

        jPanel4.setBackground(new java.awt.Color(255, 255, 255));
        jPanel4.setLayout(new java.awt.GridLayout(2, 4));
        jScrollPane1.setViewportView(jPanel4);

        add(jScrollPane1, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 90, 1020, 810));
    }// </editor-fold>//GEN-END:initComponents

    private void jPanelAddMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jPanelAddMouseClicked
        // TODO add your handling code here:
//        JFrame frame = new ThemSP();
//        frame.setVisible(true);
//        System.out.println("GUI.QLSanPham.jPanelAddMouseClicked()");
        jDialogAddSP.setVisible(true);
    }//GEN-LAST:event_jPanelAddMouseClicked

    private void formFocusGained(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_formFocusGained
        // TODO add your handling code here:
        for (int i = 0; i < sanPhamBUS.getList_SanPhamDTOs().size(); i++) {
            Product_icon product_icon = new Product_icon(sanPhamBUS.getList_SanPhamDTOs().get(i).getTenSPString(),
                    sanPhamBUS.getList_SanPhamDTOs().get(i).getGiaInt().toString(),
                    sanPhamBUS.getList_SanPhamDTOs().get(i).getSoLuongSPInt().toString());
            jPanel1.add(product_icon);
        }
        jPanel1.revalidate();
        jPanel1.repaint();
    }//GEN-LAST:event_formFocusGained

    private void jPanelSaveMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jPanelSaveMouseClicked
        // TODO add your handling code here:
    }//GEN-LAST:event_jPanelSaveMouseClicked

    private void jLabel18MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabel18MouseClicked
        // TODO add your handling code here:
        jDialogAddSP.dispose();
    }//GEN-LAST:event_jLabel18MouseClicked

    private void jPanelDelMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jPanelDelMouseClicked
        // TODO add your handling code here:
        jDialogDeleteSP.setVisible(true);
    }//GEN-LAST:event_jPanelDelMouseClicked

    private void jPanel11MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jPanel11MouseClicked
        // TODO add your handling code here:
        jDialogDeleteSP.dispose();
    }//GEN-LAST:event_jPanel11MouseClicked

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JComboBox<String> jComboBox1;
    private com.toedter.calendar.JDateChooser jDateChooser1;
    private com.toedter.calendar.JDateChooser jDateChooser2;
    private javax.swing.JDialog jDialogAddSP;
    private javax.swing.JDialog jDialogDeleteSP;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel10;
    private javax.swing.JLabel jLabel11;
    private javax.swing.JLabel jLabel12;
    private javax.swing.JLabel jLabel13;
    private javax.swing.JLabel jLabel14;
    private javax.swing.JLabel jLabel15;
    private javax.swing.JLabel jLabel16;
    private javax.swing.JLabel jLabel17;
    private javax.swing.JLabel jLabel18;
    private javax.swing.JLabel jLabel19;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel20;
    private javax.swing.JLabel jLabel21;
    private javax.swing.JLabel jLabel22;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel10;
    private javax.swing.JPanel jPanel11;
    private javax.swing.JPanel jPanel4;
    private javax.swing.JPanel jPanel6;
    private javax.swing.JPanel jPanel7;
    private javax.swing.JPanel jPanel8;
    private javax.swing.JPanel jPanel9;
    private javax.swing.JPanel jPanelAdd;
    private javax.swing.JPanel jPanelDel;
    private javax.swing.JPanel jPanelSave;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTextField jTextField1;
    private javax.swing.JTextField jTextField2;
    private javax.swing.JTextField jTextField3;
    private javax.swing.JTextField jTextField4;
    private javax.swing.JTextField jTextField6;
    private javax.swing.JTextField jTextField9;
    private GUI.PanelRound panelRound1;
    // End of variables declaration//GEN-END:variables
}
