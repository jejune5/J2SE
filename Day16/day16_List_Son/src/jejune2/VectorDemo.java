package jejune2;

import java.util.Enumeration;
import java.util.Vector;

/**
 * Created by Jejune on 2018/7/25.
 */
/*
 * Vector的特有功能：
 * 1：添加功能
 * 		public void addElement(Object obj)		--	add()
 * 2：获取功能
 * 		public Object elementAt(int index)		--  get()
 * 		public Enumeration elements()			--	Iterator iterator()
 * 				boolean hasMoreElements()				hasNext()
 * 				Object nextElement()					next()
 *
 * JDK升级的原因：
 * 		A:安全
 * 		B:效率
 * 		C:简化书写
 */
public class VectorDemo {
    public static void main(String[] args) {
        // 创建集合对象
        Vector v = new Vector();

        // 添加功能
        v.addElement("hello");
        v.addElement("world");
        v.addElement("java");

        // 遍历
        for (int x = 0; x < v.size(); x++) {
            String s = (String) v.elementAt(x); //获取功能
            System.out.println(s);
        }
        System.out.println("------------------");

        //迭代器
        Enumeration e = v.elements();
        while (e.hasMoreElements()) {
            String s = (String) e.nextElement();
            System.out.println(s);
        }
    }
}

/*
G:\Java\jdk1.8.0_162\bin\java -Didea.launcher.port=7534 "-Didea.launcher.bin.path=G:\Java\IntelliJ IDEA 16\IntelliJ IDEA 2016.1\bin" -Dfile.encoding=UTF-8 -classpath "G:\Java\jdk1.8.0_162\jre\lib\charsets.jar;G:\Java\jdk1.8.0_162\jre\lib\deploy.jar;G:\Java\jdk1.8.0_162\jre\lib\ext\access-bridge-64.jar;G:\Java\jdk1.8.0_162\jre\lib\ext\cldrdata.jar;G:\Java\jdk1.8.0_162\jre\lib\ext\dnsns.jar;G:\Java\jdk1.8.0_162\jre\lib\ext\jaccess.jar;G:\Java\jdk1.8.0_162\jre\lib\ext\jfxrt.jar;G:\Java\jdk1.8.0_162\jre\lib\ext\localedata.jar;G:\Java\jdk1.8.0_162\jre\lib\ext\nashorn.jar;G:\Java\jdk1.8.0_162\jre\lib\ext\sunec.jar;G:\Java\jdk1.8.0_162\jre\lib\ext\sunjce_provider.jar;G:\Java\jdk1.8.0_162\jre\lib\ext\sunmscapi.jar;G:\Java\jdk1.8.0_162\jre\lib\ext\sunpkcs11.jar;G:\Java\jdk1.8.0_162\jre\lib\ext\zipfs.jar;G:\Java\jdk1.8.0_162\jre\lib\javaws.jar;G:\Java\jdk1.8.0_162\jre\lib\jce.jar;G:\Java\jdk1.8.0_162\jre\lib\jfr.jar;G:\Java\jdk1.8.0_162\jre\lib\jfxswt.jar;G:\Java\jdk1.8.0_162\jre\lib\jsse.jar;G:\Java\jdk1.8.0_162\jre\lib\management-agent.jar;G:\Java\jdk1.8.0_162\jre\lib\plugin.jar;G:\Java\jdk1.8.0_162\jre\lib\resources.jar;G:\Java\jdk1.8.0_162\jre\lib\rt.jar;G:\Java\IDEA_code\Day16\day16_List_Son\out\production\day16_List_Son;G:\Java\IntelliJ IDEA 16\IntelliJ IDEA 2016.1\lib\idea_rt.jar" com.intellij.rt.execution.application.AppMain jejune2.VectorDemo
hello
world
java
------------------
hello
world
java

Process finished with exit code 0

 */