package jejune2;

import java.util.ArrayList;
import java.util.Collection;

/**
 * Created by Jejune on 2018/7/23.
 */
/*
 * boolean addAll(Collection c):添加一个集合的元素
 * boolean removeAll(Collection c):移除一个集合的元素(是一个还是所有)
 * boolean containsAll(Collection c)：判断集合中是否包含指定的集合元素(是一个还是所有)
 * boolean retainAll(Collection c):两个集合都有的元素?思考元素去哪了，返回的boolean又是什么意思呢?
 */
public class CollectionDemo2 {
    public static void main(String[] args) {
        // 创建集合1
        Collection c1 = new ArrayList();
        c1.add("abc1");
        c1.add("abc2");
        c1.add("abc3");
        c1.add("abc4");

        // 创建集合2
        Collection c2 = new ArrayList();
//		c2.add("abc1");
//		c2.add("abc2");
//		c2.add("abc3");
//		c2.add("abc4");
        c2.add("abc5");
        c2.add("abc6");
        c2.add("abc7");

        // boolean addAll(Collection c):添加一个集合的元素
        // System.out.println("addAll:" + c1.addAll(c2));

        //boolean removeAll(Collection c):移除一个集合的元素(是一个还是所有)
        //只要有一个元素被移除了，就返回true。
        //System.out.println("removeAll:"+c1.removeAll(c2));

        //boolean containsAll(Collection c)：判断集合中是否包含指定的集合元素(是一个还是所有)
        //只有包含所有的元素，才叫包含
        // System.out.println("containsAll:"+c1.containsAll(c2));

        //boolean retainAll(Collection c):两个集合都有的元素?思考元素去哪了，返回的boolean又是什么意思呢?
        //假设有两个集合A，B。
        //A对B做交集，最终的结果保存在A中，B不变。
        //返回值表示的是A是否发生过改变。
        System.out.println("retainAll:" + c1.retainAll(c2));

        System.out.println("c1:" + c1);
        System.out.println("c2:" + c2);
    }
}

/*
G:\Java\jdk1.8.0_162\bin\java -Didea.launcher.port=7533 "-Didea.launcher.bin.path=G:\Java\IntelliJ IDEA 16\IntelliJ IDEA 2016.1\bin" -Dfile.encoding=UTF-8 -classpath "G:\Java\jdk1.8.0_162\jre\lib\charsets.jar;G:\Java\jdk1.8.0_162\jre\lib\deploy.jar;G:\Java\jdk1.8.0_162\jre\lib\ext\access-bridge-64.jar;G:\Java\jdk1.8.0_162\jre\lib\ext\cldrdata.jar;G:\Java\jdk1.8.0_162\jre\lib\ext\dnsns.jar;G:\Java\jdk1.8.0_162\jre\lib\ext\jaccess.jar;G:\Java\jdk1.8.0_162\jre\lib\ext\jfxrt.jar;G:\Java\jdk1.8.0_162\jre\lib\ext\localedata.jar;G:\Java\jdk1.8.0_162\jre\lib\ext\nashorn.jar;G:\Java\jdk1.8.0_162\jre\lib\ext\sunec.jar;G:\Java\jdk1.8.0_162\jre\lib\ext\sunjce_provider.jar;G:\Java\jdk1.8.0_162\jre\lib\ext\sunmscapi.jar;G:\Java\jdk1.8.0_162\jre\lib\ext\sunpkcs11.jar;G:\Java\jdk1.8.0_162\jre\lib\ext\zipfs.jar;G:\Java\jdk1.8.0_162\jre\lib\javaws.jar;G:\Java\jdk1.8.0_162\jre\lib\jce.jar;G:\Java\jdk1.8.0_162\jre\lib\jfr.jar;G:\Java\jdk1.8.0_162\jre\lib\jfxswt.jar;G:\Java\jdk1.8.0_162\jre\lib\jsse.jar;G:\Java\jdk1.8.0_162\jre\lib\management-agent.jar;G:\Java\jdk1.8.0_162\jre\lib\plugin.jar;G:\Java\jdk1.8.0_162\jre\lib\resources.jar;G:\Java\jdk1.8.0_162\jre\lib\rt.jar;G:\Java\IDEA_code\Day14\day15_Collection\out\production\day15_Collection;G:\Java\IntelliJ IDEA 16\IntelliJ IDEA 2016.1\lib\idea_rt.jar" com.intellij.rt.execution.application.AppMain jejune2.CollectionDemo2
retainAll:true
c1:[]
c2:[abc5, abc6, abc7]

Process finished with exit code 0

 */