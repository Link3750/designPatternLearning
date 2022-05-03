package atguigu.factory.abstractFactory.factory;


import atguigu.factory.abstractFactory.pizza.LDCheesePizza;
import atguigu.factory.abstractFactory.pizza.LDPepperPizza;
import atguigu.factory.abstractFactory.pizza.Pizza;

/**
 * @author TanYuan
 * @date 2022年04月14日 21:11
 */
public class LDFactory implements AbsFactory {

    @Override
    public Pizza createPizza(String orderType) {
        Pizza pizza = null;
        if ("Cheese".equalsIgnoreCase(orderType)) {
            pizza = new LDCheesePizza(orderType);
        }else if("Pepper".equalsIgnoreCase(orderType)) {
            pizza = new LDPepperPizza(orderType);
        }
        return pizza;
    }
}
