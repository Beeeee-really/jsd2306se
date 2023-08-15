package DataBase.NOTE;


import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public class JDBCTest {
    public static void main(String[] args) throws ClassNotFoundException, SQLException {
        //加载驱动程序
        Class.forName("com.mysql.cj.jdbc.Driver");
        System.out.println("加载完成");
        //与数据库建立连接
        String url = "jdbc:mysql://localhost:3306/jsdtn2306";
        String username = "root";
        String password = "123456Bee";
        Connection conn =
                DriverManager.getConnection(url, username, password);
        System.out.println("conn=" + conn);
    }
}
