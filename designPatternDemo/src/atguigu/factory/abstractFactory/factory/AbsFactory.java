package atguigu.factory.abstractFactory.factory;


import atguigu.factory.abstractFactory.pizza.Pizza;

/**
 * @author 短途游
 */
public interface AbsFactory {

    /**
     * 创建披萨
     *
     * @param orderType
     * @return
     */
    Pizza createPizza(String orderType);

}
