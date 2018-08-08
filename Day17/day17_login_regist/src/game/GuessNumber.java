package game;

/**
 * Created by Jejune on 2018/8/6.
 */

import java.util.Scanner;

/**
 * 这是猜数字小游戏
 *
 * @author Jejune
 * @version V1.0
 */
public class GuessNumber {
    private GuessNumber() {
    }

    public static void start() {
        //产生一个随机数
        int number = (int) ((Math.random() * 100) + 1);

        //定义一个计量器
        int count = 0;

        while (true) {
            Scanner sc = new Scanner(System.in);
            System.out.println("请输入一个数（1-100）：");
            int guessNumber = sc.nextInt();
            count++;

            //判断
            if (guessNumber > number) {
                System.out.println("你猜的数字" + guessNumber + "大了！");
            } else if (guessNumber < number) {
                System.out.println("你猜的数字" + guessNumber + "小了！");
            } else {
                System.out.println("恭喜你，猜中了！");
                break;
            }
        }
    }
}
