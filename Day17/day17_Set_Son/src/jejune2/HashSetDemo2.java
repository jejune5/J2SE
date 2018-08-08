package jejune2;

import java.util.HashSet;

/**
 * Created by Jejune on 2018/7/30.
 */
/*
 * 需求：存储自定义对象，并保证元素的【唯一性】
 * 要求：如果两个对象的成员变量值都相同，则为同一个元素。
 *
 * 目前是不符合我的要求的：因为我们知道HashSet底层依赖的是hashCode()和equals()方法。
 * 而这两个方法我们在学生类中没有重写，所以，默认使用的是Object类。
 * 这个时候，他们的哈希值是不会一样的，根本就不会继续判断，执行了添加操作。
 */
public class HashSetDemo2 {
    public static void main(String[] args) {
        HashSet<Student> hs = new HashSet<Student>();

        // 创建学生对象
        Student s1 = new Student("林青霞", 27);
        Student s2 = new Student("柳岩", 22);
        Student s3 = new Student("王祖贤", 30);
        Student s4 = new Student("林青霞", 27);
        Student s5 = new Student("林青霞", 20);
        Student s6 = new Student("范冰冰", 22);

        // 添加元素
        hs.add(s1);
        hs.add(s2);
        hs.add(s3);
        hs.add(s4);
        hs.add(s5);
        hs.add(s6);

        //遍历集合
        for (Student s : hs) {
            System.out.println(s.getName() + "---" + s.getAge());
        }
    }
}

/*
G:\Java\jdk1.8.0_162\bin\java -Didea.launcher.port=7533 "-Didea.launcher.bin.path=G:\Java\IntelliJ IDEA 16\IntelliJ IDEA 2016.1\bin" -Dfile.encoding=UTF-8 -classpath "G:\Java\jdk1.8.0_162\jre\lib\charsets.jar;G:\Java\jdk1.8.0_162\jre\lib\deploy.jar;G:\Java\jdk1.8.0_162\jre\lib\ext\access-bridge-64.jar;G:\Java\jdk1.8.0_162\jre\lib\ext\cldrdata.jar;G:\Java\jdk1.8.0_162\jre\lib\ext\dnsns.jar;G:\Java\jdk1.8.0_162\jre\lib\ext\jaccess.jar;G:\Java\jdk1.8.0_162\jre\lib\ext\jfxrt.jar;G:\Java\jdk1.8.0_162\jre\lib\ext\localedata.jar;G:\Java\jdk1.8.0_162\jre\lib\ext\nashorn.jar;G:\Java\jdk1.8.0_162\jre\lib\ext\sunec.jar;G:\Java\jdk1.8.0_162\jre\lib\ext\sunjce_provider.jar;G:\Java\jdk1.8.0_162\jre\lib\ext\sunmscapi.jar;G:\Java\jdk1.8.0_162\jre\lib\ext\sunpkcs11.jar;G:\Java\jdk1.8.0_162\jre\lib\ext\zipfs.jar;G:\Java\jdk1.8.0_162\jre\lib\javaws.jar;G:\Java\jdk1.8.0_162\jre\lib\jce.jar;G:\Java\jdk1.8.0_162\jre\lib\jfr.jar;G:\Java\jdk1.8.0_162\jre\lib\jfxswt.jar;G:\Java\jdk1.8.0_162\jre\lib\jsse.jar;G:\Java\jdk1.8.0_162\jre\lib\management-agent.jar;G:\Java\jdk1.8.0_162\jre\lib\plugin.jar;G:\Java\jdk1.8.0_162\jre\lib\resources.jar;G:\Java\jdk1.8.0_162\jre\lib\rt.jar;G:\Java\IDEA_code\Day17\day17_Set_Son\out\production\day17_Set_Son;G:\Java\IntelliJ IDEA 16\IntelliJ IDEA 2016.1\lib\idea_rt.jar" com.intellij.rt.execution.application.AppMain jejune2.HashSetDemo2
林青霞---20
柳岩---22
林青霞---27
范冰冰---22
王祖贤---30

Process finished with exit code 0

 */