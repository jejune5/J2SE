package jejune6;

/**
 * Created by Jejune on 2018/6/20.
 */

import java.io.InputStream;
import java.io.IOException;
import java.net.ServerSocket;
import java.net.Socket;

/**
 * TCP接收数据:
 * A:创建接收端Socket对象
 * B:监听客户端连接。返回一个Socket对象
 * C:获取输入流，读取数据并在控制台输出
 * D:释放资源
 */
public class ServerDemo {
    public static void main(String[] args) throws IOException {
        // 创建接收端的Socket对象
        // ServerSocket(int port)
        ServerSocket ss = new ServerSocket(307);

        // 监听客户端连接。返回一个对应的Socket对象
        // public Socket accept()
        Socket s = ss.accept();

        // 获取输入流，读取数据显示在控制台
        InputStream is = s.getInputStream();

        byte[] bys = new byte[1024];
        int len = is.read(bys);
        String str = new String(bys, 0, len);

        String ip = s.getInetAddress().getHostAddress();

        System.out.println(ip + "---" + str);

        // 释放资源
        s.close();
        ss.close();
    }
}
