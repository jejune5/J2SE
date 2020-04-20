package jejune4;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.net.DatagramPacket;
import java.net.DatagramSocket;
import java.net.InetAddress;

/**
 * Created by Jejune on 2018/6/18.
 */
/*
数据来自键盘录入

 */
public class SendDemo {
    public static void main(String[] args) throws IOException {

        // 创建Socket对象
        DatagramSocket ds = new DatagramSocket();

        //封装键盘录入数据
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        String line = null;
        while ((line = br.readLine()) != null) {
            if ("886".equals(line)) {
                break;
            }
            //创建数据并打包
            byte[] bys = line.getBytes();
            DatagramPacket dp = new DatagramPacket(bys, bys.length,
                    InetAddress.getByName("192.168.0.100"), 10086);
            //发送数据
            ds.send(dp);
        }
        ds.close();

    }
}
