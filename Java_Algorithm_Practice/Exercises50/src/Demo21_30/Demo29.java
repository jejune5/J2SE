package Demo21_30;

/**
 * Created by Jejune on 2018/8/13.
 */
/*
【程序29】   题目：求一个3*3矩阵主对角线元素之和。
 */
    /*
   二维数组
     */
public class Demo29 {
    public static void main(String[] args) {
        int sum = 0;
        int arr[][] = {{1, 2, 3}, {4, 5, 6}, {7, 8, 9}};
        for (int i = 0; i < 3; i++) {
            for (int j = 0; j < 3; j++) {
                if (i == j)
                    sum += arr[i][j];
            }
        }
        System.out.println(sum);
    }
}
