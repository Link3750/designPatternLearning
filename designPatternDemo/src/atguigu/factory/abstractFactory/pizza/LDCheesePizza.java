package atguigu.factory.abstractFactory.pizza;

/**
 * @author TanYuan
 * @date 2022年04月11日 20:47
 */
public class LDCheesePizza extends Pizza {
    public LDCheesePizza() {
    }

    public LDCheesePizza(String name) {
        super(name);
    }

    @Override
    public void prepare() {
        System.out.println("Preparing LDCheesePizza.");
    }
}
