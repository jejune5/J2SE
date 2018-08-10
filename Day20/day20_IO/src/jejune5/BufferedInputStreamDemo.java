package jejune5;

import java.io.BufferedInputStream;
import java.io.FileInputStream;
import java.io.IOException;

/**
 * Created by Jejune on 2018/8/10.
 */
/*
 * 注意：虽然我们有两种方式可以读取，但是，请注意，这两种方式针对同一个对象在一个代码中只能使用一个。
 */
public class BufferedInputStreamDemo {
    public static void main(String[] args) throws IOException {
// BufferedInputStream(InputStream in)
        BufferedInputStream bis = new BufferedInputStream(new FileInputStream(
                "bos.txt"));

        // 读取数据
        // int by = 0;
        // while ((by = bis.read()) != -1) {
        // System.out.print((char) by);
        // }
        // System.out.println("---------");

        byte[] bys = new byte[1024];
        int len = 0;
        while ((len = bis.read(bys)) != -1) {
            System.out.println(new String(bys, 0, len));
        }
        bis.close();
    }
}
/*
G:\Java\jdk1.8.0_162\bin\java -Didea.launcher.port=7541 "-Didea.launcher.bin.path=G:\Java\IntelliJ IDEA 16\IntelliJ IDEA 2016.1\bin" -Dfile.encoding=UTF-8 -classpath "G:\Java\jdk1.8.0_162\jre\lib\charsets.jar;G:\Java\jdk1.8.0_162\jre\lib\deploy.jar;G:\Java\jdk1.8.0_162\jre\lib\ext\access-bridge-64.jar;G:\Java\jdk1.8.0_162\jre\lib\ext\cldrdata.jar;G:\Java\jdk1.8.0_162\jre\lib\ext\dnsns.jar;G:\Java\jdk1.8.0_162\jre\lib\ext\jaccess.jar;G:\Java\jdk1.8.0_162\jre\lib\ext\jfxrt.jar;G:\Java\jdk1.8.0_162\jre\lib\ext\localedata.jar;G:\Java\jdk1.8.0_162\jre\lib\ext\nashorn.jar;G:\Java\jdk1.8.0_162\jre\lib\ext\sunec.jar;G:\Java\jdk1.8.0_162\jre\lib\ext\sunjce_provider.jar;G:\Java\jdk1.8.0_162\jre\lib\ext\sunmscapi.jar;G:\Java\jdk1.8.0_162\jre\lib\ext\sunpkcs11.jar;G:\Java\jdk1.8.0_162\jre\lib\ext\zipfs.jar;G:\Java\jdk1.8.0_162\jre\lib\javaws.jar;G:\Java\jdk1.8.0_162\jre\lib\jce.jar;G:\Java\jdk1.8.0_162\jre\lib\jfr.jar;G:\Java\jdk1.8.0_162\jre\lib\jfxswt.jar;G:\Java\jdk1.8.0_162\jre\lib\jsse.jar;G:\Java\jdk1.8.0_162\jre\lib\management-agent.jar;G:\Java\jdk1.8.0_162\jre\lib\plugin.jar;G:\Java\jdk1.8.0_162\jre\lib\resources.jar;G:\Java\jdk1.8.0_162\jre\lib\rt.jar;G:\Java\J2SE\Day20\day20_IO\out\production\day20_IO;G:\Java\IntelliJ IDEA 16\IntelliJ IDEA 2016.1\lib\idea_rt.jar" com.intellij.rt.execution.application.AppMain jejune5.BufferedInputStreamDemo
Hello,Java

Process finished with exit code 0

 */