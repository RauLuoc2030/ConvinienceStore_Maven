package DAO_JDBC;

import java.util.ArrayList;

import DTO.HoaDonDTO;
import DTO.NhanVienDTO;
import DTO.SanPhamDTO;

public class test {

    public static void main(String[] args) {
        // -----------------------------------------------------------
        // Test Lấy thông tin từ Database
        // NhanVienDAO nhanVien = new NhanVienDAO();
        // ArrayList<src.DTO.NhanVienDTO> arr = new ArrayList<>();
        // try {
        // arr = nhanVien.ReadDB();
        // for (int i = 0; i < arr.size(); i++){
        // System.out.println(arr.get(i).toString());
        // }

        // } catch (Exception e) {
        // e.printStackTrace();
        // }
        // -----------------------------------------------------------
        // -----------------------------------------------------------
        // Test Thêm thông tin Nhân Viên vào Database và Lấy thông tin mới từ Database
        // NhanVienDTO nhanVienDTO = new NhanVienDTO();
        // nhanVienDTO.setMaNVString("103");
        // nhanVienDTO.setHoTenNVString("Test THEM()");
        // nhanVienDTO.setSDTNVString("0987");
        // nhanVienDTO.setNgaySinhNVDate("15/04/2023");
        // NhanVienDAO nhanVienDAO = new NhanVienDAO();
        // ArrayList<src.DTO.NhanVienDTO> arr = new ArrayList<>();
        // try {
        // nhanVienDAO.them(nhanVienDTO);
        // arr = nhanVienDAO.ReadDB();
        // for (int i = 0 ; i < arr.size(); i++){
        // System.out.println(arr.get(i).toString());
        // }
        // } catch (Exception e) {
        // e.printStackTrace();
        // }
        // -----------------------------------------------------------
        // -----------------------------------------------------------
        // Test Thêm thông tin Sản Phẩm vào Database và Lấy thông tin mới từ Database
        // SanPhamDTO sanPhamDTO = new SanPhamDTO(
        // "SP03",
        // "Test them()",
        // 10000,
        // 3,
        // "Loai 1",
        // "15/04/2023",
        // "15/04/2023",
        // "",
        // "",
        // 0,
        // 0,
        // "");
        // SanPhamDAO sanPhamDAO = new SanPhamDAO();
        // ArrayList<SanPhamDTO> arr = new ArrayList<>();
        // try {
        // sanPhamDAO.them(sanPhamDTO);
        // arr = sanPhamDAO.ReadDB();
        // for (int i = 0; i < arr.size(); i++) {
        // System.out.println(arr.get(i).toString());
        // }
        // } catch (Exception e) {
        // e.printStackTrace();
        // }
        // -----------------------------------------------------------
        // -----------------------------------------------------------
        // Test Thêm thông tin Sản Phẩm vào Database và Lấy thông tin mới từ Database
        // HoaDonDTO hoaDonDTO = new HoaDonDTO(
        // "HD01",
        // "15/04/2023",
        // "Loc",
        // "Test Them Hoa Don",
        // "Tien mat");

        // HoaDonDAO hoaDonDAO = new HoaDonDAO();
        // ArrayList<HoaDonDTO> arr = new ArrayList<>();
        // try {
        // hoaDonDAO.them(hoaDonDTO);
        // arr = hoaDonDAO.ReadDB();

        // for (int i = 0; i < arr.size(); i++) {
        // System.out.println(arr.get(i).toString());
        // }
        // } catch (Exception e) {
        // e.printStackTrace();
        // }
        // -----------------------------------------------------------
        SanPhamDAO sp = new SanPhamDAO();
        try {
            ArrayList<SanPhamDTO> arrSanPham = sp.ReadDB();
            for (SanPhamDTO arr : arrSanPham){
                arr.toString();
            }
        } catch (Exception e) {
            // TODO Auto-generated catch block
            e.printStackTrace();
        }

    }

}
