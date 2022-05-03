package atguigu.factory.factoryMethod.order;

import atguigu.factory.factoryMethod.pizza.BJCheesePizza;
import atguigu.factory.factoryMethod.pizza.BJPepperPizza;
import atguigu.factory.factoryMethod.pizza.Pizza;

/**
 * @author TanYuan
 * @date 2022年04月11日 20:48
 */
public class BJOrderPizza extends OrderPizza {

    Pizza pizza;

    @Override
    public Pizza createPizza(String orderType) {
        if ("Cheese".equalsIgnoreCase(orderType)) {
            pizza = new BJCheesePizza(orderType);
        }else if("Pepper".equalsIgnoreCase(orderType)) {
            pizza = new BJPepperPizza(orderType);
        }
        return pizza;
    }
}
