package jejune2;

/**
 * Created by Jejune on 2018/7/22.
 */
/*
 * System类包含一些有用的类字段和方法。它不能被实例化。
 *
 * 方法：
 * 		public static void gc()：运行垃圾回收器。
 *		public static void exit(int status):终止当前正在运行的 Java 虚拟机。参数用作状态码；根据惯例，非 0 的状态码表示异常终止。
 *		public static long currentTimeMillis():返回以毫秒为单位的当前时间
 *		public static void arraycopy(Object src,int srcPos,Object dest,int destPos,int length)
 */
public class SystemDemo {
    public static void main(String[] args) {
        // System.out.println("我们喜欢林青霞(东方不败)");
        // System.exit(0);
        // System.out.println("我们也喜欢赵雅芝(白娘子)");

        // System.out.println(System.currentTimeMillis());

        // 单独得到这样的实际目前对我们来说意义不大
        // 那么，它到底有什么作用呢?
        // 要求：请大家给我统计这段程序的运行时间

        long start = System.currentTimeMillis();
        for(int x = 0 ;x<100000; x++) {
            System.out.println("Hello");
        }
        long end = System.currentTimeMillis();
        System.out.println("共耗时："+(end - start)+"毫秒");
    }
}

/*
G:\Java\jdk1.8.0_162\bin\java -Didea.launcher.port=7532 "-Didea.launcher.bin.path=G:\Java\IntelliJ IDEA 16\IntelliJ IDEA 2016.1\bin" -Dfile.encoding=UTF-8 -classpath "G:\Java\jdk1.8.0_162\jre\lib\charsets.jar;G:\Java\jdk1.8.0_162\jre\lib\deploy.jar;G:\Java\jdk1.8.0_162\jre\lib\ext\access-bridge-64.jar;G:\Java\jdk1.8.0_162\jre\lib\ext\cldrdata.jar;G:\Java\jdk1.8.0_162\jre\lib\ext\dnsns.jar;G:\Java\jdk1.8.0_162\jre\lib\ext\jaccess.jar;G:\Java\jdk1.8.0_162\jre\lib\ext\jfxrt.jar;G:\Java\jdk1.8.0_162\jre\lib\ext\localedata.jar;G:\Java\jdk1.8.0_162\jre\lib\ext\nashorn.jar;G:\Java\jdk1.8.0_162\jre\lib\ext\sunec.jar;G:\Java\jdk1.8.0_162\jre\lib\ext\sunjce_provider.jar;G:\Java\jdk1.8.0_162\jre\lib\ext\sunmscapi.jar;G:\Java\jdk1.8.0_162\jre\lib\ext\sunpkcs11.jar;G:\Java\jdk1.8.0_162\jre\lib\ext\zipfs.jar;G:\Java\jdk1.8.0_162\jre\lib\javaws.jar;G:\Java\jdk1.8.0_162\jre\lib\jce.jar;G:\Java\jdk1.8.0_162\jre\lib\jfr.jar;G:\Java\jdk1.8.0_162\jre\lib\jfxswt.jar;G:\Java\jdk1.8.0_162\jre\lib\jsse.jar;G:\Java\jdk1.8.0_162\jre\lib\management-agent.jar;G:\Java\jdk1.8.0_162\jre\lib\plugin.jar;G:\Java\jdk1.8.0_162\jre\lib\resources.jar;G:\Java\jdk1.8.0_162\jre\lib\rt.jar;G:\Java\IDEA_code\Day14\day14_System\out\production\day14_System;G:\Java\IntelliJ IDEA 16\IntelliJ IDEA 2016.1\lib\idea_rt.jar" com.intellij.rt.execution.application.AppMain jejune2.SystemDemo
  Hello
* .
* .
* .
* Hello
  Hello
共耗时：1723毫秒

Process finished with exit code 0
* */