package jejune3;

import java.util.ArrayList;
import java.util.Scanner;

/**
 * Created by Jejune on 2018/7/28.
 */
/*
 * 键盘录入多个数据，以0结束，要求在控制台输出这多个数据中的最大值
 *
 * 分析：
 * 		A:创建键盘录入数据对象
 * 		B:键盘录入多个数据,我们不知道多少个，所以用集合存储
 * 		C:以0结束,这个简单，只要键盘录入的数据是0，我就不继续录入数据了
 * 		D:把集合转成数组
 * 		E:对数组排序
 * 		F:获取该数组中的最大索引的值
 */
public class ArrayListDemo {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        //B
        ArrayList<Integer> array = new ArrayList<Integer>();

        while (true) {
            System.out.println("请输入你的数据：");
            int number = sc.nextInt();
            if (number != 0) {
                array.add(number);
            } else {
                break;
            }
        }

        // 把集合转成数组
        // public <T> T[] toArray(T[] a)
        Integer[] i = new Integer[array.size()];
        // Integer[] ii = array.toArray(i);
        array.toArray(i);

        //获取数组中的最大索引值
        System.out.println("数组是：" + arrayToString(i) + "最大值是：" + i[i.length - 1]);
    }

    private static String arrayToString(Integer[] i) {
        StringBuilder sb = new StringBuilder();
        sb.append("[");
        for (int x = 0; x < i.length; x++) {
            if (x == i.length - 1) {
                sb.append(i[x]);

            } else {
                sb.append(i[x]).append(",");
            }
        }
        sb.append("]");
        return sb.toString();
    }
}

/*
G:\Java\jdk1.8.0_162\bin\java -Didea.launcher.port=7536 "-Didea.launcher.bin.path=G:\Java\IntelliJ IDEA 16\IntelliJ IDEA 2016.1\bin" -Dfile.encoding=UTF-8 -classpath "G:\Java\jdk1.8.0_162\jre\lib\charsets.jar;G:\Java\jdk1.8.0_162\jre\lib\deploy.jar;G:\Java\jdk1.8.0_162\jre\lib\ext\access-bridge-64.jar;G:\Java\jdk1.8.0_162\jre\lib\ext\cldrdata.jar;G:\Java\jdk1.8.0_162\jre\lib\ext\dnsns.jar;G:\Java\jdk1.8.0_162\jre\lib\ext\jaccess.jar;G:\Java\jdk1.8.0_162\jre\lib\ext\jfxrt.jar;G:\Java\jdk1.8.0_162\jre\lib\ext\localedata.jar;G:\Java\jdk1.8.0_162\jre\lib\ext\nashorn.jar;G:\Java\jdk1.8.0_162\jre\lib\ext\sunec.jar;G:\Java\jdk1.8.0_162\jre\lib\ext\sunjce_provider.jar;G:\Java\jdk1.8.0_162\jre\lib\ext\sunmscapi.jar;G:\Java\jdk1.8.0_162\jre\lib\ext\sunpkcs11.jar;G:\Java\jdk1.8.0_162\jre\lib\ext\zipfs.jar;G:\Java\jdk1.8.0_162\jre\lib\javaws.jar;G:\Java\jdk1.8.0_162\jre\lib\jce.jar;G:\Java\jdk1.8.0_162\jre\lib\jfr.jar;G:\Java\jdk1.8.0_162\jre\lib\jfxswt.jar;G:\Java\jdk1.8.0_162\jre\lib\jsse.jar;G:\Java\jdk1.8.0_162\jre\lib\management-agent.jar;G:\Java\jdk1.8.0_162\jre\lib\plugin.jar;G:\Java\jdk1.8.0_162\jre\lib\resources.jar;G:\Java\jdk1.8.0_162\jre\lib\rt.jar;G:\Java\IDEA_code\Day16\day16_List_Son_test\out\production\day16_List_Son_test;G:\Java\IntelliJ IDEA 16\IntelliJ IDEA 2016.1\lib\idea_rt.jar" com.intellij.rt.execution.application.AppMain jejune3.ArrayListDemo
请输入你的数据：
12
请输入你的数据：
22
请输入你的数据：
56
请输入你的数据：
45
请输入你的数据：
0
数组是：[12,22,56,45]最大值是：45

Process finished with exit code 0

 */