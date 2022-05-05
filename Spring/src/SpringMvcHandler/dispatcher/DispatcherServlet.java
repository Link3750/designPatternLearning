package SpringMvcHandler.dispatcher;

import SpringMvcHandler.controller.Controller;
import SpringMvcHandler.controller.HttpController;
import SpringMvcHandler.handler.AnnotationHandlerAdapter;
import SpringMvcHandler.handler.HandlerAdapter;
import SpringMvcHandler.handler.HttpHandlerAdapter;
import SpringMvcHandler.handler.SimpleHandlerAdapter;

import java.util.ArrayList;
import java.util.List;

/**
 * @author TanYuan
 * @date 2022年04月27日 21:36
 */
public class DispatcherServlet {
    public static List<HandlerAdapter> handlerAdapters = new ArrayList<>();

    public DispatcherServlet() {
        // 将所有的适配器装入集合中，便于后续遍历
        handlerAdapters.add(new AnnotationHandlerAdapter());
        handlerAdapters.add(new HttpHandlerAdapter());
        handlerAdapters.add(new SimpleHandlerAdapter());
    }

    public void doDispatcher() {
        // 此处模拟springMVC从request获取handler对象，适配器可以获取到希望的Controller
        Controller controller = new HttpController();
        HandlerAdapter adapter = getHandler(controller);
        adapter.handle(controller);
    }

    public HandlerAdapter getHandler(Controller controller) {
        // 根据得到的controller(handler)，返回对应的适配器
        for(HandlerAdapter adapter : handlerAdapters) {
            if (adapter.supports(controller)) {
                return adapter;
            }
        }
        return null;
    }

    public static void main(String[] args) {
        new DispatcherServlet().doDispatcher();
    }
}
