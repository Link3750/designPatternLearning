package atguigu.decorator.decorator;

import atguigu.decorator.component.Drink;

/**
 * @author TanYuan
 * @date 2022年05月16日 21:06
 */
public abstract class Decorator extends Drink {
    private final Drink obj;

    String getDescription() {
        return null;
    }

    @Override
    public double cost() {
        return super.getPrice() + obj.cost();
    }

    @Override
    public String getDes() {
        return super.getDes() + " " + super.getPrice() + "&&" + obj.getDes();
    }

    public Decorator(Drink obj) {
        this.obj = obj;
    }
}
