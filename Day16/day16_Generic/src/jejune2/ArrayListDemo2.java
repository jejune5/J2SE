package jejune2;

import java.util.ArrayList;
import java.util.Iterator;

/**
 * Created by Jejune on 2018/7/26.
 */
/*
 * 需求：存储自定义对象并遍历。
 *
 * A:创建学生类
 * B:创建集合对象
 * C:创建元素对象
 * D:把元素添加到集合
 * E:遍历集合
 */
public class ArrayListDemo2 {
    public static void main(String[] args) {
        // 创建集合对象
        // JDK7的新特性：泛型推断。
        // ArrayList<Student> array = new ArrayList<>();
        // 但是我不建议这样使用。
        ArrayList<Student> array = new ArrayList<Student>();

        //创建元素对象

        // 创建元素对象
        Student s1 = new Student("曹操", 40); // 后知后觉
        Student s2 = new Student("蒋干", 30); // 不知不觉
        Student s3 = new Student("诸葛亮", 26);// 先知先觉

        // 添加元素
        array.add(s1);
        array.add(s2);
        array.add(s3);

        //遍历
        Iterator<Student> it = array.iterator();
        while (it.hasNext()) {
            Student s = it.next();
            System.out.println(s.getName() + "---" + s.getAge());
        }
        System.out.println("----");
        for (Student ss : array) {
            System.out.println(ss.getName() + "---" + ss.getAge());
        }
    }
}
/*
G:\Java\jdk1.8.0_162\bin\java -Didea.launcher.port=7532 "-Didea.launcher.bin.path=G:\Java\IntelliJ IDEA 16\IntelliJ IDEA 2016.1\bin" -Dfile.encoding=UTF-8 -classpath "G:\Java\jdk1.8.0_162\jre\lib\charsets.jar;G:\Java\jdk1.8.0_162\jre\lib\deploy.jar;G:\Java\jdk1.8.0_162\jre\lib\ext\access-bridge-64.jar;G:\Java\jdk1.8.0_162\jre\lib\ext\cldrdata.jar;G:\Java\jdk1.8.0_162\jre\lib\ext\dnsns.jar;G:\Java\jdk1.8.0_162\jre\lib\ext\jaccess.jar;G:\Java\jdk1.8.0_162\jre\lib\ext\jfxrt.jar;G:\Java\jdk1.8.0_162\jre\lib\ext\localedata.jar;G:\Java\jdk1.8.0_162\jre\lib\ext\nashorn.jar;G:\Java\jdk1.8.0_162\jre\lib\ext\sunec.jar;G:\Java\jdk1.8.0_162\jre\lib\ext\sunjce_provider.jar;G:\Java\jdk1.8.0_162\jre\lib\ext\sunmscapi.jar;G:\Java\jdk1.8.0_162\jre\lib\ext\sunpkcs11.jar;G:\Java\jdk1.8.0_162\jre\lib\ext\zipfs.jar;G:\Java\jdk1.8.0_162\jre\lib\javaws.jar;G:\Java\jdk1.8.0_162\jre\lib\jce.jar;G:\Java\jdk1.8.0_162\jre\lib\jfr.jar;G:\Java\jdk1.8.0_162\jre\lib\jfxswt.jar;G:\Java\jdk1.8.0_162\jre\lib\jsse.jar;G:\Java\jdk1.8.0_162\jre\lib\management-agent.jar;G:\Java\jdk1.8.0_162\jre\lib\plugin.jar;G:\Java\jdk1.8.0_162\jre\lib\resources.jar;G:\Java\jdk1.8.0_162\jre\lib\rt.jar;G:\Java\IDEA_code\Day16\day16_Generic\out\production\day16_Generic;G:\Java\IntelliJ IDEA 16\IntelliJ IDEA 2016.1\lib\idea_rt.jar" com.intellij.rt.execution.application.AppMain jejune2.ArrayListDemo2
曹操---40
蒋干---30
诸葛亮---26
----
曹操---40
蒋干---30
诸葛亮---26

Process finished with exit code 0

 */