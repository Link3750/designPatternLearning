package atguigu.factory.abstractFactory.order;

import atguigu.factory.abstractFactory.factory.AbsFactory;
import atguigu.factory.abstractFactory.pizza.Pizza;


import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

/**
 * @author TanYuan
 * @date 2022年04月14日 21:20
 */
public class OrderPizza {

    AbsFactory factory;

    public OrderPizza(AbsFactory factory) {
        setAbsFactory(factory);
    }

    private void setAbsFactory(AbsFactory factory) {
        Pizza pizza = null;
        String orderType = "";
        this.factory = factory;
        do {
            orderType = getType();
            pizza = factory.createPizza(orderType);

            // 输出pizza
            if(pizza == null) {
                System.out.println("purchase pizza fails");
                break;
            }
            pizza.prepare();
            pizza.bake();
            pizza.cut();
            pizza.box();
        } while (true);
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
