package jejune2;

/**
 * Created by Jejune on 2018/7/15.
 */
public class MusicDecorate extends PhoneDecorate{
    public MusicDecorate(Phone p) {
        super(p);
    }

    @Override
    public void call() {
        super.call();
        System.out.println("可以听音乐");
    }
}
