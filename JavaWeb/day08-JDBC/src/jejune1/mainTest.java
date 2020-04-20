package jejune1;

import Util.JDBCUtil;

import java.sql.*;

public class mainTest {
    public static void main(String[] args) {
        Connection conn = null;
        Statement st = null;
        ResultSet rs = null;

        try {
            conn = JDBCUtil.getConn();
            /*
            //1.注册驱动
            // 静态代码块--类加载就已经执行 ，导致二次注册
            //DriverManager.registerDriver(new com.mysql.jdbc.Driver());
            Class.forName("com.mysql.jdbc.Driver");

            //DriverManager.getConnection("jdnc:mysql://localhost/test?user=root&password=root");
            //2.建立连接 参数1：协议，参数2：用户名，参数3：密码
            //Connection conn = DriverManager.getConnection("jdbc:mysql://localhost:3306/day06", "root", "root");
            //Connection conn = DriverManager.getConnection("jdbc:mysql://localhost/day06","root","root");
             conn = DriverManager.getConnection("jdbc:mysql://localhost/day06?useUnicode=true&characterEncoding=utf8" ,"root","root");
             */

            //3.创建statement,跟数据库打交道
             st = conn.createStatement();

            //4.执行查询
            String sql = "SELECT * FROM day06.student";
             rs = st.executeQuery(sql);

            //5.查询每一条记录
            while (rs.next()) {
                String name = rs.getString("Name");
                int age = rs.getInt("Age");
                int ID = rs.getInt("ID");
                System.out.println("Name:" + name + " Age:" + age + " ID:" + ID);
            }

        } catch (SQLException e) {
            e.printStackTrace();
        } finally {
            //6.释放资源
            JDBCUtil.release(rs,st,conn);
        }
    }
}
