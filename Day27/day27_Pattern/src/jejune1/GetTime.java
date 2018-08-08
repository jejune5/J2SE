package jejune1;

/**
 * Created by Jejune on 2018/7/15.
 */
/*模板設計概述：
*     定义一个算法骨架，将具体的算法延迟到子类中来实现
*      */

public abstract class GetTime {
    //需求：计算一段代码运行时间
    public long getTime() {
        long start = System.currentTimeMillis();
        //for循环
//        for (int x = 0; x < 10000; x++) {
//            System.out.println(x);
//        }

        // 再给我测试一个代码：集合操作的，多线程操作，常用API操作的等等...
        code();

        long end = System.currentTimeMillis();

        return end - start;

    }

    public abstract void code();

}
