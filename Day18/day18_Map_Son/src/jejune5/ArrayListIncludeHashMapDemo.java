package jejune5;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.Set;

/**
 * Created by Jejune on 2018/8/7.
 */
/*
/*
 ArrayList集合嵌套HashMap集合并遍历。
 需求：
 假设ArrayList集合的元素是HashMap。有3个。
 每一个HashMap集合的键和值都是字符串。
 元素我已经完成，请遍历。
 结果：
 周瑜---小乔
 吕布---貂蝉

 郭靖---黄蓉
 杨过---小龙女

 令狐冲---任盈盈
 林平之---岳灵珊
 */
public class ArrayListIncludeHashMapDemo {
    public static void main(String[] args) {
        // 创建集合对象
        ArrayList<HashMap<String, String>> array = new ArrayList<HashMap<String, String>>();

        // 创建元素1
        HashMap<String, String> hm1 = new HashMap<String, String>();
        hm1.put("周瑜", "小乔");
        hm1.put("吕布", "貂蝉");
        // 把元素添加到array里面
        array.add(hm1);

        // 创建元素1
        HashMap<String, String> hm2 = new HashMap<String, String>();
        hm2.put("郭靖", "黄蓉");
        hm2.put("杨过", "小龙女");
        // 把元素添加到array里面
        array.add(hm2);

        // 创建元素1
        HashMap<String, String> hm3 = new HashMap<String, String>();
        hm3.put("令狐冲", "任盈盈");
        hm3.put("林平之", "岳灵珊");
        // 把元素添加到array里面
        array.add(hm3);

        //遍历
        for (HashMap<String, String> hm : array) {
            Set<String> set = hm.keySet();
            for (String key : set) {
                String value = hm.get(key);
                System.out.println(key + "---" + value);
            }
        }
    }
}

/*
G:\Java\jdk1.8.0_162\bin\java -Didea.launcher.port=7532 "-Didea.launcher.bin.path=G:\Java\IntelliJ IDEA 16\IntelliJ IDEA 2016.1\bin" -Dfile.encoding=UTF-8 -classpath "G:\Java\jdk1.8.0_162\jre\lib\charsets.jar;G:\Java\jdk1.8.0_162\jre\lib\deploy.jar;G:\Java\jdk1.8.0_162\jre\lib\ext\access-bridge-64.jar;G:\Java\jdk1.8.0_162\jre\lib\ext\cldrdata.jar;G:\Java\jdk1.8.0_162\jre\lib\ext\dnsns.jar;G:\Java\jdk1.8.0_162\jre\lib\ext\jaccess.jar;G:\Java\jdk1.8.0_162\jre\lib\ext\jfxrt.jar;G:\Java\jdk1.8.0_162\jre\lib\ext\localedata.jar;G:\Java\jdk1.8.0_162\jre\lib\ext\nashorn.jar;G:\Java\jdk1.8.0_162\jre\lib\ext\sunec.jar;G:\Java\jdk1.8.0_162\jre\lib\ext\sunjce_provider.jar;G:\Java\jdk1.8.0_162\jre\lib\ext\sunmscapi.jar;G:\Java\jdk1.8.0_162\jre\lib\ext\sunpkcs11.jar;G:\Java\jdk1.8.0_162\jre\lib\ext\zipfs.jar;G:\Java\jdk1.8.0_162\jre\lib\javaws.jar;G:\Java\jdk1.8.0_162\jre\lib\jce.jar;G:\Java\jdk1.8.0_162\jre\lib\jfr.jar;G:\Java\jdk1.8.0_162\jre\lib\jfxswt.jar;G:\Java\jdk1.8.0_162\jre\lib\jsse.jar;G:\Java\jdk1.8.0_162\jre\lib\management-agent.jar;G:\Java\jdk1.8.0_162\jre\lib\plugin.jar;G:\Java\jdk1.8.0_162\jre\lib\resources.jar;G:\Java\jdk1.8.0_162\jre\lib\rt.jar;G:\Java\IDEA_code\Day18\day18_Map_Son\out\production\day18_Map_Son;G:\Java\IntelliJ IDEA 16\IntelliJ IDEA 2016.1\lib\idea_rt.jar" com.intellij.rt.execution.application.AppMain jejune5.ArrayListIncludeHashMapDemo
吕布---貂蝉
周瑜---小乔
杨过---小龙女
郭靖---黄蓉
令狐冲---任盈盈
林平之---岳灵珊

Process finished with exit code 0

 */