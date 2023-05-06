

import java.util.List;

import DAO_Hibernate.NhanVienDAO;
import DTO.NhanVienDTO;
import DTO.SanPhamDTO;

public class test {
    public static void main(String[] args) {
        // Test đọc DB
        // List<SanPhamDTO> spList = null;
        // SanPhamDAO sp = new SanPhamDAO();
        // spList = sp.readDB(null, null);
        // for (int i = 0; i < spList.size(); i++) {
        // System.out.println(spList.get(i).toString());
        // }
        // -------------------------------------------------

        // Test thêm Nhân viên vào DB
        NhanVienDAO nhanVienDAO = new NhanVienDAO();
        NhanVienDTO nhanVienDTO = new NhanVienDTO();

        nhanVienDTO.setMaNVString("NV01");
        nhanVienDTO.setHoTenNVString("Nhanvien");
        nhanVienDTO.setSDTNVString("0983");

        nhanVienDAO.them(nhanVienDTO);

    }
}
