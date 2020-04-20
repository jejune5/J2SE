package jejune4;

import java.io.IOException;
import java.net.DatagramPacket;
import java.net.DatagramSocket;
import java.net.SocketException;

/**
 * Created by Jejune on 2018/6/18.
 */
public class ReceiveDemo {
    public static void main(String[] args) throws IOException {
        //创建Socket对象
        DatagramSocket ds = new DatagramSocket(10086);

        while (true) {
            //创建包裹
            byte[] bys = new byte[1024];
            DatagramPacket dp = new DatagramPacket(bys, bys.length);

            //接收数据
            ds.receive(dp);

            //解析数据
            String ip = dp.getAddress().getHostAddress();
            String s = new String(dp.getData(), 0, bys.length);
            System.out.println("From:" + ip + "Data is :" + s);

            //释放资源
            //ds.close();
        }
    }
}
