package jejune3;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;

/**
 * Created by Jejune on 2018/7/22.
 */
/*
 * Date	 --	 String(格式化)
 * 		public final String format(Date date)
 *
 * String -- Date(解析)
 * 		public Date parse(String source)
 *
 * DateForamt:可以进行日期和字符串的格式化和解析，但是由于是抽象类，所以使用具体子类SimpleDateFormat。
 *
 * SimpleDateFormat的构造方法：
 * 		SimpleDateFormat():默认模式
 * 		SimpleDateFormat(String pattern):给定的模式
 * 			这个模式字符串该如何写呢?
 * 			通过查看API，我们就找到了对应的模式
 * 			年 y
 * 			月 M
 * 			日 d
 * 			时 H
 * 			分 m
 * 			秒 s
 *
 * 			2014年12月12日 12:12:12
 */
public class DateFormatDemo {
    public static void main(String[] args) throws ParseException {
        //Date --> String
        //创建日期对象
        Date d = new Date();
        // 创建格式化对象
        // SimpleDateFormat sdf = new SimpleDateFormat();
        // 给定模式
        SimpleDateFormat sdf = new SimpleDateFormat();
        // public final String format(Date date)
        String s = sdf.format(d);
        System.out.println(s);

        //String -->Date
        String str = "2018-07-22 23:28:12";
        //在把一个字符串解析为日期的时候，请注意格式必须和给定的字符串格式匹配
        SimpleDateFormat sdf2 = new SimpleDateFormat("yyyy-MM-dd HH:mm:ss");
        Date dd = sdf2.parse(str);
        System.out.println(dd);
    }
}

/*

G:\Java\jdk1.8.0_162\bin\java -Didea.launcher.port=7535 "-Didea.launcher.bin.path=G:\Java\IntelliJ IDEA 16\IntelliJ IDEA 2016.1\bin" -Dfile.encoding=UTF-8 -classpath "G:\Java\jdk1.8.0_162\jre\lib\charsets.jar;G:\Java\jdk1.8.0_162\jre\lib\deploy.jar;G:\Java\jdk1.8.0_162\jre\lib\ext\access-bridge-64.jar;G:\Java\jdk1.8.0_162\jre\lib\ext\cldrdata.jar;G:\Java\jdk1.8.0_162\jre\lib\ext\dnsns.jar;G:\Java\jdk1.8.0_162\jre\lib\ext\jaccess.jar;G:\Java\jdk1.8.0_162\jre\lib\ext\jfxrt.jar;G:\Java\jdk1.8.0_162\jre\lib\ext\localedata.jar;G:\Java\jdk1.8.0_162\jre\lib\ext\nashorn.jar;G:\Java\jdk1.8.0_162\jre\lib\ext\sunec.jar;G:\Java\jdk1.8.0_162\jre\lib\ext\sunjce_provider.jar;G:\Java\jdk1.8.0_162\jre\lib\ext\sunmscapi.jar;G:\Java\jdk1.8.0_162\jre\lib\ext\sunpkcs11.jar;G:\Java\jdk1.8.0_162\jre\lib\ext\zipfs.jar;G:\Java\jdk1.8.0_162\jre\lib\javaws.jar;G:\Java\jdk1.8.0_162\jre\lib\jce.jar;G:\Java\jdk1.8.0_162\jre\lib\jfr.jar;G:\Java\jdk1.8.0_162\jre\lib\jfxswt.jar;G:\Java\jdk1.8.0_162\jre\lib\jsse.jar;G:\Java\jdk1.8.0_162\jre\lib\management-agent.jar;G:\Java\jdk1.8.0_162\jre\lib\plugin.jar;G:\Java\jdk1.8.0_162\jre\lib\resources.jar;G:\Java\jdk1.8.0_162\jre\lib\rt.jar;G:\Java\IDEA_code\Day14\day14Date_DateFormat\out\production\day14Date_DateFormat;G:\Java\IntelliJ IDEA 16\IntelliJ IDEA 2016.1\lib\idea_rt.jar" com.intellij.rt.execution.application.AppMain jejune3.DateFormatDemo
18-7-22 下午11:31
Sun Jul 22 23:28:12 CST 2018

Process finished with exit code 0

 */