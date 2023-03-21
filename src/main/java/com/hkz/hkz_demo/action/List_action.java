package com.hkz.hkz_demo.action;

import com.hkz.hkz_demo.domain.Ani_info;
import com.hkz.hkz_demo.servlet.Ani_infoServlet;
import com.hkz.hkz_demo.servletimp.Ani_infoServletimp;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.util.List;

@WebServlet("/List_info")
public class List_action extends HttpServlet {
    Ani_infoServlet ani_infoServlet = new Ani_infoServletimp();

    @Override
    protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        resp.setCharacterEncoding("utf-8");
        String week = req.getParameter("week");
        req.getSession().setAttribute("b_infolist", ani_infoServlet.getNameByWeek(week));
        resp.sendRedirect("show.jsp");
    }

    @Override
    protected void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        super.doPost(req, resp);
    }
    @Override
    public void destroy() {
        super.destroy();
    }

    @Override
    public void init() throws ServletException {
        super.init();
    }
}
