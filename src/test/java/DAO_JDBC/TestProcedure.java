package DAO_JDBC;

import java.sql.CallableStatement;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.Types;

import oracle.jdbc.OracleConnection;
import oracle.jdbc.OracleTypes;
import oracle.sql.ARRAY;
import oracle.sql.ArrayDescriptor;

public class TestProcedure {
    String url = "jdbc:oracle:thin:@localhost:1521:orcl";
    String username = "ConvinienceStore";
    String password = "conviniencestore";

    public void SEARCH_SANPHAM() {
        try (Connection conn = DriverManager.getConnection(url, username, password)) {
            CallableStatement cstmt = conn.prepareCall("{call SEARCH_SANPHAM(?, ?) }");
            cstmt.setString(1, "SP10");
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

    public void INSERT_HOADON_VA_CHITIETHOADON(){
        try (Connection conn = DriverManager.getConnection(url, username, password)) {
            CallableStatement callableStatement = conn.prepareCall("{call INSERT_HOADON_VA_CHITIETHOADON(?, ?, ?, ?, ?)}");

            // Thiết lập giá trị cho các tham số IN
            callableStatement.setString(1, "HD001"); // MHD
            callableStatement.setString(2, "NV001"); // MNV
            callableStatement.setString(3, "KH001"); // MKH
            callableStatement.setString(4, "Hinh thuc thanh toan"); // H_THUC

             // Tạo mảng hai chiều
             Integer[][] numbers = {{1, 2, 3}, {4, 5, 6}, {7, 8, 9}};

             // Chuyển đổi mảng hai chiều thành mảng một chiều
             Integer[] flattenedNumbers = flattenArray(numbers);
 
             // Tạo đối tượng OracleConnection từ kết nối JDBC
             OracleConnection oracleConnection = conn.unwrap(OracleConnection.class);
 
             // Tạo mô tả mảng số nguyên
            //  ArrayDescriptor arrayDescriptor = ArrayDescriptor.createDescriptor("YOUR_ARRAY_TYPE", oracleConnection);
 
             // Tạo đối tượng ARRAY từ mô tả mảng và mảng số nguyên
             ARRAY array = new ARRAY(arrayDescriptor, oracleConnection, flattenedNumbers);
 
             // Tạo đối tượng OraclePreparedStatement
             OraclePreparedStatement preparedStatement = (OraclePreparedStatement) connection.prepareStatement("CALL YOUR_PROCEDURE(?)");
 
             // Thiết lập giá trị cho tham số con trỏ
             preparedStatement.setArray(1, array);
            // Đăng ký và thiết lập giá trị cho tham số SYS_REFCURSOR
            callableStatement.registerOutParameter(5, OracleTypes.CURSOR);
            callableStatement.execute();

            callableStatement.close();

            conn.close();
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
    private static Integer[] flattenArray(Integer[][] numbers) {
        int rows = numbers.length;
        int cols = numbers[0].length;

        Integer[] flattenedArray = new Integer[rows * cols];
        int index = 0;

        for (int i = 0; i < rows; i++) {
            for (int j = 0; j < cols; j++) {
                flattenedArray[index++] = numbers[i][j];
            }
        }

        return flattenedArray;
    }

    public static void main(String[] args) {
        TestProcedure testProcedure = new TestProcedure();
        testProcedure.PL_SANPHAM();
    }
}