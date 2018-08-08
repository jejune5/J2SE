package jejune2;

/**
 * Created by Jejune on 2018/7/17.
 */
public class DirectionDemo {
    public static void main(String[] args) {
        Direction d = Direction.FRONT;
        System.out.println(d);
        // public String toString()返回枚举常量的名称，它包含在声明中。
        System.out.println("------");

        Direction2 d2 = Direction2.FRONT;
        System.out.println(d2);
        System.out.println(d2.getName());
        System.out.println("------");

        Direction3 d3 = Direction3.FRONT;
        System.out.println(d3);
        System.out.println(d3.getName());
        d3.show();
        System.out.println("------");

        Direction3 dd = Direction3.FRONT;
        dd = Direction3.BEHIND;
        switch (dd) {
            case FRONT:
                System.out.println("你选择了前!");
                break;
            case BEHIND:
                System.out.println("你选择了后！");
                break;
            case Left:
                System.out.println("你选择了左！");
                break;
            case RIGHT:
                System.out.println("你选择了右!");
                break;
        }
    }
}

/*
* G:\Java\jdk1.8.0_162\bin\java -Didea.launcher.port=7534 "-Didea.launcher.bin.path=G:\Java\IntelliJ IDEA 16\IntelliJ IDEA 2016.1\bin" -Dfile.encoding=UTF-8 -classpath "G:\Java\jdk1.8.0_162\jre\lib\charsets.jar;G:\Java\jdk1.8.0_162\jre\lib\deploy.jar;G:\Java\jdk1.8.0_162\jre\lib\ext\access-bridge-64.jar;G:\Java\jdk1.8.0_162\jre\lib\ext\cldrdata.jar;G:\Java\jdk1.8.0_162\jre\lib\ext\dnsns.jar;G:\Java\jdk1.8.0_162\jre\lib\ext\jaccess.jar;G:\Java\jdk1.8.0_162\jre\lib\ext\jfxrt.jar;G:\Java\jdk1.8.0_162\jre\lib\ext\localedata.jar;G:\Java\jdk1.8.0_162\jre\lib\ext\nashorn.jar;G:\Java\jdk1.8.0_162\jre\lib\ext\sunec.jar;G:\Java\jdk1.8.0_162\jre\lib\ext\sunjce_provider.jar;G:\Java\jdk1.8.0_162\jre\lib\ext\sunmscapi.jar;G:\Java\jdk1.8.0_162\jre\lib\ext\sunpkcs11.jar;G:\Java\jdk1.8.0_162\jre\lib\ext\zipfs.jar;G:\Java\jdk1.8.0_162\jre\lib\javaws.jar;G:\Java\jdk1.8.0_162\jre\lib\jce.jar;G:\Java\jdk1.8.0_162\jre\lib\jfr.jar;G:\Java\jdk1.8.0_162\jre\lib\jfxswt.jar;G:\Java\jdk1.8.0_162\jre\lib\jsse.jar;G:\Java\jdk1.8.0_162\jre\lib\management-agent.jar;G:\Java\jdk1.8.0_162\jre\lib\plugin.jar;G:\Java\jdk1.8.0_162\jre\lib\resources.jar;G:\Java\jdk1.8.0_162\jre\lib\rt.jar;G:\Java\IDEA_code\Day27\day27_JDK_News\out\production\day27_JDK_News;G:\Java\IntelliJ IDEA 16\IntelliJ IDEA 2016.1\lib\idea_rt.jar" com.intellij.rt.execution.application.AppMain jejune2.DirectionDemo
FRONT
------
FRONT
前
------
FRONT
前
前
------
你选择了后！

Process finished with exit code 0

* */