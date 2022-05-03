package atguigu.builder.improve;

/**
 * @author TanYuan
 * @date 2022年04月22日 20:54
 */
public class Client {
    public static void main(String[] args) {
        CommonHouse commonHouse = new CommonHouse();
        HouseDirector houseDirector = new HouseDirector(commonHouse);
        houseDirector.build();
    }
}
