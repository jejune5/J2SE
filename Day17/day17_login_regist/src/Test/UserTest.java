package Test;

/**
 * Created by Jejune on 2018/8/6.
 */

import dao.Impl.UserDaoImpl;
import dao.UserDao;
import game.GuessNumber;
import pojo.User;

import java.util.Scanner;

/**
 * 用户测试类
 *
 * @author Jejune
 * @version V1.0
 *          <p>
 *          新增加了两个小问题
 *          A:多个对象共享同一个成员变量，用静态
 *          B:循环里面如果有switch，并且在switch里面有break，那么结束的不是循环，而是switch语句
 */
public class UserTest {
    public static void main(String[] args) {
        while (true) {
            // 欢迎界面，给出选择项
            System.out.println("-----欢迎光临-----");
            System.out.println("1 登录");
            System.out.println("2 注册");
            System.out.println("3 退出");
            System.out.println("请输入你的选项：");
            Scanner sc = new Scanner(System.in);
            // 为了后面的录入信息的方便，我所有的数据录入全部用字符接收
            String chooseNumber = sc.nextLine();


            UserDao ud = new UserDaoImpl();
            // 经过简单的思考，我选择了switch

            switch (chooseNumber) {
                case "1":
                    System.out.println("-----登录界面-----");
                    System.out.println("输入你的用户名：");
                    String username = sc.nextLine();
                    System.out.println("请输入你的密码：");
                    String password = sc.nextLine();
                    //调用登录功能
                    boolean flag = ud.isLogin(username, password);
                    if (flag) {
                        System.out.println("登录成功,可以开始玩游戏了!");
                        System.out.println("你要玩吗？y/n");
                        while (true) {
                            String resultString = sc.nextLine();
                            if (resultString.equalsIgnoreCase("y")) {
                                //玩游戏
                                GuessNumber.start();
                                System.out.println("你还玩吗？y/n");
                            } else {
                                break;
                            }
                        }
                        System.out.println("感谢使用，下次再来！");
                        System.exit(0);
                    } else {
                        System.out.println("密码或用户名错误！");
                    }
                    break;

                case "2":
                    // 欢迎界面，请输入用户名和密码
                    System.out.println("--------------注册界面--------------");
                    System.out.println("请输入用户名：");
                    String newUsername = sc.nextLine();
                    System.out.println("请输入密码：");
                    String newPassword = sc.nextLine();

                    User user = new User();
                    user.setUsername(newUsername);
                    user.setPassword(newPassword);

                    // 调用注册功能
                    // 多态
                    // UserDao ud = new UserDaoImpl();
                    // 具体类使用
                    // UserDaoImpl udi = new UserDaoImpl();
                    ud.regist(user);
                    System.out.println("注册成功！");
                    break;

                case "3":
                default:
                    System.out.println("感谢使用！");
                    System.exit(0);
                    break;
            }
        }
    }
}

/*
G:\Java\jdk1.8.0_162\bin\java -Didea.launcher.port=7536 "-Didea.launcher.bin.path=G:\Java\IntelliJ IDEA 16\IntelliJ IDEA 2016.1\bin" -Dfile.encoding=UTF-8 -classpath "G:\Java\jdk1.8.0_162\jre\lib\charsets.jar;G:\Java\jdk1.8.0_162\jre\lib\deploy.jar;G:\Java\jdk1.8.0_162\jre\lib\ext\access-bridge-64.jar;G:\Java\jdk1.8.0_162\jre\lib\ext\cldrdata.jar;G:\Java\jdk1.8.0_162\jre\lib\ext\dnsns.jar;G:\Java\jdk1.8.0_162\jre\lib\ext\jaccess.jar;G:\Java\jdk1.8.0_162\jre\lib\ext\jfxrt.jar;G:\Java\jdk1.8.0_162\jre\lib\ext\localedata.jar;G:\Java\jdk1.8.0_162\jre\lib\ext\nashorn.jar;G:\Java\jdk1.8.0_162\jre\lib\ext\sunec.jar;G:\Java\jdk1.8.0_162\jre\lib\ext\sunjce_provider.jar;G:\Java\jdk1.8.0_162\jre\lib\ext\sunmscapi.jar;G:\Java\jdk1.8.0_162\jre\lib\ext\sunpkcs11.jar;G:\Java\jdk1.8.0_162\jre\lib\ext\zipfs.jar;G:\Java\jdk1.8.0_162\jre\lib\javaws.jar;G:\Java\jdk1.8.0_162\jre\lib\jce.jar;G:\Java\jdk1.8.0_162\jre\lib\jfr.jar;G:\Java\jdk1.8.0_162\jre\lib\jfxswt.jar;G:\Java\jdk1.8.0_162\jre\lib\jsse.jar;G:\Java\jdk1.8.0_162\jre\lib\management-agent.jar;G:\Java\jdk1.8.0_162\jre\lib\plugin.jar;G:\Java\jdk1.8.0_162\jre\lib\resources.jar;G:\Java\jdk1.8.0_162\jre\lib\rt.jar;G:\Java\IDEA_code\Day17\day17_login_regist\out\production\day17_login_regist;G:\Java\IntelliJ IDEA 16\IntelliJ IDEA 2016.1\lib\idea_rt.jar" com.intellij.rt.execution.application.AppMain Test.UserTest
-----欢迎光临-----
1 登录
2 注册
3 退出
请输入你的选项：
2
--------------注册界面--------------
请输入用户名：
jejune
请输入密码：
123
注册成功！
-----欢迎光临-----
1 登录
2 注册
3 退出
请输入你的选项：
1
-----登录界面-----
输入你的用户名：
jejune
请输入你的密码：
123
登录成功,可以开始玩游戏了!
你要玩吗？y/n
Y
请输入一个数（1-100）：
50
你猜的数字50大了！
请输入一个数（1-100）：
25
你猜的数字25小了！
请输入一个数（1-100）：
30
你猜的数字30小了！
请输入一个数（1-100）：
40
你猜的数字40小了！
请输入一个数（1-100）：
45
你猜的数字45大了！
请输入一个数（1-100）：
44
你猜的数字44大了！
请输入一个数（1-100）：
46
你猜的数字46大了！
请输入一个数（1-100）：
43
恭喜你，猜中了！
你还玩吗？y/n
n
感谢使用，下次再来！

Process finished with exit code 0

 */