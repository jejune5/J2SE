package jejune7;

/**
 * Created by Jejune on 2018/8/7.
 */
/*
/*
 * 面试题：
 * 1:final,finally和finalize的区别
 * final：最终的意思，可以修饰类，成员变量，成员方法
 * 		修饰类，类不能被继承
 * 		修饰变量，变量是常量
 * 		修饰方法，方法不能被重写
 * finally：是异常处理的一部分，用于释放资源。
 * 		一般来说，代码肯定会执行，特殊情况：在执行到finally之前jvm退出了
 * finalize：是Object类的一个方法，用于垃圾回收
 *
 * 2:如果catch里面有return语句，请问finally里面的代码还会执行吗?
 *   如果会，请问是在return前，还是return后。
 * 	   会。前。
 *
 * 	 准确的说，应该是在中间。
 *
 * 3:try...catch...finally的格式变形
 * 		A:try...catch...finally
 * 		B:try...catch
 * 		C:try...catch...catch...
 * 		D:try...catch...catch...finally
 * 		E:try...finally
 * 			这种做法的目前是为了释放资源。
 */
public class FinallyDemo2 {
    public static void main(String[] args) {
        System.out.println(getInt());
    }

    private static int getInt() {
        int a = 10;
        try {
            System.out.println(a / 0);
            a = 20;
        } catch (ArithmeticException e) {
            a = 30;
            return a;
            /*
             * return a在程序执行到这一步的时候，这里不是return a而是return 30;这个返回路径就形成了。
			 * 但是呢，它发现后面还有finally，所以继续执行finally的内容，a=40
			 * 再次回到以前的返回路径，继续走return 30;
			 */
        } finally {
            a = 40;
            return a;//如果这样结果就是40了。
        }
        // return a;
    }
}

/*
G:\Java\jdk1.8.0_162\bin\java -Didea.launcher.port=7533 "-Didea.launcher.bin.path=G:\Java\IntelliJ IDEA 16\IntelliJ IDEA 2016.1\bin" -Dfile.encoding=UTF-8 -classpath "G:\Java\jdk1.8.0_162\jre\lib\charsets.jar;G:\Java\jdk1.8.0_162\jre\lib\deploy.jar;G:\Java\jdk1.8.0_162\jre\lib\ext\access-bridge-64.jar;G:\Java\jdk1.8.0_162\jre\lib\ext\cldrdata.jar;G:\Java\jdk1.8.0_162\jre\lib\ext\dnsns.jar;G:\Java\jdk1.8.0_162\jre\lib\ext\jaccess.jar;G:\Java\jdk1.8.0_162\jre\lib\ext\jfxrt.jar;G:\Java\jdk1.8.0_162\jre\lib\ext\localedata.jar;G:\Java\jdk1.8.0_162\jre\lib\ext\nashorn.jar;G:\Java\jdk1.8.0_162\jre\lib\ext\sunec.jar;G:\Java\jdk1.8.0_162\jre\lib\ext\sunjce_provider.jar;G:\Java\jdk1.8.0_162\jre\lib\ext\sunmscapi.jar;G:\Java\jdk1.8.0_162\jre\lib\ext\sunpkcs11.jar;G:\Java\jdk1.8.0_162\jre\lib\ext\zipfs.jar;G:\Java\jdk1.8.0_162\jre\lib\javaws.jar;G:\Java\jdk1.8.0_162\jre\lib\jce.jar;G:\Java\jdk1.8.0_162\jre\lib\jfr.jar;G:\Java\jdk1.8.0_162\jre\lib\jfxswt.jar;G:\Java\jdk1.8.0_162\jre\lib\jsse.jar;G:\Java\jdk1.8.0_162\jre\lib\management-agent.jar;G:\Java\jdk1.8.0_162\jre\lib\plugin.jar;G:\Java\jdk1.8.0_162\jre\lib\resources.jar;G:\Java\jdk1.8.0_162\jre\lib\rt.jar;G:\Java\IDEA_code\Day19\day19_Exception\out\production\day19_Exception;G:\Java\IntelliJ IDEA 16\IntelliJ IDEA 2016.1\lib\idea_rt.jar" com.intellij.rt.execution.application.AppMain jejune7.FinallyDemo2
40

Process finished with exit code 0

 */