package atguigu.factory.simpleFactory.pizzaStore.order;

import atguigu.factory.simpleFactory.pizzaStore.pizza.CheesePizza;
import atguigu.factory.simpleFactory.pizzaStore.pizza.GreekPizza;
import atguigu.factory.simpleFactory.pizzaStore.pizza.PepperPizza;
import atguigu.factory.simpleFactory.pizzaStore.pizza.Pizza;

/**
 * @author TanYuan
 * @date 2022年04月08日 21:41
 */
public class SimpleFactory {

    public Pizza createPizza(String orderType) {
        System.out.println("simpleFactory creates pizza");
        Pizza pizza = null;
        // 订购披萨的类型
        if ("greek".equals(orderType)) {
            pizza = new GreekPizza(orderType);
        } else if ("cheese".equals(orderType)) {
            pizza = new CheesePizza(orderType);
        } else if ("pepper".equals(orderType)) {
            pizza = new PepperPizza(orderType);
        }
        return pizza;
    }

    public static Pizza createPizza2(String orderType) {
        System.out.println("simpleFactory creates pizza");
        Pizza pizza = null;
        // 订购披萨的类型
        if ("greek".equals(orderType)) {
            pizza = new GreekPizza(orderType);
        } else if ("cheese".equals(orderType)) {
            pizza = new CheesePizza(orderType);
        } else if ("pepper".equals(orderType)) {
            pizza = new PepperPizza(orderType);
        }
        return pizza;
    }
}
