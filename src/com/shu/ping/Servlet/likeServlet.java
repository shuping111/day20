package com.shu.ping.Servlet;

import javax.servlet.ServletContext;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.io.PrintWriter;

@WebServlet("/likeServlet")
public class likeServlet extends HttpServlet {
    @Override
    protected void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {

    }

    @Override
    protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        ServletContext sc = getServletContext();
        Integer count = (Integer) sc.getAttribute("count");
        if(count ==null){
            //如果当前点赞用户是第一个点赞的人
            count =1;
        }else {
            count++;
        }
        sc.setAttribute("count",count);
        HttpServletResponse response;
        PrintWriter out = resp.getWriter();
        out.print(count);
        out.close();
    }
}
