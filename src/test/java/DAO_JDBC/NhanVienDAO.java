package DAO_JDBC;

import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.util.ArrayList;

import DTO.NhanVienDTO;

public class NhanVienDAO {

    public static SQLConnection connection = new SQLConnection();
    public static PreparedStatement pst = null;
    SQLConnectUnit connect;

    /**
     * Lấy thông tin Nhân viên từ Database
     *
     * @param condition
     * @param orderby
     * @return Danh sách nhân viên
     * @throws Exception
     */
    public ArrayList<NhanVienDTO> ReadDB(String condition, String orderby) throws Exception {
        connect = new SQLConnectUnit();

        ResultSet result = connect.Select("NHANVIEN", condition, orderby);
        ArrayList<NhanVienDTO> nhanVienList = new ArrayList<>();
        while (result.next()) {
            NhanVienDTO nhanVien = new NhanVienDTO();
            nhanVien.setMaNVString(result.getString("MANV"));
            nhanVien.setHoTenNVString(result.getString("TENNV"));
            nhanVien.setSDTNVString(result.getString("SDTNV"));
            nhanVien.setNgaySinhNVDate(result.getDate("NGAYSINHNV"));
            // Còn thiếu
            nhanVienList.add(nhanVien);
        }

        connect.Close();
        return nhanVienList;
    }

    /**
     * Override lại phương thức ReadDB() cho TH truyền vào một tham số Condition
     *
     * @param condition
     * @return
     * @throws Exception
     */
    public ArrayList<NhanVienDTO> ReadDB(String condition) throws Exception {
        return ReadDB(condition, null);
    }

    /**
     * Override lại phương thức ReadDB() cho TH không truyền vào tham số
     *
     * @return
     * @throws Exception
     */
    public ArrayList<NhanVienDTO> ReadDB() throws Exception {
        return ReadDB(null);
    }

    /**
     * Thêm một nhân viên mới đã có thông tin vào CSDL
     *
     * @param nhanvien Truyền vào nhân viên cần thêm
     * @return true nếu thành công
     * @throws Exception
     */
    public Boolean them(NhanVienDTO nhanvien) throws Exception {
        String sql = "INSERT INTO NHANVIEN (MANV, TENNV, SDTNV, NGAYSINHNV) "
                + "VALUES (?, ?, ?, ?)";

        try {
            pst = connection.getConnect().prepareStatement(sql);

            pst.setString(1, nhanvien.getMaNVString());
            pst.setString(2, nhanvien.getHoTenNVString());
            pst.setString(3, nhanvien.getSDTNVString());
            pst.setDate(4, new java.sql.Date((nhanvien.getNgaySinhNVDate()).getTime()));

            return pst.executeUpdate() > 0;
        } catch (Exception e) {
            System.out.println("Loi khong the THEM Nhan Vien");
            throw new ArithmeticException(e.getMessage());
        }
    }

    /**
     * Xóa một nhân viên khỏi CSDL
     *
     * @param nhanvien Truyền vào nhân viên cần xóa
     * @return True nếu thành công
     * @throws Exception
     */
    public Boolean xoa(NhanVienDTO nhanvien) throws Exception {
        String sql = "DELETE FROM NHANVIEN WHERE MANV = ?";

        try {
            pst = connection.getConnect().prepareStatement(sql);

            pst.setString(1, nhanvien.getMaNVString());

            return pst.executeUpdate() > 0;
        } catch (Exception e) {
            System.out.println("Loi khong the XOA Nhan Vien");
            throw new ArithmeticException(e.getMessage());
        }
    }

    /**
     * Sửa một nhân viên có trong CSDL
     *
     * @param nhanvien Truyền vào Nhân Viên cần sửa thông tin trong CSDL
     * @return True nếu sửa thành công
     * @throws Exception
     */
    public Boolean sua(NhanVienDTO nhanvien) throws Exception {
        String sql = "UPDATE NHANVIEN SET MANV = ?, TENNV = ?, SDTNV = ?, NGAYSINHNV = ?";

        try {
            pst = connection.getConnect().prepareStatement(sql);

            pst.setString(1, nhanvien.getMaNVString());
            pst.setString(2, nhanvien.getHoTenNVString());
            pst.setString(3, nhanvien.getSDTNVString());
            pst.setDate(4, new java.sql.Date((nhanvien.getNgaySinhNVDate()).getTime()));

            return pst.executeUpdate() > 0;
        } catch (Exception e) {
            System.out.println("Loi khong the SUA Nhan Vien");
            throw new ArithmeticException(e.getMessage());
        }
    }
}
