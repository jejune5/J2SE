package jejune5;

/**
 * Created by Jejune on 2018/7/27.
 */
public class ObjectToolDemo {
    public static void main(String[] args) {
        // ObjectTool ot = new ObjectTool();
        // ot.show("hello");
        // ot.show(100);
        // ot.show(true);

        // ObjectTool<String> ot = new ObjectTool<String>();
        // ot.show("hello");
        //
        // ObjectTool<Integer> ot2 = new ObjectTool<Integer>();
        // ot2.show(100);
        //
        // ObjectTool<Boolean> ot3 = new ObjectTool<Boolean>();
        // ot3.show(true);

        // 如果还听得懂，那就说明泛型类是没有问题的
        // 但是呢，谁说了我的方法一定要和类的类型的一致呢?
        // 我要是类上没有泛型的话，方法还能不能接收任意类型的参数了呢?

        // 定义泛型方法后
        ObjectTool ot = new ObjectTool();
        ot.show("Hello");
        ot.show(100);
        ot.show(true);
    }
}

/*
G:\Java\jdk1.8.0_162\bin\java -Didea.launcher.port=7534 "-Didea.launcher.bin.path=G:\Java\IntelliJ IDEA 16\IntelliJ IDEA 2016.1\bin" -Dfile.encoding=UTF-8 -classpath "G:\Java\jdk1.8.0_162\jre\lib\charsets.jar;G:\Java\jdk1.8.0_162\jre\lib\deploy.jar;G:\Java\jdk1.8.0_162\jre\lib\ext\access-bridge-64.jar;G:\Java\jdk1.8.0_162\jre\lib\ext\cldrdata.jar;G:\Java\jdk1.8.0_162\jre\lib\ext\dnsns.jar;G:\Java\jdk1.8.0_162\jre\lib\ext\jaccess.jar;G:\Java\jdk1.8.0_162\jre\lib\ext\jfxrt.jar;G:\Java\jdk1.8.0_162\jre\lib\ext\localedata.jar;G:\Java\jdk1.8.0_162\jre\lib\ext\nashorn.jar;G:\Java\jdk1.8.0_162\jre\lib\ext\sunec.jar;G:\Java\jdk1.8.0_162\jre\lib\ext\sunjce_provider.jar;G:\Java\jdk1.8.0_162\jre\lib\ext\sunmscapi.jar;G:\Java\jdk1.8.0_162\jre\lib\ext\sunpkcs11.jar;G:\Java\jdk1.8.0_162\jre\lib\ext\zipfs.jar;G:\Java\jdk1.8.0_162\jre\lib\javaws.jar;G:\Java\jdk1.8.0_162\jre\lib\jce.jar;G:\Java\jdk1.8.0_162\jre\lib\jfr.jar;G:\Java\jdk1.8.0_162\jre\lib\jfxswt.jar;G:\Java\jdk1.8.0_162\jre\lib\jsse.jar;G:\Java\jdk1.8.0_162\jre\lib\management-agent.jar;G:\Java\jdk1.8.0_162\jre\lib\plugin.jar;G:\Java\jdk1.8.0_162\jre\lib\resources.jar;G:\Java\jdk1.8.0_162\jre\lib\rt.jar;G:\Java\IDEA_code\Day16\day16_Generic\out\production\day16_Generic;G:\Java\IntelliJ IDEA 16\IntelliJ IDEA 2016.1\lib\idea_rt.jar" com.intellij.rt.execution.application.AppMain jejune5.ObjectToolDemo
Hello
100
true

Process finished with exit code 0

 */