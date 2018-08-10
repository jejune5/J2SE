package jejune2;

/**
 * Created by Jejune on 2018/8/9.
 */
/*
有一对兔子，从出生后第3个月起每个月都生一对兔子，
小兔子长到第三个月后每个月又生一对兔子，假如兔子都不死，
问第二十个月的兔子对数为多少？
 */
     /*
    具体分析如下：
f(1) = 1(第1个月有一对兔子）
f(2) = 1(第2个月还是一对兔子）
f(3) = 2(原来有一对兔子，第3个开始，每个月生一对兔子）
f(4) = 3(原来有两对兔子，有一对可以生育）
f(5) = 5(原来有3对兔子，第3个月出生的那对兔子也可以生育了，那么现在有两对兔子可以生育）
f(6) = 8(原来有5对兔子，第4个月出生的那对兔子也可以生育了，那么现在有3对兔子可以生育）
..............
由以上可以看出，第n个月兔子的对数为
f(n) = f(n - 1) + f(n - 2);
f(n-1)是上个月的兔子数量，是原来有的。
f(n-2)是可以生育的兔子数，即多出来的数量。第n-2个月开始后的第3个月是第n个月，此时第n-2个月时的兔子都可以生育了。
     */
public class DiGuiDmeo2 {
    public static void main(String[] args) {
        //方法1
        //定义一个数组
        int[] arr = new int[20];
        arr[0] = 1;
        arr[1] = 1;

        for (int x = 2; x < arr.length; x++) {
            arr[x] = arr[x - 1] + arr[x - 2];
        }
        System.out.println(arr[19]);
        System.out.println("--------");

        //方法2
        int a = 1;
        int b = 1;
        for (int x = 0; x < 18; x++) {
            //临时变量存储上一次的a
            int temp = a;
            a = b;
            b = temp + b;
        }
        System.out.println(b);

        //方法3
        System.out.println("---------");
        System.out.println("第20个月兔子的对数是：" + f(20));

    }

    private static int f(int i) {
        if (i == 1 || i == 2) {
            return 1;
        } else {
            return f(i - 1) + f(i - 2);
        }
    }
}

/*G:\Java\jdk1.8.0_162\bin\java -Didea.launcher.port=7534 "-Didea.launcher.bin.path=G:\Java\IntelliJ IDEA 16\IntelliJ IDEA 2016.1\bin" -Dfile.encoding=UTF-8 -classpath "G:\Java\jdk1.8.0_162\jre\lib\charsets.jar;G:\Java\jdk1.8.0_162\jre\lib\deploy.jar;G:\Java\jdk1.8.0_162\jre\lib\ext\access-bridge-64.jar;G:\Java\jdk1.8.0_162\jre\lib\ext\cldrdata.jar;G:\Java\jdk1.8.0_162\jre\lib\ext\dnsns.jar;G:\Java\jdk1.8.0_162\jre\lib\ext\jaccess.jar;G:\Java\jdk1.8.0_162\jre\lib\ext\jfxrt.jar;G:\Java\jdk1.8.0_162\jre\lib\ext\localedata.jar;G:\Java\jdk1.8.0_162\jre\lib\ext\nashorn.jar;G:\Java\jdk1.8.0_162\jre\lib\ext\sunec.jar;G:\Java\jdk1.8.0_162\jre\lib\ext\sunjce_provider.jar;G:\Java\jdk1.8.0_162\jre\lib\ext\sunmscapi.jar;G:\Java\jdk1.8.0_162\jre\lib\ext\sunpkcs11.jar;G:\Java\jdk1.8.0_162\jre\lib\ext\zipfs.jar;G:\Java\jdk1.8.0_162\jre\lib\javaws.jar;G:\Java\jdk1.8.0_162\jre\lib\jce.jar;G:\Java\jdk1.8.0_162\jre\lib\jfr.jar;G:\Java\jdk1.8.0_162\jre\lib\jfxswt.jar;G:\Java\jdk1.8.0_162\jre\lib\jsse.jar;G:\Java\jdk1.8.0_162\jre\lib\management-agent.jar;G:\Java\jdk1.8.0_162\jre\lib\plugin.jar;G:\Java\jdk1.8.0_162\jre\lib\resources.jar;G:\Java\jdk1.8.0_162\jre\lib\rt.jar;G:\Java\J2SE\Day20\day20_DiGui\out\production\day20_DiGui;G:\Java\IntelliJ IDEA 16\IntelliJ IDEA 2016.1\lib\idea_rt.jar" com.intellij.rt.execution.application.AppMain jejune2.DiGuiDmeo2
6765
--------
6765
---------
第20个月兔子的对数是：6765

Process finished with exit code 0


 */