package day10;

import java.sql.*;
import java.util.Scanner;

public class TestDB {
    public static void main(String[] args) throws Exception {
        Class.forName("org.sqlite.JDBC");
        Connection conn = DriverManager.getConnection("jdbc:sqlite:D:\\hr.db");


        System.out.println("--------------");
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter Dept. Id, Name and Location: ");
        int id = sc.nextInt();
        String name = sc.next();
        int loc = sc.nextInt();

//        sql = "INSERT INTO departments VALUES (" + id + ", '" + name + "', " + loc + ")";
        String sql = "INSERT INTO departments VALUES (?, ?, ?)";
        PreparedStatement pst = conn.prepareStatement(sql);
        pst.setInt(1, id);
        pst.setString(2, name);
        pst.setInt(3, loc);

        pst.executeUpdate();

        System.out.println("-------------------");
        Statement st = conn.createStatement();
        sql = "SELECT * FROM departments";
        ResultSet rs = st.executeQuery(sql);
        System.out.printf("%-5s%-25s%-10s\n", "ID", "Dept. Name", "Location");
        while (rs.next()) {
            System.out.printf("%-5d%-25s%-10d\n", rs.getInt(1)
                    , rs.getString(2)
                    , rs.getInt(3));
        }

        conn.close();
    }
}
