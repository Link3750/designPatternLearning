package atguigu.factory.simpleFactory.pizzaStore.order;

import atguigu.factory.simpleFactory.pizzaStore.pizza.Pizza;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

/**
 * @author TanYuan
 * @date 2022年04月08日 22:02
 */
public class OrderPizza2 {

    Pizza pizza;
    String orderType;
    public OrderPizza2() {
        do {
            orderType = getType();
            pizza = SimpleFactory.createPizza2(orderType);

            // 输出pizza
            if(pizza == null) {
                System.out.println("purchase pizza fails");
                break;
            }
            pizza.prepare();
            pizza.bake();
            pizza.cut();
            pizza.box();
        }while (true);
    }

    /**
     * 动态获取披萨种类
     */
    private String getType() {
        try {
            BufferedReader string = new BufferedReader(new InputStreamReader(System.in));
            System.out.println(string);
            return string.readLine();
        } catch (IOException e) {
            throw new RuntimeException();
        }
    }
}
