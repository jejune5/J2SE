package jejune4;

/**
 * Created by Jejune on 2018/7/27.
 */
/*
 * 泛型类的测试
 */
public class ObjectToolDemo {
    public static void main(String[] args) {
//         ObjectTool ot = new ObjectTool();
//
//         ot.setObj(new String("茅敏敏"));
//         String s = (String) ot.getObj();
//         System.out.println("姓名是：" + s);
//
//         ot.setObj(new Integer(16));
//         Integer i = (Integer) ot.getObj();
//         System.out.println("年龄是：" + i);
//
//         ot.setObj(new String("毛阿敏"));
//         // ClassCastException
//         Integer ii = (Integer) ot.getObj();
//         System.out.println("姓名是：" + ii);

        ObjectTool<String> ot = new ObjectTool<String>();
        ot.setObj(new String("茅敏敏"));
        String s = ot.getObj();
        System.out.println("姓名是：" + s);

        ObjectTool<Integer> ot2 = new ObjectTool<Integer>();
        ot2.setObj(new Integer(18));
        Integer i = ot2.getObj();
        System.out.println("年龄是：" + i);
    }
}

/*
G:\Java\jdk1.8.0_162\bin\java -Didea.launcher.port=7533 "-Didea.launcher.bin.path=G:\Java\IntelliJ IDEA 16\IntelliJ IDEA 2016.1\bin" -Dfile.encoding=UTF-8 -classpath "G:\Java\jdk1.8.0_162\jre\lib\charsets.jar;G:\Java\jdk1.8.0_162\jre\lib\deploy.jar;G:\Java\jdk1.8.0_162\jre\lib\ext\access-bridge-64.jar;G:\Java\jdk1.8.0_162\jre\lib\ext\cldrdata.jar;G:\Java\jdk1.8.0_162\jre\lib\ext\dnsns.jar;G:\Java\jdk1.8.0_162\jre\lib\ext\jaccess.jar;G:\Java\jdk1.8.0_162\jre\lib\ext\jfxrt.jar;G:\Java\jdk1.8.0_162\jre\lib\ext\localedata.jar;G:\Java\jdk1.8.0_162\jre\lib\ext\nashorn.jar;G:\Java\jdk1.8.0_162\jre\lib\ext\sunec.jar;G:\Java\jdk1.8.0_162\jre\lib\ext\sunjce_provider.jar;G:\Java\jdk1.8.0_162\jre\lib\ext\sunmscapi.jar;G:\Java\jdk1.8.0_162\jre\lib\ext\sunpkcs11.jar;G:\Java\jdk1.8.0_162\jre\lib\ext\zipfs.jar;G:\Java\jdk1.8.0_162\jre\lib\javaws.jar;G:\Java\jdk1.8.0_162\jre\lib\jce.jar;G:\Java\jdk1.8.0_162\jre\lib\jfr.jar;G:\Java\jdk1.8.0_162\jre\lib\jfxswt.jar;G:\Java\jdk1.8.0_162\jre\lib\jsse.jar;G:\Java\jdk1.8.0_162\jre\lib\management-agent.jar;G:\Java\jdk1.8.0_162\jre\lib\plugin.jar;G:\Java\jdk1.8.0_162\jre\lib\resources.jar;G:\Java\jdk1.8.0_162\jre\lib\rt.jar;G:\Java\IDEA_code\Day16\day16_Generic\out\production\day16_Generic;G:\Java\IntelliJ IDEA 16\IntelliJ IDEA 2016.1\lib\idea_rt.jar" com.intellij.rt.execution.application.AppMain jejune4.ObjectToolDemo
姓名是：茅敏敏
年龄是：18

Process finished with exit code 0

 */