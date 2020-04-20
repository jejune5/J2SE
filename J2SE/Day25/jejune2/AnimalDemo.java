package jejune2;

/**
 * Created by Jejune on 2018/4/2.
 */
public class AnimalDemo {
    public static void main(String[] args) {
        // 需求：我要买只狗
        Factory f = new DogFactory();
        Animal a = f.creatAnimal();
        a.eat();
        System.out.println("---");

        // 需求：买只猫
        f = new CatFactory();
        a = f.creatAnimal();
        a.eat();
    }
}
