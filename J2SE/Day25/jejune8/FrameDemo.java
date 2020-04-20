package jejune8;

import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.WindowAdapter;
import java.awt.event.WindowEvent;

/**
 * Created by Jejune on 2018/4/15.
 */
/*
 * 一级菜单
 */
public class FrameDemo {
    public static void main(String[] args) {
        // 创建窗体对象
        Frame f = new Frame("一级菜单");
        // 设置窗体属性
        f.setBounds(400, 200, 400, 300);
        f.setLayout(new FlowLayout());

        //创建菜单栏
        MenuBar mb = new MenuBar();
        //创建菜单
        Menu m = new Menu("File");
        //创建菜单项
        MenuItem mi = new MenuItem("Exit");

        // 添加到菜单栏
        mb.add(m);
        m.add(mi);

        // 添加到窗体 用setMenuBar() 方法
        f.setMenuBar(mb);

        // 设置窗体关闭
        f.addWindowListener(new WindowAdapter() {
            @Override
            public void windowClosing(WindowEvent e) {
                System.exit(0);
            }
        });

        //设置菜单项
        mi.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                System.exit(0);
            }
        });

        //设置窗体可见
        f.setVisible(true);
    }
}
