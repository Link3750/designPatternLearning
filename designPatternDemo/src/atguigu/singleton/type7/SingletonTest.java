package atguigu.singleton.type7;

/**
 * @author TanYuan
 * @date 2022年03月30日 22:01
 */
public class SingletonTest {
    public static void main(String[] args) {
        Singleton instance = Singleton.INSTANCE;
        Singleton instance2 = Singleton.INSTANCE;
        System.out.println(instance == instance2);
        System.out.println(instance.hashCode());
        System.out.println(instance2.hashCode());
        instance.sayOK();
    }
}

// 使用枚举类，可以实现单例模式，推荐
enum Singleton {
    INSTANCE;
    public void sayOK() {
        System.out.println("ok");
    }
}
