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
 *
 * 思路：
 * 		A:获取所有结婚证的集合
 * 		B:遍历结婚证的集合，得到每一个结婚证
 * 		C:根据结婚证获取丈夫和妻子
 *
 * 转换：
 * 		A:获取所有键值对对象的集合
 * 		B:遍历键值对对象的集合，得到每一个键值对对象
 * 		C:根据键值对对象获取键和值
 *
 * 这里面最麻烦的就是键值对对象如何表示呢?
 * 看看我们开始的一个方法：
 * 		Set<Map.Entry<K,V>> entrySet()：返回的是键值对对象的集合
 */
public class MapDemo4 {
    public static void main(String[] args) {
        //创建集合对象
        Map<String, String> map = new HashMap<String, String>();

        //添加元素
        map.put("sb", "Mao");
        map.put("hr", "Wu");
        map.put("sg", "Xu");
        map.put("lj", "Fan");

        //获取所有键值对对象的集合
        Set<Map.Entry<String, String>> set = map.entrySet();
        for (Map.Entry<String, String> me : set) {
            // 根据键值对对象获取键和值
            String key = me.getKey();
            String value = me.getValue();
            System.out.println(key + "---" + value);
        }
    }
}

/*
G:\Java\jdk1.8.0_162\bin\java -Didea.launcher.port=7532 "-Didea.launcher.bin.path=G:\Java\IntelliJ IDEA 16\IntelliJ IDEA 2016.1\bin" -Dfile.encoding=UTF-8 -classpath "G:\Java\jdk1.8.0_162\jre\lib\charsets.jar;G:\Java\jdk1.8.0_162\jre\lib\deploy.jar;G:\Java\jdk1.8.0_162\jre\lib\ext\access-bridge-64.jar;G:\Java\jdk1.8.0_162\jre\lib\ext\cldrdata.jar;G:\Java\jdk1.8.0_162\jre\lib\ext\dnsns.jar;G:\Java\jdk1.8.0_162\jre\lib\ext\jaccess.jar;G:\Java\jdk1.8.0_162\jre\lib\ext\jfxrt.jar;G:\Java\jdk1.8.0_162\jre\lib\ext\localedata.jar;G:\Java\jdk1.8.0_162\jre\lib\ext\nashorn.jar;G:\Java\jdk1.8.0_162\jre\lib\ext\sunec.jar;G:\Java\jdk1.8.0_162\jre\lib\ext\sunjce_provider.jar;G:\Java\jdk1.8.0_162\jre\lib\ext\sunmscapi.jar;G:\Java\jdk1.8.0_162\jre\lib\ext\sunpkcs11.jar;G:\Java\jdk1.8.0_162\jre\lib\ext\zipfs.jar;G:\Java\jdk1.8.0_162\jre\lib\javaws.jar;G:\Java\jdk1.8.0_162\jre\lib\jce.jar;G:\Java\jdk1.8.0_162\jre\lib\jfr.jar;G:\Java\jdk1.8.0_162\jre\lib\jfxswt.jar;G:\Java\jdk1.8.0_162\jre\lib\jsse.jar;G:\Java\jdk1.8.0_162\jre\lib\management-agent.jar;G:\Java\jdk1.8.0_162\jre\lib\plugin.jar;G:\Java\jdk1.8.0_162\jre\lib\resources.jar;G:\Java\jdk1.8.0_162\jre\lib\rt.jar;G:\Java\IDEA_code\Day18\day18_Map_Son\out\production\day18_Map_Son;G:\Java\IntelliJ IDEA 16\IntelliJ IDEA 2016.1\lib\idea_rt.jar" com.intellij.rt.execution.application.AppMain jejune1.MapDemo4
sg---Xu
hr---Wu
lj---Fan
sb---Mao

Process finished with exit code 0

 */