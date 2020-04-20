package jejune9;

import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.WindowAdapter;
import java.awt.event.WindowEvent;
import java.io.IOException;

/**
 * Created by Jejune on 2018/4/15.
 */
/*
  多级菜单
*/
public class FrameDemo {
    public static void main(String[] args) {
        //创建窗体，设置属性
        Frame f = new Frame("多级菜单");
        f.setBounds(400, 200, 400, 300);
        f.setLayout(new FlowLayout());

        final String name = f.getTitle();

        //创建菜单栏
        MenuBar mb = new MenuBar();
        //创建菜单
        Menu m1 = new Menu("NiuBi");
        Menu m2 = new Menu("XuTao");


        //创建菜二级单项
        final MenuItem mi1 = new MenuItem("ShaBi");
        final MenuItem mi2 = new MenuItem("CaoniMao");
        MenuItem mi3 = new MenuItem("ShaDiao");

        //创建菜一级单项
        MenuItem mi4 = new MenuItem("SanMao");
        MenuItem mi5 = new MenuItem("WJJ");

        // 设置菜单项
        m2.add(mi1);
        m2.add(mi2);
        m2.add(mi3);

        m1.add(m2);
        m1.add(mi4);
        m1.add(mi5);

        mb.add(m1);

        // 设置到菜单栏
        f.setMenuBar(mb);

        //设置窗体关闭
        f.addWindowListener(new WindowAdapter() {
            @Override
            public void windowClosing(WindowEvent e) {
                System.exit(0);
            }
        });

        //设置菜单事件
        mi1.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                f.setTitle(mi1.getLabel());
            }
        });

        mi2.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                f.setTitle(mi2.getLabel());
            }
        });

        mi3.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                f.setTitle(name);
            }
        });

        mi4.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                Runtime r = Runtime.getRuntime();
                try {
                    r.exec("notepad");
                } catch (IOException e1) {
                    e1.printStackTrace();
                }
            }
        });

        mi5.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                System.exit(0);
            }
        });

        //设置窗体可见
        f.setVisible(true);
    }
}
