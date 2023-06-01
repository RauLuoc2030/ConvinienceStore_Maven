package DAO_JDBC;

import java.util.ArrayList;
import java.util.List;

import DAO_Hibernate.ChiTietKhoDAO;

public class TestgetListSP {
    public static void main(String[] args) {
        ChiTietKhoDAO chiTietKhoDAO = new ChiTietKhoDAO();
        List<String> listSP = new ArrayList<>();
        listSP = chiTietKhoDAO.getSanPhamListByMaLoHang("LH9");
        if (listSP.size()==0){
            System.out.println("nullllllll");
        }
        for (String sp : listSP){
            System.out.println(sp);
        }
    }
}
