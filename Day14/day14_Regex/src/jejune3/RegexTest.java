package jejune3;

import java.util.Arrays;

/**
 * Created by Jejune on 2018/7/15.
 */
/*
 * 正则表达式的分割功能：split();的练习。
 *
 * 要求：
 *   将字符串 "91 27 46 38 50"
 *   转换 成    "27 38 46 50 91"
 *
 * 分析：
 *       A：定义一个字符串
 *       B：分割字符串,得到I个字符串数组
 *       C:将字符串数组转为int数组
 *       D:排序
 *       E:组成新的字符串
 *       F:输出
 *
 */
public class RegexTest {
    public static void main(String[] args) {
        //A 分割字符串
        String s = "91 27 46 38 50";

        //B 把字符串分割，并组成字符串数组
        String[] strArray = s.split(" ");

        //C 将字符串数组转换成int 数组
        int[] array = new int[strArray.length];

        for (int x = 0; x < array.length; x++) {
            array[x] = Integer.parseInt(strArray[x]);
        }
        //D 排序
        Arrays.sort(array);

        //E 组成新的字符串
        StringBuilder sb = new StringBuilder();
        for (int y = 0; y < array.length; y++) {
            sb.append(array[y]).append(" ");
        }

        //F 输出
        String ss = sb.toString().trim();
        System.out.println("Result:" + ss);
    }
}

/*
* G:\Java\jdk1.8.0_162\bin\java -Didea.launcher.port=7535 "-Didea.launcher.bin.path=G:\Java\IntelliJ IDEA 16\IntelliJ IDEA 2016.1\bin" -Dfile.encoding=UTF-8 -classpath "G:\Java\jdk1.8.0_162\jre\lib\charsets.jar;G:\Java\jdk1.8.0_162\jre\lib\deploy.jar;G:\Java\jdk1.8.0_162\jre\lib\ext\access-bridge-64.jar;G:\Java\jdk1.8.0_162\jre\lib\ext\cldrdata.jar;G:\Java\jdk1.8.0_162\jre\lib\ext\dnsns.jar;G:\Java\jdk1.8.0_162\jre\lib\ext\jaccess.jar;G:\Java\jdk1.8.0_162\jre\lib\ext\jfxrt.jar;G:\Java\jdk1.8.0_162\jre\lib\ext\localedata.jar;G:\Java\jdk1.8.0_162\jre\lib\ext\nashorn.jar;G:\Java\jdk1.8.0_162\jre\lib\ext\sunec.jar;G:\Java\jdk1.8.0_162\jre\lib\ext\sunjce_provider.jar;G:\Java\jdk1.8.0_162\jre\lib\ext\sunmscapi.jar;G:\Java\jdk1.8.0_162\jre\lib\ext\sunpkcs11.jar;G:\Java\jdk1.8.0_162\jre\lib\ext\zipfs.jar;G:\Java\jdk1.8.0_162\jre\lib\javaws.jar;G:\Java\jdk1.8.0_162\jre\lib\jce.jar;G:\Java\jdk1.8.0_162\jre\lib\jfr.jar;G:\Java\jdk1.8.0_162\jre\lib\jfxswt.jar;G:\Java\jdk1.8.0_162\jre\lib\jsse.jar;G:\Java\jdk1.8.0_162\jre\lib\management-agent.jar;G:\Java\jdk1.8.0_162\jre\lib\plugin.jar;G:\Java\jdk1.8.0_162\jre\lib\resources.jar;G:\Java\jdk1.8.0_162\jre\lib\rt.jar;G:\Java\IDEA_code\Day14\day14_Regex\out\production\day14_Regex;G:\Java\IntelliJ IDEA 16\IntelliJ IDEA 2016.1\lib\idea_rt.jar" com.intellij.rt.execution.application.AppMain jejune3.RegexTest
Result:27 38 46 50 91

Process finished with exit code 0
* */