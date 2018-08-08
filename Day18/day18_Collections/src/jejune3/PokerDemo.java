package jejune3;

import java.util.ArrayList;
import java.util.Collections;

/**
 * Created by Jejune on 2018/8/6.
 */
/*
 * 模拟斗地主洗牌和发牌
 *
 * 分析：
 * 		A:创建一个牌盒
 * 		B:装牌
 * 		C:洗牌
 * 		D:发牌
 * 		E:看牌
 */
public class PokerDemo {
    public static void main(String[] args) {
        // 创建一个牌盒
        ArrayList<String> array = new ArrayList<String>();
        // 装牌
        // 黑桃A,黑桃2,黑桃3,...黑桃K
        // 红桃A,...
        // 梅花A,...
        // 方块A,...
        // 定义一个花色数组
        String[] colors = {"♠", "♥", "♣", "♦"};
        //定义一个点数数组
        String[] numbers = {"A", "2", "3", "4", "5", "6", "7", "8", "9", "10", "J", "Q", "K"};
        //装牌
        for (String color : colors) {
            for (String number : numbers) {
                array.add(color.concat(number));
            }
        }
        array.add("Red Joker");
        array.add("Black Joker");

        // 洗牌
        Collections.shuffle(array);

        // 发牌
        ArrayList<String> Mao = new ArrayList<String>();
        ArrayList<String> Wu = new ArrayList<String>();
        ArrayList<String> Zhao = new ArrayList<String>();
        ArrayList<String> diPai = new ArrayList<String>();

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
        lookPoker("茅敏敏", Mao);
        lookPoker("吴彦祖", Wu);
        lookPoker("赵安", Mao);

        lookPoker("底牌", diPai);
    }

    private static void lookPoker(String name, ArrayList<String> array) {
        System.out.println(name + "的牌是：");
        for (String s : array) {
            System.out.println(s + " ");
        }
    }
}

/*
G:\Java\jdk1.8.0_162\bin\java -Didea.launcher.port=7533 "-Didea.launcher.bin.path=G:\Java\IntelliJ IDEA 16\IntelliJ IDEA 2016.1\bin" -Dfile.encoding=UTF-8 -classpath "G:\Java\jdk1.8.0_162\jre\lib\charsets.jar;G:\Java\jdk1.8.0_162\jre\lib\deploy.jar;G:\Java\jdk1.8.0_162\jre\lib\ext\access-bridge-64.jar;G:\Java\jdk1.8.0_162\jre\lib\ext\cldrdata.jar;G:\Java\jdk1.8.0_162\jre\lib\ext\dnsns.jar;G:\Java\jdk1.8.0_162\jre\lib\ext\jaccess.jar;G:\Java\jdk1.8.0_162\jre\lib\ext\jfxrt.jar;G:\Java\jdk1.8.0_162\jre\lib\ext\localedata.jar;G:\Java\jdk1.8.0_162\jre\lib\ext\nashorn.jar;G:\Java\jdk1.8.0_162\jre\lib\ext\sunec.jar;G:\Java\jdk1.8.0_162\jre\lib\ext\sunjce_provider.jar;G:\Java\jdk1.8.0_162\jre\lib\ext\sunmscapi.jar;G:\Java\jdk1.8.0_162\jre\lib\ext\sunpkcs11.jar;G:\Java\jdk1.8.0_162\jre\lib\ext\zipfs.jar;G:\Java\jdk1.8.0_162\jre\lib\javaws.jar;G:\Java\jdk1.8.0_162\jre\lib\jce.jar;G:\Java\jdk1.8.0_162\jre\lib\jfr.jar;G:\Java\jdk1.8.0_162\jre\lib\jfxswt.jar;G:\Java\jdk1.8.0_162\jre\lib\jsse.jar;G:\Java\jdk1.8.0_162\jre\lib\management-agent.jar;G:\Java\jdk1.8.0_162\jre\lib\plugin.jar;G:\Java\jdk1.8.0_162\jre\lib\resources.jar;G:\Java\jdk1.8.0_162\jre\lib\rt.jar;G:\Java\IDEA_code\day18_Collections\out\production\day18_Collections;G:\Java\IntelliJ IDEA 16\IntelliJ IDEA 2016.1\lib\idea_rt.jar" com.intellij.rt.execution.application.AppMain jejune3.PokerDemo
茅敏敏的牌是：
♠K
♣J
♣3
♣8
♠4
♦8
♠9
♥2
♦7
Black Joker
♣5
♠A
♣A
♦4
♥6
Red Joker
♠Q
吴彦祖的牌是：
♠8
♣7
♥7
♥8
♣2
♥10
♣K
♦2
♠2
♣4
♦K
♠7
♣Q
♦A
♣9
♥3
♥K
赵安的牌是：
♠K
♣J
♣3
♣8
♠4
♦8
♠9
♥2
♦7
Black Joker
♣5
♠A
♣A
♦4
♥6
Red Joker
♠Q
底牌的牌是：
♠3
♠6
♦9

Process finished with exit code 0

 */