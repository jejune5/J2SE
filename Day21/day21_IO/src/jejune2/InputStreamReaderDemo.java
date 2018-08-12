package jejune2;

import java.io.FileInputStream;
import java.io.IOException;
import java.io.InputStreamReader;

/**
 * Created by Jejune on 2018/8/10.
 */
/*
 * InputStreamReader(InputStream is):用默认的编码读取数据
 * InputStreamReader(InputStream is,String charsetName):用指定的编码读取数据
 */
public class InputStreamReaderDemo {
    public static void main(String[] args) throws IOException {
        // 创建对象
        // InputStreamReader isr = new InputStreamReader(new FileInputStream(
        // "osw.txt"));

        // InputStreamReader isr = new InputStreamReader(new FileInputStream(
        // "osw.txt"), "GBK");
        InputStreamReader isr = new InputStreamReader(new FileInputStream("osw.txt"), "GBK");

        // 读取数据
        // 一次读取一个字符
        int ch = 0;
        while ((ch = isr.read()) != -1) {
            System.out.print((char) ch);
        }
        isr.close();
    }
}

/*
G:\Java\jdk1.8.0_162\bin\java -Didea.launcher.port=7535 "-Didea.launcher.bin.path=G:\Java\IntelliJ IDEA 16\IntelliJ IDEA 2016.1\bin" -Dfile.encoding=UTF-8 -classpath "G:\Java\jdk1.8.0_162\jre\lib\charsets.jar;G:\Java\jdk1.8.0_162\jre\lib\deploy.jar;G:\Java\jdk1.8.0_162\jre\lib\ext\access-bridge-64.jar;G:\Java\jdk1.8.0_162\jre\lib\ext\cldrdata.jar;G:\Java\jdk1.8.0_162\jre\lib\ext\dnsns.jar;G:\Java\jdk1.8.0_162\jre\lib\ext\jaccess.jar;G:\Java\jdk1.8.0_162\jre\lib\ext\jfxrt.jar;G:\Java\jdk1.8.0_162\jre\lib\ext\localedata.jar;G:\Java\jdk1.8.0_162\jre\lib\ext\nashorn.jar;G:\Java\jdk1.8.0_162\jre\lib\ext\sunec.jar;G:\Java\jdk1.8.0_162\jre\lib\ext\sunjce_provider.jar;G:\Java\jdk1.8.0_162\jre\lib\ext\sunmscapi.jar;G:\Java\jdk1.8.0_162\jre\lib\ext\sunpkcs11.jar;G:\Java\jdk1.8.0_162\jre\lib\ext\zipfs.jar;G:\Java\jdk1.8.0_162\jre\lib\javaws.jar;G:\Java\jdk1.8.0_162\jre\lib\jce.jar;G:\Java\jdk1.8.0_162\jre\lib\jfr.jar;G:\Java\jdk1.8.0_162\jre\lib\jfxswt.jar;G:\Java\jdk1.8.0_162\jre\lib\jsse.jar;G:\Java\jdk1.8.0_162\jre\lib\management-agent.jar;G:\Java\jdk1.8.0_162\jre\lib\plugin.jar;G:\Java\jdk1.8.0_162\jre\lib\resources.jar;G:\Java\jdk1.8.0_162\jre\lib\rt.jar;G:\Java\J2SE\Day21\day21_IO\out\production\day21_IO;G:\Java\IntelliJ IDEA 16\IntelliJ IDEA 2016.1\lib\idea_rt.jar" com.intellij.rt.execution.application.AppMain jejune2.jejune3.InputStreamReaderDemo
鑼呮晱鏁忥紝
666
鎾掓瘮
Process finished with exit code 0

 */