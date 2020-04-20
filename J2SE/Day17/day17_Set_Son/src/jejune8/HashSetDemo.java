package jejune8;

import java.util.HashSet;
import java.util.Random;

/**
 * Created by Jejune on 2018/8/3.
 */
/*
 * 编写一个程序，获取10个1至20的随机数，要求随机数不能重复。
 *
 * 分析：
 * 		A:创建随机数对象
 * 		B:创建一个HashSet集合
 * 		C:判断集合的长度是不是小于10
 * 			是：就创建一个随机数添加
 * 			否：不搭理它
 * 		D:遍历HashSet集合
 */
public class HashSetDemo {
    public static void main(String[] args) {
        // 创建随机数对象
        Random r = new Random();

        //创建一个Set集合
        HashSet<Integer> hs = new HashSet<Integer>();

        //判断集合是否小于10
        while (hs.size() < 10) {
            int num = r.nextInt(20) + 1;
            hs.add(num);
        }

        //遍历Set集合
        for (Integer i : hs) {
            System.out.println(i);
        }
    }
}

/*
G:\Java\jdk1.8.0_162\bin\java -Didea.launcher.port=7534 "-Didea.launcher.bin.path=G:\Java\IntelliJ IDEA 16\IntelliJ IDEA 2016.1\bin" -Dfile.encoding=UTF-8 -classpath "G:\Java\jdk1.8.0_162\jre\lib\charsets.jar;G:\Java\jdk1.8.0_162\jre\lib\deploy.jar;G:\Java\jdk1.8.0_162\jre\lib\ext\access-bridge-64.jar;G:\Java\jdk1.8.0_162\jre\lib\ext\cldrdata.jar;G:\Java\jdk1.8.0_162\jre\lib\ext\dnsns.jar;G:\Java\jdk1.8.0_162\jre\lib\ext\jaccess.jar;G:\Java\jdk1.8.0_162\jre\lib\ext\jfxrt.jar;G:\Java\jdk1.8.0_162\jre\lib\ext\localedata.jar;G:\Java\jdk1.8.0_162\jre\lib\ext\nashorn.jar;G:\Java\jdk1.8.0_162\jre\lib\ext\sunec.jar;G:\Java\jdk1.8.0_162\jre\lib\ext\sunjce_provider.jar;G:\Java\jdk1.8.0_162\jre\lib\ext\sunmscapi.jar;G:\Java\jdk1.8.0_162\jre\lib\ext\sunpkcs11.jar;G:\Java\jdk1.8.0_162\jre\lib\ext\zipfs.jar;G:\Java\jdk1.8.0_162\jre\lib\javaws.jar;G:\Java\jdk1.8.0_162\jre\lib\jce.jar;G:\Java\jdk1.8.0_162\jre\lib\jfr.jar;G:\Java\jdk1.8.0_162\jre\lib\jfxswt.jar;G:\Java\jdk1.8.0_162\jre\lib\jsse.jar;G:\Java\jdk1.8.0_162\jre\lib\management-agent.jar;G:\Java\jdk1.8.0_162\jre\lib\plugin.jar;G:\Java\jdk1.8.0_162\jre\lib\resources.jar;G:\Java\jdk1.8.0_162\jre\lib\rt.jar;G:\Java\IDEA_code\Day17\day17_Set_Son\out\production\day17_Set_Son;G:\Java\IntelliJ IDEA 16\IntelliJ IDEA 2016.1\lib\idea_rt.jar" com.intellij.rt.execution.application.AppMain jejune8.HashSetDemo
1
17
18
2
3
5
7
9
10
14

Process finished with exit code 0

 */