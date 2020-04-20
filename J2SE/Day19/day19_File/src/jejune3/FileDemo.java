package jejune3;

import java.io.File;
import java.io.IOException;

/**
 * Created by Jejune on 2018/8/7.
 *//*
 * 删除功能:public boolean delete()
 *
 * 注意：
 * 		A:如果你创建文件或者文件夹忘了写盘符路径，那么，默认在项目路径下。
 * 		B:Java中的删除不走回收站。
 * 		C:要删除一个文件夹，请注意该文件夹内不能包含文件或者文件夹
 */
public class FileDemo {
    public static void main(String[] args) throws IOException {
        // 创建文件
        // File file = new File("e:\\a.txt");
        // System.out.println("createNewFile:" + file.createNewFile());

        // 我不小心写成这个样子了
        File file = new File("a.txt");
        System.out.println("createNewFile:" + file.createNewFile());

        // 继续玩几个
        File file2 = new File("aaa\\bbb\\ccc");
        System.out.println("mkdirs:" + file2.mkdirs());

        // 删除功能：我要删除a.txt这个文件
        File file3 = new File("a.txt");
        System.out.println("delete:" + file3.delete());

        // 删除功能：我要删除ccc这个文件夹
        File file4 = new File("aaa\\bbb\\ccc");
        System.out.println("delete:" + file4.delete());

        // 删除功能：我要删除aaa文件夹
        // File file5 = new File("aaa");
        // System.out.println("delete:" + file5.delete());

        File file6 = new File("aaa\\bbb");
        File file7 = new File("aaa");
        System.out.println("delete:" + file6.delete());
        System.out.println("delete:" + file7.delete());
    }
}

/*
G:\Java\jdk1.8.0_162\bin\java -Didea.launcher.port=7533 "-Didea.launcher.bin.path=G:\Java\IntelliJ IDEA 16\IntelliJ IDEA 2016.1\bin" -Dfile.encoding=UTF-8 -classpath "G:\Java\jdk1.8.0_162\jre\lib\charsets.jar;G:\Java\jdk1.8.0_162\jre\lib\deploy.jar;G:\Java\jdk1.8.0_162\jre\lib\ext\access-bridge-64.jar;G:\Java\jdk1.8.0_162\jre\lib\ext\cldrdata.jar;G:\Java\jdk1.8.0_162\jre\lib\ext\dnsns.jar;G:\Java\jdk1.8.0_162\jre\lib\ext\jaccess.jar;G:\Java\jdk1.8.0_162\jre\lib\ext\jfxrt.jar;G:\Java\jdk1.8.0_162\jre\lib\ext\localedata.jar;G:\Java\jdk1.8.0_162\jre\lib\ext\nashorn.jar;G:\Java\jdk1.8.0_162\jre\lib\ext\sunec.jar;G:\Java\jdk1.8.0_162\jre\lib\ext\sunjce_provider.jar;G:\Java\jdk1.8.0_162\jre\lib\ext\sunmscapi.jar;G:\Java\jdk1.8.0_162\jre\lib\ext\sunpkcs11.jar;G:\Java\jdk1.8.0_162\jre\lib\ext\zipfs.jar;G:\Java\jdk1.8.0_162\jre\lib\javaws.jar;G:\Java\jdk1.8.0_162\jre\lib\jce.jar;G:\Java\jdk1.8.0_162\jre\lib\jfr.jar;G:\Java\jdk1.8.0_162\jre\lib\jfxswt.jar;G:\Java\jdk1.8.0_162\jre\lib\jsse.jar;G:\Java\jdk1.8.0_162\jre\lib\management-agent.jar;G:\Java\jdk1.8.0_162\jre\lib\plugin.jar;G:\Java\jdk1.8.0_162\jre\lib\resources.jar;G:\Java\jdk1.8.0_162\jre\lib\rt.jar;G:\Java\IDEA_code\Day19\day19_File\out\production\day19_File;G:\Java\IntelliJ IDEA 16\IntelliJ IDEA 2016.1\lib\idea_rt.jar" com.intellij.rt.execution.application.AppMain jejune3.FileDemo
createNewFile:true
mkdirs:true
delete:true
delete:true
delete:true
delete:true

Process finished with exit code 0

 */