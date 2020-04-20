package jejune2;

import java.util.HashMap;
import java.util.Set;

/**
 * Created by Jejune on 2018/8/7.
 */
/*
 * HashMap:是基于哈希表的Map接口实现。
 * 哈希表的作用是用来保证键的唯一性的。
 *
 * HashMap<String,String>
 * 键：String
 * 值：String
 */
public class HashMapDemo {
    public static void main(String[] args) {
        // 创建集合对象
        HashMap<String, String> hm = new HashMap<String, String>();

        // 创建元素并添加元素
        // String key1 = "it001";
        // String value1 = "马云";
        // hm.put(key1, value1);

        hm.put("001", "马云");
        hm.put("003", "马化腾");
        hm.put("004", "丁磊");
        hm.put("005", "张朝阳");
        hm.put("002", "雷军");
        hm.put("001", "李彦宏");

        //遍历
        Set<String> set = hm.keySet();
        for (String key : set) {
            String value = hm.get(key);
            System.out.println(key + "---" + value);
        }
    }
}

/*
G:\Java\jdk1.8.0_162\bin\java -Didea.launcher.port=7532 "-Didea.launcher.bin.path=G:\Java\IntelliJ IDEA 16\IntelliJ IDEA 2016.1\bin" -Dfile.encoding=UTF-8 -classpath "G:\Java\jdk1.8.0_162\jre\lib\charsets.jar;G:\Java\jdk1.8.0_162\jre\lib\deploy.jar;G:\Java\jdk1.8.0_162\jre\lib\ext\access-bridge-64.jar;G:\Java\jdk1.8.0_162\jre\lib\ext\cldrdata.jar;G:\Java\jdk1.8.0_162\jre\lib\ext\dnsns.jar;G:\Java\jdk1.8.0_162\jre\lib\ext\jaccess.jar;G:\Java\jdk1.8.0_162\jre\lib\ext\jfxrt.jar;G:\Java\jdk1.8.0_162\jre\lib\ext\localedata.jar;G:\Java\jdk1.8.0_162\jre\lib\ext\nashorn.jar;G:\Java\jdk1.8.0_162\jre\lib\ext\sunec.jar;G:\Java\jdk1.8.0_162\jre\lib\ext\sunjce_provider.jar;G:\Java\jdk1.8.0_162\jre\lib\ext\sunmscapi.jar;G:\Java\jdk1.8.0_162\jre\lib\ext\sunpkcs11.jar;G:\Java\jdk1.8.0_162\jre\lib\ext\zipfs.jar;G:\Java\jdk1.8.0_162\jre\lib\javaws.jar;G:\Java\jdk1.8.0_162\jre\lib\jce.jar;G:\Java\jdk1.8.0_162\jre\lib\jfr.jar;G:\Java\jdk1.8.0_162\jre\lib\jfxswt.jar;G:\Java\jdk1.8.0_162\jre\lib\jsse.jar;G:\Java\jdk1.8.0_162\jre\lib\management-agent.jar;G:\Java\jdk1.8.0_162\jre\lib\plugin.jar;G:\Java\jdk1.8.0_162\jre\lib\resources.jar;G:\Java\jdk1.8.0_162\jre\lib\rt.jar;G:\Java\IDEA_code\Day18\day18_Map_Son\out\production\day18_Map_Son;G:\Java\IntelliJ IDEA 16\IntelliJ IDEA 2016.1\lib\idea_rt.jar" com.intellij.rt.execution.application.AppMain jejune2.HashMapDemo
001---李彦宏
002---雷军
003---马化腾
004---丁磊
005---张朝阳

Process finished with exit code 0

 */