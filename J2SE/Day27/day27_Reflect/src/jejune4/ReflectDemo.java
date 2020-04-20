package jejune4;

import java.lang.reflect.Constructor;
import java.lang.reflect.Method;

/**
 * Created by Jejune on 2018/7/6.
 */
public class ReflectDemo {
    public static void main(String[] args) throws Exception {
        Class c = Class.forName("jejune1.Person");

        //获取所有的方法
        /*
         Method[] methods = c.getMethods();  //获取自己包括父亲的公共方法
         Method[] methods1 = c.getDeclaredMethods(); //获取自己的所有方法
         for (Method method : methods1) {
         System.out.println(method);
         }
         System.out.println("---");
         */

        Constructor con = c.getConstructor();
        Object obj = con.newInstance();

        //获取单个方法并使用
        //public void show()
        //public Method getMethod(String name,Class<?>...parameterTypes)
        //第一个参数表示方法名，第二个参数表示方法的Class类型
        Method m1 = c.getMethod("show");
        //Object invoke(Object obj, Object... args)
        //对带有指定参数的指定对象调用由此 Method 对象表示的底层方法
        m1.invoke(obj); //调用obj对象的的m1方法

        System.out.println("---");
        Method m2 = c.getMethod("method", String.class);
        m2.invoke(obj, "hello");
        System.out.println("---");

        Method m3 = c.getMethod("getString", String.class, int.class);
        Object objString = m3.invoke(obj, "hello", 100);
        System.out.println(objString);

        System.out.println("---");
        Method m4 = c.getDeclaredMethod("function");
        m4.setAccessible(true);
        m4.invoke(obj);
    }
}
