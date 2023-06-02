/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JPanel.java to edit this template
 */
package GUI;

import BUS.SanPhamBUS;
import DTO.SanPhamDTO;

import java.awt.Color;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;
import java.awt.event.MouseListener;
import java.text.SimpleDateFormat;

import javax.swing.JOptionPane;
import javax.swing.border.LineBorder;

/**
 *
 * @author Locc
 */
public class Product_icon extends javax.swing.JPanel implements MouseListener {

    private int clickCount;
    private long lastClickTime;
    private boolean isSelect;

    private SanPhamDTO sanPhamDTO;

    private SanPhamBUS sanPhamBUS;

    private String ten;
    private String gia;
    private String sl;

    SimpleDateFormat sdf = new SimpleDateFormat("dd/MM/yyyy");

    /**
     * Creates new form Product
     */
    public Product_icon() {
        initComponents();
        addMouseListener(this);
        jDialogDetailSP1.setLocationRelativeTo(null);

    }

    public Product_icon(SanPhamDTO sanPhamDTO) {
        this.sanPhamDTO = new SanPhamDTO();
        this.sanPhamDTO = sanPhamDTO;
        initComponents();
        jDialogDetailSP1.setLocationRelativeTo(null);

        this.ten = sanPhamDTO.getTenSPString();
        this.gia = sanPhamDTO.getGiaInt().toString();
        this.sl = sanPhamDTO.getSoLuongSPInt().toString();

        jLabelTen.setText(ten);
        jLabelTen.setToolTipText(ten);
        jLabelGia.setText(gia);
        jLabelSL.setText(sl);

    }

    public Product_icon(String ten, String gia, String sl) {
        initComponents();
        jDialogDetailSP1.setLocationRelativeTo(null);

        this.ten = ten;
        this.gia = gia;
        this.sl = sl;

        jLabelTen.setText(ten);
        jLabelGia.setText(gia);
        jLabelSL.setText(sl);

        addMouseListener(this);

        jLabelIcon.addMouseListener(new MouseAdapter() {
            @Override
            public void mouseClicked(MouseEvent e) { // double clicked
                long currentTime = System.currentTimeMillis();

                if (clickCount == 1 && (currentTime - lastClickTime) <= 200) {
                    // Xử lý sự kiện double click
                    System.out.println("Double clicked!");

                    // Reset lại số lần click và thời gian sau khi xử lý xong
                    clickCount = 0;
                    lastClickTime = 0;
                } else {
                    // Lưu số lần click và thời gian hiện tại
                    clickCount = 1;
                    lastClickTime = currentTime;
                }
            }
        });
    }

    @Override
    public void mouseClicked(MouseEvent e) {
        // Xử lý hành động khi panel được click
    }

    @Override
    public void mousePressed(MouseEvent e) {
    }

    @Override
    public void mouseReleased(MouseEvent e) {
    }

    @Override
    public void mouseEntered(MouseEvent e) {
    }

