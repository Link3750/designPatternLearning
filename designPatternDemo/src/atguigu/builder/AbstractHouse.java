package atguigu.builder;

/**
 * @author TanYuan
 * @date 2022年04月22日 20:18
 */
public abstract class AbstractHouse {

    public abstract void buildBasic();

    public abstract void buildWalls();

    public abstract void buildRoof();

    public void build(){
        buildBasic();
        buildWalls();
        buildRoof();
    }
}
