package atguigu.prototype.deepClone;

/**
 * @author TanYuan
 * @date 2022年04月18日 21:49
 */
public class Client {
    public static void main(String[] args) {
        DeepPrototype p = new DeepPrototype();
        p.name = "张三";
        p.target = new DeepCloneableTarget("李四", "李四的类");

        DeepPrototype cloneType = (DeepPrototype) p.clone();
        System.out.println(p.target.hashCode());
        System.out.println(cloneType.target.hashCode());

        DeepPrototype deepPrototype = p.deepClone();
        System.out.println(deepPrototype.target.hashCode());
    }
}
