package Demo41_50;

import java.util.Scanner;

/**
 * Created by Jejune on 2018/8/16.
 */
/*
【程序48】   题目：某个公司采用公用电话传递数据，数据是四位的整数，在传递过程中是加密的，加密规则如下：
            每位数字都加上5，然后用和除以10的余数代替该数字，
            再将第一位和第四位交换，第二位和第三位交换。
 */
public class Demo48 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("请输入你的数据(4位数):");
        int n = sc.nextInt();
        int[] arr = new int[4];
        arr[0] = n / 1000; //千位
        arr[1] = n / 100 % 10; //百位
        arr[2] = n / 10 % 10; //十位
        arr[3] = n % 10; //个位

        for (int i = 0; i < 4; i++) {
            //每位数字都加上5
            arr[i] += 5;
            //用和除以10的余数代替该数字
            arr[i] %= 10;
        }

        //将第一位和第四位交换，第二位和第三位交换。
        int temp1 = arr[0];
        arr[0] = arr[3];
        arr[3] = temp1;

        int temp2 = arr[1];
        arr[1] = arr[2];
        arr[2] = temp2;

        //输出
        System.out.println("加密后的数字是：");
        for (int i : arr) {
            System.out.print(i);
        }

    }
}

/*
G:\Java\jdk1.8.0_162\bin\java -Didea.launcher.port=7534 "-Didea.launcher.bin.path=G:\Java\IntelliJ IDEA 16\IntelliJ IDEA 2016.1\bin" -Dfile.encoding=UTF-8 -classpath "G:\Java\jdk1.8.0_162\jre\lib\charsets.jar;G:\Java\jdk1.8.0_162\jre\lib\deploy.jar;G:\Java\jdk1.8.0_162\jre\lib\ext\access-bridge-64.jar;G:\Java\jdk1.8.0_162\jre\lib\ext\cldrdata.jar;G:\Java\jdk1.8.0_162\jre\lib\ext\dnsns.jar;G:\Java\jdk1.8.0_162\jre\lib\ext\jaccess.jar;G:\Java\jdk1.8.0_162\jre\lib\ext\jfxrt.jar;G:\Java\jdk1.8.0_162\jre\lib\ext\localedata.jar;G:\Java\jdk1.8.0_162\jre\lib\ext\nashorn.jar;G:\Java\jdk1.8.0_162\jre\lib\ext\sunec.jar;G:\Java\jdk1.8.0_162\jre\lib\ext\sunjce_provider.jar;G:\Java\jdk1.8.0_162\jre\lib\ext\sunmscapi.jar;G:\Java\jdk1.8.0_162\jre\lib\ext\sunpkcs11.jar;G:\Java\jdk1.8.0_162\jre\lib\ext\zipfs.jar;G:\Java\jdk1.8.0_162\jre\lib\javaws.jar;G:\Java\jdk1.8.0_162\jre\lib\jce.jar;G:\Java\jdk1.8.0_162\jre\lib\jfr.jar;G:\Java\jdk1.8.0_162\jre\lib\jfxswt.jar;G:\Java\jdk1.8.0_162\jre\lib\jsse.jar;G:\Java\jdk1.8.0_162\jre\lib\management-agent.jar;G:\Java\jdk1.8.0_162\jre\lib\plugin.jar;G:\Java\jdk1.8.0_162\jre\lib\resources.jar;G:\Java\jdk1.8.0_162\jre\lib\rt.jar;G:\Java\Java_Algorithm_Practice\Exercises50\out\production\Exercises50;G:\Java\IntelliJ IDEA 16\IntelliJ IDEA 2016.1\lib\idea_rt.jar" com.intellij.rt.execution.application.AppMain Demo41_50.Demo48
请输入你的数据(4位数):
1234
加密后的数字是：
9876
Process finished with exit code 0

 */