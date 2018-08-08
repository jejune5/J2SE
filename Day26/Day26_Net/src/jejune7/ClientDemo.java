package jejune7;

/**
 * Created by Jejune on 2018/6/21.
 */

import java.io.IOException;
import java.io.InputStream;
import java.io.OutputStream;
import java.net.Socket;

/**
 * TCP协议通信-客户端:
 * 给服务器端加反馈
 */
public class ClientDemo {
    public static void main(String[] args) throws IOException {
        //创建客户端Socket对象
        Socket s = new Socket("192.168.0.100", 307);

        //获取输出流
        OutputStream os = s.getOutputStream();
        os.write("三毛是个大傻逼，测试".getBytes());

        //获取输入流
        InputStream is = s.getInputStream();
        byte[] bys = new byte[1024];
        int len = is.read(bys);
        String client = new String(bys, 0, len);
        System.out.println("Client:" + client);

        //释放资源
        s.close();
    }
}
