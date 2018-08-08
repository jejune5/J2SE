package jejune2;

import java.util.HashSet;

/**
 * Created by Jejune on 2018/7/28.
 */
/*
 * HashSet:存储字符串并遍历
 * 问题：为什么存储字符串的时候，字符串内容相同的只存储了一个呢?
 * 通过查看add方法的源码，我们知道这个方法底层依赖 两个方法：hashCode()和equals()。
 * 步骤：
 * 		首先比较哈希值
 * 		如果相同，继续走，比较地址值或者走equals()
 * 		如果不同,就直接添加到集合中
 * 按照方法的步骤来说：
 * 		先看hashCode()值是否相同
 * 			相同:继续走equals()方法
 * 				返回true：	说明元素重复，就不添加
 * 				返回false：说明元素不重复，就添加到集合
 * 			不同：就直接把元素添加到集合
 * 如果类没有重写这两个方法，默认使用的Object()。一般来说不同相同。
 * 而String类重写了hashCode()和equals()方法，所以，它就可以把内容相同的字符串去掉。只留下一个。
 */
public class HashSetDemo {
    public static void main(String[] args) {
        //创建集合对象
        HashSet<String> hs = new HashSet<String>();

        //添加元素
        hs.add("hello");
        hs.add("world");
        hs.add("java");
        hs.add("world");

        //遍历集合
        for (String s : hs) {
            System.out.println(s);
        }
    }
}

/*
G:\Java\jdk1.8.0_162\bin\java -Didea.launcher.port=7533 "-Didea.launcher.bin.path=G:\Java\IntelliJ IDEA 16\IntelliJ IDEA 2016.1\bin" -Dfile.encoding=UTF-8 -classpath "G:\Java\jdk1.8.0_162\jre\lib\charsets.jar;G:\Java\jdk1.8.0_162\jre\lib\deploy.jar;G:\Java\jdk1.8.0_162\jre\lib\ext\access-bridge-64.jar;G:\Java\jdk1.8.0_162\jre\lib\ext\cldrdata.jar;G:\Java\jdk1.8.0_162\jre\lib\ext\dnsns.jar;G:\Java\jdk1.8.0_162\jre\lib\ext\jaccess.jar;G:\Java\jdk1.8.0_162\jre\lib\ext\jfxrt.jar;G:\Java\jdk1.8.0_162\jre\lib\ext\localedata.jar;G:\Java\jdk1.8.0_162\jre\lib\ext\nashorn.jar;G:\Java\jdk1.8.0_162\jre\lib\ext\sunec.jar;G:\Java\jdk1.8.0_162\jre\lib\ext\sunjce_provider.jar;G:\Java\jdk1.8.0_162\jre\lib\ext\sunmscapi.jar;G:\Java\jdk1.8.0_162\jre\lib\ext\sunpkcs11.jar;G:\Java\jdk1.8.0_162\jre\lib\ext\zipfs.jar;G:\Java\jdk1.8.0_162\jre\lib\javaws.jar;G:\Java\jdk1.8.0_162\jre\lib\jce.jar;G:\Java\jdk1.8.0_162\jre\lib\jfr.jar;G:\Java\jdk1.8.0_162\jre\lib\jfxswt.jar;G:\Java\jdk1.8.0_162\jre\lib\jsse.jar;G:\Java\jdk1.8.0_162\jre\lib\management-agent.jar;G:\Java\jdk1.8.0_162\jre\lib\plugin.jar;G:\Java\jdk1.8.0_162\jre\lib\resources.jar;G:\Java\jdk1.8.0_162\jre\lib\rt.jar;G:\Java\IDEA_code\Day17\day17_Set_Son\out\production\day17_Set_Son;G:\Java\IntelliJ IDEA 16\IntelliJ IDEA 2016.1\lib\idea_rt.jar" com.intellij.rt.execution.application.AppMain jejune2.HashSetDemo
world
java
hello

Process finished with exit code 0

 */