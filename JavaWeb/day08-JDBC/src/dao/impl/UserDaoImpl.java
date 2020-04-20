package dao.impl;

import Util.JDBCUtil;
import dao.UserDao;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.Statement;

public class UserDaoImpl implements UserDao {
    @Override
    public void findAll() {
        Connection conn = null;
        Statement st = null;
        ResultSet rs = null;
        try {
            //1.获取连接对象
            conn = JDBCUtil.getConn();

            //创建Statement对象
            st = conn.createStatement();

            //获取数据库执行语句
            String sql = "select * FROM t_user ";
            rs = st.executeQuery(sql);

            //遍历输出
            while (rs.next()) {
                String usreNamse = rs.getString("username");
                int ID = rs.getInt("id");
                int passwd = rs.getInt("password");
                System.out.println("ID:" + ID + "  Username:" + usreNamse + "  Password:" + passwd);
            }

        } catch (Exception e) {
            e.printStackTrace();
        } finally {
            JDBCUtil.release(rs, st, conn);
        }
    }


    @Override
    public void login(String username, String password) {
        //一定去查数据库，然后匹配给定用户名和密码

        Connection conn = null;
        Statement st = null;
        ResultSet rs = null;
        try {
            //1.建立对象连接
            conn = JDBCUtil.getConn();

            //2.创建Statement对象
            st = conn.createStatement();

            //3.执行
            String sql = "select * from t_user where username='" + username + "'and password='" + password + "'";
            rs = st.executeQuery(sql);

            if (rs.next()) {
                System.out.println("登录成功！");
            } else {
                System.out.println("登录失败！");
            }

        } catch (Exception e) {
            e.printStackTrace();
        } finally {
            JDBCUtil.release(rs, st, conn);
        }
    }

    @Override
    public void insert(String username, String password) {
        Connection conn = null;
        PreparedStatement ps = null;
        try {
            conn = JDBCUtil.getConn();
            String sql = "insert into user.t_user values(null,?,?)";
            ps = conn.prepareStatement(sql);

            //给占位符赋值 从左到右数过来，1 代表第一个问号， 永远是1开始。
            ps.setString(1, username);
            ps.setString(2, password);

            int result = ps.executeUpdate();
            if (result > 0) {
                System.out.println("添加成功！");
            } else {
                System.out.println("添加失败！");
            }
        } catch (Exception e) {
            e.printStackTrace();
        } finally {
            JDBCUtil.release(conn, ps);
        }
    }


}
