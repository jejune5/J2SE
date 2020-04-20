package Demo41_50;

/**
 * Created by Jejune on 2018/8/15.
 */
/*
【程序43】题目：求0—7所能组成的奇数个数。
 */
public class Demo43 {
    public static void main(String[] args) {
       // 因为是奇数，所以个位只能是1，3，5，7共4种，前面可随便排列
        int count = 4;
        // 2位时，十位有8种(1,2,3,4,5,6,7)，个位4种，8×4
        // 3位时，8×8×4……
        for (int i = 1;i<8;i++) {
            count *=8;
            System.out.println(count+"个");
        }
    }
}
