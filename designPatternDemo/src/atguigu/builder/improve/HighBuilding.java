package atguigu.builder.improve;

/**
 * @author TanYuan
 * @date 2022年04月22日 20:48
 */
public class HighBuilding extends HouseBuilder{

    @Override
    public void buildBasic() {
        System.out.println("高楼地基");
    }

    @Override
    public void buildWalls() {
        System.out.println("高楼砌墙");
    }

    @Override
    public void buildRoof() {
        System.out.println("高楼封顶");
    }
}
