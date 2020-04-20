package Demo21_30;

import java.util.Scanner;

/**
 * Created by Jejune on 2018/8/13.
 */
/*
【程序26】题目：请输入星期几的第一个字母来判断一下是星期几，如果第一个字母一样，则继续判断第二个字母。
 */
public class Demo26 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("请输入星期的首字母：");
        String s = sc.nextLine();

        if (s.equalsIgnoreCase("M")) {
            System.out.println("Monday");
        } else if (s.equalsIgnoreCase("T")) {
            System.out.println("请输入第二个字母：");
            String s2 = sc.nextLine();
            if (s2.equalsIgnoreCase("U")) {
                System.out.println("Tuesday");
            } else if (s2.equalsIgnoreCase("H")) {
                System.out.println("Thursday");
            } else {
                System.out.println("Input error!");
            }
        } else if (s.equalsIgnoreCase("W")) {
            System.out.println("Wednesday");
        } else if (s.equalsIgnoreCase("F")) {
            System.out.println("Friday");
        } else if (s.equalsIgnoreCase("S")) {
            System.out.println("请输入第二个字母：");
            String s3 = sc.nextLine();
            if (s3.equalsIgnoreCase("a")) {
                System.out.println("Saturday");
            } else if (s3.equalsIgnoreCase("u")) {
                System.out.println("Sunday");
            } else {
                System.out.println("Input error!");
            }
        } else {
            System.out.println("Input error!");
        }
    }
}

/*
G:\Java\jdk1.8.0_162\bin\java -Didea.launcher.port=7534 "-Didea.launcher.bin.path=G:\Java\IntelliJ IDEA 16\IntelliJ IDEA 2016.1\bin" -Dfile.encoding=UTF-8 -classpath "G:\Java\jdk1.8.0_162\jre\lib\charsets.jar;G:\Java\jdk1.8.0_162\jre\lib\deploy.jar;G:\Java\jdk1.8.0_162\jre\lib\ext\access-bridge-64.jar;G:\Java\jdk1.8.0_162\jre\lib\ext\cldrdata.jar;G:\Java\jdk1.8.0_162\jre\lib\ext\dnsns.jar;G:\Java\jdk1.8.0_162\jre\lib\ext\jaccess.jar;G:\Java\jdk1.8.0_162\jre\lib\ext\jfxrt.jar;G:\Java\jdk1.8.0_162\jre\lib\ext\localedata.jar;G:\Java\jdk1.8.0_162\jre\lib\ext\nashorn.jar;G:\Java\jdk1.8.0_162\jre\lib\ext\sunec.jar;G:\Java\jdk1.8.0_162\jre\lib\ext\sunjce_provider.jar;G:\Java\jdk1.8.0_162\jre\lib\ext\sunmscapi.jar;G:\Java\jdk1.8.0_162\jre\lib\ext\sunpkcs11.jar;G:\Java\jdk1.8.0_162\jre\lib\ext\zipfs.jar;G:\Java\jdk1.8.0_162\jre\lib\javaws.jar;G:\Java\jdk1.8.0_162\jre\lib\jce.jar;G:\Java\jdk1.8.0_162\jre\lib\jfr.jar;G:\Java\jdk1.8.0_162\jre\lib\jfxswt.jar;G:\Java\jdk1.8.0_162\jre\lib\jsse.jar;G:\Java\jdk1.8.0_162\jre\lib\management-agent.jar;G:\Java\jdk1.8.0_162\jre\lib\plugin.jar;G:\Java\jdk1.8.0_162\jre\lib\resources.jar;G:\Java\jdk1.8.0_162\jre\lib\rt.jar;G:\Java\Java_Algorithm_Practice\Exercises50\out\production\Exercises50;G:\Java\IntelliJ IDEA 16\IntelliJ IDEA 2016.1\lib\idea_rt.jar" com.intellij.rt.execution.application.AppMain Demo21_30.Demo26
请输入星期的首字母：
S
请输入第二个字母：
a
Saturday

Process finished with exit code 0

 */