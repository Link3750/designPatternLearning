package aggregation;

/**
 * @author TanYuan
 * @date 2022年05月06日 21:29
 */
public class Computer {
    private Mouse mouse;
    private Monitor monitor;

    public void setMouse(Mouse mouse) {
        this.mouse = mouse;
    }

    public void setMonitor(Monitor monitor) {
        this.monitor = monitor;
    }
}

class Mouse {
}

class Monitor {}
