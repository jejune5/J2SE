package jejune3;

import java.util.ArrayList;
import java.util.Collection;

/**
 * Created by Jejune on 2018/7/23.
 */
/*
 * 集合的遍历。其实就是依次获取集合中的每一个元素。
 *
 * Object[] toArray():把集合转成数组，可以实现集合的遍历
 */

public class CollectionDemo3 {
    public static void main(String[] args) {
        //创建集合对象
        Collection c = new ArrayList<>();

        //添加元素
        c.add("hello");
        c.add("world");
        c.add("java");

        //遍历
        Object[] objs = c.toArray();
        for(int x =0 ;x < objs.length;x++) {
            // System.out.println(objs[x]);
            // 我知道元素是字符串，我在获取到元素的的同时，还想知道元素的长度。
            // System.out.println(objs[x] + "---" + objs[x].length());
            // 上面的实现不了，原因是Object中没有length()方法
            // 我们要想使用字符串的方法，就必须把元素还原成字符串
            // 向下转型
            String s = (String) objs[x];
            System.out.println(s+"----"+s.length());
        }
    }
}

/*
G:\Java\jdk1.8.0_162\bin\java -Didea.launcher.port=7535 "-Didea.launcher.bin.path=G:\Java\IntelliJ IDEA 16\IntelliJ IDEA 2016.1\bin" -Dfile.encoding=UTF-8 -classpath "G:\Java\jdk1.8.0_162\jre\lib\charsets.jar;G:\Java\jdk1.8.0_162\jre\lib\deploy.jar;G:\Java\jdk1.8.0_162\jre\lib\ext\access-bridge-64.jar;G:\Java\jdk1.8.0_162\jre\lib\ext\cldrdata.jar;G:\Java\jdk1.8.0_162\jre\lib\ext\dnsns.jar;G:\Java\jdk1.8.0_162\jre\lib\ext\jaccess.jar;G:\Java\jdk1.8.0_162\jre\lib\ext\jfxrt.jar;G:\Java\jdk1.8.0_162\jre\lib\ext\localedata.jar;G:\Java\jdk1.8.0_162\jre\lib\ext\nashorn.jar;G:\Java\jdk1.8.0_162\jre\lib\ext\sunec.jar;G:\Java\jdk1.8.0_162\jre\lib\ext\sunjce_provider.jar;G:\Java\jdk1.8.0_162\jre\lib\ext\sunmscapi.jar;G:\Java\jdk1.8.0_162\jre\lib\ext\sunpkcs11.jar;G:\Java\jdk1.8.0_162\jre\lib\ext\zipfs.jar;G:\Java\jdk1.8.0_162\jre\lib\javaws.jar;G:\Java\jdk1.8.0_162\jre\lib\jce.jar;G:\Java\jdk1.8.0_162\jre\lib\jfr.jar;G:\Java\jdk1.8.0_162\jre\lib\jfxswt.jar;G:\Java\jdk1.8.0_162\jre\lib\jsse.jar;G:\Java\jdk1.8.0_162\jre\lib\management-agent.jar;G:\Java\jdk1.8.0_162\jre\lib\plugin.jar;G:\Java\jdk1.8.0_162\jre\lib\resources.jar;G:\Java\jdk1.8.0_162\jre\lib\rt.jar;G:\Java\IDEA_code\Day14\day15_Collection\out\production\day15_Collection;G:\Java\IntelliJ IDEA 16\IntelliJ IDEA 2016.1\lib\idea_rt.jar" com.intellij.rt.execution.application.AppMain jejune3.CollectionDemo3
hello----5
world----5
java----4

Process finished with exit code 0

 */