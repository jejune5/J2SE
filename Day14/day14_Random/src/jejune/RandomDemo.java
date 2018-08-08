package jejune;

import java.util.Random;

/**
 * Created by Jejune on 2018/7/22.
 */
/*
 * Random:产生随机数的类
 *
 * 构造方法：
 * 		public Random():没有给种子，用的是默认种子，是当前时间的毫秒值
 *		public Random(long seed):给出指定的种子
 *
 *		给定种子后，每次得到的随机数是相同的。
 *
 * 成员方法：
 * 		public int nextInt()：返回的是int范围内的随机数
 *		public int nextInt(int n):返回的是[0,n)范围的内随机数
 */
public class RandomDemo {
    public static void main(String[] args) {
        // 创建对象
        // Random r = new Random();
        Random r = new Random(1111);
        for (int x = 0; x < 100; x++) {
            int num = r.nextInt(100) + 1;
            System.out.println(num);
        }
    }
}

/*
G:\Java\jdk1.8.0_162\bin\java -Didea.launcher.port=7533 "-Didea.launcher.bin.path=G:\Java\IntelliJ IDEA 16\IntelliJ IDEA 2016.1\bin" -Dfile.encoding=UTF-8 -classpath "G:\Java\jdk1.8.0_162\jre\lib\charsets.jar;G:\Java\jdk1.8.0_162\jre\lib\deploy.jar;G:\Java\jdk1.8.0_162\jre\lib\ext\access-bridge-64.jar;G:\Java\jdk1.8.0_162\jre\lib\ext\cldrdata.jar;G:\Java\jdk1.8.0_162\jre\lib\ext\dnsns.jar;G:\Java\jdk1.8.0_162\jre\lib\ext\jaccess.jar;G:\Java\jdk1.8.0_162\jre\lib\ext\jfxrt.jar;G:\Java\jdk1.8.0_162\jre\lib\ext\localedata.jar;G:\Java\jdk1.8.0_162\jre\lib\ext\nashorn.jar;G:\Java\jdk1.8.0_162\jre\lib\ext\sunec.jar;G:\Java\jdk1.8.0_162\jre\lib\ext\sunjce_provider.jar;G:\Java\jdk1.8.0_162\jre\lib\ext\sunmscapi.jar;G:\Java\jdk1.8.0_162\jre\lib\ext\sunpkcs11.jar;G:\Java\jdk1.8.0_162\jre\lib\ext\zipfs.jar;G:\Java\jdk1.8.0_162\jre\lib\javaws.jar;G:\Java\jdk1.8.0_162\jre\lib\jce.jar;G:\Java\jdk1.8.0_162\jre\lib\jfr.jar;G:\Java\jdk1.8.0_162\jre\lib\jfxswt.jar;G:\Java\jdk1.8.0_162\jre\lib\jsse.jar;G:\Java\jdk1.8.0_162\jre\lib\management-agent.jar;G:\Java\jdk1.8.0_162\jre\lib\plugin.jar;G:\Java\jdk1.8.0_162\jre\lib\resources.jar;G:\Java\jdk1.8.0_162\jre\lib\rt.jar;G:\Java\IDEA_code\Day14\day14_Random\out\production\day14_Random;G:\Java\IntelliJ IDEA 16\IntelliJ IDEA 2016.1\lib\idea_rt.jar" com.intellij.rt.execution.application.AppMain jejune.RandomDemo
27
7
6
70
51
28
26
5
99
17
58
25
59
13
42
70
26
23
3
19
77
99
19
82
76
74
68
18
70
86
36
59
7
68
55
85
2
35
13
17
33
30
15
93
59
63
12
83
12
15
53
44
56
26
50
63
41
27
87
53
19
81
93
74
32
28
74
6
33
55
52
77
28
60
49
56
38
39
71
56
77
96
77
2
3
15
98
42
15
18
11
14
90
58
39
47
17
72
5
6

Process finished with exit code 0

 */