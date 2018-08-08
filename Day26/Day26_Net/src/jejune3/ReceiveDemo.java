package jejune3;

import java.io.IOException;
import java.net.DatagramPacket;
import java.net.DatagramSocket;

/**
 * Created by Jejune on 2018/6/18.
 */
public class ReceiveDemo {
    public static void main(String[] args) throws IOException {
        // 创建接收端Socket对象
        // DatagramSocket(int port)
        DatagramSocket ds = new DatagramSocket(10086);

        // 创建一个数据包(接收容器)
        // Datagrampacket(byte[] buf, int length)
        byte[] bys = new byte[1024];
        DatagramPacket dp = new DatagramPacket(bys, bys.length);

        // 调用Socket对象的接收方法接收数据
        // public void receive(DatagramPacket p)
        ds.receive(dp);

        // 解析数据包，并显示在控制台
        // 获取对方的ip
        // public InetAddress getAddress()
        String ip = dp.getAddress().getHostAddress();
        String s = new String(dp.getData(), 0, bys.length);
        System.out.println("From" + ip + " Date is:" + s);

        ds.close();
    }
}
