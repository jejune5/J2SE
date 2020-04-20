package jejune3;

import java.util.Arrays;

/*
 * 把字符串中的字符进行排序。
 * 		举例："dacgebf"
 * 		结果："abcdefg"
 *
 * 分析：
 * 		A:定义一个字符串
 * 		B:把字符串转换为字符数组
 * 		C:把字符数组进行排序
 * 		D:把排序后的字符数组转成字符串
 * 		E:输出最后的字符串
 */
public class ArrayTest {
    public static void main(String[] args) {
        //A
        String s = "dacgebf";

        //B
        char[] chs = s.toCharArray();

        //C
       // Arrays.sort(chs);
        bubbleSort(chs);

        //D
        String ressult = String.valueOf(chs);

        //E
        System.out.println(ressult);
    }

    public static void bubbleSort(char[] chs) {
        for (int x = 0; x < chs.length - 1; x++) {
            for (int y = 0; y < chs.length - 1 - x; y++) {
                if (chs[y] > chs[y + 1]) {
                    char temp = chs[y];
                    chs[y] = chs[y + 1];
                    chs[y + 1] = temp;
                }
            }
        }
    }
}
