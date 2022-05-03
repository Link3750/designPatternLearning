package atguigu.singleton.type4;

/**
 * @author TanYuan
 * @date 2022年03月30日 21:30
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
    private static Singleton instance;

    private Singleton() {

    }
    
    // 提供一个静态的公有方法，加入同步处理的代码，当使用到该方法时，采取创建instance（懒汉式）
    public static synchronized Singleton getInstance() {
        if(instance == null) {
            instance = new Singleton();
        }

        return instance;
    }
}