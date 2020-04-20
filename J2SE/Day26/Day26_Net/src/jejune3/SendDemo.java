package jejune3;

import java.io.IOException;
import java.net.*;

/**
 * Created by Jejune on 2018/6/18.
 */
public class SendDemo {
    public static void main(String[] args) throws IOException {
        // 创建发送端Socket对象
        // DatagramSocket()
        DatagramSocket ds = new DatagramSocket();

        //创建包裹
        // DatagramPacket(byte[] buf, int length, InetAddress address, int port)
        byte[] bys = "Hello SanMao".getBytes();
        DatagramPacket dp = new DatagramPacket(bys,0,bys.length,
                InetAddress.getByName("192.168.1.130"),10086);

        // 发送数据
        ds.send(dp);
        // 释放资源
        ds.close();
    }
}
