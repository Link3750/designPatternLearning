package atguigu.prototype;

/**
 * @author TanYuan
 * @date 2022年04月18日 20:17
 */
public class Client {
    public static void main(String[] args) {
        Sheep sheep = new Sheep("tom", 1, "white");
        //如果要构造十只相同属性的羊的话，需要循环十次进行构造
        new Sheep(sheep.getName(), sheep.getAge(), sheep.getColor());
    }
}
