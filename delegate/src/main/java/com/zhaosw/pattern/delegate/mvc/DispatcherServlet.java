package com.zhaosw.pattern.delegate.mvc;

import com.zhaosw.pattern.delegate.mvc.controller.MemberController;
import com.zhaosw.pattern.delegate.mvc.controller.OrderController;
import com.zhaosw.pattern.delegate.mvc.controller.SystemController;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;
import java.util.ArrayList;
import java.util.List;

/**
 * Created by zhaoshuwang on 2019-03-16 0016.
 */
public class DispatcherServlet extends HttpServlet {

    private List<Handler> list = new ArrayList<Handler>();

    @Override
    public void init() throws ServletException {
        Class<?> clazz=MemberController.class;
        try {
            list.add(new Handler()
            .setController(clazz.newInstance())
                    .setMethod(clazz.getMethod("getMemberById",new Class[]{String.class}))
                    .setUrl("/web/getMemberById.json"));
        } catch (Exception e) {
            e.printStackTrace();
        }
    }

    @Override
    protected void service(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        //完成调度
        doDispach(req,resp);
    }

    private void doDispach(HttpServletRequest req, HttpServletResponse resp) {
        String uri = req.getRequestURI();
        Handler handler=null;
        for(Handler h:list){
            if (uri.equals(h.getUrl())) {
                handler=h;
                break;
            }
        }
        try {
            Object obj=handler.getMethod().invoke(handler.getController(), req.getParameter("mid"));

        } catch (IllegalAccessException e) {
            e.printStackTrace();
        } catch (InvocationTargetException e) {
            e.printStackTrace();
        }

    }

    class Handler{
        private String url;
        private Object controller;
        private Method method;

        public String getUrl() {
            return url;
        }

        public Handler setUrl(String url) {
            this.url = url;
            return this;
        }

        public Object getController() {
            return controller;
        }

        public Handler setController(Object controller) {
            this.controller = controller;
            return this;
        }

        public Method getMethod() {
            return method;
        }

        public Handler setMethod(Method method) {
            this.method = method;
            return this;
        }
    }

    /*private void doDispach(HttpServletRequest req, HttpServletResponse resp) {
        //用户请求地址
        String uri=req.getRequestURI();
        //请求参数
        String mid=req.getParameter("mid");

        if ("getMemberById".equals(uri)) {
            new MemberController().getMemberById(mid);
        } else if ("getOrderById".equals(uri)) {
            new OrderController().getOrderById(mid);
        } else if ("logout".equals(uri)) {
            new SystemController().logout();
        }else {
            try {
                resp.getWriter().write("404 not found");
            } catch (IOException e) {
                e.printStackTrace();
            }
        }

    }*/
}
