package jejune2;

import java.util.HashMap;
import java.util.Set;

/**
 * Created by Jejune on 2018/8/7.
 */
/*
 * HashMap<String,Student>
 * 键：String	学号
 * 值：Student 学生对象
 */
public class HashMapDemo3 {
    public static void main(String[] args) {
        //创建集合对象
        HashMap<String, Student> hm = new HashMap<String, Student>();

        // 创建学生对象
        Student s1 = new Student("周星驰", 58);
        Student s2 = new Student("刘德华", 55);
        Student s3 = new Student("梁朝伟", 54);
        Student s4 = new Student("刘嘉玲", 50);

        // 添加元素
        hm.put("9527", s1);
        hm.put("9522", s2);
        hm.put("9524", s3);
        hm.put("9529", s4);

        //遍历
        Set<String> set = hm.keySet();
        for (String key : set) {
            Student value = hm.get(key);
            System.out.println(key + "---" + value.getName() + "---" + value.getAge());
        }
    }
}

/*
G:\Java\jdk1.8.0_162\bin\java -Didea.launcher.port=7534 "-Didea.launcher.bin.path=G:\Java\IntelliJ IDEA 16\IntelliJ IDEA 2016.1\bin" -Dfile.encoding=UTF-8 -classpath "G:\Java\jdk1.8.0_162\jre\lib\charsets.jar;G:\Java\jdk1.8.0_162\jre\lib\deploy.jar;G:\Java\jdk1.8.0_162\jre\lib\ext\access-bridge-64.jar;G:\Java\jdk1.8.0_162\jre\lib\ext\cldrdata.jar;G:\Java\jdk1.8.0_162\jre\lib\ext\dnsns.jar;G:\Java\jdk1.8.0_162\jre\lib\ext\jaccess.jar;G:\Java\jdk1.8.0_162\jre\lib\ext\jfxrt.jar;G:\Java\jdk1.8.0_162\jre\lib\ext\localedata.jar;G:\Java\jdk1.8.0_162\jre\lib\ext\nashorn.jar;G:\Java\jdk1.8.0_162\jre\lib\ext\sunec.jar;G:\Java\jdk1.8.0_162\jre\lib\ext\sunjce_provider.jar;G:\Java\jdk1.8.0_162\jre\lib\ext\sunmscapi.jar;G:\Java\jdk1.8.0_162\jre\lib\ext\sunpkcs11.jar;G:\Java\jdk1.8.0_162\jre\lib\ext\zipfs.jar;G:\Java\jdk1.8.0_162\jre\lib\javaws.jar;G:\Java\jdk1.8.0_162\jre\lib\jce.jar;G:\Java\jdk1.8.0_162\jre\lib\jfr.jar;G:\Java\jdk1.8.0_162\jre\lib\jfxswt.jar;G:\Java\jdk1.8.0_162\jre\lib\jsse.jar;G:\Java\jdk1.8.0_162\jre\lib\management-agent.jar;G:\Java\jdk1.8.0_162\jre\lib\plugin.jar;G:\Java\jdk1.8.0_162\jre\lib\resources.jar;G:\Java\jdk1.8.0_162\jre\lib\rt.jar;G:\Java\IDEA_code\Day18\day18_Map_Son\out\production\day18_Map_Son;G:\Java\IntelliJ IDEA 16\IntelliJ IDEA 2016.1\lib\idea_rt.jar" com.intellij.rt.execution.application.AppMain jejune2.HashMapDemo3
9524---梁朝伟---54
9522---刘德华---55
9529---刘嘉玲---50
9527---周星驰---58

Process finished with exit code 0

 */