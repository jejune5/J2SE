package jejune5;

import java.io.IOException;
import java.net.DatagramPacket;
import java.net.DatagramSocket;

/**
 * Created by Jejune on 2018/6/19.
 */
public class ReceiveThread implements Runnable {
    private DatagramSocket ds;

    public ReceiveThread(DatagramSocket ds) {
        this.ds = ds;
    }

    @Override
    public void run() {
        try {
            while (true) {
                //创建一个包裹
                byte[] bys = new byte[1024];
                DatagramPacket dp = new DatagramPacket(bys, bys.length);

                //接收数据
                ds.receive(dp);

                //解析数据
                String ip = dp.getAddress().getHostAddress();
                String s = new String(dp.getData(), 0, bys.length);
                System.out.println("From " + ip + " Data is " + s);
            }
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}