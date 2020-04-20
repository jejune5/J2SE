package jejune6;

/**
 * Created by Jejune on 2018/7/27.
 */
public class InterImpl<T> implements Inter<T> {

    @Override
    public void show(T t) {
        System.out.println(t);
    }
}
