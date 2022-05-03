package atguigu.singleton.type5;

/**
 * @author TanYuan
 * @date 2022年03月30日 21:43
 */
public class SingletonTest {
    public static void main(String[] args) {
        //测试c
        Singleton instance = Singleton.getInstance();
        Singleton instance1 = Singleton.getInstance();
        System.out.println(instance == instance1);
        System.out.println(instance.hashCode());
        System.out.println(instance1.hashCode());
    }
}

class Singleton {
    private static volatile Singleton instance;

    private Singleton() {

    }

    // 提供一个静态的公有方法，加入双重检查代码解决线程安全问题，同时解决懒加载问题
    // 同时保证了效率
    public static Singleton getInstance() {
        if(instance == null) {
            synchronized (Singleton.class) {
                if(instance == null) {
                    instance = new Singleton();
                }
            }
        }

        return instance;
    }
}
