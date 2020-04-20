package jejune2;

import java.io.FileInputStream;
import java.io.IOException;

/**
 * Created by Jejune on 2018/8/10.
 */
/*
 * 字节输入流操作步骤：
 * A:创建字节输入流对象
 * B:调用read()方法读取数据，并把数据显示在控制台
 * C:释放资源
 *
 * 读取数据的方式：
 * A:int read():一次读取一个字节
 * B:int read(byte[] b):一次读取一个字节数组
 */
public class FileInputStreamDemo {
    public static void main(String[] args) throws IOException {
        // FileInputStream(String name)
        // FileInputStream fis = new FileInputStream("fis.txt");
        FileInputStream fis = new FileInputStream("FileOutputStreamDemo.java");
        // // 调用read()方法读取数据，并把数据显示在控制台
        // // 第一次读取
        // int by = fis.read();
        // System.out.println(by);
        // System.out.println((char) by);
        //
        // // 第二次读取
        // by = fis.read();
        // System.out.println(by);
        // System.out.println((char) by);
        //
        // // 第三次读取
        // by = fis.read();
        // System.out.println(by);
        // System.out.println((char) by);
        // // 我们发现代码的重复度很高，所以我们要用循环改进
        // // 而用循环，最麻烦的事情是如何控制循环判断条件呢?
        // // 第四次读取
        // by = fis.read();
        // System.out.println(by);
        // // 第五次读取
        // by = fis.read();
        // System.out.println(by);
        // //通过测试，我们知道如果你读取的数据是-1，就说明已经读取到文件的末尾了

        // 用循环改进
        // int by = fis.read();
        // while (by != -1) {
        // System.out.print((char) by);
        // by = fis.read();
        // }

// 最终版代码
        int by = 0;
        //读取，赋值，判断
        while ((by = fis.read()) != -1) {
            System.out.print((char) by);
        }
        fis.close();
    }
}

/*
G:\Java\jdk1.8.0_162\bin\java -Didea.launcher.port=7537 "-Didea.launcher.bin.path=G:\Java\IntelliJ IDEA 16\IntelliJ IDEA 2016.1\bin" -Dfile.encoding=UTF-8 -classpath "G:\Java\jdk1.8.0_162\jre\lib\charsets.jar;G:\Java\jdk1.8.0_162\jre\lib\deploy.jar;G:\Java\jdk1.8.0_162\jre\lib\ext\access-bridge-64.jar;G:\Java\jdk1.8.0_162\jre\lib\ext\cldrdata.jar;G:\Java\jdk1.8.0_162\jre\lib\ext\dnsns.jar;G:\Java\jdk1.8.0_162\jre\lib\ext\jaccess.jar;G:\Java\jdk1.8.0_162\jre\lib\ext\jfxrt.jar;G:\Java\jdk1.8.0_162\jre\lib\ext\localedata.jar;G:\Java\jdk1.8.0_162\jre\lib\ext\nashorn.jar;G:\Java\jdk1.8.0_162\jre\lib\ext\sunec.jar;G:\Java\jdk1.8.0_162\jre\lib\ext\sunjce_provider.jar;G:\Java\jdk1.8.0_162\jre\lib\ext\sunmscapi.jar;G:\Java\jdk1.8.0_162\jre\lib\ext\sunpkcs11.jar;G:\Java\jdk1.8.0_162\jre\lib\ext\zipfs.jar;G:\Java\jdk1.8.0_162\jre\lib\javaws.jar;G:\Java\jdk1.8.0_162\jre\lib\jce.jar;G:\Java\jdk1.8.0_162\jre\lib\jfr.jar;G:\Java\jdk1.8.0_162\jre\lib\jfxswt.jar;G:\Java\jdk1.8.0_162\jre\lib\jsse.jar;G:\Java\jdk1.8.0_162\jre\lib\management-agent.jar;G:\Java\jdk1.8.0_162\jre\lib\plugin.jar;G:\Java\jdk1.8.0_162\jre\lib\resources.jar;G:\Java\jdk1.8.0_162\jre\lib\rt.jar;G:\Java\J2SE\Day20\day20_IO\out\production\day20_IO;G:\Java\IntelliJ IDEA 16\IntelliJ IDEA 2016.1\lib\idea_rt.jar" com.intellij.rt.execution.application.AppMain jejune2.FileInputStreamDemo
Hello,IOJava
Process finished with exit code 0

 */