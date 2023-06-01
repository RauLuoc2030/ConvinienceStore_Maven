package DAO_Hibernate;

import GUI.Test;

public class Test_AddSP_proc {
    public static void main(String[] args) {
        SanPhamDAO sanPhamDAO = new SanPhamDAO();
        // sanPhamDAO.updateSanPham("SP Test", "Test Update", 0, 2, "null", "01/06/2023", "01/07/2023"    , "null");
        // sanPhamDAO.deleteSanPham("SP Test");
        // sanPhamDAO.searchSanPham("SP10");
        System.out.println(sanPhamDAO.DOANHTHU("01/01/2023", "31/12/2023"));
    }
}
