import java.util.Arrays;

/**
 * Created by Jejune on 2018/9/7.
 */
public class Test {
    public static void main(String[] args) {
        int[] arr = new int[]{10, 5, 2, 5, 6, 7, 9, 1, 4, 3, 8};
        System.out.println("排序前：" + Arrays.toString(arr));

        //冒泡排序
        // BubbleSort.sort(arr);

        //选择排序
        // SelectionSort.sort(arr);

        //插入排序
        InsertSort.sort(arr);

        System.out.println("排序后：" + Arrays.toString(arr));
    }


    public static void swap(int[] data, int i, int j) {
        int temp = data[i];
        data[i] = data[j];
        data[j] = temp;
    }
}