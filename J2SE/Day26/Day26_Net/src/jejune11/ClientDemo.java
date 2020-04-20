package jejune11;

/**
 * Created by Jejune on 2018/6/22.
 */

import java.io.*;
import java.io.IOException;
import java.net.Socket;

/**
 * 客户端读取文件，并且服务器在文本文件显示
 */
public class ClientDemo {
    public static void main(String[] args) throws IOException {
        //创建客户端Socket对象
        Socket s = new Socket("192.168.0.100", 307);

        //封装文本文件
        BufferedReader br = new BufferedReader(new FileReader(
                "mmm.txt"));

        //封装通道内的流
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(
                s.getOutputStream()));

        String line = null;
        while ((line = br.readLine()) != null) {
            bw.write(line);
            bw.newLine();
            bw.flush();
        }

        //释放资源
        br.close();
        //bw.close();
        s.close();
    }
}
