package jejune4;

import java.util.ArrayList;
import java.util.Iterator;

/**
 * Created by Jejune on 2018/7/26.
 */
public class ArrayListDemo3 {
    public static void main(String[] args) {
        //创建集合对象
        ArrayList array = new ArrayList<>();

        // 创建学生对象
        Student s1 = new Student("林青霞", 27);
        Student s2 = new Student("林志玲", 40);
        Student s3 = new Student("凤姐", 35);
        Student s4 = new Student("芙蓉姐姐", 18);
        Student s5 = new Student("翠花", 16);
        Student s6 = new Student("林青霞", 27);
        Student s7 = new Student("林青霞", 18);

        // 添加元素
        array.add(s1);
        array.add(s2);
        array.add(s3);
        array.add(s4);
        array.add(s5);
        array.add(s6);
        array.add(s7);

        // 创建新集合
        ArrayList newArray = new ArrayList();

        // 遍历旧集合,获取得到每一个元素
        Iterator it = array.iterator();
        while (it.hasNext()) {
            Student s = (Student) it.next();

            // 拿这个元素到新集合去找，看有没有
            if (!newArray.contains(s)) {
                newArray.add(s);
            }
        }


        //遍历集合
        for (int x = 0; x < newArray.size(); x++) {
            Student s = (Student) newArray.get(x);
            System.out.println(s.getName() + "----" + s.getAge());
        }
    }
}

/*
G:\Java\jdk1.8.0_162\bin\java -Didea.launcher.port=7533 "-Didea.launcher.bin.path=G:\Java\IntelliJ IDEA 16\IntelliJ IDEA 2016.1\bin" -Dfile.encoding=UTF-8 -classpath "G:\Java\jdk1.8.0_162\jre\lib\charsets.jar;G:\Java\jdk1.8.0_162\jre\lib\deploy.jar;G:\Java\jdk1.8.0_162\jre\lib\ext\access-bridge-64.jar;G:\Java\jdk1.8.0_162\jre\lib\ext\cldrdata.jar;G:\Java\jdk1.8.0_162\jre\lib\ext\dnsns.jar;G:\Java\jdk1.8.0_162\jre\lib\ext\jaccess.jar;G:\Java\jdk1.8.0_162\jre\lib\ext\jfxrt.jar;G:\Java\jdk1.8.0_162\jre\lib\ext\localedata.jar;G:\Java\jdk1.8.0_162\jre\lib\ext\nashorn.jar;G:\Java\jdk1.8.0_162\jre\lib\ext\sunec.jar;G:\Java\jdk1.8.0_162\jre\lib\ext\sunjce_provider.jar;G:\Java\jdk1.8.0_162\jre\lib\ext\sunmscapi.jar;G:\Java\jdk1.8.0_162\jre\lib\ext\sunpkcs11.jar;G:\Java\jdk1.8.0_162\jre\lib\ext\zipfs.jar;G:\Java\jdk1.8.0_162\jre\lib\javaws.jar;G:\Java\jdk1.8.0_162\jre\lib\jce.jar;G:\Java\jdk1.8.0_162\jre\lib\jfr.jar;G:\Java\jdk1.8.0_162\jre\lib\jfxswt.jar;G:\Java\jdk1.8.0_162\jre\lib\jsse.jar;G:\Java\jdk1.8.0_162\jre\lib\management-agent.jar;G:\Java\jdk1.8.0_162\jre\lib\plugin.jar;G:\Java\jdk1.8.0_162\jre\lib\resources.jar;G:\Java\jdk1.8.0_162\jre\lib\rt.jar;G:\Java\IDEA_code\Day16\day16_List_Son\out\production\day16_List_Son;G:\Java\IntelliJ IDEA 16\IntelliJ IDEA 2016.1\lib\idea_rt.jar" com.intellij.rt.execution.application.AppMain jejune4.ArrayListDemo3
林青霞----27
林志玲----40
凤姐----35
芙蓉姐姐----18
翠花----16
林青霞----18

Process finished with exit code 0

 */