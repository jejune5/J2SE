package jejune3;

import java.util.ArrayList;
import java.util.List;

/**
 * Created by Jejune on 2018/7/24.
 */
/*
 * List集合的特有遍历功能：
 * 		size()和get()方法结合使用
 */
public class ListDemo2 {
    public static void main(String[] args) {
        List list = new ArrayList<>();

        //添加元素
        list.add("Hello");
        list.add("茅敏敏");
        list.add("大傻逼");

        // Object get(int index):获取指定位置的元素
        // System.out.println(list.get(0));
        // System.out.println(list.get(1));
        // System.out.println(list.get(2));
        // IndexOutOfBoundsException
        // System.out.println(list.get(3));

        // 用循环改进
        // for (int x = 0; x < 3; x++) {
        // System.out.println(list.get(x));
        // }
        // 如果元素过多，数起来就比较麻烦，所以我们使用集合的一个长度功能：size()
        // 最终的遍历方式就是：size()和get()
        for (int x = 0; x < list.size(); x++) {
            String s = (String) list.get(x);
            System.out.println(s);
        }
    }
}

/*
G:\Java\jdk1.8.0_162\bin\java -Didea.launcher.port=7532 "-Didea.launcher.bin.path=G:\Java\IntelliJ IDEA 16\IntelliJ IDEA 2016.1\bin" -Dfile.encoding=UTF-8 -classpath "G:\Java\jdk1.8.0_162\jre\lib\charsets.jar;G:\Java\jdk1.8.0_162\jre\lib\deploy.jar;G:\Java\jdk1.8.0_162\jre\lib\ext\access-bridge-64.jar;G:\Java\jdk1.8.0_162\jre\lib\ext\cldrdata.jar;G:\Java\jdk1.8.0_162\jre\lib\ext\dnsns.jar;G:\Java\jdk1.8.0_162\jre\lib\ext\jaccess.jar;G:\Java\jdk1.8.0_162\jre\lib\ext\jfxrt.jar;G:\Java\jdk1.8.0_162\jre\lib\ext\localedata.jar;G:\Java\jdk1.8.0_162\jre\lib\ext\nashorn.jar;G:\Java\jdk1.8.0_162\jre\lib\ext\sunec.jar;G:\Java\jdk1.8.0_162\jre\lib\ext\sunjce_provider.jar;G:\Java\jdk1.8.0_162\jre\lib\ext\sunmscapi.jar;G:\Java\jdk1.8.0_162\jre\lib\ext\sunpkcs11.jar;G:\Java\jdk1.8.0_162\jre\lib\ext\zipfs.jar;G:\Java\jdk1.8.0_162\jre\lib\javaws.jar;G:\Java\jdk1.8.0_162\jre\lib\jce.jar;G:\Java\jdk1.8.0_162\jre\lib\jfr.jar;G:\Java\jdk1.8.0_162\jre\lib\jfxswt.jar;G:\Java\jdk1.8.0_162\jre\lib\jsse.jar;G:\Java\jdk1.8.0_162\jre\lib\management-agent.jar;G:\Java\jdk1.8.0_162\jre\lib\plugin.jar;G:\Java\jdk1.8.0_162\jre\lib\resources.jar;G:\Java\jdk1.8.0_162\jre\lib\rt.jar;G:\Java\IDEA_code\Day15\day15_List\out\production\day15_List;G:\Java\IntelliJ IDEA 16\IntelliJ IDEA 2016.1\lib\idea_rt.jar" com.intellij.rt.execution.application.AppMain jejune3.ListDemo2
Hello
茅敏敏
大傻逼

Process finished with exit code 0

 */