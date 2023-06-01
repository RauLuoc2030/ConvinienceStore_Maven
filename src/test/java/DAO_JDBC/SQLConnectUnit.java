package DAO_JDBC;

import java.sql.ResultSet;

public class SQLConnectUnit {

    private SQLConnection connect;

    // hàm khởi tạo kết nối mặc định
    public SQLConnectUnit() {
        connect = new SQLConnection("ConvinienceStore", "conviniencestore", "orcl");
    }

    // hàm khởi tạo cơ bản
    public SQLConnectUnit(String Username, String Password, String Sid) {
        connect = new SQLConnection(Username, Password, Sid);
    }

    // Hàm hỗ trợ Select CSDL
    /**
     * Select * From Table Where Condition Order by OderBy
     *
     * @throws Exception
     */
    public ResultSet Select(String TableName, String Condition, String OrderBy) throws Exception {
        // khai báo biến StringBuilder để tạo chuỗi Select
        StringBuilder query = new StringBuilder("SELECT * FROM " + TableName);
        // Đưa câu lệnh điều kiện vaò câu query
        this.AddCondition(query, Condition);
        // Đưa câu lệnh Order vào query
        this.AddOrderBy(query, OrderBy);
        // thực thi câu lệnh query và trả kết quả
        return connect.getConnect().prepareStatement(query.toString()).executeQuery();
    }

    // Hàm over load Select giảm OrderBy parameter
    /**
     * Select * From Table Where Condition
     *
     * @throws Exception
     */
    public ResultSet Select(String TableName, String Condition) throws Exception {
        return this.Select(TableName, Condition, null);
    }

    // Hàm over load Select giảm Condition parameter
    /**
     * Select * From Table
     *
     * @throws Exception
     */
    public ResultSet Select(String TableName) throws Exception {
        return this.Select(TableName, null, null);
    }

    // Hàm thêm OrderBy vào query
    private void AddOrderBy(StringBuilder query, String OrderBy) {
        // Kiểm tra OrderBy Khác null
        if (OrderBy != null) {
            query.append(" ORDER BY " + OrderBy);
        }
    }

    // Hàm thêm điều kiện vào query
    private void AddCondition(StringBuilder query, String Condition) {
        // kiểm tra nếu condition khác null
        if (Condition != null) {
            query.append(" WHERE " + Condition);
        }
    }

    // hàm đóng kết nối
    public void Close() throws Exception {
        connect.Close();
    }

}
