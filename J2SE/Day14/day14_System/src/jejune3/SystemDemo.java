package jejune3;

import java.util.Arrays;

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
 *				从指定源数组中复制一个数组，复制从指定的位置开始，到目标数组的指定位置结束。
 */
public class SystemDemo {
    public static void main(String[] args) {
        // 定义数组
        int[] arr = { 11, 22, 33, 44, 55 };
        int[] arr2 = { 6, 7, 8, 9, 10 };

        // 请大家看这个代码的意思
        //public static void arraycopy(Object src,int srcPos,Object dest,int destPos,int length)
        System.arraycopy(arr, 1, arr2, 2, 2);  //目标数组是arr2 则要对它变化

        System.out.println(Arrays.toString(arr)); //[11,22,33,44，55]
        System.out.println(Arrays.toString(arr2)); //[6，7，11，22，9,10]

    }
}
/*
G:\Java\jdk1.8.0_162\bin\java -Didea.launcher.port=7534 "-Didea.launcher.bin.path=G:\Java\IntelliJ IDEA 16\IntelliJ IDEA 2016.1\bin" -Dfile.encoding=UTF-8 -classpath "G:\Java\jdk1.8.0_162\jre\lib\charsets.jar;G:\Java\jdk1.8.0_162\jre\lib\deploy.jar;G:\Java\jdk1.8.0_162\jre\lib\ext\access-bridge-64.jar;G:\Java\jdk1.8.0_162\jre\lib\ext\cldrdata.jar;G:\Java\jdk1.8.0_162\jre\lib\ext\dnsns.jar;G:\Java\jdk1.8.0_162\jre\lib\ext\jaccess.jar;G:\Java\jdk1.8.0_162\jre\lib\ext\jfxrt.jar;G:\Java\jdk1.8.0_162\jre\lib\ext\localedata.jar;G:\Java\jdk1.8.0_162\jre\lib\ext\nashorn.jar;G:\Java\jdk1.8.0_162\jre\lib\ext\sunec.jar;G:\Java\jdk1.8.0_162\jre\lib\ext\sunjce_provider.jar;G:\Java\jdk1.8.0_162\jre\lib\ext\sunmscapi.jar;G:\Java\jdk1.8.0_162\jre\lib\ext\sunpkcs11.jar;G:\Java\jdk1.8.0_162\jre\lib\ext\zipfs.jar;G:\Java\jdk1.8.0_162\jre\lib\javaws.jar;G:\Java\jdk1.8.0_162\jre\lib\jce.jar;G:\Java\jdk1.8.0_162\jre\lib\jfr.jar;G:\Java\jdk1.8.0_162\jre\lib\jfxswt.jar;G:\Java\jdk1.8.0_162\jre\lib\jsse.jar;G:\Java\jdk1.8.0_162\jre\lib\management-agent.jar;G:\Java\jdk1.8.0_162\jre\lib\plugin.jar;G:\Java\jdk1.8.0_162\jre\lib\resources.jar;G:\Java\jdk1.8.0_162\jre\lib\rt.jar;G:\Java\IDEA_code\Day14\day14_System\out\production\day14_System;G:\Java\IntelliJ IDEA 16\IntelliJ IDEA 2016.1\lib\idea_rt.jar" com.intellij.rt.execution.application.AppMain jejune3.SystemDemo
[11, 22, 33, 44, 55]
[6, 7, 22, 33, 10]

Process finished with exit code 0


* */