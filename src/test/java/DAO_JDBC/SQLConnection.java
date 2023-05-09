package DAO_JDBC;

import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.sql.Connection;

public class SQLConnection {

    String Username = "";
    String Password = "";
    String Sid = "";

    Connection connect = null;
    Statement statement = null;
    ResultSet resultSet = null;

    /**
     *
     */
    public SQLConnection() {
        Username = "ConvinienceStore";
        Password = "conviniencestore";
        Sid = "orcl";
    }

    /**
     * Constructor
     *
     * @param Username
     * @param Password
     * @param Sid
     */
    public SQLConnection(String Username, String Password, String Sid) {
        this.Username = Username;
        this.Password = Password;
        this.Sid = Sid;
    }

    protected void driveTest() throws Exception {
        try {
            Class.forName("oracle.jdbc.driver.OracleDriver");
        } catch (ClassNotFoundException e) {
            throw new Exception("SQl Developer not found driveTest");
        }
    }

    public Connection getConnect() throws Exception {
        // nếu connection null thì khởi tạo mới
        if (connect == null) {
            driveTest();

            // Tạo url để kết nối tới Database
            String url = "jdbc:oracle:thin:@localhost:1521:" + Sid;
            try {
                // tạo connet thông qua url
                connect = DriverManager.getConnection(url, Username, Password);
            } catch (SQLException e) {
                throw new Exception("không thể kết nối tới Database" + url + e.getMessage());
            }
        }

        return connect;
    }

    // hàm đóng kết nối
    public void Close() throws Exception {
        if (resultSet != null && !resultSet.isClosed()) {
            resultSet.close();
            resultSet = null;
        }
        if (statement != null && !statement.isClosed()) {
            statement.close();
            statement = null;
        }
        if (connect != null && !connect.isClosed()) {
            connect.close();
            connect = null;
        }
    }
}
