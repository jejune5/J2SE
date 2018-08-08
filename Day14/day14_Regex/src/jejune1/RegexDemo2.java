package jejune1;

import java.util.Scanner;

/**
 * Created by Jejune on 2018/7/22.
 */
//校验qq号码改进版
public class RegexDemo2 {
    public static void main(String[] args) {
        //A 键盘录入
        Scanner sc = new Scanner(System.in);
        System.out.println("请输入你的QQ号：");
        String QQNumber = sc.nextLine();

        System.out.println("checkQQ: " + checkQQ(QQNumber));
    }

    private static boolean checkQQ(String qqNumber) {
        // String regex ="[1-9][0-9]{4,14}";
        // //public boolean matches(String regex)告知此字符串是否匹配给定的正则表达式
        // boolean flag = qq.matches(regex);
        // return flag;

        //return qq.matches("[1-9][0-9]{4,14}");
        return qqNumber.matches("[1-9]\\d{4,14}");  //d{4,14}表示 4到14位数字，因为已去掉开头
    }
}

/*
G:\Java\jdk1.8.0_162\bin\java -Didea.launcher.port=7533 "-Didea.launcher.bin.path=G:\Java\IntelliJ IDEA 16\IntelliJ IDEA 2016.1\bin" -Dfile.encoding=UTF-8 -classpath "G:\Java\jdk1.8.0_162\jre\lib\charsets.jar;G:\Java\jdk1.8.0_162\jre\lib\deploy.jar;G:\Java\jdk1.8.0_162\jre\lib\ext\access-bridge-64.jar;G:\Java\jdk1.8.0_162\jre\lib\ext\cldrdata.jar;G:\Java\jdk1.8.0_162\jre\lib\ext\dnsns.jar;G:\Java\jdk1.8.0_162\jre\lib\ext\jaccess.jar;G:\Java\jdk1.8.0_162\jre\lib\ext\jfxrt.jar;G:\Java\jdk1.8.0_162\jre\lib\ext\localedata.jar;G:\Java\jdk1.8.0_162\jre\lib\ext\nashorn.jar;G:\Java\jdk1.8.0_162\jre\lib\ext\sunec.jar;G:\Java\jdk1.8.0_162\jre\lib\ext\sunjce_provider.jar;G:\Java\jdk1.8.0_162\jre\lib\ext\sunmscapi.jar;G:\Java\jdk1.8.0_162\jre\lib\ext\sunpkcs11.jar;G:\Java\jdk1.8.0_162\jre\lib\ext\zipfs.jar;G:\Java\jdk1.8.0_162\jre\lib\javaws.jar;G:\Java\jdk1.8.0_162\jre\lib\jce.jar;G:\Java\jdk1.8.0_162\jre\lib\jfr.jar;G:\Java\jdk1.8.0_162\jre\lib\jfxswt.jar;G:\Java\jdk1.8.0_162\jre\lib\jsse.jar;G:\Java\jdk1.8.0_162\jre\lib\management-agent.jar;G:\Java\jdk1.8.0_162\jre\lib\plugin.jar;G:\Java\jdk1.8.0_162\jre\lib\resources.jar;G:\Java\jdk1.8.0_162\jre\lib\rt.jar;G:\Java\IDEA_code\Day14\day14_Regex\out\production\day14_Regex;G:\Java\IntelliJ IDEA 16\IntelliJ IDEA 2016.1\lib\idea_rt.jar" com.intellij.rt.execution.application.AppMain jejune1.RegexDemo2
        请输入你的QQ号：
        514352566
        checkQQ: true

        Process finished with exit code 0
*/