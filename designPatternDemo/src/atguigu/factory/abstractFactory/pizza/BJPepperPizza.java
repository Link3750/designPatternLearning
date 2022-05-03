package atguigu.factory.abstractFactory.pizza;

/**
 * @author TanYuan
 * @date 2022年04月11日 20:46
 */
public class BJPepperPizza extends Pizza {

    public BJPepperPizza() {
    }

    public BJPepperPizza(String name) {
        super(name);
    }

    @Override
    public void prepare() {
        System.out.println("Preparing BJPepperPizza.");
    }
}
