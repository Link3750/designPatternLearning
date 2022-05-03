package atguigu.factory.simpleFactory.pizzaStore.pizza;

/**
 * @author TanYuan
 * @date 2022年04月01日 20:52
 */
public abstract class Pizza {
    protected String name;

    public Pizza() {
    }

    public Pizza(String name) {
        this.name = name;
    }

    public abstract void prepare();

    public void bake() {
        System.out.println(name + "baking");
    }

    public void cut() {
        System.out.println(name + "cut");
    }

    public void box() {
        System.out.println(name + "box");
    }

    public void setName(String name) {
        this.name = name;
    }
}
