package atguigu.factory.simpleFactory.pizzaStore.pizza;

/**
 * @author TanYuan
 * @date 2022年04月01日 20:54
 */
public class GreekPizza extends Pizza {

    @Override
    public void prepare() {
        System.out.println("GreekPizza prepare");
    }

    public GreekPizza() {
    }

    public GreekPizza(String name) {
        super(name);
    }
}
