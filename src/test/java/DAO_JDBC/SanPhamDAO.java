package DAO_JDBC;

import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.util.ArrayList;

import DTO.SanPhamDTO;

public class SanPhamDAO {

    public static SQLConnection connection = new SQLConnection();
    public static PreparedStatement pst = null;
    SQLConnectUnit connect;

    /**
     * Lấy thông tin từ Database
     *
     * @param condition
     * @param orderby
     * @return Danh sách Sản phẩm
     * @throws Exception
     */
    public ArrayList<SanPhamDTO> ReadDB(String condition, String orderby) throws Exception {
        connect = new SQLConnectUnit();

        ResultSet result = connect.Select("SANPHAM", condition, orderby);
        ArrayList<SanPhamDTO> sanPhamList = new ArrayList<>();
        while (result.next()) {
            SanPhamDTO sanPham = new SanPhamDTO();
            sanPham.setMaSPString(result.getString("MASP"));
            sanPham.setTenSPString(result.getString("TENSP"));
            sanPham.setGiaInt(result.getInt("GIASP"));
            sanPham.setSoLuongSPInt(result.getInt("SOLUONG"));
            sanPham.setPhanLoaiString(result.getString("PHANLOAI"));
            sanPham.setNSXDate(result.getDate("NSX"));
            sanPham.setHSDDate(result.getDate("HSD"));
            // Còn thiếu
            sanPhamList.add(sanPham);
        }

        connect.Close();
        return sanPhamList;
    }

    /**
     * Override lại phương thức ReadDB() cho TH truyền vào một tham số Condition
     *
     * @param condition
     * @return
     * @throws Exception
     */
    public ArrayList<SanPhamDTO> ReadDB(String condition) throws Exception {
        return ReadDB(condition, null);
    }

    /**
     * Override lại phương thức ReadDB() cho TH không truyền vào tham số
     *
     * @return
     * @throws Exception
     */
    public ArrayList<SanPhamDTO> ReadDB() throws Exception {
        return ReadDB(null);
    }

    /**
     * Thêm một sản phẩm mới đã có thông tin vào CSDL
     *
     * @param sanpham Truyền vào sản phẩm cần thêm
     * @return true nếu thành công
     * @throws Exception
     */
    public Boolean them(SanPhamDTO sanpham) throws Exception {
        String sql = "INSERT INTO SANPHAM (MASP, TENSP, GIASP, SOLUONG, PHANLOAI, NSX, HSD) "
                + "VALUES (?, ?, ?, ?, ?, ?, ?)";

        try {
            pst = connection.getConnect().prepareStatement(sql);

            pst.setString(1, sanpham.getMaSPString());
            pst.setString(2, sanpham.getTenSPString());
            pst.setInt(3, sanpham.getGiaInt());
            pst.setInt(4, sanpham.getSoLuongSPInt());
            pst.setString(5, sanpham.getPhanLoaiString());
            pst.setDate(6, new java.sql.Date(sanpham.getNSXDate().getTime()));
            pst.setDate(7, new java.sql.Date(sanpham.getHSDDate().getTime()));

            return pst.executeUpdate() > 0;
        } catch (Exception e) {
            System.out.println("Loi khong the THEM San Pham");
            throw new ArithmeticException(e.getMessage());
        }
    }

    /**
     * Xóa một sản phẩm khỏi CSDL
     *
     * @param sanpham Truyền vào sản phẩm cần xóa
     * @return True nếu thành công
     * @throws Exception
     */
    public Boolean xoa(SanPhamDTO sanpham) throws Exception {
        String sql = "DELETE FROM SANPHAM WHERE MASP = ?";

        try {
            pst = connection.getConnect().prepareStatement(sql);

            pst.setString(1, sanpham.getMaSPString());

            return pst.executeUpdate() > 0;
        } catch (Exception e) {
            System.out.println("Loi khong the XOA San Pham");
            throw new ArithmeticException(e.getMessage());
        }
    }

    /**
     * Sửa một Sản Phẩm có trong CSDL
     *
     * @param sanpham Truyền vào Sản Phẩm cần sửa thông tin trong CSDL
     * @return True nếu sửa thành công
     * @throws Exception
     */
    public Boolean sua(SanPhamDTO sanpham) throws Exception {
        // String sql = "UPDATE SANPHAM SET MANV = ?, TENNV = ?, SDTNV = ?, NGAYSINHNV = ?";
        String sql = "UPDATE SANPHAM SET MASP = ?, TENSP = ?, GIASP = ?, SOLUONG = ?, PHANLOAI = ?, NSX = ?, HSD = ?";
        try {
            pst = connection.getConnect().prepareStatement(sql);

            pst.setString(1, sanpham.getMaSPString());
            pst.setString(2, sanpham.getTenSPString());
            pst.setInt(3, sanpham.getGiaInt());
            pst.setInt(4, sanpham.getSoLuongSPInt());
            pst.setString(5, sanpham.getPhanLoaiString());
            pst.setDate(6, new java.sql.Date(sanpham.getNSXDate().getTime()));
            pst.setDate(7, new java.sql.Date(sanpham.getHSDDate().getTime()));

            return pst.executeUpdate() > 0;
        } catch (Exception e) {
            System.out.println("Loi khong the SUA San Pham");
            throw new ArithmeticException(e.getMessage());
        }
    }
}
