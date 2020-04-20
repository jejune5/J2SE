package Demo11_20;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.Scanner;

/**
 * Created by Jejune on 2018/8/9.
 */
/*
【程序15】 题目：输入三个整数x,y,z，请把这三个数由小到大输出。
 */
public class Demo15 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("请输入x: ");
        int x = sc.nextInt();
        System.out.println("请输入y: ");
        int y = sc.nextInt();
        System.out.println("请输入z: ");
        int z = sc.nextInt();

        List<Integer> list = new ArrayList<Integer>();
        list.add(x);
        list.add(y);
        list.add(z);

        Collections.sort(list);

        for (Integer i : list) {
            System.out.print(i+" ");
        }
    }
}
