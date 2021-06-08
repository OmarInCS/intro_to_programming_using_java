package week3.day3;

import java.sql.*;

public class TestDB {
    public static void main(String[] args) throws Exception {
        Class.forName("org.sqlite.JDBC");

        String dbPath = "D:\\Abadnet\\Java\\Group20210523\\Group20210523\\hr.db";
        Connection conn = DriverManager.getConnection("jdbc:sqlite:" + dbPath);

        Statement st = conn.createStatement();

        ResultSet rs = st.executeQuery("SELECT * FROM departments");

        while (rs.next()) {
            System.out.println(rs.getInt(1));
            System.out.println(rs.getString(2));
            System.out.println(rs.getInt(3));
            System.out.println("-----------------");
        }

//        PreparedStatement pst = conn.prepareStatement("INSERT INTO departments VALUES (?, ?, ?)");
//        pst.setInt(1, 12);
//        pst.setString(2, "Training");
//        pst.setInt(3, 1500);
//
//        pst.executeUpdate();

    }
}












