/**
 * @author TanYuan
 * @date 2022年05月10日 21:21
 */
public class FoldedPhone extends Phone{
    public FoldedPhone(Brand brand) {
        super(brand);
    }

    @Override
    public void open() {
        super.open();
        System.out.println("折叠式");
    }

    @Override
    protected void close() {
        super.close();
        System.out.println("折叠式");
    }

    @Override
    protected void call() {
        super.call();
        System.out.println("折叠式");
    }
}
