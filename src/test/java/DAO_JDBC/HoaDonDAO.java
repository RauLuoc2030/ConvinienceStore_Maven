package DAO_JDBC;

import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.util.ArrayList;

import DTO.HoaDonDTO;

public class HoaDonDAO {

    public static SQLConnection connection = new SQLConnection();
    public static PreparedStatement pst = null;
    SQLConnectUnit connect;

    /**
     * Lấy thông tin Hóa đơn từ Database
     *
     * @param condition
     * @param orderby
     * @return Danh sách Hóa đơn
     * @throws Exception
     */
    public ArrayList<HoaDonDTO> ReadDB(String condition, String orderby) throws Exception {
        connect = new SQLConnectUnit();

        ResultSet result = connect.Select("HOADON", condition, orderby);
        ArrayList<HoaDonDTO> hoaDonList = new ArrayList<>();
        while (result.next()) {
            HoaDonDTO hoaDon = new HoaDonDTO();

            hoaDon.setMaHDString(result.getString("MAHD"));
            hoaDon.setNgayMuaHangHDDate(result.getDate("NGAYMUA"));
            hoaDon.setHinhThucThanhToanHDString(result.getString("HINHTHUC"));
            // Còn thiếu
            hoaDonList.add(hoaDon);
        }

        connect.Close();
        return hoaDonList;
    }

    /**
     * Override lại phương thức ReadDB() cho TH truyền vào một tham số Condition
     *
     * @param condition
     * @return
     * @throws Exception
     */
    public ArrayList<HoaDonDTO> ReadDB(String condition) throws Exception {
        return ReadDB(condition, null);
    }

    /**
     * Override lại phương thức ReadDB() cho TH không truyền vào tham số
     *
     * @return
     * @throws Exception
     */
    public ArrayList<HoaDonDTO> ReadDB() throws Exception {
        return ReadDB(null);
    }

    /**
     * Thêm một Hóa Đơn mới đã có thông tin vào CSDL
     *
     * @param hoadon Truyền vào Hóa Đơn cần thêm
     * @return true nếu thành công
     * @throws Exception
     */
    public Boolean them(HoaDonDTO hoadon) throws Exception {
        String sql = "INSERT INTO HOADON (MAHD, NGAYMUA, TENNV, TENKH, HINHTHUC)"
                + "VALUES (?, ?, ?, ?, ?)";

        try {
            pst = connection.getConnect().prepareStatement(sql);

            pst.setString(1, hoadon.getMaHDString());
            pst.setDate(2, new java.sql.Date((hoadon.getNgayMuaHangHDDate()).getTime()));
            pst.setString(5, hoadon.getHinhThucThanhToanHDString());

            return pst.executeUpdate() > 0;
        } catch (Exception e) {
            // TODO: handle exception
            System.out.println("Loi khong the THEM Hoa Don");
            throw new ArithmeticException(e.getMessage());
        }
    }

    /**
     * Xóa một hóa đơn khỏi CSDL
     *
     * @param hoadon Truyền vào hóa đơn cần xóa
     * @return True nếu thành công
     * @throws Exception
     */
    public Boolean xoa(HoaDonDTO hoadon) throws Exception {
        String sql = "DELETE FROM HOADON WHERE MAHD = ?";

        try {
            pst = connection.getConnect().prepareStatement(sql);

            pst.setString(1, hoadon.getMaHDString());

            return pst.executeUpdate() > 0;
        } catch (Exception e) {
            System.out.println("Loi khong the XOA Hoa Don");
            throw new ArithmeticException(e.getMessage());
        }
    }

    /**
     * Sửa một Hóa Đơn có trong CSDL
     *
     * @param hoadon Truyền vào Hóa Đơn cần sửa thông tin trong CSDL
     * @return True nếu sửa thành công
     * @throws Exception
     */
    public Boolean sua(HoaDonDTO hoadon) throws Exception {
        // String sql = "UPDATE HOADON SET MANV = ?, TENNV = ?, SDTNV = ?, NGAYSINHNV =
        // ?";
        String sql = "UPDATE HOADON SET MAHD = ?, NGAYMUA = ?, TENNV = ?, TENKH = ?, HINHTHUC = ?";
        try {
            pst = connection.getConnect().prepareStatement(sql);

            pst.setString(1, hoadon.getMaHDString());
            pst.setDate(2, new java.sql.Date((hoadon.getNgayMuaHangHDDate()).getTime()));
            pst.setString(5, hoadon.getHinhThucThanhToanHDString());

            return pst.executeUpdate() > 0;
        } catch (Exception e) {
            System.out.println("Loi khong the SUA Hoa Don");
            throw new ArithmeticException(e.getMessage());
        }
    }
}
