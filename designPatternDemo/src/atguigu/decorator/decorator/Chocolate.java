package atguigu.decorator.decorator;

import atguigu.decorator.component.Drink;

/**
 * 具体的装饰者，这里就是调味品
 *
 * @author TanYuan
 * @date 2022年05月16日 21:28
 */
public class Chocolate extends Decorator{

    public Chocolate(Drink obj) {
        super(obj);
        setDes("巧克力");
        setPrice(3);
    }
}

class Soy extends Decorator{

    public Soy(Drink obj) {
        super(obj);
        setDes("豆浆");
        setPrice(1);
    }
}
