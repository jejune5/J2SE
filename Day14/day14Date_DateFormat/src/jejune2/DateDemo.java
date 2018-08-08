package jejune2;


import java.util.Date;

/**
 * Created by Jejune on 2018/7/22.
 */
/*
 * public long getTime():获取时间，以毫秒为单位
 * public void setTime(long time):设置时间
 *
 * 从Date得到一个毫秒值
 * 		getTime()
 * 把一个毫秒值转换为Date
 * 		构造方法
 * 		setTime(long time)
 */
public class DateDemo {
    public static void main(String[] args) {
        // 创建对象
        Date d = new Date();

        // 获取时间
        long time = d.getTime();
        System.out.println(time);

        System.out.println("d: " + d);
        // 设置时间
        d.setTime(1000);
        System.out.println("d: " + d);
    }
}

/*

G:\Java\jdk1.8.0_162\bin\java -Didea.launcher.port=7534 "-Didea.launcher.bin.path=G:\Java\IntelliJ IDEA 16\IntelliJ IDEA 2016.1\bin" -Dfile.encoding=UTF-8 -classpath "G:\Java\jdk1.8.0_162\jre\lib\charsets.jar;G:\Java\jdk1.8.0_162\jre\lib\deploy.jar;G:\Java\jdk1.8.0_162\jre\lib\ext\access-bridge-64.jar;G:\Java\jdk1.8.0_162\jre\lib\ext\cldrdata.jar;G:\Java\jdk1.8.0_162\jre\lib\ext\dnsns.jar;G:\Java\jdk1.8.0_162\jre\lib\ext\jaccess.jar;G:\Java\jdk1.8.0_162\jre\lib\ext\jfxrt.jar;G:\Java\jdk1.8.0_162\jre\lib\ext\localedata.jar;G:\Java\jdk1.8.0_162\jre\lib\ext\nashorn.jar;G:\Java\jdk1.8.0_162\jre\lib\ext\sunec.jar;G:\Java\jdk1.8.0_162\jre\lib\ext\sunjce_provider.jar;G:\Java\jdk1.8.0_162\jre\lib\ext\sunmscapi.jar;G:\Java\jdk1.8.0_162\jre\lib\ext\sunpkcs11.jar;G:\Java\jdk1.8.0_162\jre\lib\ext\zipfs.jar;G:\Java\jdk1.8.0_162\jre\lib\javaws.jar;G:\Java\jdk1.8.0_162\jre\lib\jce.jar;G:\Java\jdk1.8.0_162\jre\lib\jfr.jar;G:\Java\jdk1.8.0_162\jre\lib\jfxswt.jar;G:\Java\jdk1.8.0_162\jre\lib\jsse.jar;G:\Java\jdk1.8.0_162\jre\lib\management-agent.jar;G:\Java\jdk1.8.0_162\jre\lib\plugin.jar;G:\Java\jdk1.8.0_162\jre\lib\resources.jar;G:\Java\jdk1.8.0_162\jre\lib\rt.jar;G:\Java\IDEA_code\Day14\day14Date_DateFormat\out\production\day14Date_DateFormat;G:\Java\IntelliJ IDEA 16\IntelliJ IDEA 2016.1\lib\idea_rt.jar" com.intellij.rt.execution.application.AppMain jejune2.DateDemo
1532272896536
d: Sun Jul 22 23:21:36 CST 2018
d: Thu Jan 01 08:00:01 CST 1970

Process finished with exit code 0

 */