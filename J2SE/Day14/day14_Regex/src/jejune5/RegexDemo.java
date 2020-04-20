package jejune5;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

/**
 * Created by Jejune on 2018/7/22.
 */
/*
 * 获取功能
 *		Pattern和Matcher类的使用
 *
 *		模式和匹配器的基本使用顺序
 */
public class RegexDemo {
    public static void main(String[] args) {
// 模式和匹配器的典型调用顺序
        // 把正则表达式编译成模式对象
        Pattern p = Pattern.compile("a*b");  //*表示重复0次或多次
// 通过模式对象得到匹配器对象，这个时候需要的是被匹配的字符串
        Matcher m = p.matcher("aaaaab");
// 调用匹配器对象的功能
        boolean b = m.matches();
        System.out.println(b);
        System.out.println("------");

        //这个是判断功能，但是如果做判断，这样做就有点麻烦了，我们直接用字符串的方法做
        String s = "aaaaab";
        String regex = "a*b";
        boolean bb = s.matches(regex);
        System.out.println(bb);
    }
}

/*
* G:\Java\jdk1.8.0_162\bin\java -Didea.launcher.port=7534 "-Didea.launcher.bin.path=G:\Java\IntelliJ IDEA 16\IntelliJ IDEA 2016.1\bin" -Dfile.encoding=UTF-8 -classpath "G:\Java\jdk1.8.0_162\jre\lib\charsets.jar;G:\Java\jdk1.8.0_162\jre\lib\deploy.jar;G:\Java\jdk1.8.0_162\jre\lib\ext\access-bridge-64.jar;G:\Java\jdk1.8.0_162\jre\lib\ext\cldrdata.jar;G:\Java\jdk1.8.0_162\jre\lib\ext\dnsns.jar;G:\Java\jdk1.8.0_162\jre\lib\ext\jaccess.jar;G:\Java\jdk1.8.0_162\jre\lib\ext\jfxrt.jar;G:\Java\jdk1.8.0_162\jre\lib\ext\localedata.jar;G:\Java\jdk1.8.0_162\jre\lib\ext\nashorn.jar;G:\Java\jdk1.8.0_162\jre\lib\ext\sunec.jar;G:\Java\jdk1.8.0_162\jre\lib\ext\sunjce_provider.jar;G:\Java\jdk1.8.0_162\jre\lib\ext\sunmscapi.jar;G:\Java\jdk1.8.0_162\jre\lib\ext\sunpkcs11.jar;G:\Java\jdk1.8.0_162\jre\lib\ext\zipfs.jar;G:\Java\jdk1.8.0_162\jre\lib\javaws.jar;G:\Java\jdk1.8.0_162\jre\lib\jce.jar;G:\Java\jdk1.8.0_162\jre\lib\jfr.jar;G:\Java\jdk1.8.0_162\jre\lib\jfxswt.jar;G:\Java\jdk1.8.0_162\jre\lib\jsse.jar;G:\Java\jdk1.8.0_162\jre\lib\management-agent.jar;G:\Java\jdk1.8.0_162\jre\lib\plugin.jar;G:\Java\jdk1.8.0_162\jre\lib\resources.jar;G:\Java\jdk1.8.0_162\jre\lib\rt.jar;G:\Java\IDEA_code\Day14\day14_Regex\out\production\day14_Regex;G:\Java\IntelliJ IDEA 16\IntelliJ IDEA 2016.1\lib\idea_rt.jar" com.intellij.rt.execution.application.AppMain jejune5.RegexDemo
true
------
true

Process finished with exit code 0

* */