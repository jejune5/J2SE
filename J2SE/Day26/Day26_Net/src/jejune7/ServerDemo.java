package jejune7;

import java.io.IOException;
import java.io.InputStream;
import java.io.OutputStream;
import java.net.ServerSocket;
import java.net.Socket;

/**
 * Created by Jejune on 2018/6/21.
 */

/**
 * TCP协议通信-服務器:
 * 给服务器端加反馈
 */
public class ServerDemo {
    public static void main(String[] args) throws IOException {
        //创建服务器Socket对象
        // ServerSocket(int port)
        ServerSocket ss = new ServerSocket(307);

        //监听客户端的连接
        // public Socket accept()
        Socket s = ss.accept();

        //获取输入流
        InputStream is = s.getInputStream();
        byte[] bys = new byte[1024];
        int len = is.read(bys);
        String server = new String(bys, 0, len);
        System.out.println("server:" + server);

        // 获取输出流
        OutputStream os = s.getOutputStream();
        os.write("数据已收到".getBytes());

        //释放资源
        s.close();
    }
}
