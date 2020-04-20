package jejune4;

import java.awt.*;

/**
 * Created by Jejune on 2018/4/3.
 */
public class FrameDemo {
    public static void main(String[] args) {
        // 创建窗体对象
        // Frame f = new Frame();
        // Frame(String title)
        Frame f = new Frame("茅敏敏");

        //设置窗体标题
        f.setTitle("HelloWorld");
        //设置窗体大小
        f.setSize(400, 500); //单位：像素
        //设置窗体位置
        f.setLocation(400, 200);

        //调用一个方法，设置让窗体可见
//        f.show();  //过时
        f.setVisible(true);

    }
}
