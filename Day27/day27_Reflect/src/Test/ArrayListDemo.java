package Test;

import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;
import java.util.ArrayList;

/**
 * Created by Jejune on 2018/7/13.
 */
/*
* 给一个ArrayList<Integer>的对象，在这个集合中添加一个字符串数据，如何实现？
* */
public class ArrayListDemo {
    public static void main(String[] args) throws NoSuchMethodException, InvocationTargetException, IllegalAccessException {
        //创建ArrayList集合对象
        ArrayList<Integer> array = new ArrayList<Integer>();
        //array.add("Hello");  报错
        array.add(100);

        Class c = array.getClass();  //集合ArrayList的class文件对象
        Method m = c.getMethod("add", Object.class);

        m.invoke(array, "Hello");
        m.invoke(array, "World");
        m.invoke(array, "Java");

        System.out.println(array);

    }
}
