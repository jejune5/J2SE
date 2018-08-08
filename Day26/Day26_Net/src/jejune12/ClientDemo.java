package jejune12;

/**
 * Created by Jejune on 2018/6/22.
 */

import java.io.*;
import java.net.Socket;

/**
 * 客户端读取文件，并且服务器在文本文件显示并加反馈
 */
public class ClientDemo {
    public static void main(String[] args) throws IOException {
        //①创建客户端Socket对象
        Socket s = new Socket("192.168.0.100", 307);

        //②封装文本文件
        BufferedReader br = new BufferedReader(new FileReader(
                "mmm.txt"));

        //③封装通道内的流
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(
                s.getOutputStream()));

        String line = null;
        while ((line = br.readLine()) != null) {
            bw.write(line);
            bw.newLine();
            bw.flush();
        }

        //④Socket提供了一个终止，它会通知服务器你别等了，我没有数据过来了
        s.shutdownOutput();

        //⑤接受反馈
        BufferedReader brClient = new BufferedReader(new InputStreamReader(
                s.getInputStream()));
        String client = brClient.readLine();
        System.out.println(client);

        //⑥释放资源
        br.close();
        //bw.close();
        s.close();
    }
}
