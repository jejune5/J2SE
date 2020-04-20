package jejune3;

import java.util.HashSet;

/**
 * Created by Jejune on 2018/7/30.
 */
/*
 * HashSet集合存储自定义对象并遍历。如果对象的成员变量值相同即为同一个对象
 *
 * 注意了：
 * 		你使用的是HashSet集合，这个集合的底层是哈希表结构。
 * 		而哈希表结构底层依赖:hashCode()和equals()方法。
 * 		如果你认为对象的成员变量值相同即为同一个对象的话，你就应该重写这两个方法。
 * 		如何重写呢?不同担心，自动生成即可。
 */
public class DogDemo {
    public static void main(String[] args) {
        //创建集合对象
        HashSet<Dog> hs = new HashSet<Dog>();

        // 创建狗对象
        Dog d1 = new Dog("秦桧", 25, "红色", '男');
        Dog d2 = new Dog("高俅", 22, "黑色", '女');
        Dog d3 = new Dog("秦桧", 25, "红色", '男');
        Dog d4 = new Dog("秦桧", 20, "红色", '女');
        Dog d5 = new Dog("魏忠贤", 28, "白色", '男');
        Dog d6 = new Dog("李莲英", 23, "黄色", '女');
        Dog d7 = new Dog("李莲英", 23, "黄色", '女');
        Dog d8 = new Dog("李莲英", 23, "黄色", '男');

        // 添加元素
        hs.add(d1);
        hs.add(d2);
        hs.add(d3);
        hs.add(d4);
        hs.add(d5);
        hs.add(d6);
        hs.add(d7);
        hs.add(d8);

        //遍历
        for (Dog d : hs) {
            System.out.println(d.getName() + "---" + d.getAge() + "---" + d.getColor() + "---" + d.getSex());
        }
    }
}

/*
G:\Java\jdk1.8.0_162\bin\java -Didea.launcher.port=7532 "-Didea.launcher.bin.path=G:\Java\IntelliJ IDEA 16\IntelliJ IDEA 2016.1\bin" -Dfile.encoding=UTF-8 -classpath "G:\Java\jdk1.8.0_162\jre\lib\charsets.jar;G:\Java\jdk1.8.0_162\jre\lib\deploy.jar;G:\Java\jdk1.8.0_162\jre\lib\ext\access-bridge-64.jar;G:\Java\jdk1.8.0_162\jre\lib\ext\cldrdata.jar;G:\Java\jdk1.8.0_162\jre\lib\ext\dnsns.jar;G:\Java\jdk1.8.0_162\jre\lib\ext\jaccess.jar;G:\Java\jdk1.8.0_162\jre\lib\ext\jfxrt.jar;G:\Java\jdk1.8.0_162\jre\lib\ext\localedata.jar;G:\Java\jdk1.8.0_162\jre\lib\ext\nashorn.jar;G:\Java\jdk1.8.0_162\jre\lib\ext\sunec.jar;G:\Java\jdk1.8.0_162\jre\lib\ext\sunjce_provider.jar;G:\Java\jdk1.8.0_162\jre\lib\ext\sunmscapi.jar;G:\Java\jdk1.8.0_162\jre\lib\ext\sunpkcs11.jar;G:\Java\jdk1.8.0_162\jre\lib\ext\zipfs.jar;G:\Java\jdk1.8.0_162\jre\lib\javaws.jar;G:\Java\jdk1.8.0_162\jre\lib\jce.jar;G:\Java\jdk1.8.0_162\jre\lib\jfr.jar;G:\Java\jdk1.8.0_162\jre\lib\jfxswt.jar;G:\Java\jdk1.8.0_162\jre\lib\jsse.jar;G:\Java\jdk1.8.0_162\jre\lib\management-agent.jar;G:\Java\jdk1.8.0_162\jre\lib\plugin.jar;G:\Java\jdk1.8.0_162\jre\lib\resources.jar;G:\Java\jdk1.8.0_162\jre\lib\rt.jar;G:\Java\IDEA_code\Day17\day17_Set_Son\out\production\day17_Set_Son;G:\Java\IntelliJ IDEA 16\IntelliJ IDEA 2016.1\lib\idea_rt.jar" com.intellij.rt.execution.application.AppMain jejune3.DogDemo
秦桧---20---红色---女
李莲英---23---黄色---女
魏忠贤---28---白色---男
高俅---22---黑色---女
秦桧---25---红色---男
李莲英---23---黄色---男

Process finished with exit code 0

 */