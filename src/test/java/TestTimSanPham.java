import DAO_Hibernate.SanPhamDAO;

public class TestTimSanPham {
    public static void main(String[] args) {
        SanPhamDAO sanPhamDAO = new SanPhamDAO();
        System.out.println(sanPhamDAO.tim("SP001").toString());
    }
}
    