package Demo1_10;

import java.util.Scanner;

/**
 * Created by Jejune on 2018/8/7.
 */
/*
【程序7】题目：输入一行字符，分别统计出其中英文字母、空格、数字和其它字符的个数。
*/
public class Demo7 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("请输入你的字符串：");
        String str = sc.nextLine();
        char[] ch = str.toCharArray();
        count(ch);
    }

    private static void count(char[] ch) {
        int letterNumber = 0;
        int number = 0;
        int spaceNumber = 0;
        int other = 0;
        for (int x = 0; x < ch.length; x++) {
            if ((ch[x] >= 'a' && ch[x] <= 'z') || (ch[x] >= 'A' && ch[x] <= 'Z')) {
                letterNumber++;
            } else if (ch[x] >= '0' && ch[x] <= '9') {
                number++;
            } else if (ch[x] == ' ') {
                spaceNumber++;
            }else {
                other++;
            }
        }
        System.out.println("字母的个数是：" + letterNumber);
        System.out.println("数字的个数是：" + number);
        System.out.println("空格的个数是：" + spaceNumber);
        System.out.println("其他的个数是："+other);
    }

}
/*
G:\Java\jdk1.8.0_162\bin\java -Didea.launcher.port=7542 "-Didea.launcher.bin.path=G:\Java\IntelliJ IDEA 16\IntelliJ IDEA 2016.1\bin" -Dfile.encoding=UTF-8 -classpath "G:\Java\jdk1.8.0_162\jre\lib\charsets.jar;G:\Java\jdk1.8.0_162\jre\lib\deploy.jar;G:\Java\jdk1.8.0_162\jre\lib\ext\access-bridge-64.jar;G:\Java\jdk1.8.0_162\jre\lib\ext\cldrdata.jar;G:\Java\jdk1.8.0_162\jre\lib\ext\dnsns.jar;G:\Java\jdk1.8.0_162\jre\lib\ext\jaccess.jar;G:\Java\jdk1.8.0_162\jre\lib\ext\jfxrt.jar;G:\Java\jdk1.8.0_162\jre\lib\ext\localedata.jar;G:\Java\jdk1.8.0_162\jre\lib\ext\nashorn.jar;G:\Java\jdk1.8.0_162\jre\lib\ext\sunec.jar;G:\Java\jdk1.8.0_162\jre\lib\ext\sunjce_provider.jar;G:\Java\jdk1.8.0_162\jre\lib\ext\sunmscapi.jar;G:\Java\jdk1.8.0_162\jre\lib\ext\sunpkcs11.jar;G:\Java\jdk1.8.0_162\jre\lib\ext\zipfs.jar;G:\Java\jdk1.8.0_162\jre\lib\javaws.jar;G:\Java\jdk1.8.0_162\jre\lib\jce.jar;G:\Java\jdk1.8.0_162\jre\lib\jfr.jar;G:\Java\jdk1.8.0_162\jre\lib\jfxswt.jar;G:\Java\jdk1.8.0_162\jre\lib\jsse.jar;G:\Java\jdk1.8.0_162\jre\lib\management-agent.jar;G:\Java\jdk1.8.0_162\jre\lib\plugin.jar;G:\Java\jdk1.8.0_162\jre\lib\resources.jar;G:\Java\jdk1.8.0_162\jre\lib\rt.jar;G:\Java\IDEA_code\Java_Algorithm_Practice\Exercises50\out\production\Exercises50;G:\Java\IntelliJ IDEA 16\IntelliJ IDEA 2016.1\lib\idea_rt.jar" com.intellij.rt.execution.application.AppMain Demo1_10.Demo7
请输入你的字符串：
wo jiao wjj (16) @qq.com
字母的个数是：14
数字的个数是：2
空格的个数是：4
其他的个数是：4

Process finished with exit code 0


 */