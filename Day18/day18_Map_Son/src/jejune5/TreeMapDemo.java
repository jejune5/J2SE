package jejune5;

import java.util.HashSet;
import java.util.Scanner;
import java.util.Set;
import java.util.TreeMap;

/**
 * Created by Jejune on 2018/8/7.
 */
/*
 * 需求 ："aababcabcdabcde",获取字符串中每一个字母出现的次数要求结果:a(5)b(4)c(3)d(2)e(1)
 *
 * 分析：
 * 		A:定义一个字符串(可以改进为键盘录入)
 * 		B:定义一个TreeMap集合
 * 			键:Character
 * 			值：Integer
 * 		C:把字符串转换为字符数组
 * 		D:遍历字符数组，得到每一个字符
 * 		E:拿刚才得到的字符作为键到集合中去找值，看返回值
 * 			是null:说明该键不存在，就把该字符作为键，1作为值存储
 * 			不是null:说明该键存在，就把值加1，然后重写存储该键和值
 * 		F:定义字符串缓冲区变量
 * 		G:遍历集合，得到键和值，进行按照要求拼接
 * 		H:把字符串缓冲区转换为字符串输出
 *
 * 录入：linqingxia
 * 结果：result:a(1)g(1)i(3)l(1)n(2)q(1)x(1)
 */
public class TreeMapDemo {
    public static void main(String[] args) {
        //A
        Scanner sc = new Scanner(System.in);
        System.out.println("请输入一个字符串：");
        String line = sc.nextLine();

        //B
        TreeMap<Character, Integer> tm = new TreeMap<Character, Integer>();

        //C
        char[] chs = line.toCharArray();

        //D
        for (char ch : chs) {
            //E
            Integer i = tm.get(ch);

            if (i == null) {
                tm.put(ch, 1);
            } else {
                i++;
                tm.put(ch, i);
            }
        }
        //F
        StringBuilder sb = new StringBuilder();

        //G
        Set<Character> set = tm.keySet();
        for (Character key : set) {
            Integer value = tm.get(key);
            sb.append(key).append("(").append(value).append(")");
        }
        //H
        String result = sb.toString();
        System.out.println("Result:" + result);

    }
}

/*
G:\Java\jdk1.8.0_162\bin\java -Didea.launcher.port=7532 "-Didea.launcher.bin.path=G:\Java\IntelliJ IDEA 16\IntelliJ IDEA 2016.1\bin" -Dfile.encoding=UTF-8 -classpath "G:\Java\jdk1.8.0_162\jre\lib\charsets.jar;G:\Java\jdk1.8.0_162\jre\lib\deploy.jar;G:\Java\jdk1.8.0_162\jre\lib\ext\access-bridge-64.jar;G:\Java\jdk1.8.0_162\jre\lib\ext\cldrdata.jar;G:\Java\jdk1.8.0_162\jre\lib\ext\dnsns.jar;G:\Java\jdk1.8.0_162\jre\lib\ext\jaccess.jar;G:\Java\jdk1.8.0_162\jre\lib\ext\jfxrt.jar;G:\Java\jdk1.8.0_162\jre\lib\ext\localedata.jar;G:\Java\jdk1.8.0_162\jre\lib\ext\nashorn.jar;G:\Java\jdk1.8.0_162\jre\lib\ext\sunec.jar;G:\Java\jdk1.8.0_162\jre\lib\ext\sunjce_provider.jar;G:\Java\jdk1.8.0_162\jre\lib\ext\sunmscapi.jar;G:\Java\jdk1.8.0_162\jre\lib\ext\sunpkcs11.jar;G:\Java\jdk1.8.0_162\jre\lib\ext\zipfs.jar;G:\Java\jdk1.8.0_162\jre\lib\javaws.jar;G:\Java\jdk1.8.0_162\jre\lib\jce.jar;G:\Java\jdk1.8.0_162\jre\lib\jfr.jar;G:\Java\jdk1.8.0_162\jre\lib\jfxswt.jar;G:\Java\jdk1.8.0_162\jre\lib\jsse.jar;G:\Java\jdk1.8.0_162\jre\lib\management-agent.jar;G:\Java\jdk1.8.0_162\jre\lib\plugin.jar;G:\Java\jdk1.8.0_162\jre\lib\resources.jar;G:\Java\jdk1.8.0_162\jre\lib\rt.jar;G:\Java\IDEA_code\Day18\day18_Map_Son\out\production\day18_Map_Son;G:\Java\IntelliJ IDEA 16\IntelliJ IDEA 2016.1\lib\idea_rt.jar" com.intellij.rt.execution.application.AppMain jejune5.TreeMapDemo
请输入一个字符串：
linqingxia
Result:a(1)g(1)i(3)l(1)n(2)q(1)x(1)

Process finished with exit code 0

 */