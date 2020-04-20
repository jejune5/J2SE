package jejune1;

/**
 * Created by Jejune on 2018/4/2.
 */
public class AnimalDemo {
    public static void main(String[] args) {
        //具体类调用
        Dog d = new Dog();
        d.eat();
        Cat c = new Cat();
        c.eat();
        System.out.println("---");

        // 工厂有了后，通过工厂给造
//        Dog dd = AnimalFactory.createAnimal();
//        Cat cc = AnimalFactory.createAnimal();
//        dd.eat();
//        cc.eat();

        //工厂改进版
        Animal a = AnimalFactory.createAnimal("dog");
        a.eat();
        a = AnimalFactory.createAnimal("cat");
        a.eat();

        // NullPointerException
        a = AnimalFactory.createAnimal("pig");
        if (a != null) {
            a.eat();
        } else {
            System.out.println("对不起，暂时不提供这种动物");
        }

    }
}
