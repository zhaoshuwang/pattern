package com.zhaosw.pattern.delegate.mvc;

import com.zhaosw.pattern.delegate.mvc.controller.MemberController;
import com.zhaosw.pattern.delegate.mvc.controller.OrderController;
import com.zhaosw.pattern.delegate.mvc.controller.SystemController;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;

/**
 * Created by zhaoshuwang on 2019-03-16 0016.
 */
public class DispatcherServlet extends HttpServlet {
    @Override
    protected void service(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        //完成调度
        doDispach(req,resp);
    }

    private void doDispach(HttpServletRequest req, HttpServletResponse resp) {
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

    }
}
