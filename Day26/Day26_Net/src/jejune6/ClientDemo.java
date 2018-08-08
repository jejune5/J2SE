package jejune6;

/**
 * Created by Jejune on 2018/6/20.
 */

import java.io.IOException;
import java.io.OutputStream;
import java.net.Socket;

/**
 * TCP协议发送数据：
 * A:创建发送端的Socket对象
 * B:获取输出流，写数据
 * C:释放资源
 * <p>
 * 连接被拒绝。TCP协议一定要先看服务器。
 * java.net.ConnectException: Connection refused: connect
 */
public class ClientDemo {
    public static void main(String[] args) throws IOException {
        // 创建发送端的Socket对象
        // Socket(InetAddress address, int port)
        // Socket(String host, int port)
        // Socket s = new Socket(InetAddress.getByName("192.168.12.92"), 8888);
        Socket s = new Socket("192.168.1.114", 307);


        // 获取输出流，写数据
        // public OutputStream getOutputStream()
        OutputStream os = s.getOutputStream();
        os.write("Hello,TCP,测试".getBytes());

        // 释放资源
        s.close();

    }
}
