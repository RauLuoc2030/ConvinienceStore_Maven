/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JPanel.java to edit this template
 */
package GUI;

import DAO_Hibernate.ChiTietKhoDAO;
import DAO_Hibernate.SanPhamDAO;

import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.List;

import DTO.KhoDTO;

/**
 *
 * @author Locc
 */
public class LoHang extends javax.swing.JPanel {

    public static final SimpleDateFormat formatter = new SimpleDateFormat("dd/MM/yyyy");

    private KhoDTO khoDTO;
    private ChiTietKhoDAO chiTietKhoDAO;
    private SanPhamDAO sanPhamDAO;

    private int clickCount;
    private long lastClickTime;

    /**
     * Creates new form LoHang
     */
    public LoHang() {
        initComponents();
    }

    public LoHang(KhoDTO khoDTO) {
        initComponents();
        jDialogDetailLH.setLocationRelativeTo(null);
        this.khoDTO = new KhoDTO();
        this.khoDTO = khoDTO;

        jLabelMaLH.setText(khoDTO.getMaLoHangString());
        jLabelNgayNhap.setText(formatter.format(khoDTO.getNgayNhapDate()));
        jLabelSLSP.setText("1");
        jLabelMaNV.setText(khoDTO.getMaNhanVienString());
        jLabelSuplier.setText(khoDTO.getTenNhaCungCapString());
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated
    // <editor-fold defaultstate="collapsed" desc="Generated
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jDialogDetailLH = new javax.swing.JDialog();
        jPanel5 = new javax.swing.JPanel();
        jPanel13 = new javax.swing.JPanel();
        jPanel14 = new javax.swing.JPanel();
        jPanel15 = new javax.swing.JPanel();
        jLabel28 = new javax.swing.JLabel();
        jLabel29 = new javax.swing.JLabel();
        jLabel30 = new javax.swing.JLabel();
        jLabel31 = new javax.swing.JLabel();
        jLabel32 = new javax.swing.JLabel();
        jLabel34 = new javax.swing.JLabel();
        jScrollPane1 = new javax.swing.JScrollPane();
        jPanel17 = new javax.swing.JPanel();
        jPanel1 = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        jLabel47 = new javax.swing.JLabel();
        jLabel26 = new javax.swing.JLabel();
        jLabel27 = new javax.swing.JLabel();
        jLabelMaLH = new javax.swing.JLabel();
        jLabelMaNV = new javax.swing.JLabel();
        jLabelNgayNhap = new javax.swing.JLabel();
        jLabelSuplier = new javax.swing.JLabel();
        jLabelSLSP = new javax.swing.JLabel();

        jDialogDetailLH.setFocusCycleRoot(false);
        jDialogDetailLH.setFocusable(false);
        jDialogDetailLH.setFocusableWindowState(false);
        jDialogDetailLH.setMaximumSize(new java.awt.Dimension(1200, 842));
        jDialogDetailLH.setModal(true);
        jDialogDetailLH.setUndecorated(true);
        jDialogDetailLH.setResizable(false);
        jDialogDetailLH.setSize(new java.awt.Dimension(1200, 842));
        jDialogDetailLH.getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jPanel5.setBackground(new java.awt.Color(45, 96, 151));
        jPanel5.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jPanel13.setBackground(new java.awt.Color(143, 203, 253));
        jPanel13.setMaximumSize(new java.awt.Dimension(1200, 791));
        jPanel13.setMinimumSize(new java.awt.Dimension(1200, 791));
        jPanel13.setPreferredSize(new java.awt.Dimension(1200, 791));
        jPanel13.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jPanel14.setBackground(new java.awt.Color(255, 255, 255));
        jPanel14.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(209, 202, 191)));
        jPanel14.setMaximumSize(new java.awt.Dimension(1168, 780));
        jPanel14.setMinimumSize(new java.awt.Dimension(1168, 780));
        jPanel14.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jPanel15.setBackground(new java.awt.Color(255, 255, 255));
        jPanel15.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));
        jPanel15.setMaximumSize(new java.awt.Dimension(1168, 66));
        jPanel15.setMinimumSize(new java.awt.Dimension(1168, 66));
        jPanel15.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel28.setFont(new java.awt.Font("Be Vietnam Pro SemiBold", 0, 24)); // NOI18N
        jLabel28.setText("Số lượng");
        jPanel15.add(jLabel28, new org.netbeans.lib.awtextra.AbsoluteConstraints(1016, 13, 132, 60));

        jLabel29.setFont(new java.awt.Font("Be Vietnam Pro SemiBold", 0, 24)); // NOI18N
        jLabel29.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel29.setText("Phân loại");
        jPanel15.add(jLabel29, new org.netbeans.lib.awtextra.AbsoluteConstraints(476, 13, 180, 60));

        jLabel30.setFont(new java.awt.Font("Be Vietnam Pro SemiBold", 0, 24)); // NOI18N
        jLabel30.setText("Mã sản phẩm");
        jPanel15.add(jLabel30, new org.netbeans.lib.awtextra.AbsoluteConstraints(9, 13, 170, 60));

        jLabel31.setFont(new java.awt.Font("Be Vietnam Pro SemiBold", 0, 24)); // NOI18N
        jLabel31.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel31.setText("Tên sản phẩm");
        jPanel15.add(jLabel31, new org.netbeans.lib.awtextra.AbsoluteConstraints(179, 13, 297, 60));

        jLabel32.setFont(new java.awt.Font("Be Vietnam Pro SemiBold", 0, 24)); // NOI18N
        jLabel32.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel32.setText("NSX");
        jPanel15.add(jLabel32, new org.netbeans.lib.awtextra.AbsoluteConstraints(656, 13, 180, 60));

        jLabel34.setFont(new java.awt.Font("Be Vietnam Pro SemiBold", 0, 24)); // NOI18N
        jLabel34.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel34.setText("HSD");
        jPanel15.add(jLabel34, new org.netbeans.lib.awtextra.AbsoluteConstraints(836, 13, 180, 60));

        jPanel14.add(jPanel15, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 1168, 86));

        jScrollPane1.setBorder(null);
        jScrollPane1.setHorizontalScrollBarPolicy(javax.swing.ScrollPaneConstants.HORIZONTAL_SCROLLBAR_NEVER);

        jPanel17.setBackground(new java.awt.Color(255, 255, 255));
        jPanel17.setLayout(new javax.swing.BoxLayout(jPanel17, javax.swing.BoxLayout.Y_AXIS));
        jScrollPane1.setViewportView(jPanel17);

        jPanel14.add(jScrollPane1, new org.netbeans.lib.awtextra.AbsoluteConstraints(1, 90, 1166, 650));

        jPanel13.add(jPanel14, new org.netbeans.lib.awtextra.AbsoluteConstraints(15, 50, 1168, 741));

        jPanel1.setBackground(new java.awt.Color(45, 96, 151));
        jPanel1.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel1.setFont(new java.awt.Font("Be Vietnam Pro SemiBold", 0, 20)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(255, 255, 255));
        jLabel1.setText("Sửa");
        jPanel1.add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(75, 0, -1, 50));

        jLabel47.setHorizontalAlignment(javax.swing.SwingConstants.LEFT);
        jLabel47.setIcon(new javax.swing.ImageIcon(getClass().getResource("/icon/icon _edit pencil_.png"))); // NOI18N
        jLabel47.setToolTipText("");
        jPanel1.add(jLabel47, new org.netbeans.lib.awtextra.AbsoluteConstraints(35, 15, -1, 19));

        jPanel13.add(jPanel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(1018, 0, 180, 50));

        jPanel5.add(jPanel13, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 51, 1200, 791));

        jLabel26.setFont(new java.awt.Font("Be Vietnam Pro SemiBold", 0, 20)); // NOI18N
        jLabel26.setForeground(new java.awt.Color(255, 255, 255));
        jLabel26.setText("Chi tiết lô hàng");
        jPanel5.add(jLabel26, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 0, 260, 60));

        jLabel27.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel27.setIcon(new javax.swing.ImageIcon(getClass().getResource("/icon/x.png"))); // NOI18N
        jLabel27.setVerticalAlignment(javax.swing.SwingConstants.TOP);
        jLabel27.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        jLabel27.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jLabel27MouseClicked(evt);
            }
        });
        jPanel5.add(jLabel27, new org.netbeans.lib.awtextra.AbsoluteConstraints(1160, 13, -1, -1));

        jDialogDetailLH.getContentPane().add(jPanel5, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 1200, 842));

        setBackground(new java.awt.Color(255, 255, 255));
        setBorder(javax.swing.BorderFactory.createMatteBorder(0, 0, 1, 0, new java.awt.Color(0, 0, 0)));
        setMaximumSize(new java.awt.Dimension(1200, 60));
        setMinimumSize(new java.awt.Dimension(1200, 60));
        setPreferredSize(new java.awt.Dimension(1200, 60));
        addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                formMouseClicked(evt);
            }
        });
        setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabelMaLH.setFont(new java.awt.Font("Be Vietnam Pro Light", 0, 24)); // NOI18N
        jLabelMaLH.setText("Mã LH");
        add(jLabelMaLH, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 0, 170, 60));

        jLabelMaNV.setFont(new java.awt.Font("Be Vietnam Pro Light", 0, 24)); // NOI18N
        jLabelMaNV.setHorizontalAlignment(javax.swing.SwingConstants.LEFT);
        jLabelMaNV.setText("Mã NV");
        add(jLabelMaNV, new org.netbeans.lib.awtextra.AbsoluteConstraints(200, 0, 170, 60));

        jLabelNgayNhap.setFont(new java.awt.Font("Be Vietnam Pro Light", 0, 24)); // NOI18N
        jLabelNgayNhap.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabelNgayNhap.setText("Ngày nhập");
        add(jLabelNgayNhap, new org.netbeans.lib.awtextra.AbsoluteConstraints(420, 0, 150, 60));

        jLabelSuplier.setFont(new java.awt.Font("Be Vietnam Pro Light", 0, 24)); // NOI18N
        jLabelSuplier.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabelSuplier.setText("Suplier");
        add(jLabelSuplier, new org.netbeans.lib.awtextra.AbsoluteConstraints(650, 0, 180, 60));

        jLabelSLSP.setFont(new java.awt.Font("Be Vietnam Pro Light", 0, 24)); // NOI18N
        jLabelSLSP.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabelSLSP.setText("SL SP trong LH");
        add(jLabelSLSP, new org.netbeans.lib.awtextra.AbsoluteConstraints(900, 0, 180, 60));
    }// </editor-fold>//GEN-END:initComponents

    private void jLabel27MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabel27MouseClicked
        // TODO add your handling code here:
        jDialogDetailLH.dispose();
    }//GEN-LAST:event_jLabel27MouseClicked

    private void formMouseClicked(java.awt.event.MouseEvent evt) {// GEN-FIRST:event_formMouseClicked
        // Double clicked
        long currentTime = System.currentTimeMillis();

        if (clickCount == 1 && (currentTime - lastClickTime) <= 200) {
            // Xử lý sự kiện double click
            System.out.println("Double clicked!");
            chiTietKhoDAO = new ChiTietKhoDAO();
            // Lấy danh sách mã sản phẩm trong lô hàng
            List<String> sanPhamList = new ArrayList<>();
            sanPhamList = chiTietKhoDAO.getSanPhamListByMaLoHang(khoDTO.getMaLoHangString());
            // Tìm thông tin chi tiết của sản phẩm đó trong lô hàng

            // for (int i = 0; i < sanPhamList.size(); i++) {
            //     sanPhamDAO = new SanPhamDAO();
            //     CTKho ctKho = new CTKho(sanPhamDAO.tim(sanPhamList.get(i)));
            //     jPanel17.add(ctKho);
            // }
            jPanel17.removeAll();
            for (int i = sanPhamList.size() - 1; i >= 0; i--) {
                sanPhamDAO = new SanPhamDAO();
                CTKho ctKho = new CTKho(sanPhamDAO.tim(sanPhamList.get(i)));
                jPanel17.add(ctKho);
            }
            jPanel17.validate();
            jPanel17.repaint();
            jDialogDetailLH.setVisible(true);

            // Reset lại số lần click và thời gian sau khi xử lý xong
            clickCount = 0;
            lastClickTime = 0;
        } else {
            // Lưu số lần click và thời gian hiện tại
            clickCount = 1;
            lastClickTime = currentTime;
        }
    }// GEN-LAST:event_formMouseClicked

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JDialog jDialogDetailLH;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel26;
    private javax.swing.JLabel jLabel27;
    private javax.swing.JLabel jLabel28;
    private javax.swing.JLabel jLabel29;
    private javax.swing.JLabel jLabel30;
    private javax.swing.JLabel jLabel31;
    private javax.swing.JLabel jLabel32;
    private javax.swing.JLabel jLabel34;
    private javax.swing.JLabel jLabel47;
    private javax.swing.JLabel jLabelMaLH;
    private javax.swing.JLabel jLabelMaNV;
    private javax.swing.JLabel jLabelNgayNhap;
    private javax.swing.JLabel jLabelSLSP;
    private javax.swing.JLabel jLabelSuplier;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel13;
    private javax.swing.JPanel jPanel14;
    private javax.swing.JPanel jPanel15;
    private javax.swing.JPanel jPanel17;
    private javax.swing.JPanel jPanel5;
    private javax.swing.JScrollPane jScrollPane1;
    // End of variables declaration//GEN-END:variables
}
