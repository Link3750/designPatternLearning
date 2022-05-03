package atguigu.factory.abstractFactory.factory;


import atguigu.factory.abstractFactory.pizza.BJCheesePizza;
import atguigu.factory.abstractFactory.pizza.BJPepperPizza;
import atguigu.factory.abstractFactory.pizza.Pizza;

/**
 * @author TanYuan
 * @date 2022年04月14日 21:11
 */
public class BJFactory implements AbsFactory {


    @Override
    public Pizza createPizza(String orderType) {
        Pizza pizza = null;
        if ("Cheese".equalsIgnoreCase(orderType)) {
            pizza = new BJCheesePizza(orderType);
        }else if("Pepper".equalsIgnoreCase(orderType)) {
            pizza = new BJPepperPizza(orderType);
        }
        return pizza;
    }
}
