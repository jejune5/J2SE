package jejune3;

import java.util.ArrayList;
import java.util.List;

/**
 * Created by Jejune on 2018/7/24.
 */
/*
 * List集合的特有功能：
 * A:添加功能
 * 		void add(int index,Object element):在指定位置添加元素
 * B:获取功能
 * 		Object get(int index):获取指定位置的元素
 * C:列表迭代器
 * 		ListIterator listIterator()：List集合特有的迭代器
 * D:删除功能
 * 		Object remove(int index)：根据索引删除元素,返回被删除的元素
 * E:修改功能
 * 		Object set(int index,Object element):根据索引修改元素，返回被修饰的元素
 */
public class ListDemo {
    public static void main(String[] args) {
        //创建集合对象
        List list = new ArrayList<>();

        //添加元素
        list.add("Hello");
        list.add("World");
        list.add("Java");

        // void add(int index,Object element):在指定位置添加元素
        // list.add(1, "android");//没有问题
        // IndexOutOfBoundsException
        // list.add(11, "javaee");//有问题
        //list.add(3, "javaee"); //没有问题
        // list.add(4, "javaee"); //有问题

        // Object get(int index):获取指定位置的元素
        System.out.println("get:" + list.get(1));
        // IndexOutOfBoundsException
        // System.out.println("get:" + list.get(11));

        // Object remove(int index)：根据索引删除元素,返回被删除的元素
        // System.out.println("remove:" + list.remove(1));
        // IndexOutOfBoundsException
        // System.out.println("remove:" + list.remove(11));

        // Object set(int index,Object element):根据索引修改元素，返回被修饰的元素
        System.out.println("set:" + list.set(1, "javaee"));

        System.out.println("List: " + list);
    }
}

/*
G:\Java\jdk1.8.0_162\bin\java -Didea.launcher.port=7535 "-Didea.launcher.bin.path=G:\Java\IntelliJ IDEA 16\IntelliJ IDEA 2016.1\bin" -Dfile.encoding=UTF-8 -classpath "G:\Java\jdk1.8.0_162\jre\lib\charsets.jar;G:\Java\jdk1.8.0_162\jre\lib\deploy.jar;G:\Java\jdk1.8.0_162\jre\lib\ext\access-bridge-64.jar;G:\Java\jdk1.8.0_162\jre\lib\ext\cldrdata.jar;G:\Java\jdk1.8.0_162\jre\lib\ext\dnsns.jar;G:\Java\jdk1.8.0_162\jre\lib\ext\jaccess.jar;G:\Java\jdk1.8.0_162\jre\lib\ext\jfxrt.jar;G:\Java\jdk1.8.0_162\jre\lib\ext\localedata.jar;G:\Java\jdk1.8.0_162\jre\lib\ext\nashorn.jar;G:\Java\jdk1.8.0_162\jre\lib\ext\sunec.jar;G:\Java\jdk1.8.0_162\jre\lib\ext\sunjce_provider.jar;G:\Java\jdk1.8.0_162\jre\lib\ext\sunmscapi.jar;G:\Java\jdk1.8.0_162\jre\lib\ext\sunpkcs11.jar;G:\Java\jdk1.8.0_162\jre\lib\ext\zipfs.jar;G:\Java\jdk1.8.0_162\jre\lib\javaws.jar;G:\Java\jdk1.8.0_162\jre\lib\jce.jar;G:\Java\jdk1.8.0_162\jre\lib\jfr.jar;G:\Java\jdk1.8.0_162\jre\lib\jfxswt.jar;G:\Java\jdk1.8.0_162\jre\lib\jsse.jar;G:\Java\jdk1.8.0_162\jre\lib\management-agent.jar;G:\Java\jdk1.8.0_162\jre\lib\plugin.jar;G:\Java\jdk1.8.0_162\jre\lib\resources.jar;G:\Java\jdk1.8.0_162\jre\lib\rt.jar;G:\Java\IDEA_code\Day15\day15_List\out\production\day15_List;G:\Java\IntelliJ IDEA 16\IntelliJ IDEA 2016.1\lib\idea_rt.jar" com.intellij.rt.execution.application.AppMain jejune3.ListDemo
get:World
set:World
List: [Hello, javaee, Java]

Process finished with exit code 0

 */