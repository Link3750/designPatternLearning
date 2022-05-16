package atguigu.decorator;

import atguigu.decorator.component.Drink;
import atguigu.decorator.component.LongBlack;
import atguigu.decorator.decorator.Chocolate;
import atguigu.decorator.decorator.Milk;

/**
 * @author TanYuan
 * @date 2022年05月16日 21:31
 */
public class CoffeeBar {
    public static void main(String[] args) {
        // 装饰者模式下下单

        //1. 点一份LongBlack
        Drink longBlack = new LongBlack();
        System.out.println(longBlack.getDes());
        // 加入一份牛奶
        longBlack = new Milk(longBlack);
        System.out.println(longBlack.cost());
        System.out.println(longBlack.getDes());

        Drink chocolate = new Chocolate(longBlack);
        System.out.println(chocolate.cost());
        System.out.println(chocolate.getDes());

        chocolate = new Chocolate(chocolate);
        System.out.println(chocolate.cost());
        System.out.println(chocolate.getDes());
    }
}
