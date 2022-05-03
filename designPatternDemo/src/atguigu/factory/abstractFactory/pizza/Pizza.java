package atguigu.factory.abstractFactory.pizza;

/**
 * @author TanYuan
 * @date 2022年04月11日 20:44
 */
public abstract class Pizza {
    protected String name;

    public Pizza() {
    }

    public Pizza(String name) {
        this.name = name;
    }

    /**
     * 准备披萨
     */
    public abstract void prepare();

    /**
     * 烘烤披萨
     */
    public void bake() {
        System.out.println(name + "baking");
    }

    /**
     * 切分披萨
     */
    public void cut() {
        System.out.println(name + "cut");
    }

    /**
     * 打包
     */
    public void box() {
        System.out.println(name + "box");
    }
}
