package atguigu.factory.factoryMethod.pizza;

/**
 * @author TanYuan
 * @date 2022年04月11日 20:45
 */
public class BJCheesePizza extends Pizza{

    public BJCheesePizza() {
    }

    public BJCheesePizza(String name) {
        super(name);
    }

    @Override
    public void prepare() {
        System.out.println("Preparing BJCheesePizza");
    }
}
