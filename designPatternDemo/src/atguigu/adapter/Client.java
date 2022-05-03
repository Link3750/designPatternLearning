package atguigu.adapter;

/**
 * @author TanYuan
 * @date 2022年04月25日 20:46
 */
public class Client {
    public static void main(String[] args) {
        System.out.println("类适配器模式");
        Phone phone = new Phone();
        phone.charging(new VoltageAdapter());
    }
}
