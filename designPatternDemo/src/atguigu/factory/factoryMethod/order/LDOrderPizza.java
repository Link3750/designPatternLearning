package atguigu.factory.factoryMethod.order;

import atguigu.factory.factoryMethod.pizza.LDCheesePizza;
import atguigu.factory.factoryMethod.pizza.LDPepperPizza;
import atguigu.factory.factoryMethod.pizza.Pizza;

/**
 * @author TanYuan
 * @date 2022年04月11日 20:51
 */
public class LDOrderPizza extends OrderPizza{

    Pizza pizza;
    @Override
    public Pizza createPizza(String orderType) {
        if ("Cheese".equalsIgnoreCase(orderType)) {
            pizza = new LDCheesePizza(orderType);
        }else if("Pepper".equalsIgnoreCase(orderType)) {
            pizza = new LDPepperPizza(orderType);
        }
        return pizza;
    }
}
