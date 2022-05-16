package atguigu.decorator.component;

/**
 * @author TanYuan
 * @date 2022年05月16日 21:12
 */
public class Coffee extends Drink{
    @Override
    public double cost() {
        return super.getPrice();
    }
}
