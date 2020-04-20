package Demo41_50;

import java.util.Scanner;

/**
 * Created by Jejune on 2018/8/16.
 */
/*
【程序45】题目：  （1）判断几个9能被一个素数整除。
                （2）判断一个整数能被几个9整除。（原题：一个素数能被几个9整除）
 */
public class Demo45 {
    public static void main(String[] args) {
        //(1)



        //(2)
        Scanner sc = new Scanner(System.in);
        System.out.println("请输入一个数：");
        int num = sc.nextInt();
        int temp = num;
        int count = 0;
        for (int i = 0; temp %9==0;){
            temp = temp/9;
            count++;
        }
        System.out.println(num+"能被 "+count+" 个9整除！");


    }
}
