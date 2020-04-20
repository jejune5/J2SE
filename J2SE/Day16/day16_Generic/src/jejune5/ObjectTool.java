package jejune5;

/**
 * Created by Jejune on 2018/7/27.
 */
/*
 * 泛型方法：把泛型定义在方法上
 */
public class ObjectTool {
    public <T> void show(T t) {
        System.out.println(t);
    }
}
