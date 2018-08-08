package jejune5;

/**
 * Created by Jejune on 2018/7/26.
 */
public class MyStackDemo {
    public static void main(String[] args) {
        //创建集合对象
        MyStack ms = new MyStack();

        //添加元素
        ms.add("Hello");
        ms.add("World");
        ms.add("Java");

        while (!ms.isEmpty()) {
            System.out.println(ms.get());
        }
    }
}
