package atguigu.adapter;

/**
 * @author TanYuan
 * @date 2022年04月25日 20:45
 */
public class Phone {
    public void charging(IVoltage5V iVoltage5V) {
        if(iVoltage5V.output5V() == 5) {
            System.out.println("正常充电");
        } else {
            System.out.println("无法正常充电");
        }
    }
}
