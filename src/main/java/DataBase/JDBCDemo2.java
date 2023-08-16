package DataBase;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.SQLException;

public class JDBCDemo2 {
    static final String URL = "jdbc:mysql://localhost:3306/jsdtn2306?serverTimezone=Asia/Shanghai&characterEncoding=utf8";
    static final String username = "root";
    static final String password = "root";

    static void deleteById(int id) {
        Connection conn = null;
        PreparedStatement pstmt = null;
        try {
            //1.加载驱动程序
            Class.forName("com.mysql.cj.jdbc.Driver");
            //2.建立连接(3次握手)；
            conn = DriverManager.getConnection(URL, username, password);
            //3.创建Statement对象
            String sql = "delete from tb_class where id=?";
            pstmt = conn.prepareStatement(sql);
            //4.发送SQL
            pstmt.setInt(1, id);
            boolean flag = pstmt.execute();
            //5.处理结果
            if (!flag) System.out.println("Delete OK,没有结果集返回");
        } catch (Exception e) {
            e.printStackTrace();
            throw new RuntimeException(e);
        } finally {
            try {
                if (pstmt != null) {
                    pstmt.close();
                    pstmt = null;
                }
            } catch (SQLException e) {
            }
            try {
                if (conn != null) {
                    conn.close();
                    conn = null;
                }
            } catch (SQLException e) {
            }
        }
    }

    public static void main(String[] args) {
        deleteById(12);

    }
}

