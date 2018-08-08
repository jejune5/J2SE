package jejune12;

/**
 * Created by Jejune on 2018/6/22.
 */

import java.io.*;
import java.net.ServerSocket;
import java.net.Socket;

/**
 * 客户端读取文件，并且服务器在文本文件显示 加反馈
 */

/*
 * 按照我们正常的思路加入反馈信息，结果却没反应。为什么呢?
 * 读取文本文件是可以以null作为结束信息的，但是呢，通道内是不能这样结束信息的。
 * 所以，服务器根本就不知道你结束了。而你还想服务器给你反馈。所以，就相互等待了。
 *
 * 如何解决呢?
 * A:在多写一条数据，告诉服务器，读取到这条数据说明我就结束，你也结束吧。
 * 		这样做可以解决问题，但是不好。
 * B:Socket对象提供了一种解决方案
 * 		public void shutdownOutput()
 */
public class ServerDemo {
    public static void main(String[] args) throws IOException {
        //①创建服务器Socket对象
        ServerSocket ss = new ServerSocket(307);

        //②监听客户端连接
        Socket s = ss.accept(); //阻塞了

        //③封装通道内流
        BufferedReader br = new BufferedReader(new InputStreamReader(
                s.getInputStream()));

        //④封装文本文件
        BufferedWriter bw = new BufferedWriter(new FileWriter("fwq.txt"));

        String line = null;
        while ((line = br.readLine()) != null) {
            bw.write(line);
            bw.newLine();
            bw.flush();
        }

        //给出反馈
        BufferedWriter bwServer = new BufferedWriter(new OutputStreamWriter(
                s.getOutputStream()));

        bwServer.write("文件上传成功");
        bwServer.newLine();
        bwServer.flush();

        //释放资源
        bw.close();
        s.close();
    }
}