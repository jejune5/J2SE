package jejune2;

/**
 * Created by Jejune on 2018/7/17.
 */
public enum Direction2 {
    FRONT("前"), BEHIND("后"), LEFT("左"), RIGHT("右");

    private String name;

    private Direction2(String name) {
        this.name = name;
    }

    public String getName() {
        return name;
    }

//    @Override
//    public String toString() {
//        return "茅敏敏";
//    }
}
