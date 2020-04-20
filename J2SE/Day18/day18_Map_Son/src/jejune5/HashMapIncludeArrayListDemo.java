package jejune5;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.Set;

/**
 * Created by Jejune on 2018/8/7.
 */
/*
 *需求：
 *假设HashMap集合的元素是ArrayList。有3个。
 *每一个ArrayList集合的值是字符串。
 *元素我已经完成，请遍历。
 *结果：
 *		 三国演义
 *		 	吕布
 *		 	周瑜
 *		 笑傲江湖
 *		 	令狐冲
 *		 	林平之
 *		 神雕侠侣
 *		 	郭靖
 *		 	杨过
 */
public class HashMapIncludeArrayListDemo {
    public static void main(String[] args) {
        // 创建集合对象
        HashMap<String, ArrayList<String>> hm = new HashMap<String, ArrayList<String>>();

        // 创建元素集合1
        ArrayList<String> array1 = new ArrayList<String>();
        array1.add("吕布");
        array1.add("周瑜");
        hm.put("三国演义", array1);

        // 创建元素集合2
        ArrayList<String> array2 = new ArrayList<String>();
        array2.add("令狐冲");
        array2.add("林平之");
        hm.put("笑傲江湖", array2);

        // 创建元素集合3
        ArrayList<String> array3 = new ArrayList<String>();
        array3.add("郭靖");
        array3.add("杨过");
        hm.put("神雕侠侣", array3);

        //遍历
        Set<String> set = hm.keySet();
        for (String key : set) {
            System.out.println(key);
            ArrayList<String> arrayValue = hm.get(key);
            for (String value : arrayValue) {
                System.out.println("\t" + value);
            }
        }
    }
}

/*
G:\Java\jdk1.8.0_162\bin\java -Didea.launcher.port=7536 "-Didea.launcher.bin.path=G:\Java\IntelliJ IDEA 16\IntelliJ IDEA 2016.1\bin" -Dfile.encoding=UTF-8 -classpath "G:\Java\jdk1.8.0_162\jre\lib\charsets.jar;G:\Java\jdk1.8.0_162\jre\lib\deploy.jar;G:\Java\jdk1.8.0_162\jre\lib\ext\access-bridge-64.jar;G:\Java\jdk1.8.0_162\jre\lib\ext\cldrdata.jar;G:\Java\jdk1.8.0_162\jre\lib\ext\dnsns.jar;G:\Java\jdk1.8.0_162\jre\lib\ext\jaccess.jar;G:\Java\jdk1.8.0_162\jre\lib\ext\jfxrt.jar;G:\Java\jdk1.8.0_162\jre\lib\ext\localedata.jar;G:\Java\jdk1.8.0_162\jre\lib\ext\nashorn.jar;G:\Java\jdk1.8.0_162\jre\lib\ext\sunec.jar;G:\Java\jdk1.8.0_162\jre\lib\ext\sunjce_provider.jar;G:\Java\jdk1.8.0_162\jre\lib\ext\sunmscapi.jar;G:\Java\jdk1.8.0_162\jre\lib\ext\sunpkcs11.jar;G:\Java\jdk1.8.0_162\jre\lib\ext\zipfs.jar;G:\Java\jdk1.8.0_162\jre\lib\javaws.jar;G:\Java\jdk1.8.0_162\jre\lib\jce.jar;G:\Java\jdk1.8.0_162\jre\lib\jfr.jar;G:\Java\jdk1.8.0_162\jre\lib\jfxswt.jar;G:\Java\jdk1.8.0_162\jre\lib\jsse.jar;G:\Java\jdk1.8.0_162\jre\lib\management-agent.jar;G:\Java\jdk1.8.0_162\jre\lib\plugin.jar;G:\Java\jdk1.8.0_162\jre\lib\resources.jar;G:\Java\jdk1.8.0_162\jre\lib\rt.jar;G:\Java\IDEA_code\Day18\day18_Map_Son\out\production\day18_Map_Son;G:\Java\IntelliJ IDEA 16\IntelliJ IDEA 2016.1\lib\idea_rt.jar" com.intellij.rt.execution.application.AppMain jejune5.HashMapIncludeArrayListDemo
神雕侠侣
	郭靖
	杨过
三国演义
	吕布
	周瑜
笑傲江湖
	令狐冲
	林平之

Process finished with exit code 0


 */