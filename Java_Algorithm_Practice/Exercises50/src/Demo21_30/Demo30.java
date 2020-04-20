package Demo21_30;

import java.util.Arrays;
import java.util.Random;

/**
 * Created by Jejune on 2018/8/13.
 */
/*
【程序30】   题目：有一个已经排好序的数组。现输入一个数，要求按原来的规律将它插入数组中。
 */
    /*
    1.程序分析：首先判断此数是否大于最后一个数，然后再考虑插入中间的数的情况，插入后此元素之后的数，依次后移一个位置。
     */
public class Demo30 {
    public static void main(String[] args) {
        int temp = 0;
        int arr[] = new int[12];
        //随机输入长度为12的数组1000内的随机数
        Random r = new Random();
        for (int i = 0; i <= 10; i++) {
            arr[i] = r.nextInt(1000);
        }

        //输出原数组
        System.out.println("原数组：");
        for (int x : arr) {
            System.out.print(x + " ");
        }
        System.out.println();

        //排序(升序)
        Arrays.sort(arr);

        //输出排序后数组
        System.out.println("排序后数组：");
        for (int y : arr) {
            System.out.print(y + " ");
        }
        System.out.println();

        //插入数据
        arr[11] = r.nextInt(1000);
        for (int k = 0; k <= 10; k++)
            if (arr[k] > arr[11]) {
                temp = arr[11];
                for (int j = 11; j >= k + 1; j--)
                    arr[j] = arr[j - 1];
                arr[k] = temp;
            }
        System.out.println();
        for (int k = 0; k <= 11; k++)
            System.out.print(arr[k] + "\t");

    }
}

/*
G:\Java\jdk1.8.0_162\bin\java -Didea.launcher.port=7538 "-Didea.launcher.bin.path=G:\Java\IntelliJ IDEA 16\IntelliJ IDEA 2016.1\bin" -Dfile.encoding=UTF-8 -classpath "G:\Java\jdk1.8.0_162\jre\lib\charsets.jar;G:\Java\jdk1.8.0_162\jre\lib\deploy.jar;G:\Java\jdk1.8.0_162\jre\lib\ext\access-bridge-64.jar;G:\Java\jdk1.8.0_162\jre\lib\ext\cldrdata.jar;G:\Java\jdk1.8.0_162\jre\lib\ext\dnsns.jar;G:\Java\jdk1.8.0_162\jre\lib\ext\jaccess.jar;G:\Java\jdk1.8.0_162\jre\lib\ext\jfxrt.jar;G:\Java\jdk1.8.0_162\jre\lib\ext\localedata.jar;G:\Java\jdk1.8.0_162\jre\lib\ext\nashorn.jar;G:\Java\jdk1.8.0_162\jre\lib\ext\sunec.jar;G:\Java\jdk1.8.0_162\jre\lib\ext\sunjce_provider.jar;G:\Java\jdk1.8.0_162\jre\lib\ext\sunmscapi.jar;G:\Java\jdk1.8.0_162\jre\lib\ext\sunpkcs11.jar;G:\Java\jdk1.8.0_162\jre\lib\ext\zipfs.jar;G:\Java\jdk1.8.0_162\jre\lib\javaws.jar;G:\Java\jdk1.8.0_162\jre\lib\jce.jar;G:\Java\jdk1.8.0_162\jre\lib\jfr.jar;G:\Java\jdk1.8.0_162\jre\lib\jfxswt.jar;G:\Java\jdk1.8.0_162\jre\lib\jsse.jar;G:\Java\jdk1.8.0_162\jre\lib\management-agent.jar;G:\Java\jdk1.8.0_162\jre\lib\plugin.jar;G:\Java\jdk1.8.0_162\jre\lib\resources.jar;G:\Java\jdk1.8.0_162\jre\lib\rt.jar;G:\Java\Java_Algorithm_Practice\Exercises50\out\production\Exercises50;G:\Java\IntelliJ IDEA 16\IntelliJ IDEA 2016.1\lib\idea_rt.jar" com.intellij.rt.execution.application.AppMain Demo21_30.Demo30
原数组：
147 93 802 394 237 267 936 51 831 405 508 0
排序后数组：
0 51 93 147 237 267 394 405 508 802 831 936

0	51	93	147	237	267	394	405	472	508	802	831
Process finished with exit code 0

 */