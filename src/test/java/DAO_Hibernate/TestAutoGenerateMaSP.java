package DAO_Hibernate;

public class TestAutoGenerateMaSP {
    public static void main(String[] args) {
        SanPhamDAO sanPhamDAO = new SanPhamDAO();
        System.out.println(sanPhamDAO.AutoGenerateMaSP());
    }
}
