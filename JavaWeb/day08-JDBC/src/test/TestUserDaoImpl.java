package test;

import dao.UserDao;
import dao.impl.UserDaoImpl;

public class TestUserDaoImpl {

    /*
   //***findAll方法的测试***
    public void testFindAll() {
   // public static void main(String[] args) {
        UserDao dao = new UserDaoImpl();
        dao.findAll();
    }
    */

    //***登录的测试****
    /*
    //public void testLogin(){
    public static void main(String[] args) {
        UserDao dao = new UserDaoImpl();
        dao.login("Jejune", "123");
    }
    */

    //***添加的测试****
    public static void main(String[] args) {
        UserDao dao = new UserDaoImpl();
        dao.insert("三毛","123");
    }


}

