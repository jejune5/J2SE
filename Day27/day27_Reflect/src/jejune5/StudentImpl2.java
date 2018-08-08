package jejune5;

/**
 * Created by Jejune on 2018/7/14.
 */
public class StudentImpl2 implements StudentDao {
    @Override
    public void login() {
        System.out.println("权限校验");
        System.out.println("登录测试");
        System.out.println("日志记录");
    }

    @Override
    public void regist() {
        System.out.println("权限校验");
        System.out.println("登录测试");
        System.out.println("日志记录");
    }
}
