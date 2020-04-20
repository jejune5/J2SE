package jejune3;

/**
 * Created by Jejune on 2018/4/2.
 */
public class Teacher {
    private Teacher() {
    }

    private static Teacher t = null;

    public synchronized static Teacher getTeacher() {
        if (t == null) {
            t = new Teacher();
        }
        return t;
    }
}
