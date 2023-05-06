package DAO_JDBC;

import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.util.ArrayList;

import DTO.KhachHangDTO;

public class KhachHangDAO {

    public static SQLConnection connection = new SQLConnection();
    public static PreparedStatement pst = null;
    SQLConnectUnit connect;

    /**
     * Lấy thông tin Khách hàng từ Database
     *
     * @param condition
     * @param orderby
     * @return Danh sách Khách hàng
     * @throws Exception
     */
    public ArrayList<KhachHangDTO> ReadDB(String condition, String orderby) throws Exception {
        connect = new SQLConnectUnit();

        ResultSet result = connect.Select("KHACHHANG", condition, orderby);
        ArrayList<KhachHangDTO> khachHangList = new ArrayList<>();
        while (result.next()) {
            KhachHangDTO khachHang = new KhachHangDTO();
            khachHang.setSDTKHString(result.getString("SDTKH"));
            khachHangList.add(khachHang);
        }

        connect.Close();
        return khachHangList;
    }

    /**
     * Override lại phương thức ReadDB() cho TH truyền vào một tham số Condition
     *
     * @param condition
     * @return
     * @throws Exception
     */
    public ArrayList<KhachHangDTO> ReadDB(String condition) throws Exception {
        return ReadDB(condition, null);
    }

    /**
     * Override lại phương thức ReadDB() cho TH không truyền vào tham số
     *
     * @return
     * @throws Exception
     */
    public ArrayList<KhachHangDTO> ReadDB() throws Exception {
        return ReadDB(null, null);
    }

    /**
     * Thêm một Khách hàng mới đã có thông tin vào CSDL
     *
     * @param khachHang Truyền vào khách hàng cần thêm
     * @return true nếu thành công
     * @throws Exception
     */
    public Boolean them(KhachHangDTO khachHang) throws Exception {
        String sql = "INSERT INTO KHACHHANG (SDTKH, TENKH, MAHD)"
                + "VALUES (?, ?, ?)";
        try {
            pst.getConnection().prepareStatement(sql);
            pst.setString(1, khachHang.getSDTKHString());
            return pst.executeUpdate() > 0;
        } catch (Exception e) {
            System.out.println("Loi khong the THEM Khach Hang");
            throw new ArithmeticException(e.getMessage());
        }
    }

    /**
     * Xóa một Khách hàng khỏi CSDL
     *
     * @param khachHang Truyền vào Khách hàng cần xóa
     * @return True nếu thành công
     * @throws Exception
     */
    public Boolean xoa(KhachHangDTO khachHang) throws Exception {
        String sql = "DELETE FROM KHACHHANG WHERE SDTKH = ?";

        try {
            pst = connection.getConnect().prepareStatement(sql);

            pst.setString(1, khachHang.getSDTKHString());

            return pst.executeUpdate() > 0;
        } catch (Exception e) {
            System.out.println("Loi khong the XOA Khach hang");
            throw new ArithmeticException(e.getMessage());
        }
    }

    /**
     * Sửa một Khách hàng có trong CSDL
     *
     * @param khachHang Truyền vào Khách hàng cần sửa thông tin trong CSDL
     * @return True nếu sửa thành công
     * @throws Exception
     */
    public Boolean sua(KhachHangDTO khachHang) throws Exception {
        String sql = "UPDATE KHACHHANG SET SDTKH = ?, TENKH = ?, MAHD = ?";

        try {
            pst.getConnection().prepareStatement(sql);
            pst.setString(1, khachHang.getSDTKHString());
            return pst.executeUpdate() > 0;
        } catch (Exception e) {
            System.out.println("Loi khong the SUA Khach Hang");
            throw new ArithmeticException(e.getMessage());
        }
    }
}
