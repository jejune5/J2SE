package jejune1;

/**
 * Created by Jejune on 2018/7/25.
 */

import java.util.ArrayList;
import java.util.Iterator;

/*
 * List的子类特点：
 * 		ArrayListDemo:
 * 			底层数据结构是数组，查询快，增删慢
 * 			线程不安全，效率高
 * 		Vector:
 * 			底层数据结构是数组，查询快，增删慢
 * 			线程安全，效率低
 * 		LinkedList:
 * 			 底层数据结构是链表，查询慢，增删快
 * 			线程不安全，效率高
 *
 * 案例：
 * 		使用List的任何子类存储字符串或者存储自定义对象并遍历。
 *
 * ArrayList的使用。
 * 		存储字符串并遍历
 */
public class ArrayListDemo {
    public static void main(String[] args) {

        // 创建集合对象
        ArrayList array = new ArrayList();

        // 创建元素对象，并添加元素
        array.add("hello");
        array.add("world");
        array.add("java");

        //遍历
        Iterator it = array.iterator();
        while (it.hasNext()) {
            String s = (String) it.next();
            System.out.println(s);
        }
        System.out.println("-----");

        //for遍历
        for (int x = 0; x < array.size(); x++) {
            String ss = (String) array.get(x);
            System.out.println(ss);
        }
    }
}

/*
G:\Java\jdk1.8.0_162\bin\java -Didea.launcher.port=7532 "-Didea.launcher.bin.path=G:\Java\IntelliJ IDEA 16\IntelliJ IDEA 2016.1\bin" -Dfile.encoding=UTF-8 -classpath "G:\Java\jdk1.8.0_162\jre\lib\charsets.jar;G:\Java\jdk1.8.0_162\jre\lib\deploy.jar;G:\Java\jdk1.8.0_162\jre\lib\ext\access-bridge-64.jar;G:\Java\jdk1.8.0_162\jre\lib\ext\cldrdata.jar;G:\Java\jdk1.8.0_162\jre\lib\ext\dnsns.jar;G:\Java\jdk1.8.0_162\jre\lib\ext\jaccess.jar;G:\Java\jdk1.8.0_162\jre\lib\ext\jfxrt.jar;G:\Java\jdk1.8.0_162\jre\lib\ext\localedata.jar;G:\Java\jdk1.8.0_162\jre\lib\ext\nashorn.jar;G:\Java\jdk1.8.0_162\jre\lib\ext\sunec.jar;G:\Java\jdk1.8.0_162\jre\lib\ext\sunjce_provider.jar;G:\Java\jdk1.8.0_162\jre\lib\ext\sunmscapi.jar;G:\Java\jdk1.8.0_162\jre\lib\ext\sunpkcs11.jar;G:\Java\jdk1.8.0_162\jre\lib\ext\zipfs.jar;G:\Java\jdk1.8.0_162\jre\lib\javaws.jar;G:\Java\jdk1.8.0_162\jre\lib\jce.jar;G:\Java\jdk1.8.0_162\jre\lib\jfr.jar;G:\Java\jdk1.8.0_162\jre\lib\jfxswt.jar;G:\Java\jdk1.8.0_162\jre\lib\jsse.jar;G:\Java\jdk1.8.0_162\jre\lib\management-agent.jar;G:\Java\jdk1.8.0_162\jre\lib\plugin.jar;G:\Java\jdk1.8.0_162\jre\lib\resources.jar;G:\Java\jdk1.8.0_162\jre\lib\rt.jar;G:\Java\IDEA_code\Day16\day16_List_Son\out\production\day16_List_Son;G:\Java\IntelliJ IDEA 16\IntelliJ IDEA 2016.1\lib\idea_rt.jar" com.intellij.rt.execution.application.AppMain jejune1.ArrayListDemo
hello
world
java
-----
hello
world
java

Process finished with exit code 0

 */