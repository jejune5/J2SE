package jejune2;


/**
 * Created by Jejune on 2018/7/17.
 */
public enum Direction3 {
    FRONT("前") {
        @Override
        public void show() {
            System.out.println("前");
        }
    },
    BEHIND("后") {
        @Override
        public void show() {
            System.out.println("后");
        }
    },
    RIGHT("") {
        @Override
        public void show() {
            System.out.println("右");
        }
    },
    Left("") {
        @Override
        public void show() {
            System.out.println("左");
        }
    };

    private String name;

    private Direction3(String name) {
        this.name = name;
    }

    public String getName() {
        return name;
    }

    public abstract void show();
}
