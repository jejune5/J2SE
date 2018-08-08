package jejune5;

/**
 * Created by Jejune on 2018/7/14.
 */
public class StudentImpl implements StudentDao {

    @Override
    public void login() {
        System.out.println("登录测试");
    }

    @Override
    public void regist() {
        System.out.println("注册测试");
    }
}
