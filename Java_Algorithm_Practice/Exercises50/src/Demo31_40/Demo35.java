package Demo31_40;

import java.util.Scanner;

/**
 * Created by Jejune on 2018/8/13.
 */
/*
【程序35】   题目：输入数组，最大的与第一个元素交换，最小的与最后一个元素交换，输出数组。
 */
public class Demo35 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("请输入数组的长度：");
        int n = sc.nextInt();
        int[] arr = new int[n];
        for (int x = 0; x < n; x++) {
            System.out.println("请输入第" + (x + 1) + "个数");
            arr[x] = sc.nextInt();
        }
        System.out.println("原数组为：");
        for (int i : arr) {
            System.out.print(i + " ");
        }
        System.out.println();

//        if (int x= 0;)

        int temp = arr[0];
        int maxIndex = findMaxIndex(arr);
        arr[0] = arr[maxIndex];
        arr[maxIndex] = temp;

        int temp1 = arr[n - 1];
        int minIndex = findMinIndex(arr);
        arr[n - 1] = arr[minIndex];
        arr[minIndex] = temp1;

        //交换后数组
        System.out.println("交换后数组:");
        for (int i : arr) {
            System.out.print(i + " ");
        }

    }

    private static int findMaxIndex(int[] arr) {
        int max = arr[0];
        int maxIndex = 0;
        for (int x = 1; x < arr.length; x++) {
            if (max < arr[x]) {
                max = arr[x];
                maxIndex = x;
            }
        }
        return maxIndex;
    }

    private static int findMinIndex(int[] arr) {
        int min = arr[0];
        int minIndex = 0;
        for (int x = 1; x < arr.length; x++) {
            if (min > arr[x]) {
                min = arr[x];
                minIndex = x;
            }
        }
        return minIndex;
    }
}

/*
G:\Java\jdk1.8.0_162\bin\java -Didea.launcher.port=7542 "-Didea.launcher.bin.path=G:\Java\IntelliJ IDEA 16\IntelliJ IDEA 2016.1\bin" -Dfile.encoding=UTF-8 -classpath "G:\Java\jdk1.8.0_162\jre\lib\charsets.jar;G:\Java\jdk1.8.0_162\jre\lib\deploy.jar;G:\Java\jdk1.8.0_162\jre\lib\ext\access-bridge-64.jar;G:\Java\jdk1.8.0_162\jre\lib\ext\cldrdata.jar;G:\Java\jdk1.8.0_162\jre\lib\ext\dnsns.jar;G:\Java\jdk1.8.0_162\jre\lib\ext\jaccess.jar;G:\Java\jdk1.8.0_162\jre\lib\ext\jfxrt.jar;G:\Java\jdk1.8.0_162\jre\lib\ext\localedata.jar;G:\Java\jdk1.8.0_162\jre\lib\ext\nashorn.jar;G:\Java\jdk1.8.0_162\jre\lib\ext\sunec.jar;G:\Java\jdk1.8.0_162\jre\lib\ext\sunjce_provider.jar;G:\Java\jdk1.8.0_162\jre\lib\ext\sunmscapi.jar;G:\Java\jdk1.8.0_162\jre\lib\ext\sunpkcs11.jar;G:\Java\jdk1.8.0_162\jre\lib\ext\zipfs.jar;G:\Java\jdk1.8.0_162\jre\lib\javaws.jar;G:\Java\jdk1.8.0_162\jre\lib\jce.jar;G:\Java\jdk1.8.0_162\jre\lib\jfr.jar;G:\Java\jdk1.8.0_162\jre\lib\jfxswt.jar;G:\Java\jdk1.8.0_162\jre\lib\jsse.jar;G:\Java\jdk1.8.0_162\jre\lib\management-agent.jar;G:\Java\jdk1.8.0_162\jre\lib\plugin.jar;G:\Java\jdk1.8.0_162\jre\lib\resources.jar;G:\Java\jdk1.8.0_162\jre\lib\rt.jar;G:\Java\Java_Algorithm_Practice\Exercises50\out\production\Exercises50;G:\Java\IntelliJ IDEA 16\IntelliJ IDEA 2016.1\lib\idea_rt.jar" com.intellij.rt.execution.application.AppMain Demo31_40.Demo35
请输入数组的长度：
5
请输入第1个数
20
请输入第2个数
10
请输入第3个数
80
请输入第4个数
30
请输入第5个数
40
原数组为：
20 10 80 30 40
交换后数组:
80 40 20 30 10
Process finished with exit code 0

 */