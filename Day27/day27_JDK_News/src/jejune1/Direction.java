package jejune1;

/**
 * Created by Jejune on 2018/7/16.
 */
public class Direction {
    //创建几个实例
    public static final Direction FRONT = new Direction();
    public static final Direction BEHIND = new Direction();
    public static final Direction RIGHT = new Direction();
    public static final Direction LEFT = new Direction();

    //// 构造私有，别人就不能无限的创建了
    private Direction() {
    }


}
