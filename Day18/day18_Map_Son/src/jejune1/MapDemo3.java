package jejune1;

import java.util.HashMap;
import java.util.Map;
import java.util.Set;

/**
 * Created by Jejune on 2018/8/6.
 */
/*
 * Map集合的遍历。
 * Map -- 夫妻对
 * 思路：
 * 		A:把所有的丈夫给集中起来。
 * 		B:遍历丈夫的集合，获取得到每一个丈夫。
 * 		C:让丈夫去找自己的妻子。
 *
 * 转换：
 * 		A:获取所有的键
 * 		B:遍历键的集合，获取得到每一个键
 * 		C:根据键去找值
 */
public class MapDemo3 {
    public static void main(String[] args) {
        //创建集合对象
        Map<String, String> map = new HashMap<String, String>();

        //添加元素
        map.put("sb", "Mao");
        map.put("hr", "Wu");
        map.put("sg", "Xu");
        map.put("lj", "Fan");

        //遍历
        //获取所有的键
        Set<String> set = map.keySet();
        // 遍历键的集合，获取得到每一个键
        for (String key : set) {
            String value = map.get(key);
            System.out.println(key + "---" + value);
        }
    }
}
/*
G:\Java\jdk1.8.0_162\bin\java -Didea.launcher.port=7534 "-Didea.launcher.bin.path=G:\Java\IntelliJ IDEA 16\IntelliJ IDEA 2016.1\bin" -Dfile.encoding=UTF-8 -classpath "G:\Java\jdk1.8.0_162\jre\lib\charsets.jar;G:\Java\jdk1.8.0_162\jre\lib\deploy.jar;G:\Java\jdk1.8.0_162\jre\lib\ext\access-bridge-64.jar;G:\Java\jdk1.8.0_162\jre\lib\ext\cldrdata.jar;G:\Java\jdk1.8.0_162\jre\lib\ext\dnsns.jar;G:\Java\jdk1.8.0_162\jre\lib\ext\jaccess.jar;G:\Java\jdk1.8.0_162\jre\lib\ext\jfxrt.jar;G:\Java\jdk1.8.0_162\jre\lib\ext\localedata.jar;G:\Java\jdk1.8.0_162\jre\lib\ext\nashorn.jar;G:\Java\jdk1.8.0_162\jre\lib\ext\sunec.jar;G:\Java\jdk1.8.0_162\jre\lib\ext\sunjce_provider.jar;G:\Java\jdk1.8.0_162\jre\lib\ext\sunmscapi.jar;G:\Java\jdk1.8.0_162\jre\lib\ext\sunpkcs11.jar;G:\Java\jdk1.8.0_162\jre\lib\ext\zipfs.jar;G:\Java\jdk1.8.0_162\jre\lib\javaws.jar;G:\Java\jdk1.8.0_162\jre\lib\jce.jar;G:\Java\jdk1.8.0_162\jre\lib\jfr.jar;G:\Java\jdk1.8.0_162\jre\lib\jfxswt.jar;G:\Java\jdk1.8.0_162\jre\lib\jsse.jar;G:\Java\jdk1.8.0_162\jre\lib\management-agent.jar;G:\Java\jdk1.8.0_162\jre\lib\plugin.jar;G:\Java\jdk1.8.0_162\jre\lib\resources.jar;G:\Java\jdk1.8.0_162\jre\lib\rt.jar;G:\Java\IDEA_code\Day18\day18_Map_Son\out\production\day18_Map_Son;G:\Java\IntelliJ IDEA 16\IntelliJ IDEA 2016.1\lib\idea_rt.jar" com.intellij.rt.execution.application.AppMain jejune1.MapDemo3
sg---Xu
hr---Wu
lj---Fan
sb---Mao

Process finished with exit code 0

 */