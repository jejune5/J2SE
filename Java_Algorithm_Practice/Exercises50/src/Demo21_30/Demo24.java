package Demo21_30;

import java.util.Scanner;

/**
 * Created by Jejune on 2018/8/10.
 */
/*
【程序24】   题目：给一个不多于5位的正整数，要求：一、求它是几位数，二、逆序打印出各位数字。

 */
public class Demo24 {
    public static void main(String[] args) {
        Demo24 use = new Demo24();
        Scanner sc = new Scanner(System.in);
        System.out.println("请输入一个不多于5位的数：");
        long n = sc.nextInt();

        if (n < 0 || n > 100000) {
            System.out.println("Error Input, please run this program Again!");
        } else if (n >= 0 && n < 10) {
            System.out.print(n + " 是1位数,逆序数是:");
            use.invert(n);

        } else if (n >= 10 && n < 100) {
            System.out.print(n + " 是2位数,逆序数是:");
            use.invert(n);
        } else if (n >= 100 && n < 1000) {
            System.out.print(n + " 是3位数,逆序数是:");
            use.invert(n);
        } else if (n >= 1000 && n < 10000) {
            System.out.print(n + " 是4位数,逆序数是:");
            use.invert(n);
        } else if (n >= 10000 && n < 100000) {
            System.out.print(n + " 是5位数,逆序数是:");
            use.invert(n);
        }
    }

    private void invert(long n) {
        String s = Long.toString(n);
        char[] arr = s.toCharArray();
        for (int i = arr.length - 1; i >= 0; i--) {
            System.out.print(arr[i]);
        }
    }
}
/*
G:\Java\jdk1.8.0_162\bin\java -Didea.launcher.port=7537 "-Didea.launcher.bin.path=G:\Java\IntelliJ IDEA 16\IntelliJ IDEA 2016.1\bin" -Dfile.encoding=UTF-8 -classpath "G:\Java\jdk1.8.0_162\jre\lib\charsets.jar;G:\Java\jdk1.8.0_162\jre\lib\deploy.jar;G:\Java\jdk1.8.0_162\jre\lib\ext\access-bridge-64.jar;G:\Java\jdk1.8.0_162\jre\lib\ext\cldrdata.jar;G:\Java\jdk1.8.0_162\jre\lib\ext\dnsns.jar;G:\Java\jdk1.8.0_162\jre\lib\ext\jaccess.jar;G:\Java\jdk1.8.0_162\jre\lib\ext\jfxrt.jar;G:\Java\jdk1.8.0_162\jre\lib\ext\localedata.jar;G:\Java\jdk1.8.0_162\jre\lib\ext\nashorn.jar;G:\Java\jdk1.8.0_162\jre\lib\ext\sunec.jar;G:\Java\jdk1.8.0_162\jre\lib\ext\sunjce_provider.jar;G:\Java\jdk1.8.0_162\jre\lib\ext\sunmscapi.jar;G:\Java\jdk1.8.0_162\jre\lib\ext\sunpkcs11.jar;G:\Java\jdk1.8.0_162\jre\lib\ext\zipfs.jar;G:\Java\jdk1.8.0_162\jre\lib\javaws.jar;G:\Java\jdk1.8.0_162\jre\lib\jce.jar;G:\Java\jdk1.8.0_162\jre\lib\jfr.jar;G:\Java\jdk1.8.0_162\jre\lib\jfxswt.jar;G:\Java\jdk1.8.0_162\jre\lib\jsse.jar;G:\Java\jdk1.8.0_162\jre\lib\management-agent.jar;G:\Java\jdk1.8.0_162\jre\lib\plugin.jar;G:\Java\jdk1.8.0_162\jre\lib\resources.jar;G:\Java\jdk1.8.0_162\jre\lib\rt.jar;G:\Java\Java_Algorithm_Practice\Exercises50\out\production\Exercises50;G:\Java\IntelliJ IDEA 16\IntelliJ IDEA 2016.1\lib\idea_rt.jar" com.intellij.rt.execution.application.AppMain Demo21_30.Demo24
请输入一个不多于5位的数：
12345
12345 是5位数,逆序数是:54321
Process finished with exit code 0

 */