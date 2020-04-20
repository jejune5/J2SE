package Demo41_50;

/**
 * Created by Jejune on 2018/8/15.
 */
/*
【程序42】   题目：809*??=800*??+9*??+1。其中??代表的两位数,
            8*??的结果为两位数，9*??的结果为3位数。
            求??代表的两位数，及809*??后的结果。
 */
public class Demo42 {
    public static void main(String[] args) {
        for (int x = 10; x <= 99; x++) {
            if (809 * x == (800 * x + 9 * x + 1) && 8 * x >= 10 && 8 * x < 100 && 9 * x >= 100 && 9 * x <1000) {
                System.out.println("??是：" + x);
                System.out.println("809*?? = " + (809 * x));
                System.exit(0);
            }
        }
        System.out.println("------");
        for (int i = 10; i < 100; i++) {
            if (809 * i == (800 * i + 9 * i + 1) && 8 * i >= 10 && 8 * i < 100
                    && 9 * i >= 100 && 9 * i < 1000) {
                System.out.println("?? =" + i);
                System.out.println("809*??="+ 809 * i);
                System.exit(0);
            }
        }
    }
}
