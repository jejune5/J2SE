package jejune3;

import java.io.IOException;

/**
 * Created by Jejune on 2018/4/2.
 */
/*
 * Runtime:每个 Java 应用程序都有一个 Runtime 类实例，使应用程序能够与其运行的环境相连接。
 * exec(String command)
 */
public class RuntimeDemo {
    public static void main(String[] args) throws IOException {
        Runtime r = Runtime.getRuntime();

        //调用dos命令
        // r.exec("winmine");
        // r.exec("notepad");
        // r.exec("calc");
        // r.exec("shutdown -s -t 10000");
       r.exec("calc");

    }
}
