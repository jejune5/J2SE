package jejune2;

/**
 * Created by Jejune on 2018/4/2.
 */
public class DogFactory implements Factory{

    @Override
    public Animal creatAnimal() {
        return new Dog();
    }
}
