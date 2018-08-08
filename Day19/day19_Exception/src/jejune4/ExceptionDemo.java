package jejune4;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;

/**
 * Created by Jejune on 2018/8/7.
 */
/*
 * 在try里面发现问题后，jvm会帮我们生成一个异常对象，然后把这个对象抛出，和catch里面的类进行匹配。
 * 如果该对象是某个类型的，就会执行该catch里面的处理信息。
 *
 * 异常中要了解的几个方法：
 * public String getMessage():异常的消息字符串
 * public String toString():返回异常的简单信息描述
 * 		此对象的类的 name(全路径名)
 * 		": "（冒号和一个空格）
 * 		调用此对象 getLocalizedMessage()方法的结果 (默认返回的是getMessage()的内容)
 * printStackTrace() 获取异常类名和异常信息，以及异常出现在程序中的位置。返回值void。把信息输出在控制台。
 */
public class ExceptionDemo {
    public static void main(String[] args) {
        String s = "2018-08-07";
        SimpleDateFormat sdf = new SimpleDateFormat("yyyy-MM-dd HH:mm:ss");
        try {
            Date d = sdf.parse(s);
            System.out.println(d);
        } catch (ParseException e) {
            // ParseException
            // e.printStackTrace();

            // getMessage()
            // System.out.println(e.getMessage());
            // Unparseable date: "2018-08-07"

            // toString()
            // System.out.println(e.toString());
            // java.text.ParseException: Unparseable date: "2018-08-07"
            e.printStackTrace();
        }
        System.out.println("over");
    }
}

/*
G:\Java\jdk1.8.0_162\bin\java -Didea.launcher.port=7539 "-Didea.launcher.bin.path=G:\Java\IntelliJ IDEA 16\IntelliJ IDEA 2016.1\bin" -Dfile.encoding=UTF-8 -classpath "G:\Java\jdk1.8.0_162\jre\lib\charsets.jar;G:\Java\jdk1.8.0_162\jre\lib\deploy.jar;G:\Java\jdk1.8.0_162\jre\lib\ext\access-bridge-64.jar;G:\Java\jdk1.8.0_162\jre\lib\ext\cldrdata.jar;G:\Java\jdk1.8.0_162\jre\lib\ext\dnsns.jar;G:\Java\jdk1.8.0_162\jre\lib\ext\jaccess.jar;G:\Java\jdk1.8.0_162\jre\lib\ext\jfxrt.jar;G:\Java\jdk1.8.0_162\jre\lib\ext\localedata.jar;G:\Java\jdk1.8.0_162\jre\lib\ext\nashorn.jar;G:\Java\jdk1.8.0_162\jre\lib\ext\sunec.jar;G:\Java\jdk1.8.0_162\jre\lib\ext\sunjce_provider.jar;G:\Java\jdk1.8.0_162\jre\lib\ext\sunmscapi.jar;G:\Java\jdk1.8.0_162\jre\lib\ext\sunpkcs11.jar;G:\Java\jdk1.8.0_162\jre\lib\ext\zipfs.jar;G:\Java\jdk1.8.0_162\jre\lib\javaws.jar;G:\Java\jdk1.8.0_162\jre\lib\jce.jar;G:\Java\jdk1.8.0_162\jre\lib\jfr.jar;G:\Java\jdk1.8.0_162\jre\lib\jfxswt.jar;G:\Java\jdk1.8.0_162\jre\lib\jsse.jar;G:\Java\jdk1.8.0_162\jre\lib\management-agent.jar;G:\Java\jdk1.8.0_162\jre\lib\plugin.jar;G:\Java\jdk1.8.0_162\jre\lib\resources.jar;G:\Java\jdk1.8.0_162\jre\lib\rt.jar;G:\Java\IDEA_code\Day19\day19_Exception\out\production\day19_Exception;G:\Java\IntelliJ IDEA 16\IntelliJ IDEA 2016.1\lib\idea_rt.jar" com.intellij.rt.execution.application.AppMain jejune4.ExceptionDemo
over
java.text.ParseException: Unparseable date: "2018-08-07"
	at java.text.DateFormat.parse(DateFormat.java:366)
	at jejune4.ExceptionDemo.main(ExceptionDemo.java:27)
	at sun.reflect.NativeMethodAccessorImpl.invoke0(Native Method)
	at sun.reflect.NativeMethodAccessorImpl.invoke(NativeMethodAccessorImpl.java:62)
	at sun.reflect.DelegatingMethodAccessorImpl.invoke(DelegatingMethodAccessorImpl.java:43)
	at java.lang.reflect.Method.invoke(Method.java:498)
	at com.intellij.rt.execution.application.AppMain.main(AppMain.java:144)

Process finished with exit code 0

 */