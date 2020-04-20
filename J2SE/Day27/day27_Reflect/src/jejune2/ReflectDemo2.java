package jejune2;

import java.lang.reflect.Constructor;
import java.lang.reflect.InvocationTargetException;

/**
 * Created by Jejune on 2018/7/3.
 */
/*
* 需求：通过反射获取构造方法并使用
* public Person(String name,int age ,String address)
*
* Person p = new Person("三毛",18,"NANTONG")
*
* */
public class ReflectDemo2 {
    public static void main(String[] args) throws Exception {
        //获取字节码文件对象
        Class c = Class.forName("jejune1.Person");

        //获取带参构造方法对象
        Constructor con = c.getConstructor(String.class, int.class, String.class);

        //通过带参构造方法创建对象
        Object obj = con.newInstance("三毛", 18, "NANTONG");
        System.out.println(obj);
    }
}
