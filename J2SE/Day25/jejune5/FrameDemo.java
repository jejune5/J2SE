package jejune5;

import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.WindowAdapter;
import java.awt.event.WindowEvent;

/**
 * Created by Jejune on 2018/4/10.
 */

/*
 * 需求：把按钮添加到窗体，并对按钮添加一个点击事件。
 * A：创建窗体对象
 * B:创建按钮对象
 * C:把按钮添加到窗体
 * D:窗体显示
 */
public class FrameDemo {
    public static void main(String[] args) {
        //设置窗体对象
        Frame f = new Frame("按钮测试");
        // 设置属性
        f.setBounds(300, 300, 300, 300);
        // 设置流式布局
        f.setLayout(new FlowLayout());
        //创建按钮对象
        Button bu = new Button("狗涛");
        // 把按钮添加到窗体
        f.add(bu);
        //设置窗体关闭
        f.addWindowListener(new WindowAdapter() {

            @Override
            public void windowClosing(WindowEvent e) {
                System.exit(0);
            }
        });

        //设置按钮事件
        bu.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                System.out.println("大傻逼");
            }
        });

        //设置窗体显示
        f.setVisible(true);
    }
}
