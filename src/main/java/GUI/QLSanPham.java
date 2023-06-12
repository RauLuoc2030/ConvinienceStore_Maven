/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JPanel.java to edit this template
 */
package GUI;

import BUS.SanPhamBUS;
import DAO_Hibernate.SanPhamDAO;
import DAO_Hibernate.TestProcedure;
import DTO.SanPhamDTO;
import java.awt.Component;
import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JOptionPane;
import javax.swing.text.AbstractDocument;

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
        jDialogAddNV.setLocationRelativeTo(null);
        jDialogDeleteSP.setLocationRelativeTo(null);

        sanPhamBUS = new SanPhamBUS();
        for (int i = 0; i < sanPhamBUS.getList_SanPhamDTOs().size(); i++) {
            Product_icon product_icon1 = new Product_icon(sanPhamBUS.getList_SanPhamDTOs().get(i));
            jPanelDanhSachSP.add(product_icon1);
        }
        jPanelDanhSachSP.revalidate();
        jPanelDanhSachSP.repaint();
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

        jDialogAddNV = new javax.swing.JDialog();
        jPanel6 = new javax.swing.JPanel();
        jPanel7 = new javax.swing.JPanel();
        jPanel8 = new javax.swing.JPanel();
        jPanelSave = new javax.swing.JPanel();
        jLabel5 = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        jLabel8 = new javax.swing.JLabel();
        jLabel9 = new javax.swing.JLabel();
        jLabel10 = new javax.swing.JLabel();
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
        jPanel1 = new javax.swing.JPanel();
        jPanel16 = new javax.swing.JPanel();
        jLabel43 = new javax.swing.JLabel();
        panelRound2 = new GUI.PanelRound();
        jTextField5 = new javax.swing.JTextField();
        jPanelAdd = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        jPanelDel = new javax.swing.JPanel();
        jLabel2 = new javax.swing.JLabel();
        jScrollPane1 = new javax.swing.JScrollPane();
        jPanelDanhSachSP = new javax.swing.JPanel();
        jPanel2 = new javax.swing.JPanel();
        jLabel23 = new javax.swing.JLabel();
        jLabel24 = new javax.swing.JLabel();
        jLabel25 = new javax.swing.JLabel();

        jDialogAddNV.setModal(true);
        jDialogAddNV.setUndecorated(true);
        jDialogAddNV.setResizable(false);
        jDialogAddNV.setSize(new java.awt.Dimension(420, 570));
        jDialogAddNV.getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

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

        jLabel8.setFont(new java.awt.Font("Be Vietnam Pro SemiBold", 0, 12)); // NOI18N
        jLabel8.setText("Giá");
        jPanel8.add(jLabel8, new org.netbeans.lib.awtextra.AbsoluteConstraints(12, 87, 135, 24));

        jLabel9.setFont(new java.awt.Font("Be Vietnam Pro SemiBold", 0, 12)); // NOI18N
        jLabel9.setText("Mã sản phẩm");
        jPanel8.add(jLabel9, new org.netbeans.lib.awtextra.AbsoluteConstraints(12, 22, 135, 24));

        jLabel10.setFont(new java.awt.Font("Be Vietnam Pro SemiBold", 0, 12)); // NOI18N
        jLabel10.setText("Mô tả");
        jPanel8.add(jLabel10, new org.netbeans.lib.awtextra.AbsoluteConstraints(12, 156, 135, 24));

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
        jLabel15.setEnabled(false);
        jPanel8.add(jLabel15, new org.netbeans.lib.awtextra.AbsoluteConstraints(12, 223, 135, 24));

        jLabel16.setFont(new java.awt.Font("Be Vietnam Pro SemiBold", 0, 12)); // NOI18N
        jLabel16.setText("HSD");
        jLabel16.setEnabled(false);
        jPanel8.add(jLabel16, new org.netbeans.lib.awtextra.AbsoluteConstraints(224, 223, 135, 24));

        jTextField1.setEditable(false);
        jTextField1.setFont(new java.awt.Font("Be Vietnam Pro SemiBold", 0, 12)); // NOI18N
        jTextField1.setBorder(javax.swing.BorderFactory.createMatteBorder(0, 0, 2, 0, new java.awt.Color(45, 96, 151)));
        jPanel8.add(jTextField1, new org.netbeans.lib.awtextra.AbsoluteConstraints(12, 46, 135, 24));

        jTextField2.setFont(new java.awt.Font("Be Vietnam Pro SemiBold", 0, 12)); // NOI18N
        jTextField2.setText("0");
        jTextField2.setBorder(javax.swing.BorderFactory.createMatteBorder(0, 0, 2, 0, new java.awt.Color(45, 96, 151)));
        jPanel8.add(jTextField2, new org.netbeans.lib.awtextra.AbsoluteConstraints(12, 111, 135, 24));

        jTextField3.setFont(new java.awt.Font("Be Vietnam Pro SemiBold", 0, 12)); // NOI18N
        jTextField3.setBorder(javax.swing.BorderFactory.createMatteBorder(0, 0, 2, 0, new java.awt.Color(45, 96, 151)));
        jPanel8.add(jTextField3, new org.netbeans.lib.awtextra.AbsoluteConstraints(12, 180, 135, 24));

        jTextField4.setFont(new java.awt.Font("Be Vietnam Pro SemiBold", 0, 12)); // NOI18N
        jTextField4.setBorder(javax.swing.BorderFactory.createMatteBorder(0, 0, 2, 0, new java.awt.Color(45, 96, 151)));
        jPanel8.add(jTextField4, new org.netbeans.lib.awtextra.AbsoluteConstraints(224, 46, 135, 24));

        jTextField6.setFont(new java.awt.Font("Be Vietnam Pro SemiBold", 0, 12)); // NOI18N
        jTextField6.setText("0");
        jTextField6.setBorder(javax.swing.BorderFactory.createMatteBorder(0, 0, 2, 0, new java.awt.Color(45, 96, 151)));
        jPanel8.add(jTextField6, new org.netbeans.lib.awtextra.AbsoluteConstraints(224, 180, 135, 24));

        jComboBox1.setFont(new java.awt.Font("Be Vietnam Pro SemiBold", 0, 12)); // NOI18N
        jComboBox1.setBorder(javax.swing.BorderFactory.createMatteBorder(0, 0, 2, 0, new java.awt.Color(45, 96, 151)));
        jComboBox1.setLightWeightPopupEnabled(false);
        jComboBox1.setOpaque(true);
        jPanel8.add(jComboBox1, new org.netbeans.lib.awtextra.AbsoluteConstraints(224, 111, 135, 24));

        jDateChooser1.setBackground(new java.awt.Color(255, 255, 255));
        jDateChooser1.setBorder(javax.swing.BorderFactory.createMatteBorder(0, 0, 2, 0, new java.awt.Color(45, 96, 151)));
        jDateChooser1.setDateFormatString("dd/MM/yyyy");
        jDateChooser1.setEnabled(false);
        jDateChooser1.setFont(new java.awt.Font("Be Vietnam Pro", 0, 10)); // NOI18N
        jPanel8.add(jDateChooser1, new org.netbeans.lib.awtextra.AbsoluteConstraints(224, 247, 135, 24));

        jDateChooser2.setBackground(new java.awt.Color(255, 255, 255));
        jDateChooser2.setBorder(javax.swing.BorderFactory.createMatteBorder(0, 0, 2, 0, new java.awt.Color(45, 96, 151)));
        jDateChooser2.setDateFormatString("dd/MM/yyyy");
        jDateChooser2.setEnabled(false);
        jDateChooser2.setFont(new java.awt.Font("Be Vietnam Pro", 0, 10)); // NOI18N
        jPanel8.add(jDateChooser2, new org.netbeans.lib.awtextra.AbsoluteConstraints(12, 247, 135, 24));

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

        jDialogAddNV.getContentPane().add(jPanel6, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 420, 570));

        jDialogDeleteSP.setFocusCycleRoot(false);
        jDialogDeleteSP.setFocusable(false);
        jDialogDeleteSP.setFocusableWindowState(false);
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
        jPanel11.setFocusable(false);
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
        jLabel22.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        jLabel22.setFocusable(false);
        jLabel22.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jLabel22MouseClicked(evt);
            }
        });
        panelRound1.add(jLabel22, new org.netbeans.lib.awtextra.AbsoluteConstraints(310, 150, 104, 32));

        jDialogDeleteSP.getContentPane().add(panelRound1, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 625, 210));

        setBackground(new java.awt.Color(255, 255, 255));
        setMaximumSize(new java.awt.Dimension(1200, 900));
        addFocusListener(new java.awt.event.FocusAdapter() {
            public void focusGained(java.awt.event.FocusEvent evt) {
                formFocusGained(evt);
            }
            public void focusLost(java.awt.event.FocusEvent evt) {
                formFocusLost(evt);
            }
        });
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

        jLabel1.setFont(new java.awt.Font("Be Vietnam Pro Medium", 0, 28)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(255, 255, 255));
        jLabel1.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel1.setText("Thêm SP");
        jPanelAdd.add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 0, 200, 70));

        jPanel1.add(jPanelAdd, new org.netbeans.lib.awtextra.AbsoluteConstraints(545, 10, 220, 70));

        jPanelDel.setBackground(new java.awt.Color(45, 96, 151));
        jPanelDel.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        jPanelDel.setFocusable(false);
        jPanelDel.setMaximumSize(new java.awt.Dimension(80, 80));
        jPanelDel.setMinimumSize(new java.awt.Dimension(80, 80));
        jPanelDel.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jPanelDelMouseClicked(evt);
            }
        });
        jPanelDel.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel2.setFont(new java.awt.Font("Be Vietnam Pro Medium", 0, 28)); // NOI18N
        jLabel2.setForeground(new java.awt.Color(255, 255, 255));
        jLabel2.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel2.setText("Xóa SP");
        jPanelDel.add(jLabel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 0, 210, 70));

        jPanel1.add(jPanelDel, new org.netbeans.lib.awtextra.AbsoluteConstraints(311, 10, 230, 70));

        add(jPanel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 1200, 90));

        jScrollPane1.setBorder(null);
        jScrollPane1.setHorizontalScrollBarPolicy(javax.swing.ScrollPaneConstants.HORIZONTAL_SCROLLBAR_NEVER);
        jScrollPane1.setMaximumSize(new java.awt.Dimension(1200, 750));
        jScrollPane1.setMinimumSize(new java.awt.Dimension(1200, 750));
        jScrollPane1.setPreferredSize(new java.awt.Dimension(1200, 750));

        jPanelDanhSachSP.setBackground(new java.awt.Color(255, 255, 255));
        jPanelDanhSachSP.setLayout(new javax.swing.BoxLayout(jPanelDanhSachSP, javax.swing.BoxLayout.Y_AXIS));
        jScrollPane1.setViewportView(jPanelDanhSachSP);

        add(jScrollPane1, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 150, 1200, 750));

        jPanel2.setBackground(new java.awt.Color(45, 96, 151));
        jPanel2.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel23.setFont(new java.awt.Font("Be Vietnam Pro SemiBold", 0, 24)); // NOI18N
        jLabel23.setForeground(new java.awt.Color(255, 255, 255));
        jLabel23.setText("Tên sản phẩm");
        jPanel2.add(jLabel23, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 10, 240, 40));

        jLabel24.setFont(new java.awt.Font("Be Vietnam Pro SemiBold", 0, 24)); // NOI18N
        jLabel24.setForeground(new java.awt.Color(255, 255, 255));
        jLabel24.setText("Giá");
        jPanel2.add(jLabel24, new org.netbeans.lib.awtextra.AbsoluteConstraints(550, 10, 60, 40));

        jLabel25.setFont(new java.awt.Font("Be Vietnam Pro SemiBold", 0, 24)); // NOI18N
        jLabel25.setForeground(new java.awt.Color(255, 255, 255));
        jLabel25.setText("Số lượng");
        jPanel2.add(jLabel25, new org.netbeans.lib.awtextra.AbsoluteConstraints(860, 10, 150, 40));

        add(jPanel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 90, 1200, 60));
    }// </editor-fold>//GEN-END:initComponents

    private void jPanelSaveMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jPanelSaveMouseClicked
        // TODO add your handling code here:
        SanPhamDTO sanPhamDTO = new SanPhamDTO();
        sanPhamDTO.setMaSPString(jTextField1.getText());
        sanPhamDTO.setTenSPString(jTextField4.getText());
        sanPhamDTO.setGiaInt(Integer.valueOf(jTextField2.getText()));
        sanPhamDTO.setPhanLoaiString(jComboBox1.getSelectedItem().toString());
        sanPhamDTO.setMoTaString(jTextField3.getText());
        sanPhamDTO.setSoLuongSPInt(Integer.valueOf(jTextField6.getText()));
        sanPhamDTO.setNSXDate(jDateChooser2.getDate());
        sanPhamDTO.setHSDDate(jDateChooser1.getDate());

        try {
            if (sanPhamBUS.them(sanPhamDTO)) {
                Product_icon product_icon = new Product_icon(sanPhamDTO);
                jPanelDanhSachSP.add(product_icon);
                jDialogAddNV.dispose();
                jPanelDanhSachSP.revalidate();
                jPanelDanhSachSP.repaint();
            }
        } catch (Exception ex) {
            Logger.getLogger(QLSanPham.class.getName()).log(Level.SEVERE, null, ex);
        }
    }//GEN-LAST:event_jPanelSaveMouseClicked

    private void formFocusLost(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_formFocusLost
        // TODO add your handling code here:
        jPanelDanhSachSP.removeAll();
        for (int i = 0; i < sanPhamBUS.getList_SanPhamDTOs().size(); i++) {
            Product_icon product_icon = new Product_icon(sanPhamBUS.getList_SanPhamDTOs().get(i));
            jPanelDanhSachSP.add(product_icon);
        }
        jPanelDanhSachSP.revalidate();
        jPanelDanhSachSP.repaint();
    }//GEN-LAST:event_formFocusLost

    private void jTextField5ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jTextField5ActionPerformed
        // TODO add your handling code here:
        String keyword = jTextField5.getText();
        TestProcedure testProcedure = new TestProcedure();
        jPanelDanhSachSP.removeAll();
        if (keyword.length() != 0) {
            List<SanPhamDTO> sanPhamDTOs = testProcedure.SEARCH_SANPHAM(keyword);
            if (!sanPhamDTOs.isEmpty()) {
                for (SanPhamDTO sanPhamDTO : sanPhamDTOs) {
                    Product_icon product_icon = new Product_icon(sanPhamDTO);
                    jPanelDanhSachSP.add(product_icon);
                }
            }
        } else {
            for (int i = 0; i < sanPhamBUS.getList_SanPhamDTOs().size(); i++) {
                Product_icon product_icon1 = new Product_icon(sanPhamBUS.getList_SanPhamDTOs().get(i));
                jPanelDanhSachSP.add(product_icon1);
            }

        }
        jPanelDanhSachSP.revalidate();
        jPanelDanhSachSP.repaint();
    }//GEN-LAST:event_jTextField5ActionPerformed

    private void jPanelAddMouseClicked(java.awt.event.MouseEvent evt) {// GEN-FIRST:event_jPanelAddMouseClicked
        // TODO add your handling code here:
        // JFrame frame = new ThemSP();
        // frame.setVisible(true);
        // System.out.println("GUI.QLSanPham.jPanelAddMouseClicked()");
        SanPhamDAO sanPhamDAO = new SanPhamDAO();
        jTextField1.setText(sanPhamDAO.AutoGenerateMaSP());
        AbstractDocument doc2 = (AbstractDocument) jTextField2.getDocument();
        doc2.setDocumentFilter(new LimitDigitsDocumentFilter(9));
        AbstractDocument doc6 = (AbstractDocument) jTextField6.getDocument();
        doc6.setDocumentFilter(new LimitDigitsDocumentFilter(4));

        List<String> phanLoaiList = new ArrayList<String>();
        phanLoaiList = sanPhamDAO.readPhanLoai();
        List<String> uniquePhanLoaiList = new ArrayList<>();
        for (String element : phanLoaiList) {
            if (!uniquePhanLoaiList.contains(element)) {
                uniquePhanLoaiList.add(element);
            }
        }
        for (String phanLoai : uniquePhanLoaiList) {
            jComboBox1.addItem(phanLoai);
        }
        jComboBox1.setLightWeightPopupEnabled(false);
        jDialogAddNV.setVisible(true);
    }// GEN-LAST:event_jPanelAddMouseClicked

    private void formFocusGained(java.awt.event.FocusEvent evt) {// GEN-FIRST:event_formFocusGained
        // TODO add your handling code here:
        jPanelDanhSachSP.removeAll();
        sanPhamBUS = new SanPhamBUS();

        for (int i = 0; i < sanPhamBUS.getList_SanPhamDTOs().size(); i++) {
            Product_icon product_icon = new Product_icon(sanPhamBUS.getList_SanPhamDTOs().get(i));
            jPanelDanhSachSP.add(product_icon);
        }
        jPanelDanhSachSP.revalidate();
        jPanelDanhSachSP.repaint();
    }// GEN-LAST:event_formFocusGained

    private void jLabel18MouseClicked(java.awt.event.MouseEvent evt) {// GEN-FIRST:event_jLabel18MouseClicked
        // TODO add your handling code here:
        jDialogAddNV.dispose();
    }// GEN-LAST:event_jLabel18MouseClicked

    private void jPanelDelMouseClicked(java.awt.event.MouseEvent evt) {// GEN-FIRST:event_jPanelDelMouseClicked
        // TODO add your handling code here:
        Component[] components = jPanelDanhSachSP.getComponents();

        // Iterate over the components in reverse order
        for (int i = components.length - 1; i >= 0; i--) {
            Component component = components[i];

            // Check if the component is an instance of Product
            if (component instanceof Product_icon) {
                Product_icon product_icon = (Product_icon) component;

                // Check if the product needs to be deleted
                if (product_icon.isSelect()) {
                    jDialogDeleteSP.setVisible(true);
                }
            }
        }
    }// GEN-LAST:event_jPanelDelMouseClicked

    private void jPanel11MouseClicked(java.awt.event.MouseEvent evt) {// GEN-FIRST:event_jPanel11MouseClicked
        // TODO add your handling code here:
        jDialogDeleteSP.dispose();
    }// GEN-LAST:event_jPanel11MouseClicked

    private void jLabel22MouseClicked(java.awt.event.MouseEvent evt) {// GEN-FIRST:event_jLabel22MouseClicked
        // TODO add your handling code here:
        Component[] components = jPanelDanhSachSP.getComponents();

        // Iterate over the components in reverse order
        for (int i = components.length - 1; i >= 0; i--) {
            Component component = components[i];

            // Check if the component is an instance of Product
            if (component instanceof Product_icon) {
                Product_icon product_icon = (Product_icon) component;

                // Check if the product needs to be deleted
                if (product_icon.isSelect()) {
                    // Remove the product from Database
                    try {
                        if (sanPhamBUS.xoa(product_icon.getSanPhamDTO())) {
                            // Remove the product from the panel and update the UI
                            jPanelDanhSachSP.remove(product_icon);
                            System.out.println("Xoa SP thanh cong!");
                            jDialogDeleteSP.dispose();
                        } else {
                            JOptionPane.showMessageDialog(null, "Xóa SP không được!");
                        }
                    } catch (Exception e) {
                        // TODO Auto-generated catch block
                        // e.printStackTrace();
                        JOptionPane.showMessageDialog(null, "Lỗi ràng buộc khóa ngoại");
                        System.out.println("Lỗi ràng buộc khóa ngoại");
                    }
                }
            }
        }

        // Update the UI after all products have been removed
        jPanelDanhSachSP.revalidate();
        jPanelDanhSachSP.repaint();

    }// GEN-LAST:event_jLabel22MouseClicked

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JComboBox<String> jComboBox1;
    private com.toedter.calendar.JDateChooser jDateChooser1;
    private com.toedter.calendar.JDateChooser jDateChooser2;
    private javax.swing.JDialog jDialogAddNV;
    private javax.swing.JDialog jDialogDeleteSP;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel10;
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
    private javax.swing.JLabel jLabel23;
    private javax.swing.JLabel jLabel24;
    private javax.swing.JLabel jLabel25;
    private javax.swing.JLabel jLabel43;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel11;
    private javax.swing.JPanel jPanel16;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JPanel jPanel6;
    private javax.swing.JPanel jPanel7;
    private javax.swing.JPanel jPanel8;
    private javax.swing.JPanel jPanelAdd;
    private javax.swing.JPanel jPanelDanhSachSP;
    private javax.swing.JPanel jPanelDel;
    private javax.swing.JPanel jPanelSave;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTextField jTextField1;
    private javax.swing.JTextField jTextField2;
    private javax.swing.JTextField jTextField3;
    private javax.swing.JTextField jTextField4;
    private javax.swing.JTextField jTextField5;
    private javax.swing.JTextField jTextField6;
    private GUI.PanelRound panelRound1;
    private GUI.PanelRound panelRound2;
    // End of variables declaration//GEN-END:variables
}
