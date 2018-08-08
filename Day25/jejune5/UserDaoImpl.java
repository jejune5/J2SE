package jejune5;

/**
 * Created by Jejune on 2018/4/10.
 */
public class UserDaoImpl implements UserDao {

    @Override
    public void add() {
        System.out.println("增加功能");
    }

    @Override
    public void delete() {
        System.out.println("删除功能");
    }

    @Override
    public void update() {
        System.out.println("更新功能");
    }

    @Override
    public void find() {
        System.out.println("查找功能");
    }
}
