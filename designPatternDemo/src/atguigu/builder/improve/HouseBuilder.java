package atguigu.builder.improve;

/**
 * @author TanYuan
 * 抽象的建造者
 * @date 2022年04月22日 20:43
 */
public abstract class HouseBuilder {
    protected  House house = new House();


    public abstract void buildBasic();

    public abstract void buildWalls();

    public abstract void buildRoof();

    public House buildHouse() {
        return house;
    }

    public static void main(String[] args) {
        StringBuilder stringBuilder = new StringBuilder("fdsfksdfjls");
    }
}
