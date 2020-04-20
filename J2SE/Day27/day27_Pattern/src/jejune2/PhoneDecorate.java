package jejune2;

/**
 * Created by Jejune on 2018/7/15.
 */
public class PhoneDecorate implements Phone {

    private Phone p;

    public PhoneDecorate(Phone p) {
        this.p = p;
    }

    @Override
    public void call() {
        this.p.call();
    }
}
