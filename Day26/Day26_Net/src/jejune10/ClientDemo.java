package jejune10;

/**
 * Created by Jejune on 2018/6/21.
 */

import java.io.*;
import java.net.Socket;

/**
 * 客户端文本文件，服务器输出到控制台
 */
public class ClientDemo {
    public static void main(String[] args) throws IOException {
        //创建Socket对象
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

        br.close();
        bw.close();
        s.close();
    }
}
