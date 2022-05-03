package atguigu.factory.abstractFactory.pizza;

/**
 * @author TanYuan
 * @date 2022年04月11日 20:47
 */
public class LDPepperPizza extends Pizza {
    public LDPepperPizza() {
    }

    public LDPepperPizza(String name) {
        super(name);
    }

    @Override
    public void prepare() {
        System.out.println("Preparing LDPepper Pizza.");
    }
}
