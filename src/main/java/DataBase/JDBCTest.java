package DataBase;


import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.SQLException;

public class JDBCTest {
    public static void main(String[] args) throws ClassNotFoundException, SQLException {
        //加载驱动程序
        Class.forName("com.mysql.cj.jdbc.Driver");
        System.out.println("加载完成");
        //与数据库建立连接
        String url = "jdbc:mysql://localhost:3306/jsdtn2306?serverTimezone=Asia/Shanghai&characterEncoding=utf8";
        String username = "root";
        String password = "123456Bee";
        Connection conn =
                DriverManager.getConnection(url, username, password);
        System.out.println("conn=" + conn);
        //创建Statement对象
        String sql = "insert into tb_class values (?,?)";
        PreparedStatement pstmt =
                conn.prepareStatement(sql);

        //发送SQL
        //对预编译中的SQL中的问号赋值

        pstmt.setString(1, "JSDTN2308");
//        pstmt.setString(2, "JSDTN2308");
        pstmt.setDate(2, new java.sql.Date(System.currentTimeMillis()));

        boolean b = pstmt.execute();

        System.out.println(b);

        pstmt.close();
        conn.close();
    }
}
