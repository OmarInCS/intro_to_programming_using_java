package week4.day2;

import java.sql.*;

public class TestDB {
    public static void main(String[] args) throws Exception {

        Class.forName("org.sqlite.JDBC");

        String dbPath = "D:/Abadnet/Java/Group20211003/hr.db";
        Connection conn = DriverManager.getConnection("jdbc:sqlite:" + dbPath);
        Statement st = conn.createStatement();


        PreparedStatement pst = conn.prepareStatement("INSERT INTO departments VALUES (?, ?, ?)");
        pst.setInt(1, 12);
        pst.setString(2, "Training");
        pst.setInt(3, 1700);

        pst.executeUpdate();

        ResultSet rs = st.executeQuery("SELECT * FROM departments");
        while (rs.next()) {
            System.out.printf("%5d,%20s,%7d\n", rs.getInt(1), rs.getString(2), rs.getInt(3));
        }
    }
}
