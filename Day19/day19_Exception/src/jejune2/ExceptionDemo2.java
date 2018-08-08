package jejune2;

/**
 * Created by Jejune on 2018/8/7.
 */
/*
 * A:一个异常
 * B:二个异常的处理
 * 		a:每一个写一个try...catch
 * 		b:写一个try，多个catch
 * 			try{
 * 				...
 * 			}catch(异常类名 变量名) {
 * 				...
 * 			}
 * 			catch(异常类名 变量名) {
 * 				...
 * 			}
 * 			...
 *
 * 			注意事项：
 * 				1:能明确的尽量明确，不要用大的来处理。
 * 				2:平级关系的异常谁前谁后无所谓，如果出现了子父关系，父必须在后面。
 *
 * 注意：
 * 		一旦try里面出了问题，就会在这里把问题给抛出去，然后和catch里面的问题进行匹配，
 * 		一旦有匹配的，就执行catch里面的处理，然后结束了try...catch
 * 		继续执行后面的语句。
 */
public class ExceptionDemo2 {
    public static void main(String[] args) {
        // method1();

        // method2();

        // method3();

        method4();
    }

    public static void method4() {
        int a = 10;
        int b = 0;
        int[] arr = { 1, 2, 3 };

        // 爷爷在最后
        try {
            System.out.println(a / b);
            System.out.println(arr[3]);
            System.out.println("这里出现了一个异常，你不太清楚是谁，该怎么办呢?");
        } catch (ArithmeticException e) {
            System.out.println("除数不能为0");
        } catch (ArrayIndexOutOfBoundsException e) {
            System.out.println("你访问了不该的访问的索引");
        } catch (Exception e) {
            System.out.println("出问题了");
        }

        // 爷爷在前面是不可以的
        // try {
        // System.out.println(a / b);
        // System.out.println(arr[3]);
        // System.out.println("这里出现了一个异常，你不太清楚是谁，该怎么办呢?");
        // } catch (Exception e) {
        // System.out.println("出问题了");
        // } catch (ArithmeticException e) {
        // System.out.println("除数不能为0");
        // } catch (ArrayIndexOutOfBoundsException e) {
        // System.out.println("你访问了不该的访问的索引");
        // }

        System.out.println("over");
    }

    // 两个异常的处理
    public static void method3() {
        int a = 10;
        int b = 0;
        int[] arr = { 1, 2, 3 };

        try {
            System.out.println(arr[3]);
            System.out.println(a / b);
            // System.out.println(arr[3]);
        } catch (ArithmeticException e) {
            System.out.println("除数不能为0");
        } catch (ArrayIndexOutOfBoundsException e) {
            System.out.println("你访问了不该的访问的索引");
        }

        System.out.println("over");
    }

    // 两个异常
    public static void method2() {
        int a = 10;
        int b = 0;
        try {
            System.out.println(a / b);
        } catch (ArithmeticException e) {
            System.out.println("除数不能为0");
        }

        int[] arr = { 1, 2, 3 };
        try {
            System.out.println(arr[3]);
        } catch (ArrayIndexOutOfBoundsException e) {
            System.out.println("你访问了不该的访问的索引");
        }

        System.out.println("over");
    }

    // 一个异常
    public static void method1() {
        // 第一阶段
        int a = 10;
        // int b = 2;
        int b = 0;

        try {
            System.out.println(a / b);
        } catch (ArithmeticException ae) {
            System.out.println("除数不能为0");
        }

        // 第二阶段
        System.out.println("over");
    }
}

/*
G:\Java\jdk1.8.0_162\bin\java -Didea.launcher.port=7544 "-Didea.launcher.bin.path=G:\Java\IntelliJ IDEA 16\IntelliJ IDEA 2016.1\bin" -Dfile.encoding=UTF-8 -classpath "G:\Java\jdk1.8.0_162\jre\lib\charsets.jar;G:\Java\jdk1.8.0_162\jre\lib\deploy.jar;G:\Java\jdk1.8.0_162\jre\lib\ext\access-bridge-64.jar;G:\Java\jdk1.8.0_162\jre\lib\ext\cldrdata.jar;G:\Java\jdk1.8.0_162\jre\lib\ext\dnsns.jar;G:\Java\jdk1.8.0_162\jre\lib\ext\jaccess.jar;G:\Java\jdk1.8.0_162\jre\lib\ext\jfxrt.jar;G:\Java\jdk1.8.0_162\jre\lib\ext\localedata.jar;G:\Java\jdk1.8.0_162\jre\lib\ext\nashorn.jar;G:\Java\jdk1.8.0_162\jre\lib\ext\sunec.jar;G:\Java\jdk1.8.0_162\jre\lib\ext\sunjce_provider.jar;G:\Java\jdk1.8.0_162\jre\lib\ext\sunmscapi.jar;G:\Java\jdk1.8.0_162\jre\lib\ext\sunpkcs11.jar;G:\Java\jdk1.8.0_162\jre\lib\ext\zipfs.jar;G:\Java\jdk1.8.0_162\jre\lib\javaws.jar;G:\Java\jdk1.8.0_162\jre\lib\jce.jar;G:\Java\jdk1.8.0_162\jre\lib\jfr.jar;G:\Java\jdk1.8.0_162\jre\lib\jfxswt.jar;G:\Java\jdk1.8.0_162\jre\lib\jsse.jar;G:\Java\jdk1.8.0_162\jre\lib\management-agent.jar;G:\Java\jdk1.8.0_162\jre\lib\plugin.jar;G:\Java\jdk1.8.0_162\jre\lib\resources.jar;G:\Java\jdk1.8.0_162\jre\lib\rt.jar;G:\Java\IDEA_code\Day19\day19_Exception\out\production\day19_Exception;G:\Java\IntelliJ IDEA 16\IntelliJ IDEA 2016.1\lib\idea_rt.jar" com.intellij.rt.execution.application.AppMain jejune2.ExceptionDemo2
除数不能为0
over

Process finished with exit code 0

 */