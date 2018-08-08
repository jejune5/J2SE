package jejune2;

import java.util.ArrayList;
import java.util.Random;

/**
 * Created by Jejune on 2018/7/28.
 */
/*
 * 获取10个1-20之间的随机数，要求不能重复
 *
 * 用数组实现，但是数组的长度是固定的，长度不好确定。
 * 所以我们使用集合实现。
 *
 * 分析：
 * 		A:创建产生随机数的对象
 * 		B:创建一个存储随机数的集合。
 * 		C:定义一个统计变量。从0开始。
 * 		D:判断统计遍历是否小于10
 * 			是:先产生一个随机数，判断该随机数在集合中是否存在。
 * 					如果不存在:就添加，统计变量++。
 * 					如果存在:就不搭理它。
 * 			否：不搭理它
 * 		E:遍历集合
 */
public class RandomDemo {
    public static void main(String[] args) {

        //A
        Random r = new Random();

        //B
        ArrayList<Integer> array = new ArrayList<Integer>();

        //C
        int count = 0;

        //D
        while (count < 10) {
            int number = r.nextInt(20) + 1;

            //判断该随机数在集合中是否存在
            if (!array.contains(number)) {
                //如果不存在：添加统计变量++
                array.add(number);
                count++;
            }
        }

        //遍历
        for (Integer i : array) {
            System.out.println(i);
        }
    }
}

/*
G:\Java\jdk1.8.0_162\bin\java -Didea.launcher.port=7534 "-Didea.launcher.bin.path=G:\Java\IntelliJ IDEA 16\IntelliJ IDEA 2016.1\bin" -Dfile.encoding=UTF-8 -classpath "G:\Java\jdk1.8.0_162\jre\lib\charsets.jar;G:\Java\jdk1.8.0_162\jre\lib\deploy.jar;G:\Java\jdk1.8.0_162\jre\lib\ext\access-bridge-64.jar;G:\Java\jdk1.8.0_162\jre\lib\ext\cldrdata.jar;G:\Java\jdk1.8.0_162\jre\lib\ext\dnsns.jar;G:\Java\jdk1.8.0_162\jre\lib\ext\jaccess.jar;G:\Java\jdk1.8.0_162\jre\lib\ext\jfxrt.jar;G:\Java\jdk1.8.0_162\jre\lib\ext\localedata.jar;G:\Java\jdk1.8.0_162\jre\lib\ext\nashorn.jar;G:\Java\jdk1.8.0_162\jre\lib\ext\sunec.jar;G:\Java\jdk1.8.0_162\jre\lib\ext\sunjce_provider.jar;G:\Java\jdk1.8.0_162\jre\lib\ext\sunmscapi.jar;G:\Java\jdk1.8.0_162\jre\lib\ext\sunpkcs11.jar;G:\Java\jdk1.8.0_162\jre\lib\ext\zipfs.jar;G:\Java\jdk1.8.0_162\jre\lib\javaws.jar;G:\Java\jdk1.8.0_162\jre\lib\jce.jar;G:\Java\jdk1.8.0_162\jre\lib\jfr.jar;G:\Java\jdk1.8.0_162\jre\lib\jfxswt.jar;G:\Java\jdk1.8.0_162\jre\lib\jsse.jar;G:\Java\jdk1.8.0_162\jre\lib\management-agent.jar;G:\Java\jdk1.8.0_162\jre\lib\plugin.jar;G:\Java\jdk1.8.0_162\jre\lib\resources.jar;G:\Java\jdk1.8.0_162\jre\lib\rt.jar;G:\Java\IDEA_code\Day16\day16_List_Son_test\out\production\day16_List_Son_test;G:\Java\IntelliJ IDEA 16\IntelliJ IDEA 2016.1\lib\idea_rt.jar" com.intellij.rt.execution.application.AppMain jejune2.RandomDemo
2
1
4
15
3
19
7
16
18
11

Process finished with exit code 0

 */
