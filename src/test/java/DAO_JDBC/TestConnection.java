package DAO_JDBC;

import java.sql.*;

public class TestConnection {
    // public static void main(String[] args) {
    //     String jdbcUrl = "jdbc:oracle:thin:@localhost:1521:orcl"; // URL kết nối
    //     String user = "ConvinienceStore"; // Tên người dùng
    //     String password = "conviniencestore"; // Mật khẩu
    //     try {
    //         Class.forName("oracle.jdbc.driver.OracleDriver");
    //     } catch (ClassNotFoundException e) {
    //         e.printStackTrace();
    //         // TODO: handle exception
    //     }

    //     try {

    //         Connection connection = DriverManager.getConnection(jdbcUrl, user, password);

    //         Statement statement = connection.createStatement();
    //         ResultSet resultSet = statement.executeQuery("SELECT * FROM NHANVIEN");
    //         // System.out.println("CHuong trinh chay duoc" + resultSet);
    //         while (resultSet.next()) {
    //             System.out.println(resultSet.getString(1) + " " + resultSet.getString(2) + " " 
    //                              + resultSet.getString(3) + " " + resultSet.getString(4));
    //         }

    //         resultSet.close();
    //         statement.close();
    //         connection.close();

    //     } catch (SQLException e) {
    //         // TODO Auto-generated catch block
    //         System.out.println("Loi ket noi!");
    //         e.printStackTrace();
    //     }

    // }

    public static void main(String[] args) throws ClassNotFoundException {
        try {
            //Step1: load the driver class  
            Class.forName("oracle.jdbc.driver.OracleDriver");
            //Step2: create  the connection object
            Connection con = DriverManager.getConnection(
                    "jdbc:oracle:thin:@localhost:1521:orcl", "ConvinienceStore", "conviniencestore");
            //Step3: create the statement object
            Statement stmt = con.createStatement();
            //Step4: execute query
            ResultSet rs = stmt.executeQuery("SELECT * FROM NHANVIEN");
            while (rs.next()) {
                System.out.println(rs.getInt(1) + "  " + rs.getString(2) + "  " + rs.getString(3)
                        + "  " + rs.getString(4));
            }
            //Step5: close the connection object
            con.close();
        } catch (ClassNotFoundException | SQLException e) {
            System.out.println(e);
        }
    }

}
