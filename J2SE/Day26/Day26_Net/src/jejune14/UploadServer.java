package jejune14;

import java.io.IOException;
import java.net.ServerSocket;
import java.net.Socket;

/**
 * Created by Jejune on 2018/6/24.
 */
/**
 * 多线程改进版客户端-服务器收发
 */
public class UploadServer {
    public static void main(String[] args) throws IOException {
        //创建服务器 Socket 对象
        ServerSocket ss = new ServerSocket(307);

        while (true) {
            Socket s = ss.accept();
            new Thread(new UserThread(s)).start();
        }

    }
}
