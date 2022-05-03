package SpringMvcHandler.handler;

/**
 * @author TanYuan
 * @date 2022年04月27日 21:37
 */
public interface HandlerAdapter {
    public boolean supports(Object handler);

    public void handle(Object handler);
}

