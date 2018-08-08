package jejune5;

/**
 * Created by Jejune on 2018/7/14.
 */
public class UserDaoDemo {
    public static void main(String[] args) {

        UserDao ud = new UserDaoImpl();
        ud.add();
        ud.delete();
        ud.find();
        ud.update();
        System.out.println("---");

        //真实需求：操作前查看权限，操作后，留下日志
        UserDao ud2 = new UserDaoImpl2();
        ud2.add();
        ud2.delete();
        ud2.find();
        ud2.update();
        System.out.println("---");

        StudentDao sd = new StudentImpl();
        sd.login();
        sd.regist();
        System.out.println("---");

        //操作前查看权限，操作后，留下日志
        StudentDao sd2 = new StudentImpl2();
        sd2.regist();
        sd2.login();

    }
}
