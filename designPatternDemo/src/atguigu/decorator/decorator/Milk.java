package atguigu.decorator.decorator;

import atguigu.decorator.component.Drink;

/**
 * @author 短途游
 */
public class Milk extends Decorator {

    public Milk(Drink obj) {
        super(obj);
        setDes("牛奶");
        setPrice(2);
    }
}
