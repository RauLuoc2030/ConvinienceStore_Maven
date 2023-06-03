package DAO_JDBC;

import java.sql.CallableStatement;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.Types;

public class TestProcedure {
    String url = "jdbc:oracle:thin:@localhost:1521:orcl";
    String username = "ConvinienceStore";
    String password = "conviniencestore";

    public void SEARCH_SANPHAM() {
        try (Connection conn = DriverManager.getConnection(url, username, password)) {
            CallableStatement cstmt = conn.prepareCall("{call SEARCH_SANPHAM(?, ?) }");
            cstmt.setString(1, "Kem");
            cstmt.registerOutParameter(2, Types.REF_CURSOR);
            cstmt.execute();
            ResultSet rs = (ResultSet) cstmt.getObject(2);
            while (rs.next()) { 
                String maSP = rs.getString(1);
                String tenSP = rs.getString(2);
                System.out.println("Ma san pham: " + maSP + ", Ten san pham: " + tenSP);
            } 
            rs.close();
            cstmt.close();
        } catch (Exception e) {
            e.printStackTrace();
        }
    }

    public void PL_SANPHAM(){
        try (Connection conn = DriverManager.getConnection(url, username, password)) {
            CallableStatement cstmt = conn.prepareCall("{call PL_SANPHAM(?, ?) }");
            cstmt.setString(1, "Do an vat");
            cstmt.registerOutParameter(2, Types.REF_CURSOR);
            cstmt.execute();
            ResultSet rs = (ResultSet) cstmt.getObject(2);
            while (rs.next()) { 
                String maSP = rs.getString(1);
                String tenSP = rs.getString(2);
                System.out.println("Ma san pham: " + maSP + ", Ten SP: " + tenSP);
            } 
            rs.close();
            cstmt.close();
        } catch (Exception e) {
            e.printStackTrace();
        }
    }


    public static void main(String[] args) {
        TestProcedure testProcedure = new TestProcedure();
        testProcedure.SEARCH_SANPHAM();
    }
}