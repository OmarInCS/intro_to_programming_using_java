package week4.day3;

import java.sql.*;

public class TestDB {

    static Connection conn;
    static Statement stat;
    static ResultSet rs;
    static PreparedStatement pstat;

    public static void main(String[] args) {
        try {

            conn = DriverManager.getConnection("jdbc:sqlite:C:/sqlite/hr.db");
//
            stat = conn.createStatement();
            rs = stat.executeQuery("select * from departments");

            while (rs.next()) {
                System.out.println(rs.getString(2));
//                System.out.println(rs.getDouble(8));
                System.out.println("-".repeat(20));
            }

//            pstat = conn.prepareStatement("insert into departments values (?, ?, ?)");
//            pstat.setInt(1, 15);
//            pstat.setString(2, "Training");
//            pstat.setInt(3, 103);
//
//            pstat.execute();

//            pstat = conn.prepareStatement("delete from departments where department_id = 15");
//            pstat.execute();

        } catch (SQLException throwables) {
            throwables.printStackTrace();
        }
    }
}
