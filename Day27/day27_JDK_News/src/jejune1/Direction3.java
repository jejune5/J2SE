package jejune1;

/**
 * Created by Jejune on 2018/7/16.
 */
public abstract class Direction3 {
    public static final Direction3 FRONT = new Direction3("前") {
        @Override
        public void show() {
            System.out.println("前");
        }
    };
    public static final Direction3 BEHIND = new Direction3("后") {
        @Override
        public void show() {
            System.out.println("后");
        }
    };
    public static final Direction3 RIGHT = new Direction3("左") {
        @Override
        public void show() {
            System.out.println("左");
        }
    };
    public static final Direction3 LEFT = new Direction3("右") {
        @Override
        public void show() {
            System.out.println("右");
        }
    };

    // 构造私有，别人就不能无限的创建了
    // private Direction2() {
    // }

    private String name;

    private Direction3(String name) {
        this.name = name;
    }

    public String getName() {
        return name;
    }

    //加入抽象方法
    public abstract void show();
}
