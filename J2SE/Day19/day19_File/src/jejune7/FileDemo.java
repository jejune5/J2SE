package jejune7;

import java.io.File;

/**
 * Created by Jejune on 2018/8/7.
 */
/*
 * 获取功能：
 * public String[] list():获取指定目录下的所有文件或者文件夹的名称数组
 * public File[] listFiles():获取指定目录下的所有文件或者文件夹的File数组
 */
public class FileDemo {
    public static void main(String[] args) {
        // 指定一个目录
        File file = new File("G:\\");

        // public String[] list():获取指定目录下的所有文件或者文件夹的名称数组
        String[] strArray = file.list();
        for (String s : strArray) {
            System.out.println(s);
        }
        System.out.println("------------");

        //public File[] listFiles():获取指定目录下的所有文件或者文件夹的File数组
        File[] fileArray = file.listFiles();
        for (File f : fileArray) {
            System.out.println(f.getName());
        }

    }
}

/*
G:\Java\jdk1.8.0_162\bin\java -Didea.launcher.port=7541 "-Didea.launcher.bin.path=G:\Java\IntelliJ IDEA 16\IntelliJ IDEA 2016.1\bin" -Dfile.encoding=UTF-8 -classpath "G:\Java\jdk1.8.0_162\jre\lib\charsets.jar;G:\Java\jdk1.8.0_162\jre\lib\deploy.jar;G:\Java\jdk1.8.0_162\jre\lib\ext\access-bridge-64.jar;G:\Java\jdk1.8.0_162\jre\lib\ext\cldrdata.jar;G:\Java\jdk1.8.0_162\jre\lib\ext\dnsns.jar;G:\Java\jdk1.8.0_162\jre\lib\ext\jaccess.jar;G:\Java\jdk1.8.0_162\jre\lib\ext\jfxrt.jar;G:\Java\jdk1.8.0_162\jre\lib\ext\localedata.jar;G:\Java\jdk1.8.0_162\jre\lib\ext\nashorn.jar;G:\Java\jdk1.8.0_162\jre\lib\ext\sunec.jar;G:\Java\jdk1.8.0_162\jre\lib\ext\sunjce_provider.jar;G:\Java\jdk1.8.0_162\jre\lib\ext\sunmscapi.jar;G:\Java\jdk1.8.0_162\jre\lib\ext\sunpkcs11.jar;G:\Java\jdk1.8.0_162\jre\lib\ext\zipfs.jar;G:\Java\jdk1.8.0_162\jre\lib\javaws.jar;G:\Java\jdk1.8.0_162\jre\lib\jce.jar;G:\Java\jdk1.8.0_162\jre\lib\jfr.jar;G:\Java\jdk1.8.0_162\jre\lib\jfxswt.jar;G:\Java\jdk1.8.0_162\jre\lib\jsse.jar;G:\Java\jdk1.8.0_162\jre\lib\management-agent.jar;G:\Java\jdk1.8.0_162\jre\lib\plugin.jar;G:\Java\jdk1.8.0_162\jre\lib\resources.jar;G:\Java\jdk1.8.0_162\jre\lib\rt.jar;G:\Java\IDEA_code\Day19\day19_File\out\production\day19_File;G:\Java\IntelliJ IDEA 16\IntelliJ IDEA 2016.1\lib\idea_rt.jar" com.intellij.rt.execution.application.AppMain jejune7.FileDemo
$RECYCLE.BIN
Android
Android Studio
Apache24
demo
eclipse
jad
Java
keil
matlab7
mmm
MySQL
netbeans-7.4-javase-windows
Notepad++
PLC
Python
ss_win_temp
System Volume Information
Test
vb6.0
快捷
茅敏敏
------------
$RECYCLE.BIN
Android
Android Studio
Apache24
demo
eclipse
jad
Java
keil
matlab7
mmm
MySQL
netbeans-7.4-javase-windows
Notepad++
PLC
Python
ss_win_temp
System Volume Information
Test
vb6.0
快捷
茅敏敏

Process finished with exit code 0

 */