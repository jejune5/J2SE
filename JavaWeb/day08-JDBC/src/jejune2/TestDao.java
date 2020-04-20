package jejune2;

import Util.JDBCUtil;

import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

public class TestDao {
    /**
     * 使用junit进行测试
     */
    public void testQuery(){
        //查询
        Connection conn = null;
        Statement st = null;
        ResultSet rs = null;
        try {
            //1.获取连接对象
            conn = JDBCUtil.getConn();

            //2.根据连接对象，得到Statement
            st = conn.createStatement();

            //3.执行操作语句，返回ResultSet
            String sql = "SELECT *FROM student";
            rs = st.executeQuery(sql);

            //遍历数据库
            while(rs.next()){
                String Name = rs.getString("Name");
                int Age = rs.getInt("Age");
                int ID = rs.getInt("ID");
                System.out.println("Name:"+Name+"  Age:"+Age+"  ID:"+ID);
            }
        } catch (SQLException e) {
            e.printStackTrace();
        }
    }
}
