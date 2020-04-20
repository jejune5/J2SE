package Util;

import java.io.FileInputStream;
import java.io.IOException;
import java.io.InputStream;
import java.sql.*;
import java.util.Properties;

public class JDBCUtil {
    /**
     * 获取连接对象
     *
     * @return
     */

    static String url = null;
    static String user = null;
    static String password = null;
    static String driverClass = null;

    static {
        try {
        //创建一个属性配置对象
        Properties properties = new Properties();
        //InputStream is = JDBCUtil.class.getClassLoader().getResourceAsStream("jdbc.properties");
        InputStream is = new FileInputStream("jdbc.properties");

        //导入输入流
            properties.load(is);

        //读取属性
        driverClass = properties.getProperty("driverClass");
        url = properties.getProperty("url");
        user = properties.getProperty("user");
        password = properties.getProperty("password");

        } catch (IOException e) {
            e.printStackTrace();
        }
    }

    public static Connection getConn() {
        Connection conn = null;
        try {
            Class.forName(driverClass);

            conn = DriverManager.getConnection(url,user,password);
        } catch (ClassNotFoundException e) {
            e.printStackTrace();
        } catch (SQLException e) {
            e.printStackTrace();
        }
        return conn;
    }

    /**
     * 释放资源类
     *
     * @param rs
     * @param st
     * @param conn
     */
    public static void release(ResultSet rs, Statement st, Connection conn) {
        closeRs(rs);
        closeConn(conn);
        closeSt(st);
    }

    public static void release(Connection conn ,PreparedStatement ps){
        closeConn(conn);
        closePs(ps);
    }

    private static void closePs(PreparedStatement ps) {
        try {
            if (ps!= null){
                ps.close();
            }
        } catch (Exception e) {
            e.printStackTrace();
        }finally {
            ps = null;
        }
    }

    private static void closeRs(ResultSet rs) {
        try {
            if (rs != null) {
                rs.close();
            }
        } catch (SQLException e) {
            e.printStackTrace();
        } finally {
            rs = null;
        }
    }

    private static void closeSt(Statement st) {
        try {
            if (st != null) {
                st.close();
            }
        } catch (SQLException e) {
            e.printStackTrace();
        } finally {
            st = null;
        }
    }

    private static void closeConn(Connection conn) {
        try {
            if (conn != null) {
                conn.close();
            }
        } catch (SQLException e) {
            e.printStackTrace();
        } finally {
            conn = null;
        }
    }

}
