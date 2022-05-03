package atguigu.builder;

/**
 * @author TanYuan
 * @date 2022年04月22日 20:20
 */
public class Client {

    public static void main(String[] args) {
        AbstractHouse house = new CommonHouse();
        house.build();
    }
}
