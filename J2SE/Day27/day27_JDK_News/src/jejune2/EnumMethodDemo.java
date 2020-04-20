package jejune2;

/**
 * Created by Jejune on 2018/7/17.
 */
public class EnumMethodDemo {
    public static void main(String[] args) {
        //int compareTo(E o)
        Direction2 d21 = Direction2.FRONT;
        Direction2 d22 = Direction2.BEHIND;
        Direction2 d23 = Direction2.LEFT;
        Direction2 d24 = Direction2.RIGHT;
        System.out.println(d21.compareTo(d21));
        System.out.println(d21.compareTo(d24));
        System.out.println(d24.compareTo(d21));
        System.out.println("-----");
        //String name()
        System.out.println(d21.name());
        System.out.println(d22.name());
        System.out.println(d23.name());
        System.out.println(d24.name());
        System.out.println("-----");
        // int oridnal()
        System.out.println(d21.ordinal());
        System.out.println(d22.ordinal());
        System.out.println(d23.ordinal());
        System.out.println(d24.ordinal());
        System.out.println("-----");
        // String toString()
        System.out.println(d21.toString());
        System.out.println(d22.toString());
        System.out.println(d23.toString());
        System.out.println(d24.toString());
        System.out.println("-----");
        // <T> T valueOf(Class<T> type,String name)
        Direction2 d = Enum.valueOf(Direction2.class, "FRONT");
        System.out.println(d.getName());
        System.out.println("------");
        // values()
        // 此方法虽然在JDK文档中查找不到，但每个枚举类都具有该方法，它遍历枚举类的所有枚举值非常方便
        Direction2[] dirs = Direction2.values();
        for (Direction2 d2 : dirs) {
            System.out.println(d2);
            System.out.println(d2.getName());
        }
    }
}

/*
* G:\Java\jdk1.8.0_162\bin\java -Didea.launcher.port=7535 "-Didea.launcher.bin.path=G:\Java\IntelliJ IDEA 16\IntelliJ IDEA 2016.1\bin" -Dfile.encoding=UTF-8 -classpath "G:\Java\jdk1.8.0_162\jre\lib\charsets.jar;G:\Java\jdk1.8.0_162\jre\lib\deploy.jar;G:\Java\jdk1.8.0_162\jre\lib\ext\access-bridge-64.jar;G:\Java\jdk1.8.0_162\jre\lib\ext\cldrdata.jar;G:\Java\jdk1.8.0_162\jre\lib\ext\dnsns.jar;G:\Java\jdk1.8.0_162\jre\lib\ext\jaccess.jar;G:\Java\jdk1.8.0_162\jre\lib\ext\jfxrt.jar;G:\Java\jdk1.8.0_162\jre\lib\ext\localedata.jar;G:\Java\jdk1.8.0_162\jre\lib\ext\nashorn.jar;G:\Java\jdk1.8.0_162\jre\lib\ext\sunec.jar;G:\Java\jdk1.8.0_162\jre\lib\ext\sunjce_provider.jar;G:\Java\jdk1.8.0_162\jre\lib\ext\sunmscapi.jar;G:\Java\jdk1.8.0_162\jre\lib\ext\sunpkcs11.jar;G:\Java\jdk1.8.0_162\jre\lib\ext\zipfs.jar;G:\Java\jdk1.8.0_162\jre\lib\javaws.jar;G:\Java\jdk1.8.0_162\jre\lib\jce.jar;G:\Java\jdk1.8.0_162\jre\lib\jfr.jar;G:\Java\jdk1.8.0_162\jre\lib\jfxswt.jar;G:\Java\jdk1.8.0_162\jre\lib\jsse.jar;G:\Java\jdk1.8.0_162\jre\lib\management-agent.jar;G:\Java\jdk1.8.0_162\jre\lib\plugin.jar;G:\Java\jdk1.8.0_162\jre\lib\resources.jar;G:\Java\jdk1.8.0_162\jre\lib\rt.jar;G:\Java\IDEA_code\Day27\day27_JDK_News\out\production\day27_JDK_News;G:\Java\IntelliJ IDEA 16\IntelliJ IDEA 2016.1\lib\idea_rt.jar" com.intellij.rt.execution.application.AppMain jejune2.EnumMethodDemo
0
-3
3
-----
FRONT
BEHIND
LEFT
RIGHT
-----
0
1
2
3
-----
FRONT
BEHIND
LEFT
RIGHT
-----
前
------
FRONT
前
BEHIND
后
LEFT
左
RIGHT
右

Process finished with exit code 0

* */
