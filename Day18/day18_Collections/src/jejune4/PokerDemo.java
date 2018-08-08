package jejune4;

import java.util.ArrayList;
import java.util.Collections;
import java.util.HashMap;
import java.util.TreeSet;

/**
 * Created by Jejune on 2018/8/6.
 */
/*
 * 思路：
 * 		A:创建一个HashMap集合
 * 		B:创建一个ArrayList集合
 * 		C:创建花色数组和点数数组
 * 		D:从0开始往HashMap里面存储编号，并存储对应的牌
 *        同时往ArrayList里面存储编号即可。
 *      E:洗牌(洗的是编号)
 *      F:发牌(发的也是编号，为了保证编号是排序的，就创建TreeSet集合接收)
 *      G:看牌(遍历TreeSet集合，获取编号，到HashMap集合找对应的牌)
 */
public class PokerDemo {
    public static void main(String[] args) {
        //A
        HashMap<Integer, String> hm = new HashMap<Integer, String>();

        //B
        ArrayList<Integer> array = new ArrayList<Integer>();

        // 创建花色数组和点数数组
        // 定义一个花色数组
        String[] colors = {"♠", "♥", "♣", "♦"};
        // 定义一个点数数组
        String[] numbers = {"3", "4", "5", "6", "7", "8", "9", "10", "J", "Q",
                "K", "A", "2",};

        // 从0开始往HashMap里面存储编号，并存储对应的牌,同时往ArrayList里面存储编号即可。
        int index = 0;

        for (String number : numbers) {
            for (String color : colors) {
                String poker = color.concat(number);
                hm.put(index, poker);
                array.add(index);
                index++;
            }
        }
        hm.put(index, "BlackJoker");
        array.add(index);
        index++;
        hm.put(index, "RedJoker");
        array.add(index);

        // 洗牌(洗的是编号)
        Collections.shuffle(array);

        // 发牌(发的也是编号，为了保证编号是排序的，就创建TreeSet集合接收
        TreeSet<Integer> Mao = new TreeSet<Integer>();
        TreeSet<Integer> Wu = new TreeSet<Integer>();
        TreeSet<Integer> Zhao = new TreeSet<Integer>();
        TreeSet<Integer> diPai = new TreeSet<Integer>();

        for (int x = 0; x < array.size(); x++) {
            if (x >= array.size() - 3) {
                diPai.add(array.get(x));
            } else if (x % 3 == 0) {
                Mao.add(array.get(x));
            } else if (x % 3 == 1) {
                Wu.add(array.get(x));
            } else if (x % 3 == 2) {
                Zhao.add(array.get(x));
            }
        }
        //看牌
        lookPoker("茅敏敏", Mao, hm);
        lookPoker("吴彦祖", Wu, hm);
        lookPoker("赵安", Mao, hm);

        lookPoker("底牌", diPai, hm);

    }

    //看牌的功能
    private static void lookPoker(String name, TreeSet<Integer> ts, HashMap<Integer, String> hm) {
        System.out.println(name + "的牌是：");
        for (Integer key : ts) {
            String value = hm.get(key);
            System.out.println(value + " ");
        }
    }
}

/*
G:\Java\jdk1.8.0_162\bin\java -Didea.launcher.port=7534 "-Didea.launcher.bin.path=G:\Java\IntelliJ IDEA 16\IntelliJ IDEA 2016.1\bin" -Dfile.encoding=UTF-8 -classpath "G:\Java\jdk1.8.0_162\jre\lib\charsets.jar;G:\Java\jdk1.8.0_162\jre\lib\deploy.jar;G:\Java\jdk1.8.0_162\jre\lib\ext\access-bridge-64.jar;G:\Java\jdk1.8.0_162\jre\lib\ext\cldrdata.jar;G:\Java\jdk1.8.0_162\jre\lib\ext\dnsns.jar;G:\Java\jdk1.8.0_162\jre\lib\ext\jaccess.jar;G:\Java\jdk1.8.0_162\jre\lib\ext\jfxrt.jar;G:\Java\jdk1.8.0_162\jre\lib\ext\localedata.jar;G:\Java\jdk1.8.0_162\jre\lib\ext\nashorn.jar;G:\Java\jdk1.8.0_162\jre\lib\ext\sunec.jar;G:\Java\jdk1.8.0_162\jre\lib\ext\sunjce_provider.jar;G:\Java\jdk1.8.0_162\jre\lib\ext\sunmscapi.jar;G:\Java\jdk1.8.0_162\jre\lib\ext\sunpkcs11.jar;G:\Java\jdk1.8.0_162\jre\lib\ext\zipfs.jar;G:\Java\jdk1.8.0_162\jre\lib\javaws.jar;G:\Java\jdk1.8.0_162\jre\lib\jce.jar;G:\Java\jdk1.8.0_162\jre\lib\jfr.jar;G:\Java\jdk1.8.0_162\jre\lib\jfxswt.jar;G:\Java\jdk1.8.0_162\jre\lib\jsse.jar;G:\Java\jdk1.8.0_162\jre\lib\management-agent.jar;G:\Java\jdk1.8.0_162\jre\lib\plugin.jar;G:\Java\jdk1.8.0_162\jre\lib\resources.jar;G:\Java\jdk1.8.0_162\jre\lib\rt.jar;G:\Java\IDEA_code\day18_Collections\out\production\day18_Collections;G:\Java\IntelliJ IDEA 16\IntelliJ IDEA 2016.1\lib\idea_rt.jar" com.intellij.rt.execution.application.AppMain jejune4.PokerDemo
茅敏敏的牌是：
♣4
♦5
♦6
♥8
♥9
♣9
♣10
♦10
♠J
♣J
♦J
♥K
♦K
♥A
♦A
♠2
♦2
吴彦祖的牌是：
♥3
♠4
♥6
♣6
♣7
♣8
♦8
♠9
♦9
♠10
♥10
♥J
♠Q
♣Q
♦Q
♠A
BlackJoker
赵安的牌是：
♣4
♦5
♦6
♥8
♥9
♣9
♣10
♦10
♠J
♣J
♦J
♥K
♦K
♥A
♦A
♠2
♦2
底牌的牌是：
♣3
♦3
♠K

Process finished with exit code 0

 */