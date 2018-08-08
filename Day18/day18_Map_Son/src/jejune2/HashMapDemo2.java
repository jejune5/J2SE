package jejune2;

import java.util.HashMap;
import java.util.Set;

/**
 * Created by Jejune on 2018/8/7.
 */
/*
 * HashMap<Integer,String>
 * 键：Integer
 * 值：String
 */
public class HashMapDemo2 {
    public static void main(String[] args) {
        //创建集合对象
        HashMap<Integer, String> hm = new HashMap<Integer, String>();
        // 创建元素并添加元素
        // Integer i = new Integer(17);
        // Integer i = 17;
        // String s = "毛毛毛";
        // hm.put(i, s);

        hm.put(21, "茅敏敏");
        hm.put(22, "徐涛");
        hm.put(23, "范于");
        hm.put(25, "吴亦凡");

        // 下面的写法是八进制，但是不能出现8以上的单个数据
        // hm.put(003, "hello");
        // hm.put(006, "hello");
        // hm.put(007, "hello");
        // hm.put(008, "hello");

        //遍历
        Set<Integer> set = hm.keySet();
        for (Integer key : set) {
            String value = hm.get(key);
            System.out.println(key + "---" + value);
        }

        // 下面这种方式仅仅是集合的元素的字符串表示
        System.out.println("hm:" + hm);

    }
}

/*
G:\Java\jdk1.8.0_162\bin\java -Didea.launcher.port=7533 "-Didea.launcher.bin.path=G:\Java\IntelliJ IDEA 16\IntelliJ IDEA 2016.1\bin" -Dfile.encoding=UTF-8 -classpath "G:\Java\jdk1.8.0_162\jre\lib\charsets.jar;G:\Java\jdk1.8.0_162\jre\lib\deploy.jar;G:\Java\jdk1.8.0_162\jre\lib\ext\access-bridge-64.jar;G:\Java\jdk1.8.0_162\jre\lib\ext\cldrdata.jar;G:\Java\jdk1.8.0_162\jre\lib\ext\dnsns.jar;G:\Java\jdk1.8.0_162\jre\lib\ext\jaccess.jar;G:\Java\jdk1.8.0_162\jre\lib\ext\jfxrt.jar;G:\Java\jdk1.8.0_162\jre\lib\ext\localedata.jar;G:\Java\jdk1.8.0_162\jre\lib\ext\nashorn.jar;G:\Java\jdk1.8.0_162\jre\lib\ext\sunec.jar;G:\Java\jdk1.8.0_162\jre\lib\ext\sunjce_provider.jar;G:\Java\jdk1.8.0_162\jre\lib\ext\sunmscapi.jar;G:\Java\jdk1.8.0_162\jre\lib\ext\sunpkcs11.jar;G:\Java\jdk1.8.0_162\jre\lib\ext\zipfs.jar;G:\Java\jdk1.8.0_162\jre\lib\javaws.jar;G:\Java\jdk1.8.0_162\jre\lib\jce.jar;G:\Java\jdk1.8.0_162\jre\lib\jfr.jar;G:\Java\jdk1.8.0_162\jre\lib\jfxswt.jar;G:\Java\jdk1.8.0_162\jre\lib\jsse.jar;G:\Java\jdk1.8.0_162\jre\lib\management-agent.jar;G:\Java\jdk1.8.0_162\jre\lib\plugin.jar;G:\Java\jdk1.8.0_162\jre\lib\resources.jar;G:\Java\jdk1.8.0_162\jre\lib\rt.jar;G:\Java\IDEA_code\Day18\day18_Map_Son\out\production\day18_Map_Son;G:\Java\IntelliJ IDEA 16\IntelliJ IDEA 2016.1\lib\idea_rt.jar" com.intellij.rt.execution.application.AppMain jejune2.HashMapDemo2
21---茅敏敏
22---徐涛
23---范于
25---吴亦凡
hm:{21=茅敏敏, 22=徐涛, 23=范于, 25=吴亦凡}

Process finished with exit code 0

 */