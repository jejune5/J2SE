package jejune1;

import java.util.ArrayList;
import java.util.Iterator;

/**
 * Created by Jejune on 2018/7/25.
 */
public class ArrayListDemo2 {
    public static void main(String[] args) {
        //创建对象
        ArrayList array = new ArrayList();

        // 创建学生对象
        Student s1 = new Student("武松", 30);
        Student s2 = new Student("鲁智深", 40);
        Student s3 = new Student("林冲", 36);
        Student s4 = new Student("杨志", 38);

        // 添加元素
        array.add(s1);
        array.add(s2);
        array.add(s3);
        array.add(s4);

        //遍历
        Iterator it = array.iterator();
        while (it.hasNext()) {
            Student s = (Student) it.next();
            System.out.println(s.getName() + "----" + s.getAge());
        }
        System.out.println("------");

        for (int x = 0; x < array.size(); x++) {
            Student ss = (Student) array.get(x);
            System.out.println(ss.getName() + "----" + ss.getAge());
        }
    }
}


/*
G:\Java\jdk1.8.0_162\bin\java -Didea.launcher.port=7533 "-Didea.launcher.bin.path=G:\Java\IntelliJ IDEA 16\IntelliJ IDEA 2016.1\bin" -Dfile.encoding=UTF-8 -classpath "G:\Java\jdk1.8.0_162\jre\lib\charsets.jar;G:\Java\jdk1.8.0_162\jre\lib\deploy.jar;G:\Java\jdk1.8.0_162\jre\lib\ext\access-bridge-64.jar;G:\Java\jdk1.8.0_162\jre\lib\ext\cldrdata.jar;G:\Java\jdk1.8.0_162\jre\lib\ext\dnsns.jar;G:\Java\jdk1.8.0_162\jre\lib\ext\jaccess.jar;G:\Java\jdk1.8.0_162\jre\lib\ext\jfxrt.jar;G:\Java\jdk1.8.0_162\jre\lib\ext\localedata.jar;G:\Java\jdk1.8.0_162\jre\lib\ext\nashorn.jar;G:\Java\jdk1.8.0_162\jre\lib\ext\sunec.jar;G:\Java\jdk1.8.0_162\jre\lib\ext\sunjce_provider.jar;G:\Java\jdk1.8.0_162\jre\lib\ext\sunmscapi.jar;G:\Java\jdk1.8.0_162\jre\lib\ext\sunpkcs11.jar;G:\Java\jdk1.8.0_162\jre\lib\ext\zipfs.jar;G:\Java\jdk1.8.0_162\jre\lib\javaws.jar;G:\Java\jdk1.8.0_162\jre\lib\jce.jar;G:\Java\jdk1.8.0_162\jre\lib\jfr.jar;G:\Java\jdk1.8.0_162\jre\lib\jfxswt.jar;G:\Java\jdk1.8.0_162\jre\lib\jsse.jar;G:\Java\jdk1.8.0_162\jre\lib\management-agent.jar;G:\Java\jdk1.8.0_162\jre\lib\plugin.jar;G:\Java\jdk1.8.0_162\jre\lib\resources.jar;G:\Java\jdk1.8.0_162\jre\lib\rt.jar;G:\Java\IDEA_code\Day16\day16_List_Son\out\production\day16_List_Son;G:\Java\IntelliJ IDEA 16\IntelliJ IDEA 2016.1\lib\idea_rt.jar" com.intellij.rt.execution.application.AppMain jejune1.ArrayListDemo2
武松----30
鲁智深----40
林冲----36
杨志----38
------
武松----30
鲁智深----40
林冲----36
杨志----38

Process finished with exit code 0


 */