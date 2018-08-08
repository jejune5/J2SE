package jejune14;

/**
 * Created by Jejune on 2018/6/24.
 */
/**
 * 多线程改进版客户端-服务器收发
 */
import java.io.*;
import java.net.Socket;

public class UserThread implements Runnable {
    private Socket s;

    public UserThread(Socket s) {
        this.s = s;

    }

    @Override
    public void run() {
        //封装通道内的流
        try {
            BufferedReader br = new BufferedReader(new InputStreamReader(
                    s.getInputStream()));

            //封装文本文件
            /*
            BufferedWriter bw = new BufferedWriter(new FileWriter(

                    "a.txt"));
            */
            //为了防止名称重名，此服务器采用当前时间来命名
            String newName = System.currentTimeMillis()+".txt";
            BufferedWriter bw = new BufferedWriter(new FileWriter(
                    newName));

            String line = null;
            while((line = br.readLine()) != null){
                bw.write(line);
                bw.newLine();
                bw.flush();
            }

            //给出一个反馈
            BufferedWriter bwServer = new BufferedWriter(new OutputStreamWriter(
                    s.getOutputStream()));
            bwServer.write("文件上传成功！");
            bwServer.newLine();
            bwServer.flush();

            //释放资源
            bw.close();
            s.close();

        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
