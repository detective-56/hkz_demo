package com.hkz.hkz_demo.action;

import com.hkz.hkz_demo.domain.Ani_info;
import com.hkz.hkz_demo.servlet.Ani_infoServlet;
import com.hkz.hkz_demo.servletimp.Ani_infoServletimp;
import org.junit.Test;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.util.List;

@WebServlet("/Find_info")
public class Ani_action extends HttpServlet {
    Ani_infoServlet ani_infoServlet = new Ani_infoServletimp();


    @Override
    protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        resp.setCharacterEncoding("utf-8");
        req.getSession().setAttribute("ani_infolist", ani_infoServlet.show_leftlist());
        req.getSession().setAttribute("top_infolist", ani_infoServlet.show_toplist());
        resp.sendRedirect("index.jsp");
    }

    @Override
    protected void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {

        this.doGet(req, resp);
    }

    @Test
    public void show(){
        List<Ani_info> ani_list = ani_infoServlet.show_leftlist();
        for (Ani_info ani: ani_list){
            System.out.println(ani);
        }
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
