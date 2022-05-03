package atguigu.builder.improve;

/**
 * @author TanYuan
 * @date 2022年04月22日 20:49
 */
public class HouseDirector {
    HouseBuilder houseBuilder = null;

    //构造器传入
    public HouseDirector(HouseBuilder houseBuilder) {
        this.houseBuilder = houseBuilder;
    }


    //setter方法传入
    public void setHouseBuilder(HouseBuilder houseBuilder) {
        this.houseBuilder = houseBuilder;
    }

    public House build() {
        new HouseDirector(houseBuilder);
        houseBuilder.buildBasic();
        houseBuilder.buildRoof();
        houseBuilder.buildWalls();
        return houseBuilder.buildHouse();
    }
}
