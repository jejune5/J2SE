package jejune6;

import jejune5.UserDao;
import jejune5.UserDaoImpl;

import java.lang.reflect.Proxy;

/**
 * Created by Jejune on 2018/7/14.
 */
/*动态代理的测试*/
public class Test {
    public static void main(String[] args) {
        UserDao ud = new UserDaoImpl();
        ud.add();
        ud.delete();
        ud.update();
        ud.find();
        System.out.println("---");
        // 我们要创建一个动态代理对象
        // Proxy类中有一个方法可以创建动态代理对象
        // public static Object newProxyInstance(ClassLoader loader,Class<?>[]
        // interfaces,InvocationHandler h)
        // 我准备对ud对象做一个代理对象
        MyInvocationHandler handler = new MyInvocationHandler(ud);
        UserDao proxy = (UserDao) Proxy.newProxyInstance(ud.getClass()
                .getClassLoader(), ud.getClass().getInterfaces(), handler);
        proxy.add();
        proxy.delete();
        proxy.update();
        proxy.find();
        System.out.println("---");

        StudentDao sd = new StudentDaoImpl();
        MyInvocationHandler handler1 = new MyInvocationHandler(sd);
        StudentDao proxy1 = (StudentDao) Proxy.newProxyInstance(sd.getClass()
                .getClassLoader(), sd.getClass().getInterfaces(), handler1);
        proxy1.login();
        proxy1.regist();
        System.out.println("---");

    }
}

/*G:\Java\jdk1.8.0_162\bin\java -Didea.launcher.port=7532 "-Didea.launcher.bin.path=G:\Java\IntelliJ IDEA 16\IntelliJ IDEA 2016.1\bin" -Dfile.encoding=UTF-8 -classpath "G:\Java\jdk1.8.0_162\jre\lib\charsets.jar;G:\Java\jdk1.8.0_162\jre\lib\deploy.jar;G:\Java\jdk1.8.0_162\jre\lib\ext\access-bridge-64.jar;G:\Java\jdk1.8.0_162\jre\lib\ext\cldrdata.jar;G:\Java\jdk1.8.0_162\jre\lib\ext\dnsns.jar;G:\Java\jdk1.8.0_162\jre\lib\ext\jaccess.jar;G:\Java\jdk1.8.0_162\jre\lib\ext\jfxrt.jar;G:\Java\jdk1.8.0_162\jre\lib\ext\localedata.jar;G:\Java\jdk1.8.0_162\jre\lib\ext\nashorn.jar;G:\Java\jdk1.8.0_162\jre\lib\ext\sunec.jar;G:\Java\jdk1.8.0_162\jre\lib\ext\sunjce_provider.jar;G:\Java\jdk1.8.0_162\jre\lib\ext\sunmscapi.jar;G:\Java\jdk1.8.0_162\jre\lib\ext\sunpkcs11.jar;G:\Java\jdk1.8.0_162\jre\lib\ext\zipfs.jar;G:\Java\jdk1.8.0_162\jre\lib\javaws.jar;G:\Java\jdk1.8.0_162\jre\lib\jce.jar;G:\Java\jdk1.8.0_162\jre\lib\jfr.jar;G:\Java\jdk1.8.0_162\jre\lib\jfxswt.jar;G:\Java\jdk1.8.0_162\jre\lib\jsse.jar;G:\Java\jdk1.8.0_162\jre\lib\management-agent.jar;G:\Java\jdk1.8.0_162\jre\lib\plugin.jar;G:\Java\jdk1.8.0_162\jre\lib\resources.jar;G:\Java\jdk1.8.0_162\jre\lib\rt.jar;G:\Java\IDEA_code\Day27\day27_Reflect\out\production\day27_Reflect;G:\Java\IntelliJ IDEA 16\IntelliJ IDEA 2016.1\lib\idea_rt.jar" com.intellij.rt.execution.application.AppMain jejune6.Test
添加功能
删除功能
修改功能
查找功能
---
权限校验
添加功能
日志记录
权限校验
删除功能
日志记录
权限校验
修改功能
日志记录
权限校验
查找功能
日志记录
---
权限校验
登录测试
日志记录
权限校验
注册功能
日志记录
---

Process finished with exit code 0
*/