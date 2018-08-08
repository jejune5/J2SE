package jejune11;

/**
 * Created by Jejune on 2018/6/22.
 */

import java.io.*;
import java.net.ServerSocket;
import java.net.Socket;

/**
 * 客户端读取文件，并且服务器在文本文件显示
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
        BufferedWriter bw = new BufferedWriter(new FileWriter("fwq.txt"));

        String line = null;
        while ((line = br.readLine()) != null) {
            bw.write(line);
            bw.newLine();
            bw.flush();
        }

        //释放资源
        bw.close();
        s.close();
    }
}