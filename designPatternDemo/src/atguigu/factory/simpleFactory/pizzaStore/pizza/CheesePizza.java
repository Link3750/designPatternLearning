package atguigu.factory.simpleFactory.pizzaStore.pizza;

/**
 * @author TanYuan
 * @date 2022年04月01日 20:54
 */
public class CheesePizza extends Pizza{

    @Override
    public void prepare() {
        System.out.println("CheesePizza Prepare");
    }

    public CheesePizza() {
    }

    public CheesePizza(String name) {
        super(name);
    }
}