    @Override
    public void mouseExited(MouseEvent e) {
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated
    // <editor-fold defaultstate="collapsed" desc="Generated
    // <editor-fold defaultstate="collapsed" desc="Generated
    // <editor-fold defaultstate="collapsed" desc="Generated
    // <editor-fold defaultstate="collapsed" desc="Generated
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jDialogDetailSP1 = new javax.swing.JDialog();
        jLabel43 = new javax.swing.JLabel();
        jPanel3 = new javax.swing.JPanel();
        jPanel15 = new javax.swing.JPanel();
        jPanel16 = new javax.swing.JPanel();
        jLabel25 = new javax.swing.JLabel();
        jLabel30 = new javax.swing.JLabel();
        jLabel31 = new javax.swing.JLabel();
        jLabel32 = new javax.swing.JLabel();
        jLabel33 = new javax.swing.JLabel();
        jLabel34 = new javax.swing.JLabel();
        jLabel44 = new javax.swing.JLabel();
        jLabel45 = new javax.swing.JLabel();
        jScrollPane6 = new javax.swing.JScrollPane();
        TenSP1 = new javax.swing.JTextArea();
        jPanelSua = new javax.swing.JPanel();
        jLabel47 = new javax.swing.JLabel();
        jLabel48 = new javax.swing.JLabel();
        MoTa1 = new javax.swing.JTextField();
        MaSP1 = new javax.swing.JTextField();
        NSX1 = new javax.swing.JTextField();
        HSD1 = new javax.swing.JTextField();
        SL1 = new javax.swing.JTextField();
        PL1 = new javax.swing.JTextField();
        Gia1 = new javax.swing.JTextField();
        jPanelSave = new javax.swing.JPanel();
        jLabel50 = new javax.swing.JLabel();
        jLabel51 = new javax.swing.JLabel();
        jLabel49 = new javax.swing.JLabel();
        jPanel11 = new javax.swing.JPanel();
        jLabelTen = new javax.swing.JLabel();
        jLabelGia = new javax.swing.JLabel();
        jLabelSL = new javax.swing.JLabel();

        jDialogDetailSP1.setModal(true);
        jDialogDetailSP1.setUndecorated(true);
        jDialogDetailSP1.setResizable(false);
        jDialogDetailSP1.setSize(new java.awt.Dimension(420, 520));
        jDialogDetailSP1.getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel43.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel43.setIcon(new javax.swing.ImageIcon(getClass().getResource("/icon/x.png"))); // NOI18N
        jLabel43.setVerticalAlignment(javax.swing.SwingConstants.TOP);
        jLabel43.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        jLabel43.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jLabel43MouseClicked(evt);
            }
        });
        jDialogDetailSP1.getContentPane().add(jLabel43, new org.netbeans.lib.awtextra.AbsoluteConstraints(386, 13, 24, 24));

        jPanel3.setBackground(new java.awt.Color(45, 96, 151));
        jPanel3.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jPanel15.setBackground(new java.awt.Color(143, 203, 253));
        jPanel15.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jPanel16.setBackground(new java.awt.Color(255, 255, 255));
        jPanel16.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(209, 202, 191)));
        jPanel16.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel25.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel25.setText("icon");
        jLabel25.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));
        jLabel25.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jLabel25MouseClicked(evt);
            }
        });
        jPanel16.add(jLabel25, new org.netbeans.lib.awtextra.AbsoluteConstraints(15, 12, 123, 123));

        jLabel30.setFont(new java.awt.Font("Be Vietnam Pro SemiBold", 0, 12)); // NOI18N
        jLabel30.setText("Mã sản phẩm:");
        jPanel16.add(jLabel30, new org.netbeans.lib.awtextra.AbsoluteConstraints(200, 20, 90, 40));

        jLabel31.setFont(new java.awt.Font("Be Vietnam Pro SemiBold", 0, 12)); // NOI18N
        jLabel31.setText("NSX:");
        jPanel16.add(jLabel31, new org.netbeans.lib.awtextra.AbsoluteConstraints(200, 60, 30, 40));

        jLabel32.setFont(new java.awt.Font("Be Vietnam Pro SemiBold", 0, 12)); // NOI18N
        jLabel32.setText("HSD:");
        jPanel16.add(jLabel32, new org.netbeans.lib.awtextra.AbsoluteConstraints(200, 100, 30, 40));

        jLabel33.setFont(new java.awt.Font("Be Vietnam Pro SemiBold", 0, 12)); // NOI18N
        jLabel33.setText("Số lượng:");
        jPanel16.add(jLabel33, new org.netbeans.lib.awtextra.AbsoluteConstraints(200, 140, 60, 40));

        jLabel34.setFont(new java.awt.Font("Be Vietnam Pro SemiBold", 0, 12)); // NOI18N
        jLabel34.setText("Phân loại:");
        jPanel16.add(jLabel34, new org.netbeans.lib.awtextra.AbsoluteConstraints(200, 180, 60, 40));

        jLabel44.setFont(new java.awt.Font("Be Vietnam Pro SemiBold", 0, 12)); // NOI18N
        jLabel44.setText("Giá:");
        jPanel16.add(jLabel44, new org.netbeans.lib.awtextra.AbsoluteConstraints(200, 220, 30, 40));

        jLabel45.setFont(new java.awt.Font("Be Vietnam Pro SemiBold", 0, 12)); // NOI18N
        jLabel45.setText("Mô tả:");
        jPanel16.add(jLabel45, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 260, 40, 40));

        jScrollPane6.setHorizontalScrollBarPolicy(javax.swing.ScrollPaneConstants.HORIZONTAL_SCROLLBAR_NEVER);
        jScrollPane6.setVerticalScrollBarPolicy(javax.swing.ScrollPaneConstants.VERTICAL_SCROLLBAR_NEVER);

        TenSP1.setEditable(false);
        TenSP1.setBackground(new java.awt.Color(255, 255, 255));
        TenSP1.setColumns(20);
        TenSP1.setFont(new java.awt.Font("Be Vietnam Pro SemiBold", 0, 12)); // NOI18N
        TenSP1.setLineWrap(true);
        TenSP1.setRows(5);
        TenSP1.setText("Tên SP nếu mà cái text này nó quá dài thì nó sẽ xuống dòng");
        TenSP1.setWrapStyleWord(true);
        TenSP1.setBorder(null);
        TenSP1.setDisabledTextColor(new java.awt.Color(255, 255, 255));
        TenSP1.setMaximumSize(new java.awt.Dimension(125, 90));
        TenSP1.setMinimumSize(new java.awt.Dimension(125, 90));
        jScrollPane6.setViewportView(TenSP1);

        jPanel16.add(jScrollPane6, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 140, 140, -1));

        jPanelSua.setBackground(new java.awt.Color(45, 96, 151));
        jPanelSua.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        jPanelSua.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jPanelSuaMouseClicked(evt);
            }
        });
        jPanelSua.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel47.setHorizontalAlignment(javax.swing.SwingConstants.LEFT);
        jLabel47.setIcon(new javax.swing.ImageIcon(getClass().getResource("/icon/icon _edit pencil_.png"))); // NOI18N
        jLabel47.setToolTipText("");
        jPanelSua.add(jLabel47, new org.netbeans.lib.awtextra.AbsoluteConstraints(28, 10, -1, 19));

        jLabel48.setFont(new java.awt.Font("Be Vietnam Pro SemiBold", 0, 20)); // NOI18N
        jLabel48.setForeground(new java.awt.Color(255, 255, 255));
        jLabel48.setText("Sửa");
        jPanelSua.add(jLabel48, new org.netbeans.lib.awtextra.AbsoluteConstraints(54, 0, 41, 41));

        jPanel16.add(jPanelSua, new org.netbeans.lib.awtextra.AbsoluteConstraints(8, 400, 125, 40));

        MoTa1.setEditable(false);
        MoTa1.setBackground(new java.awt.Color(255, 255, 255));
        MoTa1.setFont(new java.awt.Font("Be Vietnam Pro SemiBold", 0, 12)); // NOI18N
        MoTa1.setHorizontalAlignment(javax.swing.JTextField.LEFT);
        MoTa1.setText("jTextField1");
        MoTa1.setBorder(null);
        jPanel16.add(MoTa1, new org.netbeans.lib.awtextra.AbsoluteConstraints(65, 260, 330, 40));

        MaSP1.setEditable(false);
        MaSP1.setBackground(new java.awt.Color(255, 255, 255));
        MaSP1.setFont(new java.awt.Font("Be Vietnam Pro SemiBold", 0, 12)); // NOI18N
        MaSP1.setHorizontalAlignment(javax.swing.JTextField.LEFT);
        MaSP1.setText("jTextField1");
        MaSP1.setBorder(null);
        jPanel16.add(MaSP1, new org.netbeans.lib.awtextra.AbsoluteConstraints(289, 20, 110, 40));

        NSX1.setEditable(false);
        NSX1.setBackground(new java.awt.Color(255, 255, 255));
        NSX1.setFont(new java.awt.Font("Be Vietnam Pro SemiBold", 0, 12)); // NOI18N
        NSX1.setHorizontalAlignment(javax.swing.JTextField.LEFT);
        NSX1.setText("jTextField1");
        NSX1.setBorder(null);
        jPanel16.add(NSX1, new org.netbeans.lib.awtextra.AbsoluteConstraints(234, 60, 165, 40));

        HSD1.setEditable(false);
        HSD1.setBackground(new java.awt.Color(255, 255, 255));
        HSD1.setFont(new java.awt.Font("Be Vietnam Pro SemiBold", 0, 12)); // NOI18N
        HSD1.setHorizontalAlignment(javax.swing.JTextField.LEFT);
        HSD1.setText("jTextField1");
        HSD1.setBorder(null);
        jPanel16.add(HSD1, new org.netbeans.lib.awtextra.AbsoluteConstraints(234, 100, 165, 40));

        SL1.setEditable(false);
        SL1.setBackground(new java.awt.Color(255, 255, 255));
        SL1.setFont(new java.awt.Font("Be Vietnam Pro SemiBold", 0, 12)); // NOI18N
        SL1.setHorizontalAlignment(javax.swing.JTextField.LEFT);
        SL1.setText("jTextField1");
        SL1.setBorder(null);
        jPanel16.add(SL1, new org.netbeans.lib.awtextra.AbsoluteConstraints(260, 140, 139, 40));

        PL1.setEditable(false);
        PL1.setBackground(new java.awt.Color(255, 255, 255));
        PL1.setFont(new java.awt.Font("Be Vietnam Pro SemiBold", 0, 12)); // NOI18N
        PL1.setHorizontalAlignment(javax.swing.JTextField.LEFT);
        PL1.setText("jTextField1");
        PL1.setBorder(null);
        jPanel16.add(PL1, new org.netbeans.lib.awtextra.AbsoluteConstraints(264, 180, 134, 40));

        Gia1.setEditable(false);
        Gia1.setBackground(new java.awt.Color(255, 255, 255));
        Gia1.setFont(new java.awt.Font("Be Vietnam Pro SemiBold", 0, 12)); // NOI18N
        Gia1.setHorizontalAlignment(javax.swing.JTextField.LEFT);
        Gia1.setText("jTextField1");
        Gia1.setBorder(null);
        jPanel16.add(Gia1, new org.netbeans.lib.awtextra.AbsoluteConstraints(230, 220, 169, 40));

        jPanelSave.setBackground(new java.awt.Color(45, 96, 151));
        jPanelSave.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        jPanelSave.setEnabled(false);
        jPanelSave.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jPanelSaveMouseClicked(evt);
            }
        });
        jPanelSave.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel50.setHorizontalAlignment(javax.swing.SwingConstants.LEFT);
        jLabel50.setIcon(new javax.swing.ImageIcon(getClass().getResource("/icon/download.png"))); // NOI18N
        jLabel50.setToolTipText("");
        jPanelSave.add(jLabel50, new org.netbeans.lib.awtextra.AbsoluteConstraints(28, 10, -1, 19));

        jLabel51.setFont(new java.awt.Font("Be Vietnam Pro SemiBold", 0, 20)); // NOI18N
        jLabel51.setForeground(new java.awt.Color(255, 255, 255));
        jLabel51.setText("Lưu");
        jPanelSave.add(jLabel51, new org.netbeans.lib.awtextra.AbsoluteConstraints(54, 0, 41, 41));

        jPanel16.add(jPanelSave, new org.netbeans.lib.awtextra.AbsoluteConstraints(8, 400, 125, 40));

        jPanel15.add(jPanel16, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 8, 400, 462));

        jPanel3.add(jPanel15, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 50, 420, 470));

        jLabel49.setFont(new java.awt.Font("Be Vietnam Pro SemiBold", 0, 20)); // NOI18N
        jLabel49.setForeground(new java.awt.Color(255, 255, 255));
        jLabel49.setText("Chi tiết sản phẩm");
        jPanel3.add(jLabel49, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 0, 190, 50));

        jDialogDetailSP1.getContentPane().add(jPanel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 420, 520));

        setBackground(new java.awt.Color(255, 255, 255));
        setMaximumSize(new java.awt.Dimension(250, 376));
        setMinimumSize(new java.awt.Dimension(250, 376));
        setPreferredSize(new java.awt.Dimension(250, 376));
        setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jPanel11.setBackground(new java.awt.Color(204, 255, 255));
        jPanel11.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        jPanel11.setPreferredSize(new java.awt.Dimension(230, 315));
        jPanel11.addFocusListener(new java.awt.event.FocusAdapter() {
            public void focusGained(java.awt.event.FocusEvent evt) {
                jPanel11FocusGained(evt);
            }
            public void focusLost(java.awt.event.FocusEvent evt) {
                jPanel11FocusLost(evt);
            }
        });
        jPanel11.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jPanel11MouseClicked(evt);
            }
        });
        jPanel11.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabelTen.setFont(new java.awt.Font("Be Vietnam Pro ExtraLight", 0, 20)); // NOI18N
        jLabelTen.setText("Tên ");
        jPanel11.add(jLabelTen, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 5, 590, 60));

        jLabelGia.setFont(new java.awt.Font("Be Vietnam Pro ExtraLight", 0, 20)); // NOI18N
        jLabelGia.setText("Giá");
        jPanel11.add(jLabelGia, new org.netbeans.lib.awtextra.AbsoluteConstraints(650, 10, 200, 60));

        jLabelSL.setBackground(new java.awt.Color(255, 255, 255));
        jLabelSL.setFont(new java.awt.Font("Be Vietnam Pro ExtraLight", 0, 20)); // NOI18N
        jLabelSL.setText("SL");
        jPanel11.add(jLabelSL, new org.netbeans.lib.awtextra.AbsoluteConstraints(900, 5, 200, 60));

        add(jPanel11, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 1118, 70));
    }// </editor-fold>//GEN-END:initComponents

    private void jPanel11FocusGained(java.awt.event.FocusEvent evt) {// GEN-FIRST:event_jPanel11FocusGained
        // TODO add your handling code here:
        isSelect = true;
        jPanel11.setBorder(new LineBorder(Color.BLACK, 2));

        System.out.println("Focus gained");
    }// GEN-LAST:event_jPanel11FocusGained

    private void jPanel11FocusLost(java.awt.event.FocusEvent evt) {// GEN-FIRST:event_jPanel11FocusLost
        // TODO add your handling code here:
        isSelect = false;
        jPanel11.setBorder(new LineBorder(Color.WHITE, 2));

        System.out.println("Focus lost");
    }// GEN-LAST:event_jPanel11FocusLost

    private void jLabel43MouseClicked(java.awt.event.MouseEvent evt) {// GEN-FIRST:event_jLabel43MouseClicked
        // TODO add your handling code here:
        jDialogDetailSP1.dispose();
    }// GEN-LAST:event_jLabel43MouseClicked

    private void jPanelSuaMouseClicked(java.awt.event.MouseEvent evt) {// GEN-FIRST:event_jPanelSuaMouseClicked
        // TODO add your handling code here:
        jPanelSua.setEnabled(false);
        jPanelSua.setVisible(false);
        jPanelSave.setEnabled(true);
        jPanelSave.setVisible(true);

        MaSP1.setEditable(true);
        NSX1.setEditable(true);
        HSD1.setEditable(true);
        SL1.setEditable(true);
        PL1.setEditable(true);
        Gia1.setEditable(true);
        TenSP1.setEditable(true);
        MoTa1.setEditable(true);

    }// GEN-LAST:event_jPanelSuaMouseClicked

    private void jPanelSaveMouseClicked(java.awt.event.MouseEvent evt) {// GEN-FIRST:event_jPanelSaveMouseClicked
        // TODO add your handling code here:
        jPanelSua.setEnabled(true);
        jPanelSua.setVisible(true);
        jPanelSave.setEnabled(false);
        jPanelSave.setVisible(false);

        // Disable edit in every TextField
        MaSP1.setEditable(false);
        NSX1.setEditable(false);
        HSD1.setEditable(false);
        SL1.setEditable(false);
        PL1.setEditable(false);
        Gia1.setEditable(false);
        TenSP1.setEditable(false);
        MoTa1.setEditable(false);

        // Sửa sản phẩm trong CSDL
        sanPhamBUS = new SanPhamBUS();
        sanPhamDTO.setMaSPString(MaSP1.getText());
        sanPhamDTO.setNSXDate(NSX1.getText());
        sanPhamDTO.setHSDDate(HSD1.getText());
        sanPhamDTO.setSoLuongSPInt(Integer.valueOf(SL1.getText()));
        sanPhamDTO.setPhanLoaiString(PL1.getText());
        sanPhamDTO.setGiaInt(Integer.valueOf(Gia1.getText()));
        sanPhamDTO.setTenSPString(TenSP1.getText());
        sanPhamDTO.setMoTaString(MoTa1.getText());

        try {
            sanPhamBUS.sua(sanPhamDTO);
        } catch (Exception e) {
            // TODO Auto-generated catch block
            JOptionPane.showMessageDialog(null, "Sua khong thanh cong");
            e.printStackTrace();
        }

        // Hiển thị lại thông tin sản phẩm sau khi sửa
        MaSP1.setText(sanPhamDTO.getMaSPString());
        if (sanPhamDTO.getNSXDate() == null) {
            NSX1.setText("");
        } else {
            NSX1.setText(sdf.format(sanPhamDTO.getNSXDate()).toString());
        }
        if (sanPhamDTO.getHSDDate() == null) {
            HSD1.setText("");
        } else {
            HSD1.setText(sdf.format(sanPhamDTO.getHSDDate()).toString());
        }
        SL1.setText(sanPhamDTO.getSoLuongSPInt().toString());
        PL1.setText(sanPhamDTO.getPhanLoaiString());
        Gia1.setText(sanPhamDTO.getGiaInt().toString());
        TenSP1.setText(sanPhamDTO.getTenSPString());
        MoTa1.setText(sanPhamDTO.getMoTaString());

    }// GEN-LAST:event_jPanelSaveMouseClicked

    private void jLabel25MouseClicked(java.awt.event.MouseEvent evt) {// GEN-FIRST:event_jLabel25MouseClicked
        // TODO add your handling code here:
    }// GEN-LAST:event_jLabel25MouseClicked

    private void jLabel42MouseClicked(java.awt.event.MouseEvent evt) {// GEN-FIRST:event_jLabel42MouseClicked
        // TODO add your handling code here:
    }// GEN-LAST:event_jLabel42MouseClicked

    private void jPanel11MouseClicked(java.awt.event.MouseEvent evt) {// GEN-FIRST:event_jPanel11MouseClicked
        // TODO add your handling code here:
        // double clicked
        long currentTime = System.currentTimeMillis();

        if (clickCount == 1 && (currentTime - lastClickTime) <= 200) {
            // Xử lý sự kiện double click
            MaSP1.setText(sanPhamDTO.getMaSPString());
            if (sanPhamDTO.getNSXDate() == null) {
                NSX1.setText("");
            } else {
                NSX1.setText(sdf.format(sanPhamDTO.getNSXDate()).toString());
            }
            if (sanPhamDTO.getHSDDate() == null) {
                HSD1.setText("");
            } else {
                HSD1.setText(sdf.format(sanPhamDTO.getHSDDate()).toString());
            }
            SL1.setText(sanPhamDTO.getSoLuongSPInt().toString());
            PL1.setText(sanPhamDTO.getPhanLoaiString());
            Gia1.setText(sanPhamDTO.getGiaInt().toString());
            TenSP1.setText(sanPhamDTO.getTenSPString());
            MoTa1.setText(sanPhamDTO.getMoTaString());
            MoTa1.setToolTipText(sanPhamDTO.getMoTaString());

            jDialogDetailSP1.setVisible(true);
            System.out.println("Double clicked!");

            // Reset lại số lần click và thời gian sau khi xử lý xong
            clickCount = 0;
            lastClickTime = 0;
        } else {
            // Lưu số lần click và thời gian hiện tại
            jPanel11.requestFocus();

            clickCount = 1;
            lastClickTime = currentTime;
        }
    }// GEN-LAST:event_jPanel11MouseClicked

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JTextField Gia1;
    private javax.swing.JTextField HSD1;
    private javax.swing.JTextField MaSP1;
    private javax.swing.JTextField MoTa1;
    private javax.swing.JTextField NSX1;
    private javax.swing.JTextField PL1;
    private javax.swing.JTextField SL1;
    private javax.swing.JTextArea TenSP1;
    private javax.swing.JDialog jDialogDetailSP1;
    private javax.swing.JLabel jLabel25;
    private javax.swing.JLabel jLabel30;
    private javax.swing.JLabel jLabel31;
    private javax.swing.JLabel jLabel32;
    private javax.swing.JLabel jLabel33;
    private javax.swing.JLabel jLabel34;
    private javax.swing.JLabel jLabel43;
    private javax.swing.JLabel jLabel44;
    private javax.swing.JLabel jLabel45;
    private javax.swing.JLabel jLabel47;
    private javax.swing.JLabel jLabel48;
    private javax.swing.JLabel jLabel49;
    private javax.swing.JLabel jLabel50;
    private javax.swing.JLabel jLabel51;
    private javax.swing.JLabel jLabelGia;
    private javax.swing.JLabel jLabelSL;
    private javax.swing.JLabel jLabelTen;
    private javax.swing.JPanel jPanel11;
    private javax.swing.JPanel jPanel15;
    private javax.swing.JPanel jPanel16;
    private javax.swing.JPanel jPanel3;
    private javax.swing.JPanel jPanelSave;
    private javax.swing.JPanel jPanelSua;
    private javax.swing.JScrollPane jScrollPane6;
    // End of variables declaration//GEN-END:variables

    /**
     * @return the ten
     */
    public String getTen() {
        return ten;
    }

    /**
     * @param ten the ten to set
     */
    public void setTen(String ten) {
        this.ten = ten;
    }

    /**
     * @return the gia
     */
    public String getGia() {
        return gia;
    }

    /**
     * @param gia the gia to set
     */
    public void setGia(String gia) {
        this.gia = gia;
    }

    /**
     * @return the sl
     */
    public String getSl() {
        return sl;
    }

    /**
     * @param sl the sl to set
     */
    public void setSl(String sl) {
        this.sl = sl;
    }

    /**
     * @return the jLabel4
     */
    public javax.swing.JLabel getjLabelIcon() {
        return jLabelIcon;
    }

    /**
     * @param jLabel4 the jLabel4 to set
     */
    public void setjLabelIcon(javax.swing.JLabel jLabel4) {
        this.jLabelIcon = jLabel4;
    }

    /**
     * @return the jLabelGia
     */
    public javax.swing.JLabel getjLabelGia() {
        return jLabelGia;
    }

    /**
     * @param jLabelGia the jLabelGia to set
     */
    public void setjLabelGia(javax.swing.JLabel jLabelGia) {
        this.jLabelGia = jLabelGia;
    }

    /**
     * @return the jLabelSL
     */
    public javax.swing.JLabel getjLabelSL() {
        return jLabelSL;
    }

    /**
     * @param jLabelSL the jLabelSL to set
     */
    public void setjLabelSL(javax.swing.JLabel jLabelSL) {
        this.jLabelSL = jLabelSL;
    }

    /**
     * @return the jLabelTen
     */
    public javax.swing.JLabel getjLabelTen() {
        return jLabelTen;
    }

    /**
     * @param jLabelTen the jLabelTen to set
     */
    public void setjLabelTen(javax.swing.JLabel jLabelTen) {
        this.jLabelTen = jLabelTen;
    }

    /**
     * @return the jPanel11
     */
    public javax.swing.JPanel getjPanel11() {
        return jPanel11;
    }

    /**
     * @param jPanel11 the jPanel11 to set
     */
    public void setjPanel11(javax.swing.JPanel jPanel11) {
        this.jPanel11 = jPanel11;
    }

    public boolean isSelect() {
        return isSelect;
    }

    /**
     * @return the sanPhamDTO
     */
    public SanPhamDTO getSanPhamDTO() {
        return sanPhamDTO;
    }

    /**
     * @param sanPhamDTO the sanPhamDTO to set
     */
    public void setSanPhamDTO(SanPhamDTO sanPhamDTO) {
        this.sanPhamDTO = sanPhamDTO;
    }
}
