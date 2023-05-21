package DAO_Hibernate;

import java.sql.CallableStatement;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.Types;

import org.hibernate.Session;

public class CallProcedure {
    Session session;

    public static void main(String[] args) {
        String url = "jdbc:oracle:thin:@localhost:1521:orcl";
        String username = "ConvinienceStore";
        String password = "conviniencestore";

        try (Connection conn = DriverManager.getConnection(url, username, password)) {
            // Tạo đối tượng CallableStatement
            CallableStatement cstmt = conn.prepareCall("{ call TOP10SP_BANCHAY(?, ?, ?) }");

            // Đặt tham số FR_DATE và END_DATE
            cstmt.setDate(1, java.sql.Date.valueOf("2023-01-01"));
            cstmt.setDate(2, java.sql.Date.valueOf("2023-12-31"));

            // Đặt tham số FR_DATE và END_DATE
            cstmt.setString(1, "TO_DATE('" + "01-01-2023" + "','dd-MM-yyyy')");
            cstmt.setString(2, "TO_DATE('" + "31-12-2023" + "','dd-MM-yyyy')");

            // Đăng ký tham số TOP10 với kiểu dữ liệu SYS_REFCURSOR
            cstmt.registerOutParameter(3, Types.REF_CURSOR);

            // Thực thi stored procedure
            cstmt.execute();

            // Lấy kết quả trả về từ tham số TOP10
            ResultSet rs = (ResultSet) cstmt.getObject(3);

            // Xử lý kết quả    
            while (rs.next()) {
                String maSP = rs.getString(1);
                String tenSP = rs.getString(2);
                int soLuong = rs.getInt(3);
                System.out.println("Mã sản phẩm: " + maSP + ", Tên sản phẩm: " + tenSP + ", Số lượng: " + soLuong);
            }

            // Đóng ResultSet và CallableStatement
            rs.close();
            cstmt.close();
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}
