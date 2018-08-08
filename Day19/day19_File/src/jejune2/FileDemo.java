package jejune2;

import java.io.File;
import java.io.IOException;

/**
 * Created by Jejune on 2018/8/7.
 */
/*
 *创建功能：
 *public boolean createNewFile():创建文件 如果存在这样的文件，就不创建了
 *public boolean mkdir():创建文件夹 如果存在这样的文件夹，就不创建了
 *public boolean mkdirs():创建文件夹,如果父文件夹不存在，会帮你创建出来
 *
 *骑白马的不一定是王子，可能是班长。
 *注意：你到底要创建文件还是文件夹，你最清楚，方法不要调错了。
 */
public class FileDemo {
    public static void main(String[] args) throws IOException {
        // 需求：我要在e盘目录下创建一个文件夹Test
        File file = new File("G:\\Test");
        System.out.println("mkdir:" + file.mkdir());

        // 需求:我要在e盘目录demo下创建一个文件a.txt
        File file2 = new File("G:\\Test\\a.txt");
        System.out.println("createNewFile:" + file2.createNewFile());

        // 需求：我要在e盘目录test下创建一个文件b.txt
        // Exception in thread "main" java.io.IOException: 系统找不到指定的路径。
        // 注意：要想在某个目录下创建内容，该目录首先必须存在。
        // File file3 = new File("e:\\test\\b.txt");
        // System.out.println("createNewFile:" + file3.createNewFile());

        // 需求:我要在e盘目录test下创建aaa目录
        // File file4 = new File("e:\\test\\aaa");
        // System.out.println("mkdir:" + file4.mkdir());

        // File file5 = new File("e:\\test");
        // File file6 = new File("e:\\test\\aaa");
        // System.out.println("mkdir:" + file5.mkdir());
        // System.out.println("mkdir:" + file6.mkdir());

        // 其实我们有更简单的方法
        File file7 = new File("G:\\Test\\bbb\\ccc\\ddd");
        System.out.println("mkdirs:" + file7.mkdirs());

        // 看下面的这个东西：
        File file8 = new File("G:\\Test\\a.txt");
        System.out.println("mkdirs:" + file8.mkdirs());
    }
}

/*
G:\Java\jdk1.8.0_162\bin\java -Didea.launcher.port=7532 "-Didea.launcher.bin.path=G:\Java\IntelliJ IDEA 16\IntelliJ IDEA 2016.1\bin" -Dfile.encoding=UTF-8 -classpath "G:\Java\jdk1.8.0_162\jre\lib\charsets.jar;G:\Java\jdk1.8.0_162\jre\lib\deploy.jar;G:\Java\jdk1.8.0_162\jre\lib\ext\access-bridge-64.jar;G:\Java\jdk1.8.0_162\jre\lib\ext\cldrdata.jar;G:\Java\jdk1.8.0_162\jre\lib\ext\dnsns.jar;G:\Java\jdk1.8.0_162\jre\lib\ext\jaccess.jar;G:\Java\jdk1.8.0_162\jre\lib\ext\jfxrt.jar;G:\Java\jdk1.8.0_162\jre\lib\ext\localedata.jar;G:\Java\jdk1.8.0_162\jre\lib\ext\nashorn.jar;G:\Java\jdk1.8.0_162\jre\lib\ext\sunec.jar;G:\Java\jdk1.8.0_162\jre\lib\ext\sunjce_provider.jar;G:\Java\jdk1.8.0_162\jre\lib\ext\sunmscapi.jar;G:\Java\jdk1.8.0_162\jre\lib\ext\sunpkcs11.jar;G:\Java\jdk1.8.0_162\jre\lib\ext\zipfs.jar;G:\Java\jdk1.8.0_162\jre\lib\javaws.jar;G:\Java\jdk1.8.0_162\jre\lib\jce.jar;G:\Java\jdk1.8.0_162\jre\lib\jfr.jar;G:\Java\jdk1.8.0_162\jre\lib\jfxswt.jar;G:\Java\jdk1.8.0_162\jre\lib\jsse.jar;G:\Java\jdk1.8.0_162\jre\lib\management-agent.jar;G:\Java\jdk1.8.0_162\jre\lib\plugin.jar;G:\Java\jdk1.8.0_162\jre\lib\resources.jar;G:\Java\jdk1.8.0_162\jre\lib\rt.jar;G:\Java\IDEA_code\Day19\day19_File\out\production\day19_File;G:\Java\IntelliJ IDEA 16\IntelliJ IDEA 2016.1\lib\idea_rt.jar" com.intellij.rt.execution.application.AppMain jejune2.FileDemo
mkdir:false
createNewFile:true
mkdirs:true
mkdirs:false

Process finished with exit code 0

 */