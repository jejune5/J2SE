package Demo31_40;

import java.util.Scanner;

/**
 * Created by Jejune on 2018/8/14.
 */
/*
【程序39】 题目：编写一个函数，
               输入n为偶数时，调用函数求1/2+1/4+...+1/n,
               当输入n为奇数时，调用函数1/1+1/3+...+1/n
 */
public class Demo39 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("请输入n的值：");
        double n = sc.nextDouble();
        if (n % 2 == 1) {
            System.out.println(oddSum(n));
        } else if (n % 2 == 0) {
            System.out.println(evenSum(n));
        }
    }

    private static double evenSum(double n) {
        double sum = 0;
        for (double x = 2; x <= n; x += 2) {
            sum += 1/x;
        }
        return sum;
    }

    private static double oddSum(double n) {
        double sum = 0;
        for (double x = 1; x <= n; x += 2) {
            sum += 1 / x;
        }
        return sum;
    }
}

/*
G:\Java\jdk1.8.0_162\bin\java -Didea.launcher.port=7546 "-Didea.launcher.bin.path=G:\Java\IntelliJ IDEA 16\IntelliJ IDEA 2016.1\bin" -Dfile.encoding=UTF-8 -classpath "G:\Java\jdk1.8.0_162\jre\lib\charsets.jar;G:\Java\jdk1.8.0_162\jre\lib\deploy.jar;G:\Java\jdk1.8.0_162\jre\lib\ext\access-bridge-64.jar;G:\Java\jdk1.8.0_162\jre\lib\ext\cldrdata.jar;G:\Java\jdk1.8.0_162\jre\lib\ext\dnsns.jar;G:\Java\jdk1.8.0_162\jre\lib\ext\jaccess.jar;G:\Java\jdk1.8.0_162\jre\lib\ext\jfxrt.jar;G:\Java\jdk1.8.0_162\jre\lib\ext\localedata.jar;G:\Java\jdk1.8.0_162\jre\lib\ext\nashorn.jar;G:\Java\jdk1.8.0_162\jre\lib\ext\sunec.jar;G:\Java\jdk1.8.0_162\jre\lib\ext\sunjce_provider.jar;G:\Java\jdk1.8.0_162\jre\lib\ext\sunmscapi.jar;G:\Java\jdk1.8.0_162\jre\lib\ext\sunpkcs11.jar;G:\Java\jdk1.8.0_162\jre\lib\ext\zipfs.jar;G:\Java\jdk1.8.0_162\jre\lib\javaws.jar;G:\Java\jdk1.8.0_162\jre\lib\jce.jar;G:\Java\jdk1.8.0_162\jre\lib\jfr.jar;G:\Java\jdk1.8.0_162\jre\lib\jfxswt.jar;G:\Java\jdk1.8.0_162\jre\lib\jsse.jar;G:\Java\jdk1.8.0_162\jre\lib\management-agent.jar;G:\Java\jdk1.8.0_162\jre\lib\plugin.jar;G:\Java\jdk1.8.0_162\jre\lib\resources.jar;G:\Java\jdk1.8.0_162\jre\lib\rt.jar;G:\Java\Java_Algorithm_Practice\Exercises50\out\production\Exercises50;G:\Java\IntelliJ IDEA 16\IntelliJ IDEA 2016.1\lib\idea_rt.jar" com.intellij.rt.execution.application.AppMain Demo31_40.Demo39
请输入n的值：
4
0.75

Process finished with exit code 0


 */
