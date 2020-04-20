package jejune3;

/**
 * Created by Jejune on 2018/7/25.
 */
/*
 * 可变参数：定义方法的时候不知道该定义多少个参数
 * 格式：
 * 		修饰符 返回值类型 方法名(数据类型…  变量名){
 * 
 * 		}
 * 
 * 		注意：
 * 			这里的变量其实是一个数组
 * 			如果一个方法有可变参数，并且有多个参数，那么，可变参数肯定是最后一个
 */
public class ArgsDemo {
    public static void main(String[] args) {
        //2个数据求和
        int a = 10;
        int b = 20;
        int result = sum(a, b);

        // 需求：我要写一个求和的功能，到底是几个数据求和呢，我不太清楚，但是我知道在调用的时候我肯定就知道了
        // 为了解决这个问题，Java就提供了一个东西：可变参数

        //3个数据
        int c = 30;
        result = sum(a, b, c);
        System.out.println(result);

        //4个数
        int d = 40;
        result = sum(a, b, c, d);
        System.out.println(result);

        //5个数
        result = sum(a, b, c, d, 50);
        System.out.println(result);

        //6
        result = sum(a, b, c, d, 40, 50);
        System.out.println("result:" + result);

    }

    private static int sum(int... a) {
        int s = 0;

        for (int x : a) {
            s += x;
        }
        return s;
    }

    // public static int sum(int a, int b, int c, int d) {
    // return a + b + c + d;
    // }
    //
    // public static int sum(int a, int b, int c) {
    // return a + b + c;
    // }
    //
    // public static int sum(int a, int b) {
    // return a + b;
    // }
}

/*
G:\Java\jdk1.8.0_162\bin\java -Didea.launcher.port=7532 "-Didea.launcher.bin.path=G:\Java\IntelliJ IDEA 16\IntelliJ IDEA 2016.1\bin" -Dfile.encoding=UTF-8 -classpath "G:\Java\jdk1.8.0_162\jre\lib\charsets.jar;G:\Java\jdk1.8.0_162\jre\lib\deploy.jar;G:\Java\jdk1.8.0_162\jre\lib\ext\access-bridge-64.jar;G:\Java\jdk1.8.0_162\jre\lib\ext\cldrdata.jar;G:\Java\jdk1.8.0_162\jre\lib\ext\dnsns.jar;G:\Java\jdk1.8.0_162\jre\lib\ext\jaccess.jar;G:\Java\jdk1.8.0_162\jre\lib\ext\jfxrt.jar;G:\Java\jdk1.8.0_162\jre\lib\ext\localedata.jar;G:\Java\jdk1.8.0_162\jre\lib\ext\nashorn.jar;G:\Java\jdk1.8.0_162\jre\lib\ext\sunec.jar;G:\Java\jdk1.8.0_162\jre\lib\ext\sunjce_provider.jar;G:\Java\jdk1.8.0_162\jre\lib\ext\sunmscapi.jar;G:\Java\jdk1.8.0_162\jre\lib\ext\sunpkcs11.jar;G:\Java\jdk1.8.0_162\jre\lib\ext\zipfs.jar;G:\Java\jdk1.8.0_162\jre\lib\javaws.jar;G:\Java\jdk1.8.0_162\jre\lib\jce.jar;G:\Java\jdk1.8.0_162\jre\lib\jfr.jar;G:\Java\jdk1.8.0_162\jre\lib\jfxswt.jar;G:\Java\jdk1.8.0_162\jre\lib\jsse.jar;G:\Java\jdk1.8.0_162\jre\lib\management-agent.jar;G:\Java\jdk1.8.0_162\jre\lib\plugin.jar;G:\Java\jdk1.8.0_162\jre\lib\resources.jar;G:\Java\jdk1.8.0_162\jre\lib\rt.jar;G:\Java\IDEA_code\Day16\day16_JDK5News\out\production\day16_JDK5News;G:\Java\IntelliJ IDEA 16\IntelliJ IDEA 2016.1\lib\idea_rt.jar" com.intellij.rt.execution.application.AppMain jejune3.ArgsDemo
60
100
150
result:190

Process finished with exit code 0

 */