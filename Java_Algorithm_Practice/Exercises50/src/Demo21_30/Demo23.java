package Demo21_30;

/**
 * Created by Jejune on 2018/8/10.
 */
/*
【程序23】   题目：有5个人坐在一起，
                 问第5个人多少岁？他说比第4个人大2岁。
                 问第4个人岁数，他说比第3个人大2岁。
                 问第3个人，又说比第2人大两岁。
                 问第2个人，说比第一个人大两岁。
                 问最后第1个人，他说是10岁。
                 请问第五个人多大？
 */
public class Demo23 {
    public static void main(String[] args) {
        int age1 = 10;
        for (int x = 2; x <= 5; x++) {
            age1 += 2;
        }
        System.out.println("第5个人" + age1 + "岁");
        System.out.println(Age(5));
    }

    private static int Age(int n) {
        if (n == 1) {
            return 10;
        } else {
            return 2 + Age(n - 1);
        }
    }
}
/*
G:\Java\jdk1.8.0_162\bin\java -Didea.launcher.port=7538 "-Didea.launcher.bin.path=G:\Java\IntelliJ IDEA 16\IntelliJ IDEA 2016.1\bin" -Dfile.encoding=UTF-8 -classpath "G:\Java\jdk1.8.0_162\jre\lib\charsets.jar;G:\Java\jdk1.8.0_162\jre\lib\deploy.jar;G:\Java\jdk1.8.0_162\jre\lib\ext\access-bridge-64.jar;G:\Java\jdk1.8.0_162\jre\lib\ext\cldrdata.jar;G:\Java\jdk1.8.0_162\jre\lib\ext\dnsns.jar;G:\Java\jdk1.8.0_162\jre\lib\ext\jaccess.jar;G:\Java\jdk1.8.0_162\jre\lib\ext\jfxrt.jar;G:\Java\jdk1.8.0_162\jre\lib\ext\localedata.jar;G:\Java\jdk1.8.0_162\jre\lib\ext\nashorn.jar;G:\Java\jdk1.8.0_162\jre\lib\ext\sunec.jar;G:\Java\jdk1.8.0_162\jre\lib\ext\sunjce_provider.jar;G:\Java\jdk1.8.0_162\jre\lib\ext\sunmscapi.jar;G:\Java\jdk1.8.0_162\jre\lib\ext\sunpkcs11.jar;G:\Java\jdk1.8.0_162\jre\lib\ext\zipfs.jar;G:\Java\jdk1.8.0_162\jre\lib\javaws.jar;G:\Java\jdk1.8.0_162\jre\lib\jce.jar;G:\Java\jdk1.8.0_162\jre\lib\jfr.jar;G:\Java\jdk1.8.0_162\jre\lib\jfxswt.jar;G:\Java\jdk1.8.0_162\jre\lib\jsse.jar;G:\Java\jdk1.8.0_162\jre\lib\management-agent.jar;G:\Java\jdk1.8.0_162\jre\lib\plugin.jar;G:\Java\jdk1.8.0_162\jre\lib\resources.jar;G:\Java\jdk1.8.0_162\jre\lib\rt.jar;G:\Java\Java_Algorithm_Practice\Exercises50\out\production\Exercises50;G:\Java\IntelliJ IDEA 16\IntelliJ IDEA 2016.1\lib\idea_rt.jar" com.intellij.rt.execution.application.AppMain Demo21_30.Demo23
第5个人18岁
18

Process finished with exit code 0

 */