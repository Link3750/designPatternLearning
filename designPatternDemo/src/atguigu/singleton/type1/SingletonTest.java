package atguigu.singleton.type1;

/**
 * @author TanYuan
 * @date 2022年03月29日 21:25
 */
public class SingletonTest {
    public static void main(String[] args) {
        //测试
        Singleton instance = Singleton.getInstance();
        Singleton instance1 = Singleton.getInstance();
        System.out.println(instance == instance1);
        System.out.println(instance.hashCode());
        System.out.println(instance1.hashCode());
    }
}

/**
 * 饿汉式（静态变量）
 */
class Singleton {

    /**
     * 1.构造器私有化
     */
    private Singleton() {

    }

    // 本例内部创建对象实例
    private final static Singleton instance = new Singleton();

    // 3.提供一个公有的静态方法，返回实例对象
    public static Singleton getInstance() {
        return instance;
    }
}
