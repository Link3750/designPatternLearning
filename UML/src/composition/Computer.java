package composition;

/**
 * @author TanYuan
 * @date 2022年05月06日 21:38
 */
public class Computer {
    private Mouse mouse = new Mouse();
    private Monitor monitor = new Monitor();
}

class Mouse {
}

class Monitor {}