/**
 * Created by Jejune on 2018/9/7.
 */
/*
 * 希尔排序：先取一个小于n的整数d1作为第一个增量，
 * 把文件的全部记录分成（n除以d1）个组。所有距离为d1的倍数的记录放在同一个组中。
 * 先在各组内进行直接插入排序；然后，取第二个增量d2<d1重复上述的分组和排序，
 * 直至所取的增量dt=1(dt<dt-l<…<d2<d1)，即所有记录放在同一组中进行直接插入排序为止。
 */
public class ShellSort {
    public static void sort(int[] data) {
        for (int i = data.length / 2; i > 2; i /= 2) {
            for (int j = 0 ;j < i ;j++){
//                insertSort(data;);
            }
        }
    }

    private static void insertSort(int[] data , int start ,int inc) {
//        for (int i = start + inc)



    }
}
