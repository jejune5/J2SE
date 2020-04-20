package Demo1_10;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.Scanner;

/**
 * Created by Jejune on 2018/8/7.
 */
/*
【程序6】题目：输入两个正整数m和n，求其最大公约数和最小公倍数。
*/

public class Demo6 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("请输入第一个正整数：");
        int m = sc.nextInt();
        System.out.println("请输入第二个正整数：");
        int n = sc.nextInt();
        gongYue(m, n);
        gongBei(m, n);
    }

    private static void gongYue(int m, int n) {
        List<Integer> list = new ArrayList<Integer>();
        int min = Math.min(m, n);
        for (int x = 1; x <= min; x++) {
            if (m % x == 0 && n % x == 0) {
                list.add(x);
            }
        }
        System.out.println(m + "和" + n + "的最大公约数是：" + Collections.max(list));
    }

    private static void gongBei(int m, int n) {
        List<Integer> list = new ArrayList<Integer>();
        int max = Math.max(m, n);
        for (int x = max; x <= m * n; x++) {
            if (x%m==0&&x%n== 0) {
                list.add(x);
            }
        }
        System.out.println(m + "和" + n + "的最小公倍数是：" + Collections.min(list));
    }

}

/*
G:\Java\jdk1.8.0_162\bin\java -Didea.launcher.port=7534 "-Didea.launcher.bin.path=G:\Java\IntelliJ IDEA 16\IntelliJ IDEA 2016.1\bin" -Dfile.encoding=UTF-8 -classpath "G:\Java\jdk1.8.0_162\jre\lib\charsets.jar;G:\Java\jdk1.8.0_162\jre\lib\deploy.jar;G:\Java\jdk1.8.0_162\jre\lib\ext\access-bridge-64.jar;G:\Java\jdk1.8.0_162\jre\lib\ext\cldrdata.jar;G:\Java\jdk1.8.0_162\jre\lib\ext\dnsns.jar;G:\Java\jdk1.8.0_162\jre\lib\ext\jaccess.jar;G:\Java\jdk1.8.0_162\jre\lib\ext\jfxrt.jar;G:\Java\jdk1.8.0_162\jre\lib\ext\localedata.jar;G:\Java\jdk1.8.0_162\jre\lib\ext\nashorn.jar;G:\Java\jdk1.8.0_162\jre\lib\ext\sunec.jar;G:\Java\jdk1.8.0_162\jre\lib\ext\sunjce_provider.jar;G:\Java\jdk1.8.0_162\jre\lib\ext\sunmscapi.jar;G:\Java\jdk1.8.0_162\jre\lib\ext\sunpkcs11.jar;G:\Java\jdk1.8.0_162\jre\lib\ext\zipfs.jar;G:\Java\jdk1.8.0_162\jre\lib\javaws.jar;G:\Java\jdk1.8.0_162\jre\lib\jce.jar;G:\Java\jdk1.8.0_162\jre\lib\jfr.jar;G:\Java\jdk1.8.0_162\jre\lib\jfxswt.jar;G:\Java\jdk1.8.0_162\jre\lib\jsse.jar;G:\Java\jdk1.8.0_162\jre\lib\management-agent.jar;G:\Java\jdk1.8.0_162\jre\lib\plugin.jar;G:\Java\jdk1.8.0_162\jre\lib\resources.jar;G:\Java\jdk1.8.0_162\jre\lib\rt.jar;G:\Java\IDEA_code\Java_Algorithm_Practice\Exercises50\out\production\Exercises50;G:\Java\IntelliJ IDEA 16\IntelliJ IDEA 2016.1\lib\idea_rt.jar" com.intellij.rt.execution.application.AppMain Demo1_10.Demo6
请输入第一个正整数：
6
请输入第二个正整数：
9
6和9的最大公约数是：3
6和9的最小公倍数是：18

Process finished with exit code 0

 */

/*
1.程序分析：利用辗除法。
import java.util.Scanner;
public class Demo06 {
    public static void main(String[] args){
        int a,b,m,n;
        Scanner in=new Scanner(System.in);
        System.out.println("请输入一个正整数：");
        a=in.nextInt();
        System.out.println("再输入一个正整数：");
        b=in.nextInt();
        commonDivisor use=new commonDivisor();
        m=use.commonDivisor(a,b);
        n=a*b/m;
        System.out.println("最大公约数："+m);
        System.out.println("最小公倍数："+n);
    }
}
class commonDivisor{
    public int commonDivisor(int x,int y){
        if(x<y){
            int t=x;
            x=y;
            y=t;
        }
        while(y!=0){
            if(x==y)return x;
            else{
                int k=x%y;
                x=y;
                y=k;
            }
        }
        return x;
    }
}
 */