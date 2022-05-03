package atguigu.factory.simpleFactory.pizzaStore.pizza;

/**
 * @author TanYuan
 * @date 2022年04月08日 21:14
 */
public class PepperPizza extends Pizza {

    @Override
    public void prepare() {
        System.out.println("PepperPizza");
    }

    public PepperPizza(String name) {
        super(name);
    }
}
