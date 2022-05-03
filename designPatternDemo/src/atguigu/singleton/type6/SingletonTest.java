package atguigu.singleton.type6;

/**
 * @author TanYuan
 * @date 2022年03月30日 21:54
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
class Singleton{
    private static volatile Singleton instance;
    
    private Singleton() {
        
    }
    // 写一个静态内部类，该类中有一个静态属性Singleton
    private static class SingletonInstance{
        private static final Singleton INSTANCE = new Singleton();
    }
    
    // 提供一个惊天的公有方法，直接返回SingletonInstance.INSTANCE
    public static synchronized Singleton getInstance() {
        return SingletonInstance.INSTANCE;
    }
}