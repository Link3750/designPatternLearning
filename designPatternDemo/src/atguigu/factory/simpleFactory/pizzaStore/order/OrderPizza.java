package atguigu.factory.simpleFactory.pizzaStore.order;

import atguigu.factory.simpleFactory.pizzaStore.pizza.Pizza;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

/**
 * @author TanYuan
 * @date 2022年04月01日 20:55
 */
public class OrderPizza {

//    public OrderPizza() {
//        Pizza pizza = null;
//        // 订购披萨的类型
//        String orderType;
//        do {
//            orderType = getType();
//            if("greek".equals(orderType)) {
//                pizza = new GreekPizza(orderType);
//            } else if("cheese".equals(orderType)){
//                pizza = new CheesePizza(orderType);
//            }else if ("pepper".equals(orderType)) {
//                pizza = new PepperPizza(orderType);
//            }else {
//                break;
//            }
//            pizza.prepare();
//            pizza.bake();
//            pizza.cut();
//            pizza.box();
//        } while (true);
//    }


    SimpleFactory simpleFactory;
    Pizza pizza = null;

    public OrderPizza(SimpleFactory simpleFactory) {
        setFactory(simpleFactory);
    }

    public void setFactory(SimpleFactory simpleFactory) {
        String orderType = null;
        this.simpleFactory = simpleFactory;
        do {
            orderType = getType();
            pizza = this.simpleFactory.createPizza(orderType);

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
