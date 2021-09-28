package week5;

import java.sql.*;

public class TestDB {
    public static void main(String[] args) throws Exception {
        Class.forName("org.sqlite.JDBC");

        String dbPath = "D:\\Abadnet\\Java\\Group20210822\\code\\hr.db";
        Connection conn = DriverManager.getConnection("jdbc:sqlite:" + dbPath);
        Statement sql = conn.createStatement();
        ResultSet rs = sql.executeQuery("select * from employees");

        while (rs.next()) {
            System.out.print(rs.getString(3));
            System.out.println(", " + rs.getDouble("salary"));
        }

//        PreparedStatement pst = conn.prepareStatement("INSERT INTO departments VALUES (?, ?, ?)");
//        pst.setInt(1, 12);
//        pst.setString(2, "Training");
//        pst.setInt(3, 1700);
//
//        pst.executeUpdate();

    }
}
