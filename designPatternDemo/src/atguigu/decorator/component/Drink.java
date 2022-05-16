package atguigu.decorator.component;

/**
 * @author TanYuan
 * @date 2022年05月16日 21:09
 */
public abstract class Drink {
    public String des;
    private double price = 0.0;

    public String getDes() {
        return des;
    }

    public void setDes(String des) {
        this.des = des;
    }

    public double getPrice() {
        return price;
    }

    public void setPrice(double price) {
        this.price = price;
    }

    /**
     * 计算价格
     *
     * @return 价格
     */
    public abstract double cost();
}
