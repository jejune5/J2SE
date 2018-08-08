package jejune1;

import java.util.ArrayList;
import java.util.Iterator;

/**
 * Created by Jejune on 2018/7/24.
 */

/*
 * 需求：ArrayList存储自定义对象并遍历。要求加入泛型，并用增强for遍历。
 * A:迭代器
 * B:普通for
 * C:增强for
 *
 * LinkedList,Vector,Colleciton,List等存储我还讲吗?不讲解了，但是要求你们练习。
 *
 * 增强for是用来替迭代器。
 */
public class ArrayListDemo2 {
    public static void main(String[] args) {
        // 创建集合对象
        ArrayList<Student> array = new ArrayList<Student>();

        // 创建学生对象
        Student s1 = new Student("林青霞", 27);
        Student s2 = new Student("貂蝉", 22);
        Student s3 = new Student("杨玉环", 24);
        Student s4 = new Student("西施", 21);
        Student s5 = new Student("王昭君", 23);

        // 把学生对象添加到集合中
        array.add(s1);
        array.add(s2);
        array.add(s3);
        array.add(s4);
        array.add(s5);

        //遍历--迭代器
        Iterator it = array.iterator();
        while (it.hasNext()) {
            Student ss = (Student) it.next();
            System.out.println(ss.getName() + "---" + ss.getAge());
        }
        System.out.println("---");

        //普通for
        for (int x = 0; x < array.size(); x++) {
            Student ss2 = array.get(x);
            System.out.println(ss2.getName() + "---" + ss2.getAge());
        }
        System.out.println("----");

        //增强for
        for (Student ss3 : array) {
            System.out.println(ss3.getName() + "---" + ss3.getAge());
        }
    }
}

/*
G:\Java\jdk1.8.0_162\bin\java -Didea.launcher.port=7533 "-Didea.launcher.bin.path=G:\Java\IntelliJ IDEA 16\IntelliJ IDEA 2016.1\bin" -Dfile.encoding=UTF-8 -classpath "G:\Java\jdk1.8.0_162\jre\lib\charsets.jar;G:\Java\jdk1.8.0_162\jre\lib\deploy.jar;G:\Java\jdk1.8.0_162\jre\lib\ext\access-bridge-64.jar;G:\Java\jdk1.8.0_162\jre\lib\ext\cldrdata.jar;G:\Java\jdk1.8.0_162\jre\lib\ext\dnsns.jar;G:\Java\jdk1.8.0_162\jre\lib\ext\jaccess.jar;G:\Java\jdk1.8.0_162\jre\lib\ext\jfxrt.jar;G:\Java\jdk1.8.0_162\jre\lib\ext\localedata.jar;G:\Java\jdk1.8.0_162\jre\lib\ext\nashorn.jar;G:\Java\jdk1.8.0_162\jre\lib\ext\sunec.jar;G:\Java\jdk1.8.0_162\jre\lib\ext\sunjce_provider.jar;G:\Java\jdk1.8.0_162\jre\lib\ext\sunmscapi.jar;G:\Java\jdk1.8.0_162\jre\lib\ext\sunpkcs11.jar;G:\Java\jdk1.8.0_162\jre\lib\ext\zipfs.jar;G:\Java\jdk1.8.0_162\jre\lib\javaws.jar;G:\Java\jdk1.8.0_162\jre\lib\jce.jar;G:\Java\jdk1.8.0_162\jre\lib\jfr.jar;G:\Java\jdk1.8.0_162\jre\lib\jfxswt.jar;G:\Java\jdk1.8.0_162\jre\lib\jsse.jar;G:\Java\jdk1.8.0_162\jre\lib\management-agent.jar;G:\Java\jdk1.8.0_162\jre\lib\plugin.jar;G:\Java\jdk1.8.0_162\jre\lib\resources.jar;G:\Java\jdk1.8.0_162\jre\lib\rt.jar;G:\Java\IDEA_code\Day16\day16_JDK5News\out\production\day16_JDK5News;G:\Java\IntelliJ IDEA 16\IntelliJ IDEA 2016.1\lib\idea_rt.jar" com.intellij.rt.execution.application.AppMain jejune1.ArrayListDemo2
林青霞---27
貂蝉---22
杨玉环---24
西施---21
王昭君---23
---
林青霞---27
貂蝉---22
杨玉环---24
西施---21
王昭君---23
----
林青霞---27
貂蝉---22
杨玉环---24
西施---21
王昭君---23

Process finished with exit code 0

 */