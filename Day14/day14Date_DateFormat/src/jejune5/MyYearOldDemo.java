package jejune5;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.Scanner;

/**
 * Created by Jejune on 2018/7/22.
 */
/*
 * 算一下你来到这个世界多少天?
 *
 * 分析：
 * 		A:键盘录入你的出生的年月日
 * 		B:把该字符串转换为一个日期
 * 		C:通过该日期得到一个毫秒值
 * 		D:获取当前时间的毫秒值
 * 		E:用D-C得到一个毫秒值
 * 		F:把E的毫秒值转换为年
 * 			/1000/60/60/24
 */
public class MyYearOldDemo {
    public static void main(String[] args) throws ParseException {
        //键盘录入出生年月日
        Scanner sc = new Scanner(System.in);
        System.out.println("请输入你的年龄： ");
        String s = sc.nextLine();

        //B 把字符串转化为日期
        SimpleDateFormat sdf = new SimpleDateFormat("yyyy-MM-dd");
        Date d = sdf.parse(s);

// C得到该日的毫秒值
        long myTime = d.getTime();

        //D 获取当前
        long nowTime = new Date().getTime();

        //E 做差
        long msTime = nowTime - myTime;

        //F
        int day = (int) (msTime/1000/60/60/24);
        System.out.println("三毛已經存在了 "+day+" 天");


    }
}

/*
G:\Java\jdk1.8.0_162\bin\java -Didea.launcher.port=7533 "-Didea.launcher.bin.path=G:\Java\IntelliJ IDEA 16\IntelliJ IDEA 2016.1\bin" -Dfile.encoding=UTF-8 -classpath "G:\Java\jdk1.8.0_162\jre\lib\charsets.jar;G:\Java\jdk1.8.0_162\jre\lib\deploy.jar;G:\Java\jdk1.8.0_162\jre\lib\ext\access-bridge-64.jar;G:\Java\jdk1.8.0_162\jre\lib\ext\cldrdata.jar;G:\Java\jdk1.8.0_162\jre\lib\ext\dnsns.jar;G:\Java\jdk1.8.0_162\jre\lib\ext\jaccess.jar;G:\Java\jdk1.8.0_162\jre\lib\ext\jfxrt.jar;G:\Java\jdk1.8.0_162\jre\lib\ext\localedata.jar;G:\Java\jdk1.8.0_162\jre\lib\ext\nashorn.jar;G:\Java\jdk1.8.0_162\jre\lib\ext\sunec.jar;G:\Java\jdk1.8.0_162\jre\lib\ext\sunjce_provider.jar;G:\Java\jdk1.8.0_162\jre\lib\ext\sunmscapi.jar;G:\Java\jdk1.8.0_162\jre\lib\ext\sunpkcs11.jar;G:\Java\jdk1.8.0_162\jre\lib\ext\zipfs.jar;G:\Java\jdk1.8.0_162\jre\lib\javaws.jar;G:\Java\jdk1.8.0_162\jre\lib\jce.jar;G:\Java\jdk1.8.0_162\jre\lib\jfr.jar;G:\Java\jdk1.8.0_162\jre\lib\jfxswt.jar;G:\Java\jdk1.8.0_162\jre\lib\jsse.jar;G:\Java\jdk1.8.0_162\jre\lib\management-agent.jar;G:\Java\jdk1.8.0_162\jre\lib\plugin.jar;G:\Java\jdk1.8.0_162\jre\lib\resources.jar;G:\Java\jdk1.8.0_162\jre\lib\rt.jar;G:\Java\IDEA_code\Day14\day14Date_DateFormat\out\production\day14Date_DateFormat;G:\Java\IntelliJ IDEA 16\IntelliJ IDEA 2016.1\lib\idea_rt.jar" com.intellij.rt.execution.application.AppMain jejune5.MyYearOldDemo
请输入你的年龄：
1996-03-07
已出生了 8173 天

Process finished with exit code 0


 */