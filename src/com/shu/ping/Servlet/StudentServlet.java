package com.shu.ping.Servlet;

import com.fasterxml.jackson.databind.ObjectMapper;
import com.shu.ping.javaBean.Student;
import com.shu.ping.service.StudentService;
import com.shu.ping.service.StudentServiceImp;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.io.PrintWriter;
import java.util.ArrayList;
import java.util.List;
@WebServlet("/studentServlet")
public class StudentServlet extends HttpServlet {
    @Override
    protected void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {

    }

    @Override
    protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        req.setCharacterEncoding("UTF-8");
        resp.setContentType("text/html;charset=UTF-8");
        String name = req.getParameter("name");
        StudentService ss = new StudentServiceImp();
        List<Student> list = ss.getStudentByName(name);
        ObjectMapper mapper = new ObjectMapper();
        String res = mapper.writeValueAsString(list);
        PrintWriter out = resp.getWriter();
        out.print(res);
        out.close();
    }
}
