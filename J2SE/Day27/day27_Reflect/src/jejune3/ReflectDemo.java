package jejune3;

/**
 * Created by Jejune on 2018/7/6.
 */

import java.lang.reflect.Constructor;
import java.lang.reflect.Field;

/**
 * 通过反射获取成员变量并使用
 */
public class ReflectDemo {
    public static void main(String[] args) throws Exception {
        //获取字节码对象
        Class c = Class.forName("jejune1.Person");

        /*
        //获取所有成员变量
        Field[] fields = c.getDeclaredFields();
        for (Field field : fields) {
            System.out.println(field);
        }
        */

        //获取无参构造方法创建对象
        Constructor con = c.getDeclaredConstructor();
        Object obj = con.newInstance();
        System.out.println(obj);

        //获取单个成员变量
        //获取address变量并赋值
        Field addressField = c.getField("address");
        //public void set (Object obj ,Object value);
        //将指定对象变量上此Field 对象表示字段设置为指定的新值
        addressField.set(obj, "南通");
        System.out.println(obj);

        //获取name变量并赋值
        Field nameField = c.getDeclaredField("name");
        //Exception in thread "main" java.lang.NoSuchFieldException: name
        nameField.setAccessible(true);
        //java.lang.IllegalAccessException
        nameField.set(obj, "茅敏敏");
        System.out.println(obj);

    }
}
