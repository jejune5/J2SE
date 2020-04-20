package jejune9;

import java.io.*;
import java.net.ServerSocket;
import java.net.Socket;

/**
 * Created by Jejune on 2018/6/21.
 */
public class ServerDemo {
    public static void main(String[] args) throws IOException {
        //创建服务器Socket对象
        ServerSocket ss = new ServerSocket(307);

        //监听客户端连接
        Socket s = ss.accept();

        //封装通道内数据
        BufferedReader br = new BufferedReader(new InputStreamReader(
                s.getInputStream()));

        //封装文本文件
        BufferedWriter bw = new BufferedWriter(new FileWriter("mmm.txt"));

        String line = null;
        while ((line = br.readLine()) != null) {
            bw.write(line);
            bw.newLine();
            bw.flush();
        }

        //释放资源
        bw.close();
        // br.close();
        s.close();
        // ss.close();
    }
}
