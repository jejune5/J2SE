package jejune2;

import java.io.IOException;
import java.net.*;

/**
 * Created by Jejune on 2018/5/29.
 */
/*
 * UDP协议发送数据：
 * A:创建发送端Socket对象
 * B:创建数据，并把数据打包
 * C:调用Socket对象的发送方法发送数据包
 * D:释放资源
 */
public class SendDemo {
    public static void main(String[] args) throws IOException {
        // 创建发送端Socket对象
        // DatagramSocket()
        DatagramSocket ds = new DatagramSocket();

        // 创建数据，并把数据打包
        // DatagramPacket(byte[] buf, int length, InetAddress address, int port)
        // 创建数据
        byte[] bys = "hello,udp,测试".getBytes();

        //长度
        int length = bys.length;
        //ip地址对象
        InetAddress address = InetAddress.getByName("192.168.1.130");

        //端口
        int port = 10086;
        DatagramPacket dp = new DatagramPacket(bys, length, address, port);
        // 调用Socket对象的发送方法发送数据包
        // public void send(DatagramPacket p)

        ds.send(dp);

        //释放资源
        ds.close();

    }
}
