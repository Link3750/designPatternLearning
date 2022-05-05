package SpringMvcHandler.handler;

/**
 * @author TanYuan
 * @date 2022年04月27日 21:37
 */
public interface HandlerAdapter {
    /**
     * 判断该对象是不是相应适配器的Controller层
     * @param handler 对象
     * @return return true if handler.instanceOf(one of the Controllers)
     */
    boolean supports(Object handler);

    /**
     * 将对象适配到相应的Controller层中处理相应逻辑
     * @param handler 对象
     */
    void handle(Object handler);
}

