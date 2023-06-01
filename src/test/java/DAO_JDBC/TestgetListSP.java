package DAO_JDBC;

import java.util.ArrayList;
import java.util.List;

import DAO_Hibernate.ChiTietHoaDonDAO;

public class TestgetListSP {
    public static void main(String[] args) {
        ChiTietHoaDonDAO chiTietHoaDonDAO = new ChiTietHoaDonDAO();
        List<String> listSP = new ArrayList<>();
        listSP = chiTietHoaDonDAO.getSanPhamListByMaHoaDon("HD8");
        if (listSP.size()==0){
            System.out.println("nullllllll");
        }
        for (String sp : listSP){
            System.out.println(sp);
        }
    }
}
