package jejune2;

/**
 * Created by Jejune on 2018/7/5.
 */

import java.lang.reflect.Constructor;

/**
 * 需求 ：通过反射获取私有构造方法
 * Private Person(String name)
  * Person p = new Person ("茅敏敏是傻逼")
 * System.out.println(p)
 */
public class ReflectDemo3 {
    public static void main(String[] args) throws Exception {
        //获取字节码文件对象
        Class c = Class.forName("jejune1.Person");

        //获取私有构造方法、
        //一开始我们获取的方法只能获取公共的，(会报错NoSuchMethodException)下面这种方式就可以了
        Constructor con = c.getDeclaredConstructor(String.class);

        //用该私有构造方法创建对象,(报错：IllegallAccessException)
        con.setAccessible(true); //暴力访问
        Object obj = con.newInstance("茅敏敏");

        System.out.println(obj);
    }
}
