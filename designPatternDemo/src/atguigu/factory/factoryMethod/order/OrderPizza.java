package atguigu.factory.factoryMethod.order;

import atguigu.factory.factoryMethod.pizza.Pizza;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

/**
 * @author TanYuan
 * @date 2022年04月11日 20:43
 */
public abstract class OrderPizza {
    private Pizza pizza;
    String orderType;

    public OrderPizza() {
        do {
            orderType = getType();
            pizza = createPizza(orderType);

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

    /**
     * 创建披萨
     *
     * @param orderType
     * @return
     */
    public abstract Pizza createPizza(String orderType);
}
