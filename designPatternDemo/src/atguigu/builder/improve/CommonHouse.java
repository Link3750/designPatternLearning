package atguigu.builder.improve;

/**
 * @author TanYuan
 * @date 2022年04月22日 20:47
 */
public class CommonHouse extends HouseBuilder{
    @Override
    public void buildBasic() {
        System.out.println("普通房子地基");
    }

    @Override
    public void buildWalls() {
        System.out.println("普通房子砌墙");
    }

    @Override
    public void buildRoof() {
        System.out.println("普通房子封顶");
    }
}
