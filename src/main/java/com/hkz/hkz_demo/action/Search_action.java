package com.hkz.hkz_demo.action;

import com.hkz.hkz_demo.servlet.Ani_infoServlet;
import com.hkz.hkz_demo.servletimp.Ani_infoServletimp;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;

@WebServlet("/Search")
public class Search_action extends HttpServlet {
    Ani_infoServlet ani_infoServlet = new Ani_infoServletimp();
    @Override
    protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        String info_name = new String(req.getParameter("search_info").getBytes("iso-8859-1"), "utf-8");
        System.out.println(info_name);
        if (!"".equals(info_name)){
            int size = ani_infoServlet.getInfoByName(info_name).size();
 //           if (size != 0) {
                req.getSession().setAttribute("search_infolist", ani_infoServlet.getInfoByName(info_name));
                resp.sendRedirect("search_finished.jsp");
 //           }
        }
        else resp.sendRedirect("index.jsp");
    }

    @Override
    protected void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        this.doGet(req, resp);
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
