package Test;

import java.io.FileReader;
import java.io.IOException;
import java.lang.reflect.Constructor;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;
import java.util.Properties;

/**
 * Created by Jejune on 2018/7/11.
 */
/*
 * 通过配置文件运行类中的方法
 *
 * 反射：
 * 		需要有配置文件配合使用。
 * 		用class.txt代替。
 * 		并且你知道有两个键。
 * 			className
 * 			methodName
 */
public class Test {
    public static void main(String[] args) throws IOException, ClassNotFoundException, NoSuchMethodException, IllegalAccessException, InvocationTargetException, InstantiationException {

        /*
        //反射前
        Student s = new Student();
        s.love();
        Teacher t = new Teacher();
        t.love();
        Worker w = new Worker();
        w.love();
        */

        // 加载键值对数据
        Properties prop = new Properties();
        FileReader fr = new FileReader("Class.txt");
        prop.load(fr);
        fr.close();

        //获取数据
        String className = prop.getProperty("className");
        String methodName = prop.getProperty("methodName");

        //反射
        Class c = Class.forName(className);

        Constructor con = c.getConstructor();
        Object obj = con.newInstance();

        //调用方法
        Method m = c.getMethod(methodName);
        m.invoke(obj);
    }
}
