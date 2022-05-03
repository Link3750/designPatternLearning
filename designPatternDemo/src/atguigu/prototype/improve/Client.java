package atguigu.prototype.improve;

/**
 * @author TanYuan
 * @date 2022年04月18日 20:46
 */
public class Client {
    public static void main(String[] args) {
        Sheep sheep = new Sheep("tom", 1, "white");
        sheep.setFriend(new Sheep("jack", 2, "black"));

        Sheep sheep1 = (Sheep) sheep.clone();

        System.out.println(sheep.getFriend().hashCode());
        System.out.println(sheep1.getFriend().hashCode());
    }
}
