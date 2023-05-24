import DAO_Hibernate.NguoiDungDAO;
import DAO_Hibernate.NhanVienDAO;
import DAO_Hibernate.SanPhamDAO;
import DTO.NguoiDungDTO;
import DTO.NhanVienDTO;
import DTO.SanPhamDTO;

public class TestTimUsername {
    public static void main(String[] args) {
        NguoiDungDAO nguoiDungDAO = new NguoiDungDAO();
        NguoiDungDTO nv = nguoiDungDAO.tim("admin");
        if (nv == null) {
        System.out.println("Không tìm thấy");
        } else {
        System.out.println(nv.toString());
        }

        // NhanVienDAO nhanVienDAO = new NhanVienDAO();
        // NhanVienDTO nv = nhanVienDAO.tim("NV001");
        // if (nv == null) {
        // System.out.println("Không tìm thấy");
        // } else {
        // System.out.println(nv.toString());
        // }


        // SanPhamDAO sanPhamDAO = new SanPhamDAO();
        // SanPhamDTO sp = sanPhamDAO.tim("SP001");
        // if (sp == null) {
        //     System.out.println("Không tìm thấy");
        // } else {
        //     System.out.println(sp.toString());
        // }
    }
}
