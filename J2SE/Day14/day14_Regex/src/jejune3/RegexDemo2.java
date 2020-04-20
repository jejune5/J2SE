package jejune3;

/**
 * Created by Jejune on 2018/7/22.
 */
//分割练习
public class RegexDemo2 {
    public static void main(String[] args) {
        //str1
        String s1 = "aa,bb,cc";
        //直接分割
        String[] strArray1 = s1.split(",");
        for (int x = 0; x < strArray1.length; x++) {
            System.out.println(strArray1[x]);
        }
        System.out.println("-----");

        //str2
        String s2 = "aa.bb.cc";
        String[] strArray2 = s2.split("\\.");    //注意需要加双斜杠表示转义
        for (int x = 0; x < strArray2.length; x++) {
            System.out.println(strArray2[x]);
        }
        System.out.println("------");

        //str3
        String s3 = "aa    bb                cc";
        String[] strArray3 = s3.split(" +");
        for (int x = 0; x < strArray3.length; x++) {
            System.out.println(strArray3[x]);
        }
        System.out.println("------");

        //str4
        String s4 = "E:\\JavaSE\\day14\\avi";
        String[] strArray4 = s4.split("\\\\");
        for (int x = 0; x < strArray4.length; x++) {
            System.out.println(strArray4[x]);
        }
        System.out.println("------");
    }
}

/*
* G:\Java\jdk1.8.0_162\bin\java -Didea.launcher.port=7535 "-Didea.launcher.bin.path=G:\Java\IntelliJ IDEA 16\IntelliJ IDEA 2016.1\bin" -Dfile.encoding=UTF-8 -classpath "G:\Java\jdk1.8.0_162\jre\lib\charsets.jar;G:\Java\jdk1.8.0_162\jre\lib\deploy.jar;G:\Java\jdk1.8.0_162\jre\lib\ext\access-bridge-64.jar;G:\Java\jdk1.8.0_162\jre\lib\ext\cldrdata.jar;G:\Java\jdk1.8.0_162\jre\lib\ext\dnsns.jar;G:\Java\jdk1.8.0_162\jre\lib\ext\jaccess.jar;G:\Java\jdk1.8.0_162\jre\lib\ext\jfxrt.jar;G:\Java\jdk1.8.0_162\jre\lib\ext\localedata.jar;G:\Java\jdk1.8.0_162\jre\lib\ext\nashorn.jar;G:\Java\jdk1.8.0_162\jre\lib\ext\sunec.jar;G:\Java\jdk1.8.0_162\jre\lib\ext\sunjce_provider.jar;G:\Java\jdk1.8.0_162\jre\lib\ext\sunmscapi.jar;G:\Java\jdk1.8.0_162\jre\lib\ext\sunpkcs11.jar;G:\Java\jdk1.8.0_162\jre\lib\ext\zipfs.jar;G:\Java\jdk1.8.0_162\jre\lib\javaws.jar;G:\Java\jdk1.8.0_162\jre\lib\jce.jar;G:\Java\jdk1.8.0_162\jre\lib\jfr.jar;G:\Java\jdk1.8.0_162\jre\lib\jfxswt.jar;G:\Java\jdk1.8.0_162\jre\lib\jsse.jar;G:\Java\jdk1.8.0_162\jre\lib\management-agent.jar;G:\Java\jdk1.8.0_162\jre\lib\plugin.jar;G:\Java\jdk1.8.0_162\jre\lib\resources.jar;G:\Java\jdk1.8.0_162\jre\lib\rt.jar;G:\Java\IDEA_code\Day14\day14_Regex\out\production\day14_Regex;G:\Java\IntelliJ IDEA 16\IntelliJ IDEA 2016.1\lib\idea_rt.jar" com.intellij.rt.execution.application.AppMain jejune3.RegexDemo2
aa
bb
cc
-----
aa
bb
cc
------
aa
bb
cc
------
E:
JavaSE
day14
avi
------

Process finished with exit code 0

* */