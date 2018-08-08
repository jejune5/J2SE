package jejune2;

import java.util.HashMap;
import java.util.Set;

/**
 * Created by Jejune on 2018/8/7.
 */
/*
 * HashMap<Student,String>
 * 键：Student
 * 		要求：如果两个对象的成员变量值都相同，则为同一个对象。
 * 值：String
 */
public class HashMapDemo4 {
    public static void main(String[] args) {
        // 创建集合对象
        HashMap<Student, String> hm = new HashMap<Student, String>();

        // 创建学生对象
        Student s1 = new Student("貂蝉", 27);
        Student s2 = new Student("王昭君", 30);
        Student s3 = new Student("西施", 33);
        Student s4 = new Student("杨玉环", 35);
        Student s5 = new Student("貂蝉", 27);

        // 添加元素
        hm.put(s1, "8888");
        hm.put(s2, "6666");
        hm.put(s3, "5555");
        hm.put(s4, "7777");
        hm.put(s5, "9999");

        //遍历
        Set<Student> set = hm.keySet();
        for (Student key : set) {
            String value = hm.get(key);
            System.out.println(key.getName() + "---" + key.getAge() + "---" + value);
        }
    }
}
/*
G:\Java\jdk1.8.0_162\bin\java -Didea.launcher.port=7533 "-Didea.launcher.bin.path=G:\Java\IntelliJ IDEA 16\IntelliJ IDEA 2016.1\bin" -Dfile.encoding=UTF-8 -classpath "G:\Java\jdk1.8.0_162\jre\lib\charsets.jar;G:\Java\jdk1.8.0_162\jre\lib\deploy.jar;G:\Java\jdk1.8.0_162\jre\lib\ext\access-bridge-64.jar;G:\Java\jdk1.8.0_162\jre\lib\ext\cldrdata.jar;G:\Java\jdk1.8.0_162\jre\lib\ext\dnsns.jar;G:\Java\jdk1.8.0_162\jre\lib\ext\jaccess.jar;G:\Java\jdk1.8.0_162\jre\lib\ext\jfxrt.jar;G:\Java\jdk1.8.0_162\jre\lib\ext\localedata.jar;G:\Java\jdk1.8.0_162\jre\lib\ext\nashorn.jar;G:\Java\jdk1.8.0_162\jre\lib\ext\sunec.jar;G:\Java\jdk1.8.0_162\jre\lib\ext\sunjce_provider.jar;G:\Java\jdk1.8.0_162\jre\lib\ext\sunmscapi.jar;G:\Java\jdk1.8.0_162\jre\lib\ext\sunpkcs11.jar;G:\Java\jdk1.8.0_162\jre\lib\ext\zipfs.jar;G:\Java\jdk1.8.0_162\jre\lib\javaws.jar;G:\Java\jdk1.8.0_162\jre\lib\jce.jar;G:\Java\jdk1.8.0_162\jre\lib\jfr.jar;G:\Java\jdk1.8.0_162\jre\lib\jfxswt.jar;G:\Java\jdk1.8.0_162\jre\lib\jsse.jar;G:\Java\jdk1.8.0_162\jre\lib\management-agent.jar;G:\Java\jdk1.8.0_162\jre\lib\plugin.jar;G:\Java\jdk1.8.0_162\jre\lib\resources.jar;G:\Java\jdk1.8.0_162\jre\lib\rt.jar;G:\Java\IDEA_code\Day18\day18_Map_Son\out\production\day18_Map_Son;G:\Java\IntelliJ IDEA 16\IntelliJ IDEA 2016.1\lib\idea_rt.jar" com.intellij.rt.execution.application.AppMain jejune2.HashMapDemo4
王昭君---30---6666
貂蝉---27---9999
杨玉环---35---7777
西施---33---5555

Process finished with exit code 0

 */