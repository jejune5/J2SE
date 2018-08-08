package jejune2;

import java.io.*;
import java.util.Scanner;

/**
 * Created by Jejune on 2018/7/15.
 */
public class PhoneDemo {
    public static void main(String[] args) {
        Phone p = new iPhone();
        p.call();
        System.out.println("-----");

        //需求：我想在接电话前先，听彩铃
        PhoneDecorate pd = new RingPhoneDecorate(p);
        pd.call();
        System.out.println("------");

        //需求：在接电话后，听音乐
        pd = new MusicDecorate(p);
        pd.call();
        System.out.println("-----");

        //需求：想在接电话前听彩铃，接电话后听音乐
        //自己提供装饰类，在打电话前听听彩铃，打电话后听音乐
        pd = new RingPhoneDecorate(new MusicDecorate(p));
        pd.call();
        System.out.println("-----");

        //在IO流中使用
//        InputStream is = System.in;
//        InputStreamReader isr = new InputStreamReader(is);
//        BufferedReader br = new BufferedReader(isr);

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

        Scanner sc = new Scanner(System.in);

    }
}

/*
* G:\Java\jdk1.8.0_162\bin\java -Didea.launcher.port=7532 "-Didea.launcher.bin.path=G:\Java\IntelliJ IDEA 16\IntelliJ IDEA 2016.1\bin" -Dfile.encoding=UTF-8 -classpath "G:\Java\jdk1.8.0_162\jre\lib\charsets.jar;G:\Java\jdk1.8.0_162\jre\lib\deploy.jar;G:\Java\jdk1.8.0_162\jre\lib\ext\access-bridge-64.jar;G:\Java\jdk1.8.0_162\jre\lib\ext\cldrdata.jar;G:\Java\jdk1.8.0_162\jre\lib\ext\dnsns.jar;G:\Java\jdk1.8.0_162\jre\lib\ext\jaccess.jar;G:\Java\jdk1.8.0_162\jre\lib\ext\jfxrt.jar;G:\Java\jdk1.8.0_162\jre\lib\ext\localedata.jar;G:\Java\jdk1.8.0_162\jre\lib\ext\nashorn.jar;G:\Java\jdk1.8.0_162\jre\lib\ext\sunec.jar;G:\Java\jdk1.8.0_162\jre\lib\ext\sunjce_provider.jar;G:\Java\jdk1.8.0_162\jre\lib\ext\sunmscapi.jar;G:\Java\jdk1.8.0_162\jre\lib\ext\sunpkcs11.jar;G:\Java\jdk1.8.0_162\jre\lib\ext\zipfs.jar;G:\Java\jdk1.8.0_162\jre\lib\javaws.jar;G:\Java\jdk1.8.0_162\jre\lib\jce.jar;G:\Java\jdk1.8.0_162\jre\lib\jfr.jar;G:\Java\jdk1.8.0_162\jre\lib\jfxswt.jar;G:\Java\jdk1.8.0_162\jre\lib\jsse.jar;G:\Java\jdk1.8.0_162\jre\lib\management-agent.jar;G:\Java\jdk1.8.0_162\jre\lib\plugin.jar;G:\Java\jdk1.8.0_162\jre\lib\resources.jar;G:\Java\jdk1.8.0_162\jre\lib\rt.jar;G:\Java\IDEA_code\Day27\day27_Pattern\out\production\day27_Pattern;G:\Java\IntelliJ IDEA 16\IntelliJ IDEA 2016.1\lib\idea_rt.jar" com.intellij.rt.execution.application.AppMain jejune2.PhoneDemo
手机可以打电话！
-----
手机可以听彩铃!
手机可以打电话！
------
手机可以打电话！
可以听音乐
-----
手机可以听彩铃!
手机可以打电话！
可以听音乐
-----

Process finished with exit code 0

* */
