package jejune5;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;


/**
 * Created by Jejune on 2018/8/7.
 */
/*
 * 有些时候，我们是可以对异常进行处理的，但是又有些时候，我们根本就没有权限去处理某个异常。
 * 或者说，我处理不了，我就不处理了。
 * 为了解决出错问题，Java针对这种情况，就提供了另一种处理方案：抛出。
 *
 * 格式：
 * 		throws 异常类名
 * 		注意：这个格式必须跟在方法的括号后面。
 *
 * 注意：
 * 		尽量不要在main方法上抛出异常。
 * 		但是我讲课为了方便我就这样做了。
 *
 * 小结：
 * 		编译期异常抛出，将来调用者必须处理。
 * 		运行期异常抛出，将来调用可以不用处理。
 */
public class ExceptionDemo {
    public static void main(String[] args) {
        System.out.println("今天天气很好");
        try {
            method();
        } catch (ParseException e) {
            e.printStackTrace();
        }
        System.out.println("但是就是不该有雾霾");

        method2();

    }

    private static void method2() throws ArithmeticException {
        int a = 10;
        int b = 0;
        System.out.println(a / b);
    }

    private static void method() throws ParseException {
        String s = "2018-08-07";
        SimpleDateFormat sdf = new SimpleDateFormat("yyyy-MM-dd HH:mm:ss");
        Date d = sdf.parse(s);
        System.out.println(d);
    }
}

/*
G:\Java\jdk1.8.0_162\bin\java -Didea.launcher.port=7540 "-Didea.launcher.bin.path=G:\Java\IntelliJ IDEA 16\IntelliJ IDEA 2016.1\bin" -Dfile.encoding=UTF-8 -classpath "G:\Java\jdk1.8.0_162\jre\lib\charsets.jar;G:\Java\jdk1.8.0_162\jre\lib\deploy.jar;G:\Java\jdk1.8.0_162\jre\lib\ext\access-bridge-64.jar;G:\Java\jdk1.8.0_162\jre\lib\ext\cldrdata.jar;G:\Java\jdk1.8.0_162\jre\lib\ext\dnsns.jar;G:\Java\jdk1.8.0_162\jre\lib\ext\jaccess.jar;G:\Java\jdk1.8.0_162\jre\lib\ext\jfxrt.jar;G:\Java\jdk1.8.0_162\jre\lib\ext\localedata.jar;G:\Java\jdk1.8.0_162\jre\lib\ext\nashorn.jar;G:\Java\jdk1.8.0_162\jre\lib\ext\sunec.jar;G:\Java\jdk1.8.0_162\jre\lib\ext\sunjce_provider.jar;G:\Java\jdk1.8.0_162\jre\lib\ext\sunmscapi.jar;G:\Java\jdk1.8.0_162\jre\lib\ext\sunpkcs11.jar;G:\Java\jdk1.8.0_162\jre\lib\ext\zipfs.jar;G:\Java\jdk1.8.0_162\jre\lib\javaws.jar;G:\Java\jdk1.8.0_162\jre\lib\jce.jar;G:\Java\jdk1.8.0_162\jre\lib\jfr.jar;G:\Java\jdk1.8.0_162\jre\lib\jfxswt.jar;G:\Java\jdk1.8.0_162\jre\lib\jsse.jar;G:\Java\jdk1.8.0_162\jre\lib\management-agent.jar;G:\Java\jdk1.8.0_162\jre\lib\plugin.jar;G:\Java\jdk1.8.0_162\jre\lib\resources.jar;G:\Java\jdk1.8.0_162\jre\lib\rt.jar;G:\Java\IDEA_code\Day19\day19_Exception\out\production\day19_Exception;G:\Java\IntelliJ IDEA 16\IntelliJ IDEA 2016.1\lib\idea_rt.jar" com.intellij.rt.execution.application.AppMain jejune5.ExceptionDemo
今天天气很好
但是就是不该有雾霾
java.text.ParseException: Unparseable date: "2018-08-07"
	at java.text.DateFormat.parse(DateFormat.java:366)
	at jejune5.ExceptionDemo.method(ExceptionDemo.java:51)
	at jejune5.ExceptionDemo.main(ExceptionDemo.java:32)
	at sun.reflect.NativeMethodAccessorImpl.invoke0(Native Method)
	at sun.reflect.NativeMethodAccessorImpl.invoke(NativeMethodAccessorImpl.java:62)
	at sun.reflect.DelegatingMethodAccessorImpl.invoke(DelegatingMethodAccessorImpl.java:43)
	at java.lang.reflect.Method.invoke(Method.java:498)
	at com.intellij.rt.execution.application.AppMain.main(AppMain.java:144)
Exception in thread "main" java.lang.ArithmeticException: / by zero
	at jejune5.ExceptionDemo.method2(ExceptionDemo.java:45)
	at jejune5.ExceptionDemo.main(ExceptionDemo.java:38)
	at sun.reflect.NativeMethodAccessorImpl.invoke0(Native Method)
	at sun.reflect.NativeMethodAccessorImpl.invoke(NativeMethodAccessorImpl.java:62)
	at sun.reflect.DelegatingMethodAccessorImpl.invoke(DelegatingMethodAccessorImpl.java:43)
	at java.lang.reflect.Method.invoke(Method.java:498)
	at com.intellij.rt.execution.application.AppMain.main(AppMain.java:144)

Process finished with exit code 1

 */