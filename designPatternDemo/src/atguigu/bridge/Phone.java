package atguigu.bridge;

/**
 * @author TanYuan
 * @date 2022年05月10日 21:19
 */
public abstract class Phone {

    private final Brand brand;

    public Phone(Brand brand) {
        super();
        this.brand = brand;
    }

    protected void open() {
        brand.open();
    }

    protected void close() {
        brand.close();
    }

    protected void call() {
        brand.call();
    }
}
