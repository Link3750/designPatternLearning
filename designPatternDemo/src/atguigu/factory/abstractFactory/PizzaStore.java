package atguigu.factory.abstractFactory;

import atguigu.factory.abstractFactory.factory.BJFactory;
import atguigu.factory.abstractFactory.order.OrderPizza;

/**
 * @author TanYuan
 * @date 2022年04月14日 21:06
 */
public class PizzaStore {

    public static void main(String[] args) {
        new OrderPizza(new BJFactory());
    }
}
