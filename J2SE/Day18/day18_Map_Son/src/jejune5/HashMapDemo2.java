package jejune5;

import java.util.HashMap;
import java.util.Set;

/**
 * Created by Jejune on 2018/8/7.
 */
/*
 * HashMap嵌套HashMap
 *
 * DQXY
 * 		DQ	电气
 * 				徐笑笑		23
 * 				张成		22
 * 		ZDH	自动化
 * 				毛毛毛		21
 * 				徐涛		23
 *
 * 先存储元素，然后遍历元素
 */
public class HashMapDemo2 {
    public static void main(String[] args) {
        //创建集合对象
        HashMap<String, HashMap<String, Integer>> DQXY = new HashMap<String, HashMap<String, Integer>>();

        //创建电气集合对象
        HashMap<String, Integer> DQMap = new HashMap<String, Integer>();

        //添加元素
        DQMap.put("徐笑笑", 23);
        DQMap.put("张成", 22);

        //把电气专业添加到电气学院
        DQXY.put("电气", DQMap);

        //创建自动化集合对象
        HashMap<String, Integer> ZDHMap = new HashMap<String, Integer>();

        //添加元素
        ZDHMap.put("毛毛毛", 21);
        ZDHMap.put("徐涛", 22);

        //把自动化专业添加到电气学院
        DQXY.put("自动化", ZDHMap);

        //遍历
        Set<String> DQXYset = DQXY.keySet();
        for (String DQXYKey : DQXYset) {
            System.out.println(DQXYKey);
            HashMap<String, Integer> DQXYValue = DQXY.get(DQXYKey);
            Set<String> DQXYValueKeyset = DQXYValue.keySet();
            for (String DQXYValuekey : DQXYValueKeyset) {
                System.out.println(DQXYValuekey + "---" + DQXYValue.get(DQXYValuekey));
            }
        }
    }
}

/*
G:\Java\jdk1.8.0_162\bin\java -Didea.launcher.port=7534 "-Didea.launcher.bin.path=G:\Java\IntelliJ IDEA 16\IntelliJ IDEA 2016.1\bin" -Dfile.encoding=UTF-8 -classpath "G:\Java\jdk1.8.0_162\jre\lib\charsets.jar;G:\Java\jdk1.8.0_162\jre\lib\deploy.jar;G:\Java\jdk1.8.0_162\jre\lib\ext\access-bridge-64.jar;G:\Java\jdk1.8.0_162\jre\lib\ext\cldrdata.jar;G:\Java\jdk1.8.0_162\jre\lib\ext\dnsns.jar;G:\Java\jdk1.8.0_162\jre\lib\ext\jaccess.jar;G:\Java\jdk1.8.0_162\jre\lib\ext\jfxrt.jar;G:\Java\jdk1.8.0_162\jre\lib\ext\localedata.jar;G:\Java\jdk1.8.0_162\jre\lib\ext\nashorn.jar;G:\Java\jdk1.8.0_162\jre\lib\ext\sunec.jar;G:\Java\jdk1.8.0_162\jre\lib\ext\sunjce_provider.jar;G:\Java\jdk1.8.0_162\jre\lib\ext\sunmscapi.jar;G:\Java\jdk1.8.0_162\jre\lib\ext\sunpkcs11.jar;G:\Java\jdk1.8.0_162\jre\lib\ext\zipfs.jar;G:\Java\jdk1.8.0_162\jre\lib\javaws.jar;G:\Java\jdk1.8.0_162\jre\lib\jce.jar;G:\Java\jdk1.8.0_162\jre\lib\jfr.jar;G:\Java\jdk1.8.0_162\jre\lib\jfxswt.jar;G:\Java\jdk1.8.0_162\jre\lib\jsse.jar;G:\Java\jdk1.8.0_162\jre\lib\management-agent.jar;G:\Java\jdk1.8.0_162\jre\lib\plugin.jar;G:\Java\jdk1.8.0_162\jre\lib\resources.jar;G:\Java\jdk1.8.0_162\jre\lib\rt.jar;G:\Java\IDEA_code\Day18\day18_Map_Son\out\production\day18_Map_Son;G:\Java\IntelliJ IDEA 16\IntelliJ IDEA 2016.1\lib\idea_rt.jar" com.intellij.rt.execution.application.AppMain jejune5.HashMapDemo2
电气
徐笑笑---23
张成---22
自动化
徐涛---22
毛毛毛---21

Process finished with exit code 0


 */